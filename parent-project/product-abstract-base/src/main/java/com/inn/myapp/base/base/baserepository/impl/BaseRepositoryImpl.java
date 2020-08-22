package com.inn.myapp.base.base.baserepository.impl;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.inn.myapp.base.baserepository.BaseRepository;

public class BaseRepositoryImpl<T , I> extends SimpleJpaRepository<T, I> implements BaseRepository<T, I> {

	

	@Autowired
	public EntityManager entityManager;
	
	public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
	}
	
	@Override
	public final <S extends T> S save(S entity) {
		entityManager.persist(entity);
		return null;
	}


	@Override
	public final Optional<T> findById(I id) {
		return null;
	}

	@Override
	public final boolean existsById(I id) {
		return false;
	}



	@Override
	public final long count() {
		return 0;
	}

	@Override
	public final void deleteById(I id) {
		
	}

	@Override
	public final void delete(T entity) {
		
	}

	@Override
	public final  void deleteAll(Iterable<? extends T> entities) {
		
	}

	@Override
	public final void deleteAll() {
		
	}

}
