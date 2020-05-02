package com.inn.myapp.base.abstracts.service;

interface AbstractService<T , P> {

	public abstract T create(T entity);

    public abstract T update(T entity);

    public abstract boolean delete(T entity);

    public abstract boolean isExistById(P number);
    
    
}
