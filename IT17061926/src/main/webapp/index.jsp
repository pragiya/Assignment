<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html>
<head>
<title>Create User</title>
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div style="padding-left:50px;font-family:monospace;">
			CRUD Operations</br></br>
		<a href="${pageContext.request.contextPath}/Create.jsp"><div style="color:saffron">Add Item</div></a></br></br>
		<a href="${pageContext.request.contextPath}/rest/itemInfo"><div style="color:saffron">Get Items details</div></a></br></br>
		<a href="${pageContext.request.contextPath}/Update.jsp"><div style="color:saffron">Update Item</div></a></br></br>
		<a href="${pageContext.request.contextPath}/Delete.jsp"><div style="color:saffron">Delete Item</div></a></br></br>
	</div>
</body>
</html>