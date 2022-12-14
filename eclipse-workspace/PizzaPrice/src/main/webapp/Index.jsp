<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Pizza World</title>
</head>
<body>
<h1>Pizza Price</h1>
<form action="getPizzaServlet" method="post">
Enter your pizza's toping:
<input type="text" name="size">
<input type="text" name="protein">
<input type="submit" value="Calculate price">
</form>

</body>
</html>