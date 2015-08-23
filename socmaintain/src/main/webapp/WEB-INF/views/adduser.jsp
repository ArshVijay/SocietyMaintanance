<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>

<html>
<head>

   <title>Home Page</title>
   <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
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
<h2 id="banner">Add a New User</h2> 

		<form:form modelAttribute="userDetailsFormBean" action="/maintain/user/add" method="POST" >
		<table width="50%" border="1">
			<tr>
				<td>User Name</td>
				<td><form:input path="userName" />
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" />
				</td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Login" />
				</td>
			</tr>
		</table>
	</form:form> 
	</body>
</html>