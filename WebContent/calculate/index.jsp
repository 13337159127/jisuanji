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
      Integer sum=(Integer)request.getAttribute("total");
      Integer abbr=(Integer)request.getAttribute("addend");
      Integer operation=(Integer)request.getAttribute("augend");
      if(sum==null){
    	  sum=0;
      }
      if(abbr==null){
    	  abbr=0;
      }
      if(operation==null){
    	  operation=0;
      }
%>
<form action="/calculator/CountServlet" method="get">
<center>
   <input type="text" name="figure" value="<%=abbr%>">
   <select name="computerType">
   <option value="+">+</option>
   <option value="-">-</option>
   <option value="*">*</option>
   <option value="/">/</option>
   </select>
   <input type="text" name="number" value="<%=operation%>">
   <input type="submit" value=" = ">
   <input type="text"  value="<%out.print(sum);%>">
</center>
</form>
</body>
</html>