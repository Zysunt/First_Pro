<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	
	<br><br><br><br><br>
		<form action="Selectservlet.do" method="post">
			<input type="text" name="bookname" placeholder="书名,书名"> 
			<input type="submit" value="搜索"> 
			 </a> 
		</form>
		<form action="/Book/Deleteservlet.do" method="post">
			
			<input type="submit" value="删除">
			
			<table border="3" width="50%">
				<tr>
					<td>#</td>
					<td>书名</td>
					<td>作者</td>
				</tr>

				<c:forEach items="${requestScope.book }" var="i">

					<tr>
						<td><input type="checkbox" name="booknos" value="${i.bookno }"></td>
						<td>${i.bookname }</td>
						<td>${i.author }</td>
					</tr>

				</c:forEach>

			</table>
			
		</form>
			

	</center>

</body>
</html>