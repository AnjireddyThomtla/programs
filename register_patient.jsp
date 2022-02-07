<html>
<body bgcolor="wheat">

<%@page import="java.sql.*" %>

<%
Connection con=null;
PreparedStatement pst=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/Anji";
String username="root";
String password="Anji@123";
con=DriverManager.getConnection(url, username, password);
System.out.println("\n\n \tDATA ADDED SUCCESSFULLY... \n");
	
	String name=request.getParameter("username");
	String email=request.getParameter("email");
	String pass=request.getParameter("password");
	//String phone=request.getParameter("phone");
	//long mobile=Long.parseLong(phone);
	String address=request.getParameter("address");
		
	String query="insert into  patientreg (name,email,password,address) values(?,?,?,?)";
	pst=con.prepareStatement(query);
	pst.setString(1, name);
	pst.setString(2, email);
	pst.setString(3, pass);
//	pst.setLong(4, mobile);
	pst.setString(4, address);
	
	int count=pst.executeUpdate();
	
	if(count!=0)
		response.sendRedirect("./patient_registration.html");
	
%>

</body>
</html>