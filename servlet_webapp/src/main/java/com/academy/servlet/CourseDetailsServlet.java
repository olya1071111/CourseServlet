package com.academy.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/course_details")
public class CourseDetailsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");

        out.println("Course: Introduction to Java <br>");
        out.println("Lecturer : Ivanov Ivan Ivanovich <br>");
        out.println("Program course: data types, operators, classes and objects, oop,  multithreading <br>");
        out.println("Price course: 1500 BYN <br>");

        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
