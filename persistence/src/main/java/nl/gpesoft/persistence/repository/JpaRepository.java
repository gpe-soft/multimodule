package nl.gpesoft.persistence.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class JpaRepository<E> implements Repository<E> {

    protected Class<E> entityClass;

    @PersistenceContext(unitName = "multimodule")
    protected EntityManager entityManager;

    public void add(E entity) {
        entityManager.persist(entity);
    }

    public void update(E entity) {
        entityManager.merge(entity);
    }

    public void remove(E entity) {
        entityManager.remove(entity);
    }

}