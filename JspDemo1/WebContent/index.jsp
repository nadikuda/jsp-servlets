<%@ page  contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int a = 9000;%>
	<%
		int a = 4;
		int b = 45;

		out.println(a + b);
	%>


	<%
		int c = 90;
		int result = c + a + b;
	%>

	<%-- <%

out.println(result);
%> --%>
	<%=result%>
	<!-- data is converted into string and placed in response-->
	<%=a%>
	<%=this.a%>
	<%
		if (a > 10) {
	%>

	<h1>hello</h1>

	<%
		} else {
	%>

	<h2>welcome</h2>
	<%
		}
	%>








</body>
</html>