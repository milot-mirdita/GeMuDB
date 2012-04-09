import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.rostlab.snapdb.dao.MutationDao;
import org.rostlab.snapdb.dao.SequenceDao;
import org.rostlab.snapdb.dom.Mutation;
import org.rostlab.snapdb.dom.MutationType;
import org.rostlab.snapdb.dom.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// specifies the Spring configuration to load for this test fixture
@ContextConfiguration(locations={"file:config/Application-Context.xml"})
public final class DaoTests {
	final private static String seq="MKAQNLLKLTSPGPAPASCQHLQAQPLPHGGFSRPSSSSGLSLQAQLLLHNSLFWPSSCP"+
"AHSGQCRPKTSSSQTPQARLLLPGGMNRPSFDLRTASAGRALASQGLLQAQLLPHGGCPR"+
"PSFCLPASSLNRHSSSLTVAHLGPTHDCRAISRPSACLLADS";
	
	final private Boolean[] effect=
		{false,true,false,true,false,true,false,false,false,false,
		 true,false,true,false,false,false,false,true,true,false};
	final private Integer[] reli=
		{80,50,60,70,50,70,90,86,23,64,
		 76,87,68,89,43,57,69,43,79,35};
    // this instance will be dependency injected by type
    @Autowired    
    private SequenceDao sequenceDao;
    
    @Autowired    
    private MutationDao mutationDao;
    
    private static Sequence sequence;
    @Before
    public void setUpTestDataWithinTransaction() {
        // set up test data within the transaction
    }

    @Test
    public void writeSequence() {
    	sequence = new Sequence();
    	sequence.setRefId("REF123332515");;
    	sequence.setSequence(seq);
    	sequenceDao.create(sequence);
    	assertTrue(sequence.getId()>0);
    	Sequence tmpSeq=sequenceDao.selectById(sequence.getId());
    	assertEquals(sequence.getRefId(), tmpSeq.getRefId());
    	assertEquals(sequence.getSequence(), tmpSeq.getSequence());
    	tmpSeq=sequenceDao.selectByRefId(sequence.getRefId());
    	assertEquals(sequence.getRefId(), tmpSeq.getRefId());
    	assertEquals(sequence.getSequence(), tmpSeq.getSequence());
    	assertTrue(tmpSeq.equals("")==false);
    }
    
    @Test
    public void writeMutation() {
    	Mutation mut = new Mutation();
    	mut.setLsequenceid(sequence.getId());
    	mut.setPos(0);
    	mut.setMutEffect(effect);
    	mut.setMutReliability(reli);
    	mut.setType(MutationType.SNAP);
    	mutationDao.create(mut);
    	Mutation tmpMut=mutationDao.selectById(sequence.getId()).get(0);
    	assertEquals(sequence.getId(),tmpMut.getLsequenceid());
    	assertEquals(new Integer(0),tmpMut.getPos());
    	for(int i = 0;i < mut.getMutEffect().length;i++)
    		assertEquals(mut.getMutEffect()[i],tmpMut.getMutEffect()[i]);
    	for(int i = 0;i < mut.getMutReliability().length;i++)
    		assertEquals(mut.getMutReliability()[i],tmpMut.getMutReliability()[i]);
    	assertEquals(MutationType.SNAP,tmpMut.getType());
    	mutationDao.deleteAll();
    }
    
    
    
    @Test
    public void deleteSequnece() {
    	sequenceDao.delete(sequence.getId());
    	assertNull(sequenceDao.selectById(sequence.getId()));
    }

    
}