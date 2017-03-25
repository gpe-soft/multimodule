package nl.gpesoft.persistence.repository;

import nl.gpesoft.persistence.model.EmployeeEntity;

public class EmployeeJpaRepository extends JpaRepository<EmployeeEntity> {

    public EmployeeEntity getById(Long id) {
        return entityManager.find(EmployeeEntity.class, id);
    }
}