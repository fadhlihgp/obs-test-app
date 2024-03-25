package com.example.obstestapp.models;

public class Student {
    private String id;
    private int marks;
    private String name;

    public Student(String id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
