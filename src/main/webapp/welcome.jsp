<%@ page import="java.util.List" %>
<%@ page import="com.example.obstestapp.models.Department" %>
<%@ page import="com.example.obstestapp.models.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
<p>Welcome <%= session.getAttribute("username") %></p>

<table border="1">
    <thead>
    <tr>
        <th>Department</th>
        <th>Pass %</th>
        <th>Student ID</th>
        <th>Marks</th>
    </tr>
    </thead>
    <tbody>
    <% List<Department> departments = (List<Department>) request.getAttribute("departments"); %>
    <%for (Department department : departments) { %>
    <tr>
        <td rowspan="<%= department.getStudents().size() + 1 %>"><%= department.getName() %></td>
            <td rowspan="<%= department.getStudents().size() + 1 %>"><%= department.getPass() %></td>
        <% for (Student student : department.getStudents()) { %>
    </tr>
    <tr>
        <td><%= student.getId() %></td>
        <td><%= student.getMarks() %></td>
    </tr>
    <% } %>
    <% } %>
    </tbody>
</table>

</body>
</html>
