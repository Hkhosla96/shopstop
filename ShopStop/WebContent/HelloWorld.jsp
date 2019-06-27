<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>My First jsp page</h1>

Today's date: <%=( new java.util.Date()).toLocaleString() %>
<br><br>

<font size="3" color="blue">
<% for(int num=1; num<=10;num++)
	{
	out.println("Welcome to Jsp" + num + "<br>");
	}
	%>
	</font>
	
<br><br>	
	
	Current Time: <%=java.util.Calendar.getInstance().getTime() %>
	
	<br><br>
	
	<%! int data=50, data2=60; %>
<h2>The Value of variable is : <%= data %></h2>
<h2>The sum of 2 no's is : <%= data+data2 %></h2>

<%! 
int cube(int n){
return n*n*n;
}
%>
<br><br>

the cube of 3 is : <%= cube(3)%>



</body>
</html>