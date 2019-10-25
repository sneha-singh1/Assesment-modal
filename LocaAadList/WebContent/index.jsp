<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Details</h1>
<form action="/details.do" method="post">
	Name:<input type="text" name="name"><br><br>
	Email:<input type="text" name="email"><br><br>
	Phone:<input type="text" name="phone"><br><br>
	Posting title:<input type="text" name="postingtitle"><br><br>
	City or Neighborhood:<input type="text" name="city"><br><br>
	Postal Code:<input type="text" name="postalcode"><br><br>
	Description:<textarea rows="4" name="description"></textarea>
			<button type="submit">Continue</button>
</form>
</body>
</html>