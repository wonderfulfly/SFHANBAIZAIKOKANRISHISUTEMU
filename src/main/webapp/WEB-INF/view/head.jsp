<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<style>
i.menu_fa {
	position: absolute;
	left: calc(100% - 13px);
}
</style>
<input type="hidden" id="runMode" name="runMode" value="0">
<header>
<div class="hradnavi">
<ul class="head_app">
<li class="appver">SF販売在庫管理システム</li>
<li class="refresh"><a href="#" onclick="window.location.reload();">
<i class="fa fa-refresh" aria-hidden="true"></i></a></li>
</ul>
<nav class="Dropnav">
<div class="DropdownContent">
<label></label>
<div class="inner menuicon" style="left: 1265px;">
<ul></ul>
</div>
</div>
<div class="DropdownContent">
<label class="userphoto"><span class="icon-wev_font28"></span></label>
<div class="inner account" style="left: 1265px;">
	<dl>
		<dt><a href="#"><span class="icon-wev_font28" style="font-size:96px"></span></a></dt>
		<dd><span class="logintitle">アカウント</span><span class="loginuser">${sessionScope.USER_ID}</span></dd>
		<dd><span class="logintitle">パスワード</span><span class="loginuser">******</span></dd>
	</dl>
	<div style="text-align: right; margin-top: 60px;">
		<input type="button" style="width: 48%;" value="ログアウト" class="btn03 ui-button ui-widget ui-state-default ui-corner-all" onclick="logout('logoutButton.do');" role="button" aria-disabled="false" _sf_class_done="1">
	</div>
</div>
</div>
</nav>
</div> 
<div class='tabnav' style='padding-top: 1px;display:none;'><ul id='mainmenu'><li class="lvlone" style='width: 16.6667%;'><a class="menu-title" href="#" title='社員管理' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>社員管理</a>
<ul style="display:none;">
  <li ><a href='A002.do?PageID=P00002&init=0' onclick='clearSession=true;' target='_self' title='社員検索' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>社員検索</a></li>
  <li ><a href='A014.do?PageID=P00004&init=0' onclick='clearSession=true;' target='_self' title='部門検索' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>部門検索</a></li>
</ul><!--DDD8-0-->
</li>
<li class="lvlone" style='width: 16.6667%;'><a class="menu-title" href="#" title='会社管理' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>会社管理</a>
<ul style="display:none;">
  <li ><a href='A015.do?PageID=P00006&init=0' onclick='clearSession=true;' target='_self' title='会社検索' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>会社検索</a></li>
</ul><!--DDD8-0-->
</li>
<li class="lvlone" style='width: 16.6667%;'><a class="menu-title" href="#" title='データインタフェース' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>データインタフェース</a>
<ul style="display:none;">
  <li ><a href='A005.do?PageID=P00007&init=0' onclick='clearSession=true;' target='_self' title='データインタフェース' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>データインタフェース</a></li>
</ul><!--DDD8-0-->
</li>
<li class="lvlone" style='width: 16.6667%;'><a class="menu-title" href="#" title='商品管理' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>商品管理</a>
<ul style="display:none;">
  <li ><a href='A006.do?PageID=P00008&init=0' onclick='clearSession=true;' target='_self' title='商品' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>商品</a></li>
</ul><!--DDD8-0-->
</li>
<li class="lvlone" style='width: 16.6667%;'><a class="menu-title" href="#" title='注文書管理' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>注文書管理</a>
<ul style="display:none;">
  <li ><a href='A007.do?PageID=P00009&init=0' onclick='clearSession=true;' target='_self' title='商品入庫画面' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>商品入庫画面</a></li>
  <li ><a href='A010.do?PageID=P00012&init=0' onclick='clearSession=true;' target='_self' title='注文管理検索' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>注文管理検索</a></li>
</ul><!--DDD8-0-->
</li>
<li class="lvlone" style='width: 16.6667%;'><a class="menu-title" href="#" title='入金管理' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>入金管理</a>
<ul style="display:none;">
  <li ><a href='A008.do?PageID=P00010&init=0' onclick='clearSession=true;' target='_self' title='入金管理検索' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'>入金管理検索</a></li>
</ul><!--DDD6-0-->
</li>
</ul></div>
</header>

