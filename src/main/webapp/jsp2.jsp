<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Welcome！</title>
</head>
<body>
<%! int a = 0; %>
<%
  a = (int) session.getAttribute("a");
  a++;
  session.setAttribute("a", a);
  request.getRequestDispatcher("jsp1.jsp").forward(request,response);
%>
<%= "本页面使用JSP内嵌JAVA脚本实现对session对象的处理，并自动跳转回原来页面" %>


</body>
</html>