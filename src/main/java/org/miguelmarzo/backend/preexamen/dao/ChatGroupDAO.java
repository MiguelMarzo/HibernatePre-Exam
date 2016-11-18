/**
 * 
 */
package org.miguelmarzo.backend.preexamen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.miguelmarzo.backend.preexamen.models.ChatGroup;
import org.miguelmarzo.backend.preexamen.HibernateSession;

/**
 * 
 */
public class ChatGroupDAO implements ChatGroupDAOInterface {

	/* 
	 * selects one ChatGroup by Id
	 * @param id
	 * @return ChatGroup
	 */
	public ChatGroup selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    ChatGroup chatGroup = (ChatGroup) session.get(ChatGroup.class, id);
	    
	    session.close();
	    return chatGroup;
	}

	/*
	 * retrieves all chatGroup from db
	 * @return List of chatGroups
	 */
	public List<ChatGroup> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<ChatGroup> chatGroups = session.createQuery("from ChatGroup").list();
	    
	    session.close();
	    return chatGroups;
	}

	/*
	 * inserts a new chatGroup in database
	 * @param new chatGroup
	 */
	public void insert(ChatGroup chatGroup) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	 
	    session.persist(chatGroup);    
	    
	    session.getTransaction().commit();	         
	    session.close();

	}

	/*
	 * updates chatGroup
	 * @param chatGroup to update
	 */
	public void update(ChatGroup chatGroup) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(chatGroup); 
		    
		    session.getTransaction().commit();		 
		    session.close();
	}

	/*
	 * delete given chatGroup
	 * @param chatGroup to delete
	 */
	public void delete(ChatGroup chatGroup) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(chatGroup);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
