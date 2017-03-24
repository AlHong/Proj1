package com.main;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional 
public interface UserDAO extends CrudRepository<RecievedData, Long> {
	
	public RecievedData findById (int id);
	public RecievedData findByUrl (String url);
	public RecievedData findByViews (int views);
	public RecievedData findByLikes (int likes);
	public RecievedData findByDislikes (int dislikes);
	
}
