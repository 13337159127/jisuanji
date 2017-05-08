<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    Integer receivenumber = (Integer)request.getAttribute("sum");
    Integer receivefigure = (Integer)request.getAttribute("total");
    String charactertype = (String)request.getAttribute("character");
    if(receivenumber == null){
    	receivenumber=0;
    }
    if(receivefigure == null){
    	receivefigure=0;
    }
%>
<form action="/calculator/ReturnServlet" METHOD="get">
<center>
<label>数字1：</label>
<input type="text" name="count" value="<%=receivenumber%>">
<br>
<label>数字2：</label>
<input type="text" name="digit" value="<%=receivefigure%>">
<br>
<label>返回值：</label>
<input type="text" name="number" value="<%=charactertype%>">
<br>
<input type="submit" value="提交">
</center>
</form>
</body>
</html>