package nl.gpesoft.domain.convertor;

import nl.gpesoft.domain.Employee;
import nl.gpesoft.persistence.model.EmployeeEntity;

public class EmployeeConvertor {

    public static EmployeeEntity convertToPersistence (Employee employee) {
        return EmployeeEntity.builder().
                name(employee.getName()).
                employeeNumber(employee.getEmployeeNumber()).
                employedDate(employee.getEmployedDate()).
                socialSecurityNumber(employee.getSocialSecurityNumber()).build();
    }

    public static Employee convertToDomain (EmployeeEntity employeeEntity) {
        return Employee.builder().
                name(employeeEntity.getName()).
                employeeNumber(employeeEntity.getEmployeeNumber()).
                employedDate(employeeEntity.getEmployedDate()).
                socialSecurityNumber(employeeEntity.getSocialSecurityNumber()).build();
    }
}