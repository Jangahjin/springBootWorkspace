<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Form Test</title>
</head>
<body>
	<h1>Model 데이터 전송 테스트</h1>

	<form:form modelAttribute="member" method="post"
		action="/spring/register">
		<table>
			<tr>
				<td>유저ID</td>
				<td><form:input path="userId" />
				<form:errors path="userId" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><form:input path="userName" />
				<form:errors path="userName" /></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><form:input path="email" />
				<form:errors path="email" /></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><form:password path="password"  showPassword="true"/>\
				<font color="red"><form:errors path="password" /></font></td>
			</tr>
			<tr>
				<td>자기소개</td>
				<td><form:textarea path="introduction" rows="6" cols="40" /> <font
					color="red"><form:errors path="introduction" /></font></td>
			</tr>
			<tr>
				<td>취미</td>
				<td>
					<%-- DTO 필드명 hobbyValue와 일치시킴 --%> <form:checkboxes
						path="hobbyValue" items="${member.hobbyMap}" />
				</td>
			</tr>
			<tr>
				<td>외국인 여부</td>
				<td><form:checkbox path="foreigner" value="true" /></td>
			</tr>
			<tr>
                <td>취미</td>
                <td>
                    <form:checkbox path="hobbyList2" value="sports" label="Sports" /><br> 
                    <form:checkbox path="hobbyList2" value="music" label="Music" /><br> 
                    <form:checkbox path="hobbyList2" value="movie" label="Movie" />
                </td>
            </tr>
		</table>
		<form:button name="register">등록</form:button>
	</form:form>
</body>
</html>