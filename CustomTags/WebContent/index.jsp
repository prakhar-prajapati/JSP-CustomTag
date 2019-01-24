<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Custom tag</title>
</head>
<body>
<%@taglib uri="WEB-INF/tlds/CustomerCountTld.tld" prefix="tt" %>

total:<tt:total/>
<br/>
product: <tt:product status="NA"/>
<br/>
<tt:loop count="5">
A
</tt:loop>

</body>
</html>