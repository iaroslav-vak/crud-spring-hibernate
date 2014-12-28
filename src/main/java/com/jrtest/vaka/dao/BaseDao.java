package com.jrtest.vaka.dao;

import com.jrtest.vaka.model.BaseEntity;

/**
 * @author Iaroslav
 * @since 20.12.2014 15:31
 */
public interface BaseDao<T extends BaseEntity> {
    T create(T entity);

    T read(int id);

    T update(int id, T entity);

    boolean delete(int id);
}