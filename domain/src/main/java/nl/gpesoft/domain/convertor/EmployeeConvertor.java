package nl.gpesoft.domain.convertor;


import nl.gpesoft.domain.Employee;
import nl.gpesoft.persistence.EmployeeJPA;

public class EmployeeConvertor {

    public static EmployeeJPA convertToPersistence (Employee employee) {
        EmployeeJPA employeeJPA = new EmployeeJPA();
        employeeJPA.setName(employee.getName());
        return employeeJPA;
    }

    public static Employee convertToDomain (EmployeeJPA employeeJPA) {
        Employee employee = new Employee();
        employee.setName(employeeJPA.getName());
        return employee;
    }
}
