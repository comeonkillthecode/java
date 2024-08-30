import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

@WebServlet("/ServletLife")
public class ServletLifeCycle extends HttpServlet {

    static
    {
        System.out.println("Servlet is loaded");
    }

    public ServletLifeCycle() {
        System.out.println("Servlet Object is created");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet Initialized");
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service method to handle http request and  back");
    }

    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}
