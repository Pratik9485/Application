package com.inn.myapp.base.abstracts.service;

import com.inn.myapp.base.abstracts.entity.AbstractEntity;

 abstract class  GenericService<T extends AbstractEntity<N> , N> implements AbstractService<T, N> {

	
    public final T create(T entity) {
            return null;
    }

   
    public final T update(T entity) {
            return null;
    }

    public final boolean delete(T entity) {
            return false;
    }

    public final boolean isExistById(N number) {
            return false;
    }


}
