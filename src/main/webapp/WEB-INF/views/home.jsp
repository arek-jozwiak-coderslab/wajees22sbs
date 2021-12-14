<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="<c:url value="/logout"/>" method="post">
    <input class="fa fa-id-badge" type="submit" value="Wyloguj">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
<!-- /home/arek/Pictures/BOX/pudelka/1-cute-funny-danbo-cardboard-box-art-lonely-hopscotch.jpg-->
<img src="/resources/1-cute-funny-danbo-cardboard-box-art-lonely-hopscotch.jpg"/>

<sec:authorize access="isAuthenticated()">
    Witaj  <sec:authentication property="principal.username" /> <br/>
    Role <sec:authentication property="principal.authorities" />
</sec:authorize>

</body>
</html>
