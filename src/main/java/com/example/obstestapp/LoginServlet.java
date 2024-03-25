package com.example.obstestapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Contoh hardcoded userID dan password
        String validUsername = "admin";
        String validPassword = "password";

        if (username.equals(validUsername) && password.equals(validPassword)) {
            // Jika username dan password benar, redirect ke halaman welcome
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp");
        } else {
            // Jika username atau password salah, kembali ke halaman login dengan pesan error
            request.setAttribute("error", "Invalid username or password");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
