<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/contents.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/nav.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font-awesome.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css">
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script> -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/json-minified.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/xmlhttp.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/colorbox.css" />
<script src="${pageContext.request.contextPath}/static/js/jquery.colorbox.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/login.js"></script>
<script src="${pageContext.request.contextPath}/static/js/saasforce-1.0.0.1.js"></script>
<script type="text/javascript">
function doLogin(){
	var url = "login.do";
	getQAjaxRunJson("rstfld",true,1,"",url,true,setSendDivData("FM"),"","");
}
</script>
</head>
<body>
<div id="container">
<main>
<section class="upm5">
<div class="wrapper botm5">
<div class="contener">

<h3 class="h3title">ログイン</h3>

<div class="Loginbox">
<p class="font80 flot_c"><i class="fa fa-unlock-alt" aria-hidden="true"></i>　IDとパスワードを入力してください。</p>
<div class="formbox">
<form id=FM name=FM action="Login.jsp" onSubmit="return LoginSubmit(this)" method="post">
<section id="demo-sec" class="demo-section">
<input name=pf value="" type="hidden">
<p class="font80 flot_c">
</p>

<p><input type="text" name="userid" id="userid" class="id-element" maxlength="50" tabindex=1 placeholder="ID"></p>
<p><input type="password" name="pwd" id="pwd" class="pw-element"  maxlength="45" style="width: 100%;" tabindex=2 placeholder="パスワード"></p>
</section>
<p class="submit botm3"><input type="button" value="Login" tabindex=4 onclick="doLogin();"/></p>
</form>
</div>
</div>

</div>
</div>
</section>
</main>
</div>
</body>
</html>