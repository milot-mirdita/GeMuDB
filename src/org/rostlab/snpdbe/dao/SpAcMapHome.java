package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.SpAcMap;
import org.rostlab.snpdbe.domain.SpAcMapId;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class SpAcMap.
 * @see .SpAcMap
 * @author Hibernate Tools
 */
public class SpAcMapHome {

	private static final Log log = LogFactory.getLog(SpAcMapHome.class);

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

	public void persist(SpAcMap transientInstance) {
		log.debug("persisting SpAcMap instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SpAcMap instance) {
		log.debug("attaching dirty SpAcMap instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SpAcMap instance) {
		log.debug("attaching clean SpAcMap instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SpAcMap persistentInstance) {
		log.debug("deleting SpAcMap instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SpAcMap merge(SpAcMap detachedInstance) {
		log.debug("merging SpAcMap instance");
		try {
			SpAcMap result = (SpAcMap) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SpAcMap findById(SpAcMapId id) {
		log.debug("getting SpAcMap instance with id: " + id);
		try {
			SpAcMap instance = (SpAcMap) sessionFactory.getCurrentSession()
					.get("SpAcMap", id);
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

	public List<SpAcMap> findByExample(SpAcMap instance) {
		log.debug("finding SpAcMap instance by example");
		try {
			List<SpAcMap> results = (List<SpAcMap>) sessionFactory
					.getCurrentSession().createCriteria("SpAcMap")
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
