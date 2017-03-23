package nl.gpesoft.repository;

import nl.gpesoft.persistence.model.EmployeeEntity;

public class EmployeeJpaRepository extends JpaRepository<EmployeeEntity> {

    public EmployeeJpaRepository() {
        System.out.println("EmployeeJpaRepository is constructed");
    }
}