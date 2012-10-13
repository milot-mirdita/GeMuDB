package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.Omim2disease;
import org.rostlab.snpdbe.domain.Omim2diseaseId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Omim2disease.
 * @see .Omim2disease
 * @author Hibernate Tools
 */
public class Omim2diseaseHome {

	private static final Log log = LogFactory.getLog(Omim2diseaseHome.class);

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

	public void persist(Omim2disease transientInstance) {
		log.debug("persisting Omim2disease instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Omim2disease instance) {
		log.debug("attaching dirty Omim2disease instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Omim2disease instance) {
		log.debug("attaching clean Omim2disease instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Omim2disease persistentInstance) {
		log.debug("deleting Omim2disease instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Omim2disease merge(Omim2disease detachedInstance) {
		log.debug("merging Omim2disease instance");
		try {
			Omim2disease result = (Omim2disease) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Omim2disease findById(Omim2diseaseId id) {
		log.debug("getting Omim2disease instance with id: " + id);
		try {
			Omim2disease instance = (Omim2disease) sessionFactory
					.getCurrentSession().get("Omim2disease", id);
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

	public List<Omim2disease> findByExample(Omim2disease instance) {
		log.debug("finding Omim2disease instance by example");
		try {
			List<Omim2disease> results = (List<Omim2disease>) sessionFactory
					.getCurrentSession().createCriteria("Omim2disease")
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
