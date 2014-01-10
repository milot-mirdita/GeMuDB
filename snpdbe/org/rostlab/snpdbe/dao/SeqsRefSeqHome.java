package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.SeqsRefSeq;
import org.rostlab.snpdbe.domain.SeqsRefSeqId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class SeqsRefSeq.
 * @see .SeqsRefSeq
 * @author Hibernate Tools
 */
public class SeqsRefSeqHome {

	private static final Log log = LogFactory.getLog(SeqsRefSeqHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SeqsRefSeq transientInstance) {
		log.debug("persisting SeqsRefSeq instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SeqsRefSeq instance) {
		log.debug("attaching dirty SeqsRefSeq instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SeqsRefSeq instance) {
		log.debug("attaching clean SeqsRefSeq instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SeqsRefSeq persistentInstance) {
		log.debug("deleting SeqsRefSeq instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SeqsRefSeq merge(SeqsRefSeq detachedInstance) {
		log.debug("merging SeqsRefSeq instance");
		try {
			SeqsRefSeq result = (SeqsRefSeq) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SeqsRefSeq findById(SeqsRefSeqId id) {
		log.debug("getting SeqsRefSeq instance with id: " + id);
		try {
			SeqsRefSeq instance = (SeqsRefSeq) sessionFactory
					.getCurrentSession().get("SeqsRefSeq", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<SeqsRefSeq> findByExample(SeqsRefSeq instance) {
		log.debug("finding SeqsRefSeq instance by example");
		try {
			List<SeqsRefSeq> results = (List<SeqsRefSeq>) sessionFactory
					.getCurrentSession().createCriteria("SeqsRefSeq")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
