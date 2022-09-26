<!DOCTYPE html>
<html lang="ja"><!-- InstanceBegin template="/Templates/ssl.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta charset="utf-8">
<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- InstanceBeginEditable name="doctitle" -->
<title>ログイン</title>
<!-- InstanceEndEditable -->
<meta name="viewport" content="width=device-width, maximum-scale=1.0" />
<!-- <link href='https://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'> -->
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/contents.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/nav.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/font-awesome.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css">
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script> -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.9.1.min.js"></script>
<!---colorbox--->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/colorbox.css" />
<script src="${pageContext.request.contextPath}/static/js/jquery.colorbox.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/login.js"></script>
<script src="${pageContext.request.contextPath}/static/js/lib.js"></script>
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
<script type="text/javascript">
var loginID = sessionStorage.getItem("LOGIN_USER_ID");
if (loginID != null && loginID != undefined) {
	sessionStorage.removeItem("LOGIN_USER_ID");
}
var prevLoc = sessionStorage.getItem("PREVIOUS_LOCATION");
if (prevLoc != null && prevLoc != undefined) {
	sessionStorage.removeItem("PREVIOUS_LOCATION");
}

$(function() {
});
</script>
</head>

<body>

<!-- InstanceBeginEditable name="contents" -->
<section class="upm5">
<div class="wrapper botm10">
<div class="contener">

<h3 class="h3title">ログアウト</h3>

<div class="Loginbox" align="center">

<p>正常にログアウトしました。</p>
<p class="submit"><input type="button" value="ログイン画面へ" onclick="javascript: window.location.href='logoutGamenn.do';"></p>

</div>
</div>
</div>
</section>
</body>
<!-- InstanceEnd --></html>
