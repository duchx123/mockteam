<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>${hello}</h1>

<%-- 
  <img alt="xxx" src='<c:url value="/resources/images/85.jpg"></c:url>'>  --%>
	<s:form method="post" action="addCMND"  enctype="multipart/form-data">

		<input type="file" name="anh1"><br><br>


 &nbsp;<input type="submit"  value="Submit">
 </s:form>

</body>
</html>