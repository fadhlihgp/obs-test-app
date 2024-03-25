<%@ page import="java.util.List" %>
<%@ page import="com.example.obstestapp.models.Department" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
<p>Welcome <c:out value="${username}" /></p>

<table border="1">
    <thead>
    <tr>
        <th>Department</th>
        <th>Student ID</th>
        <th>Marks</th>
<%--        <th>Pass %</th>--%>
    </tr>
    </thead>
    <tbody>
    <% List<Department> departments = (List<Department>) request.getAttribute("departments"); %>
    <% for (Department department : departments) {%>
    <tr>
        <td rowspan="<% department.getStudents().size(); %>"><%=department.getName() %>
        </td>
<%--        <td><%=department.getAddress()%>--%>
<%--        </td>--%>
<%--        <td><%=department.getPhone() %>--%>
<%--        </td>--%>
    </tr>
    <%}%>
    </tbody>
</table>
</body>
</html>
