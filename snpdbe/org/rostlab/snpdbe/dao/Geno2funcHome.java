package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.Geno2func;
import org.rostlab.snpdbe.domain.Geno2funcId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Geno2func.
 * @see .Geno2func
 * @author Hibernate Tools
 */
public class Geno2funcHome {

	private static final Log log = LogFactory.getLog(Geno2funcHome.class);

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

	public void persist(Geno2func transientInstance) {
		log.debug("persisting Geno2func instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Geno2func instance) {
		log.debug("attaching dirty Geno2func instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Geno2func instance) {
		log.debug("attaching clean Geno2func instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Geno2func persistentInstance) {
		log.debug("deleting Geno2func instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Geno2func merge(Geno2func detachedInstance) {
		log.debug("merging Geno2func instance");
		try {
			Geno2func result = (Geno2func) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Geno2func findById(Geno2funcId id) {
		log.debug("getting Geno2func instance with id: " + id);
		try {
			Geno2func instance = (Geno2func) sessionFactory.getCurrentSession()
					.get("Geno2func", id);
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

	public List<Geno2func> findByExample(Geno2func instance) {
		log.debug("finding Geno2func instance by example");
		try {
			List<Geno2func> results = (List<Geno2func>) sessionFactory
					.getCurrentSession().createCriteria("Geno2func")
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
