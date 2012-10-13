package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.DbSnpValCode;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class DbSnpValCode.
 * @see .DbSnpValCode
 * @author Hibernate Tools
 */
public class DbSnpValCodeHome {

	private static final Log log = LogFactory.getLog(DbSnpValCodeHome.class);

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

	public void persist(DbSnpValCode transientInstance) {
		log.debug("persisting DbSnpValCode instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(DbSnpValCode instance) {
		log.debug("attaching dirty DbSnpValCode instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DbSnpValCode instance) {
		log.debug("attaching clean DbSnpValCode instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(DbSnpValCode persistentInstance) {
		log.debug("deleting DbSnpValCode instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DbSnpValCode merge(DbSnpValCode detachedInstance) {
		log.debug("merging DbSnpValCode instance");
		try {
			DbSnpValCode result = (DbSnpValCode) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DbSnpValCode findById(byte id) {
		log.debug("getting DbSnpValCode instance with id: " + id);
		try {
			DbSnpValCode instance = (DbSnpValCode) sessionFactory
					.getCurrentSession().get("DbSnpValCode", id);
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

	public List<DbSnpValCode> findByExample(DbSnpValCode instance) {
		log.debug("finding DbSnpValCode instance by example");
		try {
			List<DbSnpValCode> results = (List<DbSnpValCode>) sessionFactory
					.getCurrentSession().createCriteria("DbSnpValCode")
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
