package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.TaxidMerged;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TaxidMerged.
 * @see .TaxidMerged
 * @author Hibernate Tools
 */
public class TaxidMergedHome {

	private static final Log log = LogFactory.getLog(TaxidMergedHome.class);

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

	public void persist(TaxidMerged transientInstance) {
		log.debug("persisting TaxidMerged instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TaxidMerged instance) {
		log.debug("attaching dirty TaxidMerged instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TaxidMerged instance) {
		log.debug("attaching clean TaxidMerged instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TaxidMerged persistentInstance) {
		log.debug("deleting TaxidMerged instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TaxidMerged merge(TaxidMerged detachedInstance) {
		log.debug("merging TaxidMerged instance");
		try {
			TaxidMerged result = (TaxidMerged) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TaxidMerged findById(int id) {
		log.debug("getting TaxidMerged instance with id: " + id);
		try {
			TaxidMerged instance = (TaxidMerged) sessionFactory
					.getCurrentSession().get("TaxidMerged", id);
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

	public List<TaxidMerged> findByExample(TaxidMerged instance) {
		log.debug("finding TaxidMerged instance by example");
		try {
			List<TaxidMerged> results = (List<TaxidMerged>) sessionFactory
					.getCurrentSession().createCriteria("TaxidMerged")
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
