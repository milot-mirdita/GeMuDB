package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.SnpsDbSnp;
import org.rostlab.snpdbe.domain.SnpsDbSnpId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class SnpsDbSnp.
 * @see .SnpsDbSnp
 * @author Hibernate Tools
 */
public class SnpsDbSnpHome {

	private static final Log log = LogFactory.getLog(SnpsDbSnpHome.class);

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

	public void persist(SnpsDbSnp transientInstance) {
		log.debug("persisting SnpsDbSnp instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SnpsDbSnp instance) {
		log.debug("attaching dirty SnpsDbSnp instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SnpsDbSnp instance) {
		log.debug("attaching clean SnpsDbSnp instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SnpsDbSnp persistentInstance) {
		log.debug("deleting SnpsDbSnp instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SnpsDbSnp merge(SnpsDbSnp detachedInstance) {
		log.debug("merging SnpsDbSnp instance");
		try {
			SnpsDbSnp result = (SnpsDbSnp) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SnpsDbSnp findById(SnpsDbSnpId id) {
		log.debug("getting SnpsDbSnp instance with id: " + id);
		try {
			SnpsDbSnp instance = (SnpsDbSnp) sessionFactory.getCurrentSession()
					.get("SnpsDbSnp", id);
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

	public List<SnpsDbSnp> findByExample(SnpsDbSnp instance) {
		log.debug("finding SnpsDbSnp instance by example");
		try {
			List<SnpsDbSnp> results = (List<SnpsDbSnp>) sessionFactory
					.getCurrentSession().createCriteria("SnpsDbSnp")
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
