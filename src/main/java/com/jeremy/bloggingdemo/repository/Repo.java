package com.jeremy.bloggingdemo.repository;

import java.util.List;

/**
 * Created by jeremy on 11/2/17.
 */
public interface Repo<T> {

    T create(T t);
    T update(T t);
    T findOne(int id);
    List<T> findAll();
    T delete(int id);
}
