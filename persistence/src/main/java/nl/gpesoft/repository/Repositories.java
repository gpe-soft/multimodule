package nl.gpesoft.repository;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class Repositories {

    @Inject
    private EmployeeJpaRepository employeeRepository;

    private Repositories() {
    }

    public EmployeeJpaRepository getEmployeeRepository() {
        return employeeRepository;
    }

}