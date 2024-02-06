package com.academy.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/course")
public class CourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");

        out.println("Course: Java, lecturer: Ivanov <br>");
        out.println("Course: Python, lecturer: Petrov <br>");
        out.println("Course: JavaScript, lecturer: Sidorov <br>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("Create book");
        out.println("</body>");
        out.println("</html>");

        out.close();

    }
}
