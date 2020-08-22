package com.inn.myapp.base.abstracts.service;

import java.util.Optional;

interface AbstractService<T , I> {

	<S extends T> S save(S entity);

	<S extends T> Iterable<S> saveAll(Iterable<S> entities);

	Optional<T> findByI(I id);

	boolean existsById(I id);

	Iterable<T> findAll();

	Iterable<T> findAllById(Iterable<I> id);

	long count();

	void deleteById(I id);

	void delete(T entity);

	void deleteAll(Iterable<? extends T> entities);

	void deleteAll();
}
