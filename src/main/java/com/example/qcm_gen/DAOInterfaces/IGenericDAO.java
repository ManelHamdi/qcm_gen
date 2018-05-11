package com.example.qcm_gen.DAOInterfaces;

import java.util.List;

public interface IGenericDAO<E, PK extends java.io.Serializable> {

    PK save(E newInstance);

    boolean saveBool(E newInstance);

    boolean update(E transientObject);

    void saveOrUpdate(E transientObject);

    void delete(E persistentObject);

    List<E> findAll();

    List<E> findByCriteria(String propertyName1, Object value1);

    E findById(int id);
//	public Object findBy(Class<?> clazz, Serializable id);


}
