<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%
	Random rnd = new Random();
	String[] fortunes={"大吉","中吉","小吉","凶"};
	int index=rnd.nextInt(fortunes.length);
	int xxx = 2;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><font size=<%=xxx %>><%= fortunes[index] %></font></p>
</body>
</html>