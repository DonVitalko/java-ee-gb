<%@ page import="java.util.List" %>
<%@ page import="ru.gb.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
      <title>Product</title>
</head>
<body>
<h2>Product</h2>
<ul>
<% for (Product value: ((Product)request.getAttribute("product")).getList()) { %>
<li> id: <%=value.getId()%>; title: <%=value.getTitle()%>; cost: <%=value.getCost()%></li>
<% } %>
</ul>
</body>
</html>