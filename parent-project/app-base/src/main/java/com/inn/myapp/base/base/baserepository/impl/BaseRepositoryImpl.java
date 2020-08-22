package com.inn.myapp.base.base.baserepository.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.inn.myapp.base.baserepository.BaseRepository;

public class BaseRepositoryImpl<T, I> extends SimpleJpaRepository<T, I> implements BaseRepository<T, I> {

	
	public final EntityManager entityManager;

	public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;
	}

	@Override
	public T createEntity(T entity) {
		if(entity==null) {
			throw new IllegalArgumentException("Entity must not be null !!!");
		}
		return super.save(entity);
	}

	@Override
	public T updateEntity(T entity) {
		if(entity==null) {
			throw new IllegalArgumentException("Update Entity must not be null  !!!");
		}
		return super.save(entity);
	}

	@Override
	public T findEntityByPk(I id) {
		Optional<T> findById = super.findById(id);
		return findById.isPresent() ? findById.get() : null;
	}

	@Override
	public boolean isEntityExistByPk(I id) {

		Optional<T> findById = super.findById(id);
		return findById.isPresent() ? Boolean.TRUE : Boolean.FALSE;
	}

	@Override
	public List<T> findAllEntity() {

		return super.findAll();
	}

	@Override
	public void deleteEntityByPk(I id) {
		super.deleteById(id);

	}

	@Override
	public void deleteEntity(T entity) {
		super.delete(entity);
	}

	@Override
	public void deleteAllEntity() {
		super.deleteAll();
	}

}
