<%--
  Created by IntelliJ IDEA.
  User: Adam Faherty
  Date: 9/22/2015
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login Page</title>
</head>
<body>
    <h3>Sorry, you must log in before accessing this resource</h3>
    <form action="j_security_check" method="post">
        <table>
            <tr>
                <td>
                    User Name:
                </td>
                <td>
                    <input type="text" name="j_username" />
                </td>
            </tr>
            <tr>
                <td>
                    Password:
                </td>
                <td>
                    <input type="password" name="j_password" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Log In" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
