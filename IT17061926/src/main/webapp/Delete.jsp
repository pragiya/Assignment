<!DOCTYPE html>
<html>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script src="js/rest.js"></script>
<%@ page contentType="text/html; charset=UTF-8" %>
<head>
<title>Delete Item</title>
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
</head>
<body>
	<div style="padding-left:50px;font-family:monospace;">
		<h2>Delete Item</h2>
		<form id="deleteForm">
			<div style="width: 100px; text-align:left;">
				<div style="padding:15px;">
					Item ID: <input name="id" />
				</div>
				<div style="padding:20px;text-align:center">
					<input type="submit" value="Submit" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>