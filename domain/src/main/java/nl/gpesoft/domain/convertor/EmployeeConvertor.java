package nl.gpesoft.domain.convertor;


import nl.gpesoft.domain.Employee;
import nl.gpesoft.persistence.model.EmployeeEntity;

public class EmployeeConvertor {

    public static EmployeeEntity convertToPersistence (Employee employee) {
        EmployeeEntity employeeJPA = new EmployeeEntity();
        employeeJPA.setName(employee.getName());
        return employeeJPA;
    }

    public static Employee convertToDomain (EmployeeEntity employeeEntity) {
        Employee employee = new Employee();
        employee.setName(employeeEntity.getName());
        return employee;
    }
}