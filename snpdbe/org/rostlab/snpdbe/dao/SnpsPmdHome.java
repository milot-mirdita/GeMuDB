package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.SnpsPmd;
import org.rostlab.snpdbe.domain.SnpsPmdId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class SnpsPmd.
 * @see .SnpsPmd
 * @author Hibernate Tools
 */
public class SnpsPmdHome {

	private static final Log log = LogFactory.getLog(SnpsPmdHome.class);

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

	public void persist(SnpsPmd transientInstance) {
		log.debug("persisting SnpsPmd instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SnpsPmd instance) {
		log.debug("attaching dirty SnpsPmd instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SnpsPmd instance) {
		log.debug("attaching clean SnpsPmd instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SnpsPmd persistentInstance) {
		log.debug("deleting SnpsPmd instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SnpsPmd merge(SnpsPmd detachedInstance) {
		log.debug("merging SnpsPmd instance");
		try {
			SnpsPmd result = (SnpsPmd) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SnpsPmd findById(SnpsPmdId id) {
		log.debug("getting SnpsPmd instance with id: " + id);
		try {
			SnpsPmd instance = (SnpsPmd) sessionFactory.getCurrentSession()
					.get("SnpsPmd", id);
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

	public List<SnpsPmd> findByExample(SnpsPmd instance) {
		log.debug("finding SnpsPmd instance by example");
		try {
			List<SnpsPmd> results = (List<SnpsPmd>) sessionFactory
					.getCurrentSession().createCriteria("SnpsPmd")
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
