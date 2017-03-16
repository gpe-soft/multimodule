package nl.gpesoft.repository;

public class Repositories {

    private static final Repositories INSTANCE = new Repositories();

    public static Repositories get() {
        return INSTANCE;
    }

    private EmployeeJpaRepository employeeRepository;

    private Repositories() {
    }

    public EmployeeJpaRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeJpaRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}