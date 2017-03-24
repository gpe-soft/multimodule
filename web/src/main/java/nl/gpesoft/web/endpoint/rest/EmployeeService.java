package nl.gpesoft.web.endpoint.rest;

import nl.gpesoft.domain.Employee;
import nl.gpesoft.domain.repository.EmployeeRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employee/{id}")
public class EmployeeService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("id") Long id) {
        Employee employee = new Employee();
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.getNumberOfEmployees();
        return employee;
    }
}