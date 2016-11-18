/**
 * 
 */
package org.miguelmarzo.backend.preexamen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.miguelmarzo.backend.preexamen.models.Message;
import org.miguelmarzo.backend.preexamen.HibernateSession;

/**
 * 
 */
public class MessageDAO implements MessageDAOInterface {

	/* 
	 * selects one message by Id
	 * @param id
	 * @return message
	 */
	public Message selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Message message = (Message) session.get(Message.class, id);
	    
	    session.close();
	    return message;
	}

	/*
	 * retrieves all Message from db
	 * @return List of Message
	 */
	public List<Message> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Message> message = session.createQuery("from Message").list();
	    
	    session.close();
	    return message;
	}

	/*
	 * inserts a new Message in database
	 * @param new Message
	 */
	public void insert(Message message) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	 
	    session.persist(message);    
	    
	    session.getTransaction().commit();	         
	    session.close();

	}

	/*
	 * updates Message
	 * @param Message to update
	 */
	public void update(Message message) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(message); 
		    
		    session.getTransaction().commit();		 
		    session.close();
	}

	/*
	 * delete given Message
	 * @param Message to delete
	 */
	public void delete(Message message) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(message);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
