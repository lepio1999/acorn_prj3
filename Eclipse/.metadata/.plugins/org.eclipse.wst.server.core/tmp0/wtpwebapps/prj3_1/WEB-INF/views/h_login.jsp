<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
* {
	margin: 0;
	padding: 0;
	background-color: rgb(205, 207, 206);
}

.loginBox {
	width: 500px;
	height: 400px;
	margin: 0 auto;
	margin-top: 200px;
	background-color: aliceblue;
	border-radius: 30px
}

form {
	width: 300px;
	margin: 0 auto;
	margin-top: 30px;
	background-color: aliceblue;
}

.loginHead {
	font-size: 50px;
	font-weight: bolder;
	text-align: center;
	background-color: aliceblue;
	border-radius: 30px
}

.inputBox {
	margin-top: 50px;
	background-color: aliceblue;
}

.inputName {
	margin-left: 5px;
	background-color: aliceblue;
}

input {
	height: 25px;
	width: 300px;
	background-color: aliceblue;
	border-radius: 8px;
}

button {
	width: 300px;
	height: 30px;
	background-color: rgb(55, 61, 63);
	margin-top: 30px;
	color: aliceblue;
	border-radius: 8px;
	border: none;
}

button:active {
	background-color: rgb(152, 153, 153);
}
</style>
</head>

<body>

	<div class="loginBox">
		<div class="loginHead">LOGIN</div>

		<form action="<%=request.getContextPath()%>/h_login" method="post">
			<div class="inputBox">
				<div class="inputName">
					ID <br> <input type="text" name="id">
				</div>
				<br>
				<div class="inputName">
					PASSWORD <br> <input type="password" name="pw"> <br>
				</div>
				<button>로그인</button>
			</div>
		</form>
	</div>
	
  

	<%
	String failMessage = (String) request.getAttribute("failMessage");
	%>
	<%
	if (failMessage != null) {
	%>
	<script>
            alert("<%=failMessage%>");
	</script>
	<%
	}
	%>
</body>
</html>