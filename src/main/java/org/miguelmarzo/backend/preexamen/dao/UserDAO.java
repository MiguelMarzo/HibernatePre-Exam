package org.miguelmarzo.backend.preexamen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.miguelmarzo.backend.preexamen.models.User;
import org.miguelmarzo.backend.preexamen.HibernateSession;

public class UserDAO implements UserDAOInterface {

	/* 
	 * selects one Student by Id
	 * @param id
	 * @return Student
	 */
	public User selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    User student = (User) session.get(User.class, id);
	    
	    session.close();
	    return student;
	}

	/*
	 * retrieves all Students from db
	 * @return List of Students
	 */
	public List<User> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<User> studentes = session.createQuery("from Student").list();
	    
	    session.close();
	    return studentes;
	}

	/*
	 * inserts a new Student in database
	 * retrieves generated id and sets to Student instance
	 * @param new Student
	 */
	public void insert(User student) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(student);
	         
	    session.getTransaction().commit();
	    session.close();

	}

	/*
	 * updates Student
	 * @param Student to update
	 */
	public void update(User student) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(student);
		 
		    session.getTransaction().commit();
		    session.close();
	}

	/*
	 * delete given Student
	 * @param Student to delete
	 */
	public void delete(User student) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(student);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
