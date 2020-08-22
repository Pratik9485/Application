package com.inn.myapp.base.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.inn.myapp.base.baserepository.BaseRepository;

@Transactional(rollbackOn = Exception.class)
public abstract class GenericService<T, I> implements AbstractService<T, I> {

	@Autowired
	BaseRepository<T, I> baseRepository;

	@Override
	public T createEntity(T entity) {
		return baseRepository.createEntity(entity);
	}

	@Override
	public T updateEntity(T entity) {
		return baseRepository.updateEntity(entity);
	}

	@Override
	public T findEntityByPk(I id) {

		return baseRepository.findEntityByPk(id);
	}

	@Override
	public boolean existsEntityById(I id) {

		return baseRepository.isEntityExistByPk(id);
	}

	@Override
	public List<T> findAllEntity() {

		return baseRepository.findAllEntity();
	}

	@Override
	public void deleteEntityByPk(I id) {

		baseRepository.deleteEntityByPk(id);

	}

	@Override
	public void deleteEntity(T entity) {

		baseRepository.deleteEntity(entity);
	}

	@Override
	public void deleteAllEntity() {

		baseRepository.deleteAllEntity();
	}

}
