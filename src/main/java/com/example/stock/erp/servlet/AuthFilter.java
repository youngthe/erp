package com.example.stock.erp.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.util.ObjectUtils;

import java.io.IOException;


public class AuthFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        System.out.println("session : "+ session.getAttribute("user"));
        String loginURI = req.getContextPath() + "/login";
        boolean loggedIn = !ObjectUtils.isEmpty(session.getAttribute("user"));

        if (loggedIn || req.getRequestURI().equals(loginURI)) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect(loginURI);
        }
    }

}