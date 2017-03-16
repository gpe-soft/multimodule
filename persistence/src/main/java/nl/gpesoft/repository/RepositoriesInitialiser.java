package nl.gpesoft.repository;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
public class RepositoriesInitialiser {

    @Inject
    private EmployeeJpaRepository employeeRepository;

    @PostConstruct
    public void init() {
        Repositories.get().setEmployeeRepository(this.employeeRepository);
    }
}