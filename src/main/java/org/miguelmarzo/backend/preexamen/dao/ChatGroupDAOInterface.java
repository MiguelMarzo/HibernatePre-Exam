package org.miguelmarzo.backend.preexamen.dao;

import java.util.List;

import org.miguelmarzo.backend.preexamen.models.ChatGroup;

/**
 * interface for ChatGroupDAO class
 */
public interface ChatGroupDAOInterface {
	
	public ChatGroup selectById(Long id);
	public List<ChatGroup> selectAll ();
	public void insert (ChatGroup role);
	public void update (ChatGroup role);
	public void delete (ChatGroup role);

}
