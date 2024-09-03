import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/Register")
public class Register extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String city = req.getParameter("city");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        Model model = new Model();
        model.setCity(city);
        model.setEmail(email);
        model.setName(name);
        HttpSession session = req.getSession();

        if(password == null || password.isEmpty() || name == null || name.isEmpty() || city == null || city.isEmpty() || email == null || email.isEmpty()){
            session.setAttribute("error", "Please enter all details");
            resp.sendRedirect("failure.jsp");
            return;
        }
        model.setPassword(password);
        session.setAttribute("name", name);
        try {
            int rowsEffected = model.register();

            if(rowsEffected==0){
                resp.sendRedirect("failure.jsp");
            }else {
                resp.sendRedirect("success.jsp");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
