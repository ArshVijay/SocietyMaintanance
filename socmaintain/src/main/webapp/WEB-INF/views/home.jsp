<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

   <title>Home Page</title>
   <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/scss/style.scss" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.js" />"></script>
    <script src="<c:url value="/resources/js/script.js" />"></script>
</head>
<body>
<h1>
	Society Management	
</h1>

<div id='cssmenu'>
<ul>
 <li class='active'><a href="${pageContext.request.contextPath}/user/addUser">Add a User</a></li>
 <li><a href="${pageContext.request.contextPath}/user/getAllUsers">All User</a></li>
 <li><a href="${pageContext.request.contextPath}/complaint/raiseComplaint">Raise Complaint</a></li>
 <li><a href="${pageContext.request.contextPath}/complaint/getAllComplaints">All Complaints</a></li>
 <li><a href="${pageContext.request.contextPath}/login"> Logout here</a></li>
</ul>
</div>
</body>
</html>
