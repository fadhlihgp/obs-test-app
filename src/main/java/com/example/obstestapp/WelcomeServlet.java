package com.example.obstestapp;

import com.example.obstestapp.models.Department;
import com.example.obstestapp.models.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
            add(new Department("Dep 1", students1, calculatePass(students1, students1.size())));
            add(new Department("Dep 2", students2, calculatePass(students2, students2.size())));
            add(new Department("Dep 3", students3, calculatePass(students3, students3.size())));
        }};

        request.setAttribute("departments", departments);

        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private double calculatePass(List<Student> students, int countStudent) {
        double passCount1 = 0;
        for (Student student : students) {
            if (student.getMarks() >= 60) {
                passCount1++;
            }
        }
        return passCount1/countStudent * 100;
    }
}
