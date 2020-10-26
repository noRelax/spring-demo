package com.relax.www.dao.reflect;

import java.io.Serializable;

public interface BaseDao<T> {
    void add(T t);//增
    void delete(Serializable id);//删
    void update(T t);//改
    T findOne(Serializable id);//查一条记录
}