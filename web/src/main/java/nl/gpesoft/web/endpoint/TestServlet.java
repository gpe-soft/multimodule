package nl.gpesoft.web.endpoint;

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
        TestDelegate testDelegate = new TestDelegate();
        String name = request.getParameter("name");
        if (!name.isEmpty()) {
            id = testDelegate.saveTest(name);
        }
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.println("<html><body>TestEntity toegevoegd met id: " + id);
        outputStream.println("</body></html>");
        outputStream.close();
    }
}