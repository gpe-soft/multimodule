package nl.gpesoft.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class JpaRepository<E> implements Repository<E> {

    protected Class<E> entityClass;

    @PersistenceContext(name = "multimodule")
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

    public E getById(Long id) {
        return entityManager.find(entityClass, id);
    }

    public List<E> getAll() {
        return entityManager.createQuery("Select t from " + entityClass.getSimpleName() + " t").getResultList();
    }
}