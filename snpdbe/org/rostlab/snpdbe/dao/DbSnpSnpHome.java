package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.DbSnpSnp;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class DbSnpSnp.
 * @see .DbSnpSnp
 * @author Hibernate Tools
 */
public class DbSnpSnpHome {

	private static final Log log = LogFactory.getLog(DbSnpSnpHome.class);

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

	public void persist(DbSnpSnp transientInstance) {
		log.debug("persisting DbSnpSnp instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(DbSnpSnp instance) {
		log.debug("attaching dirty DbSnpSnp instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DbSnpSnp instance) {
		log.debug("attaching clean DbSnpSnp instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(DbSnpSnp persistentInstance) {
		log.debug("deleting DbSnpSnp instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DbSnpSnp merge(DbSnpSnp detachedInstance) {
		log.debug("merging DbSnpSnp instance");
		try {
			DbSnpSnp result = (DbSnpSnp) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DbSnpSnp findById(int id) {
		log.debug("getting DbSnpSnp instance with id: " + id);
		try {
			DbSnpSnp instance = (DbSnpSnp) sessionFactory.getCurrentSession()
					.get("DbSnpSnp", id);
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

	public List<DbSnpSnp> findByExample(DbSnpSnp instance) {
		log.debug("finding DbSnpSnp instance by example");
		try {
			List<DbSnpSnp> results = (List<DbSnpSnp>) sessionFactory
					.getCurrentSession().createCriteria("DbSnpSnp")
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
