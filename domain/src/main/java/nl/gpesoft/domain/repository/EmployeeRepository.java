package nl.gpesoft.domain.repository;

import nl.gpesoft.domain.Employee;
import nl.gpesoft.domain.convertor.EmployeeConvertor;
import nl.gpesoft.persistence.repository.EmployeeJpaRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class EmployeeRepository {

    @Inject
    private EmployeeJpaRepository employeeJpaRepository;

    public Employee getEmployee(Long id) {
        return EmployeeConvertor.convertToDomain(employeeJpaRepository.getById(id));
    }
}