package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.SeqsContainingSnps;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class SeqsContainingSnps.
 * @see .SeqsContainingSnps
 * @author Hibernate Tools
 */
public class SeqsContainingSnpsHome {

	private static final Log log = LogFactory
			.getLog(SeqsContainingSnpsHome.class);

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

	public void persist(SeqsContainingSnps transientInstance) {
		log.debug("persisting SeqsContainingSnps instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SeqsContainingSnps instance) {
		log.debug("attaching dirty SeqsContainingSnps instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SeqsContainingSnps instance) {
		log.debug("attaching clean SeqsContainingSnps instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SeqsContainingSnps persistentInstance) {
		log.debug("deleting SeqsContainingSnps instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SeqsContainingSnps merge(SeqsContainingSnps detachedInstance) {
		log.debug("merging SeqsContainingSnps instance");
		try {
			SeqsContainingSnps result = (SeqsContainingSnps) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SeqsContainingSnps findById(java.lang.String id) {
		log.debug("getting SeqsContainingSnps instance with id: " + id);
		try {
			SeqsContainingSnps instance = (SeqsContainingSnps) sessionFactory
					.getCurrentSession().get("SeqsContainingSnps", id);
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

	public List<SeqsContainingSnps> findByExample(SeqsContainingSnps instance) {
		log.debug("finding SeqsContainingSnps instance by example");
		try {
			List<SeqsContainingSnps> results = (List<SeqsContainingSnps>) sessionFactory
					.getCurrentSession().createCriteria("SeqsContainingSnps")
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
