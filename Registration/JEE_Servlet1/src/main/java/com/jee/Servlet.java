package com.jee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter out = resp.getWriter();

        Connection con = Database.loadDriver();
        if (con == null) {
            out.println("DB Connection Failed");
            return;
        }

        try {
            // Correct SQL query using parameters
            String sql = "SELECT * FROM audit.users WHERE username = ? AND password = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            // Set values for the ? placeholders
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                out.println("Login Successful!");
            } else {
                out.println("Invalid Username or Password!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("Error occurred!");
        }
    }
}
