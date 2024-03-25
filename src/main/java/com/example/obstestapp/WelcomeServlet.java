package com.example.obstestapp;

import com.example.obstestapp.models.Department;
import com.example.obstestapp.models.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "WelcomeServlet", value = "/welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Simpan data departemen dan siswa dalam objek
        List<Student> students1 = new ArrayList<>() {{
            add(new Student("S1", 35, "John"));
            add(new Student("S2", 70, "Erick"));
            add(new Student("S3", 60, "Indra"));
            add(new Student("S4", 90, "Surya"));
        }};

        List<Student> students2 = new ArrayList<>() {{
            add(new Student("S5", 30, "Yono"));
        }};

        List<Student> students3 = new ArrayList<>() {{
            add(new Student("S6", 32, "John"));
            add(new Student("S7", 70, "Erick"));
            add(new Student("S8", 20, "Indra"));
        }};

        List<Department> departments = new ArrayList<Department>() {{
            add(new Department("Dep 1", students1));
            add(new Department("Dep 2", students2));
            add(new Department("Dep 3", students3));
        }};


        // Simpan data dalam request attribute
        request.setAttribute("departments", departments);

        // Forward ke halaman JSP
        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
