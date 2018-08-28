<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fmt:parseNumber value="2e3" var="kk"></fmt:parseNumber>
formatting : ${kk}<br/>
<c:out value="<h1>hi</h1>" escapeXml="false"></c:out>
<c:set var="actionUrl" value="Page2.jsp" scope="session"/>
<c:remove var="actionUrl" />
<c:url var="page" value="Page2.jsp" scope="request"/>

<c:if test="${actionUrl eq 'Page.jsp'}">
<h4>hi hello how are u</h4>
</c:if>
<c:if test="${actionUrl ne 'Page.jsp'}">
<h4>hi hello </h4>
</c:if>

	<c:forEach begin="1" end="10" step="2" var="i">
	${i} times looped
	</c:forEach>
	<br/>
	<%--
	step cannot be <=0
	 <c:forEach begin="10" end="1" step="-2" var="i">
	${i} times looped
	</c:forEach> --%>
<c:set var="arr" value="{2,3,4,5,6}" scope="request"/>
${sessionScope.arr} <br/>
<c:if test="${requestScope.arr ne null}">
	<c:forEach items="${requestScope.arr}" var="s" >
		data is : ${s} <br/>
	</c:forEach>
</c:if>
<c:if test="${requestScope.arr eq null}">
	<h3>no data available</h3>
</c:if>

 ${sessionScope.actionUrl}</br>
 in req : ${requestScope.actionUrl}</br>
${page}</br>
<form action="${actionUrl}" >
<input type="text" name="name"/>
Languages Known: <br/>
C <input type="checkbox" name="lang" value="C"/><br>
C++ <input type="checkbox" name="lang" value="C++"/>
<input type="submit" value="sub"/>
</form>


<%= request.getParameter("msg") %>
	${msg} <br/>
	${10 eq 10}<br/>
	<%-- ${10 ne 11}<br/> --%>
	${10 == 10}<br/>
	${10 != 10}<br/>
	${15 gt 10}<br/>
	${1 lt 10}<br/> //ge,le, instanceof 
	${'Hello' eq 'hello'}<br/>
	${'string' eq null }<br/>
	${12+4}<br/>
	${12/0} 
</body>
</html>