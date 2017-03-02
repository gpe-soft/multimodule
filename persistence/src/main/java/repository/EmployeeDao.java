package repository;

import nl.gpesoft.persistence.Employee;
import java.util.List;

public interface EmployeeDao extends BaseDao<Integer, Employee> {

    public List<Employee> getAllEmployeesEmployedLastWeek();

}