<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/10 0010
  Time: 下午 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link rel="stylesheet" href="/statics/css/main.css">
    <title>session的访问</title>
</head>
<body>
        session:${sessionScope.get("sessionVal")}<br>
        request:${requestScope.get("sessionVal")}
   <%--${"sessionVal"}--%>
</body>
</html>
