package com.jeremy.bloggingdemo.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by jeremy on 11/2/17.
 */
@Repository
@Transactional
public abstract class GenericRepo<T> implements Repo<T>{

    // Use reflection to get the class type of the paramaterized type
    private final Class<T> type = (Class)
            ((ParameterizedType) getClass()
                    .getGenericSuperclass())
                    .getActualTypeArguments()[0];
    @Autowired
    protected SessionFactory sessionFactory;

    protected Session session;

    @Override
    public T create(T t) {
        session = sessionFactory.getCurrentSession();
        session.save(t);
        return t;
    }

    @Override
    public T update(T t) {
        session = sessionFactory.getCurrentSession();
        session.update(t);
        return t;
    }

    @Override
    public T findOne(int id) {
        session = sessionFactory.getCurrentSession();
        return session.get(type ,  id);
    }

    @Override
    public List<T> findAll() {
        session = sessionFactory.getCurrentSession();
        List<T> list = session.createCriteria(type)
                        .list();
        return list;
    }

    @Override
    public T delete(int id) {
        session = sessionFactory.getCurrentSession();
        T result = findOne(id);
        session.delete(result);
        return result;
    }

    public GenericRepo() {

    }
}
