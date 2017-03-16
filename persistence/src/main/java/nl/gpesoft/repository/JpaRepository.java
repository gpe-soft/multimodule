package nl.gpesoft.repository;

public interface JpaRepository {

    void addObject(Object object);
    void updateObject(Object object);
    void removeObject(Object object);
}