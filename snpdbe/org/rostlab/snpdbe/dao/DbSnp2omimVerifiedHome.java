package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.DbSnp2omimVerified;
import org.rostlab.snpdbe.domain.DbSnp2omimVerifiedId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class DbSnp2omimVerified.
 * @see .DbSnp2omimVerified
 * @author Hibernate Tools
 */
public class DbSnp2omimVerifiedHome {

	private static final Log log = LogFactory
			.getLog(DbSnp2omimVerifiedHome.class);

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

	public void persist(DbSnp2omimVerified transientInstance) {
		log.debug("persisting DbSnp2omimVerified instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(DbSnp2omimVerified instance) {
		log.debug("attaching dirty DbSnp2omimVerified instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DbSnp2omimVerified instance) {
		log.debug("attaching clean DbSnp2omimVerified instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(DbSnp2omimVerified persistentInstance) {
		log.debug("deleting DbSnp2omimVerified instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DbSnp2omimVerified merge(DbSnp2omimVerified detachedInstance) {
		log.debug("merging DbSnp2omimVerified instance");
		try {
			DbSnp2omimVerified result = (DbSnp2omimVerified) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DbSnp2omimVerified findById(DbSnp2omimVerifiedId id) {
		log.debug("getting DbSnp2omimVerified instance with id: " + id);
		try {
			DbSnp2omimVerified instance = (DbSnp2omimVerified) sessionFactory
					.getCurrentSession().get("DbSnp2omimVerified", id);
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

	public List<DbSnp2omimVerified> findByExample(DbSnp2omimVerified instance) {
		log.debug("finding DbSnp2omimVerified instance by example");
		try {
			List<DbSnp2omimVerified> results = (List<DbSnp2omimVerified>) sessionFactory
					.getCurrentSession().createCriteria("DbSnp2omimVerified")
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
