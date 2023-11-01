<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Welcome！</title>
</head>
<body>
<h1><%= "这是一个JSP练习页面，包含在JSP中嵌入JAVA脚本等操作" %></h1>

<%! int a = 0; %>
<%
  try {
    a = (int) session.getAttribute("a");
  }catch (NullPointerException n){
    session.setAttribute("a", 0);
  }
%>


<form action="jsp2.jsp">
<input type="submit" name="add" value="按我让变量a+1">
</form>

<%= "使用表达式脚本输出文字：a = " + a %>
</body>
</html>