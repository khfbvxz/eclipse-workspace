<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
<style type="text/css">
	*{ font-size : 20pt}
</style>
</head>
<body>
	<h1>gugudan.jsp</h1>
	<% 
	int dan =31; 
	for(int i = 1 ; i < 10; i++){
		//System.out.println(dan+"*"+i+"="+(dan*i));
		out.print(dan+"*"+i+"="+(dan*i)+"<br>");
	}
	%>
	<p>
	<%
		Date dt = new Date();
		ArrayList<String> arr = new ArrayList<>();
		out.println("오늘날짜 : " + dt.toLocaleString());
		System.out.println("오늘날짜 : " + dt.toLocaleString());
	%>
</body>
</html>