package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.Md52keywords;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Md52keywords.
 * @see .Md52keywords
 * @author Hibernate Tools
 */
public class Md52keywordsHome {

	private static final Log log = LogFactory.getLog(Md52keywordsHome.class);

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

	public void persist(Md52keywords transientInstance) {
		log.debug("persisting Md52keywords instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Md52keywords instance) {
		log.debug("attaching dirty Md52keywords instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Md52keywords instance) {
		log.debug("attaching clean Md52keywords instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Md52keywords persistentInstance) {
		log.debug("deleting Md52keywords instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Md52keywords merge(Md52keywords detachedInstance) {
		log.debug("merging Md52keywords instance");
		try {
			Md52keywords result = (Md52keywords) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Md52keywords findById(java.lang.String id) {
		log.debug("getting Md52keywords instance with id: " + id);
		try {
			Md52keywords instance = (Md52keywords) sessionFactory
					.getCurrentSession().get("Md52keywords", id);
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

	public List<Md52keywords> findByExample(Md52keywords instance) {
		log.debug("finding Md52keywords instance by example");
		try {
			List<Md52keywords> results = (List<Md52keywords>) sessionFactory
					.getCurrentSession().createCriteria("Md52keywords")
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
