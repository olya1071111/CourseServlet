package com.academy.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("The filter is working!");

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession httpSession = httpServletRequest.getSession();

        if (httpSession.getAttribute("user") == null) {
            String login = httpServletRequest.getParameter("login");
            String password = httpServletRequest.getParameter("password");

            if ("admin".equalsIgnoreCase(login) && "admin".equalsIgnoreCase(password)) {
                httpSession.setAttribute("user", "admin");
                chain.doFilter(request, response);
            }
        } else {
            chain.doFilter(request, response);
        }
    }
}
