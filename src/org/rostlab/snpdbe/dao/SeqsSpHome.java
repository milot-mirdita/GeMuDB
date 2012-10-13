package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.SeqsSp;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class SeqsSp.
 * @see .SeqsSp
 * @author Hibernate Tools
 */
public class SeqsSpHome {

	private static final Log log = LogFactory.getLog(SeqsSpHome.class);

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

	public void persist(SeqsSp transientInstance) {
		log.debug("persisting SeqsSp instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SeqsSp instance) {
		log.debug("attaching dirty SeqsSp instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SeqsSp instance) {
		log.debug("attaching clean SeqsSp instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SeqsSp persistentInstance) {
		log.debug("deleting SeqsSp instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SeqsSp merge(SeqsSp detachedInstance) {
		log.debug("merging SeqsSp instance");
		try {
			SeqsSp result = (SeqsSp) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SeqsSp findById(java.lang.String id) {
		log.debug("getting SeqsSp instance with id: " + id);
		try {
			SeqsSp instance = (SeqsSp) sessionFactory.getCurrentSession().get(
					"SeqsSp", id);
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

	public List<SeqsSp> findByExample(SeqsSp instance) {
		log.debug("finding SeqsSp instance by example");
		try {
			List<SeqsSp> results = (List<SeqsSp>) sessionFactory
					.getCurrentSession().createCriteria("SeqsSp")
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
