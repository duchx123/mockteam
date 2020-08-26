<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hi</h1>
<h2>${shke.id_shk }</h2>
<c:forEach items="${list}" var="nk">    
  <table>
  <tr>
<!--    	 <td>${nk.soCMND}</td>-->
<!--     <td>${nk.id_nk}</td> -->
   	<td>${nk.ten}</td>	

    <td>${nk.quanHeCH}</td>
  <td>${nk.anh}</td>
    <td> <a href="view?id=${nk.id_nk}">View</a> </td>
    
  

  </tr>
  </table>
  </c:forEach>
</body>
</html>