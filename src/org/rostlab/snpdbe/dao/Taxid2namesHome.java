package org.rostlab.snpdbe.dao;
// default package
// Generated 21.08.2012 14:34:30 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.rostlab.snpdbe.domain.Taxid2names;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Taxid2names.
 * @see .Taxid2names
 * @author Hibernate Tools
 */
public class Taxid2namesHome {

	private static final Log log = LogFactory.getLog(Taxid2namesHome.class);

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

	public void persist(Taxid2names transientInstance) {
		log.debug("persisting Taxid2names instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Taxid2names instance) {
		log.debug("attaching dirty Taxid2names instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Taxid2names instance) {
		log.debug("attaching clean Taxid2names instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Taxid2names persistentInstance) {
		log.debug("deleting Taxid2names instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Taxid2names merge(Taxid2names detachedInstance) {
		log.debug("merging Taxid2names instance");
		try {
			Taxid2names result = (Taxid2names) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Taxid2names findById(int id) {
		log.debug("getting Taxid2names instance with id: " + id);
		try {
			Taxid2names instance = (Taxid2names) sessionFactory
					.getCurrentSession().get("Taxid2names", id);
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

	public List<Taxid2names> findByExample(Taxid2names instance) {
		log.debug("finding Taxid2names instance by example");
		try {
			List<Taxid2names> results = (List<Taxid2names>) sessionFactory
					.getCurrentSession().createCriteria("Taxid2names")
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
