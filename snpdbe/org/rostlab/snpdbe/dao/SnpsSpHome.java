package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.SnpsSp;
import org.rostlab.snpdbe.domain.SnpsSpId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class SnpsSp.
 * @see .SnpsSp
 * @author Hibernate Tools
 */
public class SnpsSpHome {

	private static final Log log = LogFactory.getLog(SnpsSpHome.class);

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

	public void persist(SnpsSp transientInstance) {
		log.debug("persisting SnpsSp instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SnpsSp instance) {
		log.debug("attaching dirty SnpsSp instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SnpsSp instance) {
		log.debug("attaching clean SnpsSp instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SnpsSp persistentInstance) {
		log.debug("deleting SnpsSp instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SnpsSp merge(SnpsSp detachedInstance) {
		log.debug("merging SnpsSp instance");
		try {
			SnpsSp result = (SnpsSp) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SnpsSp findById(SnpsSpId id) {
		log.debug("getting SnpsSp instance with id: " + id);
		try {
			SnpsSp instance = (SnpsSp) sessionFactory.getCurrentSession().get(
					"SnpsSp", id);
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

	public List<SnpsSp> findByExample(SnpsSp instance) {
		log.debug("finding SnpsSp instance by example");
		try {
			List<SnpsSp> results = (List<SnpsSp>) sessionFactory
					.getCurrentSession().createCriteria("SnpsSp")
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
