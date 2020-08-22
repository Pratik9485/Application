package com.inn.myapp.base.baserepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @Author Pratik Mahajan
 * 
 */

@NoRepositoryBean
public interface BaseRepository<T, I> extends CrudRepository<T, I> {

	
	  T createEntity(T entity);
	  
	  T updateEntity(T entity);
	  
	  T findEntityByPk(I id);
	  
	  boolean existsEntityById(I id);
	  
	  List<T> findAllEntity();
	  
	  void deleteEntityByPk(I id);
	  
	  void deleteEntity(T entity);
	  
	  void deleteAllEntity();
	 
}
