package repository;

import java.util.List;

public interface BaseDao<K, E> {

    void persist(E entity);

    void remove(E entity);

    E findById(K id);

    List<E> findAll();
}