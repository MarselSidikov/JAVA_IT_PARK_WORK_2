package ru.itis.servlets;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itis.dao.UsersDao;
import ru.itis.models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class HelloServlet extends HttpServlet {

    UsersDao usersDao;
    @Override
    public void init() throws ServletException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ru.itis\\context.xml");

        usersDao = context.getBean(UsersDao.class);
    }

    // метод, обрабатывающий GET-запрос с клиента
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        List<User> users = usersDao.findAll();

//        PrintWriter writer = resp.getWriter();
//        writer.print("<table>");
//        writer.print("<th>Имя</th>");
//        writer.print("<th>Возраст</th>");
//        for (User user : users) {
//            writer.print("<tr>");
//            writer.print("<td>" + user.getName() + "</td>");
//            writer.print("<td>" + user.getAge() + "</td>");
//            writer.print("</tr>");
//        }
//        writer.print("</table>");

        req.setAttribute("users", users);
        req.getRequestDispatcher("views\\users.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        int height = Integer.parseInt(req.getParameter("height"));
        User user = new User(name, age, height);
        usersDao.save(user);

        req.setAttribute("users", usersDao.findAll());
        req.getRequestDispatcher("views\\users.jsp").forward(req, resp);
    }
}
