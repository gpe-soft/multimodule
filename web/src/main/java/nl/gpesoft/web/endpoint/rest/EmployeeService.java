package nl.gpesoft.web.endpoint.rest;

import nl.gpesoft.domain.Employee;
import nl.gpesoft.domain.repository.EmployeeRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("/rest/employee/{id}")
public class EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployee(@PathParam("id") Long id) {
        Employee employee = employeeRepository.getEmployee(id);
        return Response.status(200).entity(employee).build();
    }
}