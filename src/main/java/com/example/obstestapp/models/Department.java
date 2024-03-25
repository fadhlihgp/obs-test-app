package com.example.obstestapp.models;

import java.util.List;

public class Department {
    private String name;
    private List<Student> students;

    public double getPass() {
        return pass;
    }

    public void setPass(double pass) {
        this.pass = pass;
    }

    private double pass;

    public Department(String name, List<Student> students, double pass) {
        this.name = name;
        this.students = students;
        this.pass = pass;
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
