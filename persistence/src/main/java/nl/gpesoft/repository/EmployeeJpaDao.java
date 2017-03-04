package nl.gpesoft.repository;

import nl.gpesoft.persistence.EmployeeJPA;
import java.util.List;

public class EmployeeJpaDao extends JpaDao<Integer, EmployeeJPA> implements EmployeeDao {

    public List<EmployeeJPA> getAllEmployeesEmployedLastWeek() {
        return entityManager.createQuery("Select t from " + EmployeeJPA.class.getSimpleName() + " t where EmployeeJPA.employedDate >= current_date - 7 ").getResultList();
    }
}