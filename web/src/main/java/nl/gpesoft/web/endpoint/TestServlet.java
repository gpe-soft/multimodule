package nl.gpesoft.web.endpoint;

import nl.gpesoft.domain.Employee;
import nl.gpesoft.domain.repository.EmployeeRepository;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = null;
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            response.sendError(500, "Encoding not supported");
        }
        response.setContentType("text/html");
        String name = request.getParameter("name");
        if (!name.isEmpty()) {
            EmployeeRepository employeeRepository = new EmployeeRepository();
            Employee employee = new Employee();
            employee.setName(request.getParameter("name"));
            id = employeeRepository.addNewEmployee(employee);
        }
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.println("<html><body>Employee added with id: " + id);
        outputStream.println("</body></html>");
        outputStream.close();
    }
}