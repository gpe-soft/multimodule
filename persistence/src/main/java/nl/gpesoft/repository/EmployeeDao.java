package nl.gpesoft.repository;

import nl.gpesoft.persistence.EmployeeJPA;
import java.util.List;

public interface EmployeeDao extends BaseDao<Integer, EmployeeJPA> {

    public List<EmployeeJPA> getAllEmployeesEmployedLastWeek();

}