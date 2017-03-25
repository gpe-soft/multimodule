package nl.gpesoft.domain.convertor;


import nl.gpesoft.domain.Employee;
import nl.gpesoft.persistence.model.EmployeeEntity;

public class EmployeeConvertor {

    public static EmployeeEntity convertToPersistence (Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employee.getName());
        return employeeEntity;
    }

    public static Employee convertToDomain (EmployeeEntity employeeEntity) {
        Employee employee = new Employee();
        employee.setName(employeeEntity.getName());
        employee.setEmployedDate(employeeEntity.getEmployedDate());
        employee.setEmployeeNumber(employeeEntity.getEmployeeNumber());
        employee.setSocialSecurityNumber(employeeEntity.getSocialSecurityNumber());
        return employee;
    }
}