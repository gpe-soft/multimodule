package nl.gpesoft.domain;


import nl.gpesoft.domain.convertor.EmployeeConvertor;
import nl.gpesoft.persistence.EmployeeJPA;
import nl.gpesoft.repository.EmployeeJpaDao;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Piet");
        EmployeeJPA employeeJPA = EmployeeConvertor.convertToPersistence(employee);

        EmployeeJpaDao employeeJpaDao = new EmployeeJpaDao();
        employeeJpaDao.persist(employeeJPA);
    }
}