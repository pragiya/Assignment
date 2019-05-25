<!DOCTYPE html>
<html>
<head>
<title>Add Item</title>
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
</head>
<body bgcolor="#E6E6FA">
	<div style="padding-left:50px;font-family:monospace;">
		<h2>Add Item</h2>
		<form action="rest/userInfo" method="POST">
			<div style="width: 100px; text-align:left;">
				<div style="padding:15px;">
					Item ID: <input name="id" />
				</div>
				<div style="padding:10px;">
					Name: <input name="name" />
				</div>
				<div style="padding:10px;">
					Price: <input name="age" />
				</div>
				<div style="padding:20px;text-align:center">
					<input type="submit" value="Submit" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>