<%@ page import="java.sql.*"%>
<%
    String username = request.getParameter("username");   
    String password = request.getParameter("password");
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root", "root");
    Statement st = con.createStatement();
    int i = st.executeUpdate("insert into user(firstname, lastname, email, username, password, regdate) values ('" + firstname + "','"
    + lastname + "','" + email + "','" + username + "','" + password + "', CURDATE())");
    if (i > 0) {
        response.sendRedirect("welcome.jsp");
        
    } else {
        response.sendRedirect("index.jsp");
    }
%>