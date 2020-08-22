package com.inn.myapp.base.baserepository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @Author Pratik Mahajan
 * 
 */

@NoRepositoryBean
public interface BaseRepository<T, I> extends CrudRepository<T, I> {

	<S extends T> S save(S entity);

	<S extends T> Iterable<S> saveAll(Iterable<S> entities);

	Optional<T> findById(I id);

	boolean existsById(I id);

	Iterable<T> findAll();

	long count();

	void deleteById(I id);

	void delete(T entity);

	void deleteAll();
}
