<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1> memLoginOk </h1>
	
	ID : ${member.memId}<br />
	PW : ${member.memPw}<br />
	
	<P>  The time on the server is ${serverTime}. </P>
	
	<a href="/basic/resources/html/index.html"> Go Main </a>
</body>
</html>