package nl.gpesoft.web.client;

import nl.gpesoft.domain.Employee;

public class WebClient implements IEmployee {

    public Employee getEmployee(Long id) {
        return new Employee();
    }
}