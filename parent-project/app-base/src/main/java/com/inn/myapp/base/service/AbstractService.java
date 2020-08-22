package com.inn.myapp.base.service;

import java.util.List;

/*
 * @Author Pratik Mahajan
*/

interface AbstractService<T, I> {

	T createEntity(T entity);

	T updateEntity(T entity);

	T findEntityByPk(I id);

	boolean existsEntityById(I id);

	List<T> findAllEntity();

	void deleteEntityByPk(I id);

	void deleteEntity(T entity);

	void deleteAllEntity();
}
