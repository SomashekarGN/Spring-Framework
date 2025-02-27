<%@ page language="java" contentType="text/html; charset=US-ASCII"
       pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User List</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">

    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Arial', sans-serif;
        }

        .container {
            margin-top: 50px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #343a40;
        }

        table {
            width: 100%;
            background-color: #fff;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        th {
            background-color: #343a40;
            color: white;
        }

        td, th {
            text-align: center;
            padding: 12px;
            border-bottom: 1px solid #dee2e6;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        .btn {
            padding: 6px 12px;
            font-size: 14px;
        }

        .btn-danger {
            background-color: #dc3545;
            border: none;
        }

        .btn-primary {
            background-color: #007bff;
            border: none;
        }

        .btn:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>User Management</h2>

    <table class="table table-bordered table-hover">
        <thead>
            <tr>
                <th>Sl.No</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email Id</th>
                <th>Phone Number</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <ref:forEach items="${ listOfUsers }" var="dto">
                <tr>
                    <td>${ dto.getId() }</td>
                    <td>${ dto.getFirstName() }</td>
                    <td>${ dto.getLastName() }</td>
                    <td>${ dto.getEmail() }</td>
                    <td>${ dto.getPhoneNumber() }</td>
                    <td>
                        <a href="fetchUser?userId=${ dto.getId() }" class="btn btn-primary btn-sm">Edit</a>
                        <a href="delete?id=${ dto.getId() }" class="btn btn-danger btn-sm">Remove</a>
                    </td>
                </tr>
            </ref:forEach>
        </tbody>
    </table>
</div>

<!-- Bootstrap JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>

</body>
</html>
