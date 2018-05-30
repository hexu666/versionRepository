<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>add product form</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<div id="global">
		<form action="product_save" method="post">
			<fieldset>
				<legend>add a product</legend>
				<p>
					<label for="name">Product Name:</label> <input type="text"
						id="name" name="name" tabindex="1">
				</p>
				<p>
					<label for="description">Description:</label> <input type="text"
						id="description" name="description" tabindex="2">
				</p>
				<p>
					<label for="price">Price:</label> <input type="text" id="price"
						name="price" tabindex="3">
				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> <input
						id="submit" type="submit" tabindex="5" value="Add Product">
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>
