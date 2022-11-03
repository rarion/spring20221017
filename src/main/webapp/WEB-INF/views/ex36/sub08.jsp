<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

	<c:if test="${not empty message }">
		<div>${message }</div>
	</c:if>
	
	<h1>공급자 정보 등록하기</h1>
	<form action="" method="post">
		<input type="text" placeholder="이름" value="Mina" name="name" > <br>
		<input type="text" placeholder="계약명" value="Libereuta" name="contactName"> <br>
		<input type="text" placeholder="도시" value="Seoul" name="city"> <br>
		<input type="text" placeholder="우편번호" value="343434" name="postalCode"> <br>
		<input type="text" placeholder="나라" value="Korea" name="country"> <br>
		<input type="text" placeholder="전화번호" value="010-0000-0000" name="phone"> <br>
		<input type="submit">	
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>