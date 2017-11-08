<%--
  Created by IntelliJ IDEA.
  User: Half_candy
  Date: 2017-10-13
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    测试项目<br/>
    <form action="/myController" method="post">
        <input type="text" name="name"/>
        return: ${name}
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
