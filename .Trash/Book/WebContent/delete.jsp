<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br><br>
<center>
	<form action="Deleteservlet" method="post">
			<input type="text" name = "bookno" value="<%=request.getParameter("bookno") %>"><br><br><br>
			<input type="submit" value="删除">
			<a href="select.jsp" style="text-decoration: none;margin-left: 30px;">返回</a>
			
	</form>

</center>


</body>
</html>