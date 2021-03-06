<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

   <title>Home Page</title>
 <%--   <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/scss/style.scss" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.js" />"></script>
    <script src="<c:url value="/resources/js/script.js" />"></script>
   --%>
     <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link href="<c:url value="/resources/css/styless.css" />" rel="stylesheet">
  	<script src="<c:url value="/resources/js/jquery-latest.js" />"></script>
   <script src="script.js"></script>
   <title>CSS MenuMaker</title>
</head>
<body>
<h1>
	Society Management	
</h1>

<%-- <div id='cssmenu'>
<ul>
 <li class='active'><a href="${pageContext.request.contextPath}/user/addUser">Add a User</a></li>
 <li><a href="${pageContext.request.contextPath}/user/getAllUsers">All User</a></li>
 <li><a href="${pageContext.request.contextPath}/complaint/raiseComplaint">Raise Complaint</a></li>
 <li><a href="${pageContext.request.contextPath}/complaint/getAllComplaints">All Complaints</a></li>
 <li><a href="${pageContext.request.contextPath}/login"> Logout here</a></li>
   <c:forEach var="listValue" items="${modulelist}">
   <li><a href="#">${listValue.moduleTopName}</a>
	<ul><a href="#">${listValue.moduleTopName}</a></ul>
	</li>
	</c:forEach>
</ul>
</div> --%>


<div id='cssmenu'>

<%-- <ul>
   <li class='active'><a href='#'><span>Home</span></a></li>
   <c:forEach var="listValue" items="${topModuleList}">
   <li class='has-sub'><a href='#'><span>${listValue}</span></a>
      <ul>
			<c:choose>
    			<c:when test="${listValue.moduleName != null}">
      		
       					<li><a href='${listValue.moduleUrl}'><span>${listValue.moduleName}</span></a></li>
        			
    			</c:when>
   			 </c:choose>
    
      </ul>
   </li>
   </c:forEach>
</ul> --%>
<ul>
   <li class='active'><a href='#'><span>Home</span></a></li>
   <c:forEach var="topModule" items="${topModuleList}">
   <li class='has-sub'><a href='#'><span>${topModule}</span></a>
      <ul>
      <c:forEach items="${subModuleMap}" var="entry">
   			 <c:choose>
    			<c:when test="${entry.key == topModule }">
      				<c:forEach items="${entry.value}" var="mapEntry">. 
       					<li><a href='${mapEntry.moduleUrl}'><span>${mapEntry.moduleName}</span></a></li>
        			</c:forEach>
    			</c:when>
   			 </c:choose>
      </c:forEach>
      </ul>
   </li>
   </c:forEach>
   <li class='active'><a href='http://localhost:8080/maintain/logout'><span>Log out</span></a></li>
</ul>
</div>
</body>
</html>
