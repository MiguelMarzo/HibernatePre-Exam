package org.miguelmarzo.backend.preexamen.dao;

import java.util.List;

import org.miguelmarzo.backend.preexamen.models.Message;

/**
 * interface for MessageDAO class
 */
public interface MessageDAOInterface {
	
	public Message selectById(Long id);
	public List<Message> selectAll ();
	public void insert (Message message);
	public void update (Message message);
	public void delete (Message message);

}
