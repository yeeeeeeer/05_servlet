<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>practice240605</title>
</head>
<body>

	<h1>Practice 240605</h1>

		<form action="practice240605" method="get">

			<label>🍦 베스킨라빈스 맛 선택 :  </label> <select name="flavor">
			<br>
				<option value="초코나무숲">초코나무숲</option>
				<option value="민트초콜릿칩">민트초콜릿칩</option>
				<option value="엄마는외계인">엄마는외계인</option>
			</select>
			<br><br> 
			<label>🎀 수량: </label> 
			<input type="text" name="count">
			<br><br>
			<input type="submit" value="주문하기(GET 요청)">

		</form>


</body>
</html>