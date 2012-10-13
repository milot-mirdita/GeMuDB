package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.Snps1kg;
import org.rostlab.snpdbe.domain.Snps1kgId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Snps1kg.
 * @see .Snps1kg
 * @author Hibernate Tools
 */
public class Snps1kgHome {

	private static final Log log = LogFactory.getLog(Snps1kgHome.class);

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

	public void persist(Snps1kg transientInstance) {
		log.debug("persisting Snps1kg instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Snps1kg instance) {
		log.debug("attaching dirty Snps1kg instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Snps1kg instance) {
		log.debug("attaching clean Snps1kg instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Snps1kg persistentInstance) {
		log.debug("deleting Snps1kg instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Snps1kg merge(Snps1kg detachedInstance) {
		log.debug("merging Snps1kg instance");
		try {
			Snps1kg result = (Snps1kg) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Snps1kg findById(Snps1kgId id) {
		log.debug("getting Snps1kg instance with id: " + id);
		try {
			Snps1kg instance = (Snps1kg) sessionFactory.getCurrentSession()
					.get("Snps1kg", id);
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

	public List<Snps1kg> findByExample(Snps1kg instance) {
		log.debug("finding Snps1kg instance by example");
		try {
			List<Snps1kg> results = (List<Snps1kg>) sessionFactory
					.getCurrentSession().createCriteria("Snps1kg")
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
