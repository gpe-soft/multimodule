package nl.gpesoft.repository;

import java.util.List;

public interface Repository<E> {
    E getById(Long id);
    List<E> getAll();
    void add(E entity);
    void update(E entity);
    void remove(E entity);
}