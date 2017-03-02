package repository;

import nl.gpesoft.persistence.Employee;
import java.util.List;

public class EmployeeJpaDao extends JpaDao<Integer, Employee> implements EmployeeDao {

    public List<Employee> getAllEmployeesEmployedLastWeek() {
        return entityManager.createQuery("Select t from " + Employee.class.getSimpleName() + " t where Employee.employedDate >= current_date - 7 ").getResultList();
    }
}