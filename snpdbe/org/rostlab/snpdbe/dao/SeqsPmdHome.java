package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.SeqsPmd;
import org.rostlab.snpdbe.domain.SeqsPmdId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class SeqsPmd.
 * @see .SeqsPmd
 * @author Hibernate Tools
 */
public class SeqsPmdHome {

	private static final Log log = LogFactory.getLog(SeqsPmdHome.class);

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

	public void persist(SeqsPmd transientInstance) {
		log.debug("persisting SeqsPmd instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SeqsPmd instance) {
		log.debug("attaching dirty SeqsPmd instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SeqsPmd instance) {
		log.debug("attaching clean SeqsPmd instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SeqsPmd persistentInstance) {
		log.debug("deleting SeqsPmd instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SeqsPmd merge(SeqsPmd detachedInstance) {
		log.debug("merging SeqsPmd instance");
		try {
			SeqsPmd result = (SeqsPmd) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SeqsPmd findById(SeqsPmdId id) {
		log.debug("getting SeqsPmd instance with id: " + id);
		try {
			SeqsPmd instance = (SeqsPmd) sessionFactory.getCurrentSession()
					.get("SeqsPmd", id);
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

	public List<SeqsPmd> findByExample(SeqsPmd instance) {
		log.debug("finding SeqsPmd instance by example");
		try {
			List<SeqsPmd> results = (List<SeqsPmd>) sessionFactory
					.getCurrentSession().createCriteria("SeqsPmd")
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
