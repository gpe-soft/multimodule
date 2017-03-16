package nl.gpesoft.domain;


import nl.gpesoft.domain.convertor.EmployeeConvertor;
import nl.gpesoft.persistence.model.EmployeeEntity;
import nl.gpesoft.repository.EmployeeRepository;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Piet");
        EmployeeEntity employeeEntity = EmployeeConvertor.convertToPersistence(employee);

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.add(employeeEntity);
    }
}