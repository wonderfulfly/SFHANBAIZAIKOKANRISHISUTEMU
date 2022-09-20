 
$(function(){
	$(".buy_an").click(function(){
		$("#title").html(this.title);
		$(".money").html(this.lang);
		
		$("#title").val(this.title);
		$("#money").val(this.lang);
		$("#fwid").val($(this).data("id"));
	})
	
});


 
 

function tlogin(id,url){ 
	if(confirm("请先登录会员后才能操作下一步!")){ 
		var gurl=encodeURI(url+"?id="+id);
		window.location = 'register.php?uri='+gurl; 
	} 
} 

function login(id){ 
	if(confirm("只有登陆会员才可以购买！")){ 
		window.location = 'register.php?uri=goods.php?id='+id; 
	} 
} 
 
function changebig(locationid){
	document.form4.csid.length = 0;
	document.form4.csid.options[0] = new Option('-请选择-','');
	for (i=0; i<subcat.length; i++){
		if (subcat[i][0] == locationid){
			document.form4.csid.options[document.form4.csid.length] = new Option(subcat[i][1], subcat[i][2]);
		}
	}
}

function changebigs(locationid){
	document.formlist.csid.length = 0;
	document.formlist.csid.options[0] = new Option('-请选择-','');
	for (i=0; i<subcat.length; i++){
		if (subcat[i][0] == locationid){
			document.formlist.csid.options[document.formlist.csid.length] = new Option(subcat[i][1], subcat[i][2]);
		}
	}
}
  
function CheckAll(formlist){
  var val=document.formlist.all.checked;
  for (var i=0;i<document.formlist.elements.length;i++){
    var e = document.formlist.elements[i];
    if (e.name != 'all')
      e.checked = val;
  }
}

function checkData (formlist){  
  var RecordsCount=0;
  for (var i=0;i<document.formlist.elements.length;i++){
                var e = document.formlist.elements[i];
                if (e.name != 'all' && e.checked)
                       RecordsCount++;
  }
  
 // document.getElementById("nums").innerHTML=1;
           
  if(!RecordsCount){
      alert("你还没选择记录！");
      return false
  }else {
     if (confirm("即将操作所选择的记录， 是否继续 ？")){            
     	return true;
	 }else{
         return false;
	 }
   }
}

 
function change_yzm() {
	var num = 	new Date().getTime();
	var rand = Math.round(Math.random() * 10000);
	num = num + rand;
	if ($("#vdimgck")[0]) {
		$("#vdimgck")[0].src = "/include/yzm.php?tag=" + num;
	}
	return false;	
}

 
function changeselect1(locationid){
	document.formlist.ty.length = 0;
	document.formlist.ty.options[0] = new Option('-请选择-','');
	for (i=0; i<subcat.length; i++){
		if (subcat[i][0] == locationid){
			document.formlist.ty.options[document.formlist.ty.length] = new Option(subcat[i][1], subcat[i][2]);
		}
	}
}

//删除信息验证
function ConfirmDelInfo()
{
   if(confirm("确定要删除此信息吗？删除后不能恢复！"))
     return true;
   else
     return false;
	 
}


//去空格
function checkspace(checkstr) {
	var str = '';
	for(i = 0; i < checkstr.length; i++) 
	{
		str = str + ' ';
	}
	return (str == checkstr);
}

function check_pay(formlist){
  	if (checkspace(formlist.realname.value))
	{
		alert("请输入姓名！");
		formlist.realname.focus();
		return false;
	}
   if (checkspace(formlist.tel.value))
   {
		alert("提示：请输入手机号码！");
		formlist.tel.focus();
		return (false);
   }
  
	var telcode=new RegExp(/^\d{10,100}$/);
	
	if (!formlist.tel.value.match(telcode)) {
		alert("提示：请输入正确的手机号码!");
		return false;                
	}
	
   	if (checkspace(formlist.email.value))
	{
		alert("请输入邮箱！");
		formlist.email.focus();
		return false;
	}

	if (formlist.email.value.length <4 || formlist.email.value.length >=100)
	{
		alert("请输入正确的邮箱！");
		formlist.email.focus();
		return (false);
	}
 
	if (formlist.email.value.length > 0 && !formlist.email.value.match(/^[\w\-\.]+@[\w\-\.]+(\.\w+)+$/) ) {
		alert("请输入正确的邮箱！");
		formlist.email.focus();
		return false;
	}
}
function check_pay3(formlist){
	if (checkspace(formlist.userid.value))
	{
		alert("请输入用户名或绑定手机号！");
		formlist.userid.focus();
		return false;
	}
	if (checkspace(formlist.pwd.value))
	{
		alert("提示：请输入登陆密码！");
		formlist.pwd.focus();
		return (false);
	}
	if (checkspace(formlist.certCode.value))
	{
		alert("提示：请输入验证码！");
		formlist.certCode.focus();
		return (false);
	}
}

 