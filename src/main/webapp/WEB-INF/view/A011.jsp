<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8" />
<title>P00013 - 注文管理詳細</title>
    <!-- The below script Makes IE understand the new html5 tags are there and applies our CSS to it -->
    <!--[if IE]>
    <script src="https://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=uft-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
<style type="text/css">

</style>
<script type="text/javascript">
var pjn = "${pageContext.request.contextPath}";
</script>
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/loadJqueryAll.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/jquery.contextMenu.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/hoverIntent.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.dateFormat-1.0.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/ajaxupload.3.6.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/fileUpload.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/knockout-3.4.0.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/xmlhttp.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/checkuserjpn.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/unloadcheck.js"></script>
<link type="text/css" rel="Stylesheet" href="${pageContext.request.contextPath}/static/css/nv.d3.min.css">
<link type="text/css" rel="Stylesheet" href="${pageContext.request.contextPath}/static/css/nv.d3.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/d3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/d3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/nv.d3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/nv.d3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/stream_layers.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.form.js"></script>
<!-- animsition.js -->
<script src="${pageContext.request.contextPath}/static/js/animsition.min.js"></script>
<!-- animsition.css -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/animsition.min.css">
<script type="text/javascript">

var httpObj;
var sendcode;
var oriVal;
var clearSession = false;
var ganttDataOri = "";
var WF_PageModal = "";

function initdisplayData() {
    if (sendcode=="1") {
        getAjaxRunData(httpObj, "rstFld", true,false,'2',refObj,"text");
    } else if (sendcode=="2") {
        getAjaxRunData(httpObj, "rstFld", false,false,'2',refObj,"image");
    } else if (sendcode=="3") {
        getAjaxRunData(httpObj, "rstFld", false,false,"2",refObj,"div");
    } else if (sendcode=="5") {
        getAjaxRunData(httpObj, "rstFld", true,false,"2","searchText","text");
    } else if (sendcode=="103") {
        getAjaxRunData(httpObj, "rstFld", true,false,"2","innerAttListHtml","text");
    } else if (sendcode=="8") {
        getAjaxRunData(httpObj, "rstFld", false,false);
    }
}
function setPageLayout() {
	var cWidth = 1157;
	cWidth = ($(window).width()-cWidth)/2;
	$("#target").css({
		left: cWidth-10+"px",
		width: "1157px"
	});
}

function uinout001_closeMe() {
    $("#FuncDiv").dialog('close');
}

function afterajax() {
    isChanged = false;
    dataFormat();
    if (sendcode =="1") {
        changeRefSpecHtml($("#"+refObj));
    } else if (sendcode =="103"){
        var retVal = getObj("innerAttListHtml").value;
        var fileNm = retVal.substring(0,retVal.lastIndexOf('#'));
        var fileType = retVal.substring(retVal.lastIndexOf('#')+1, retVal.length);
        getObj("fileName").value = fileNm;
        getObj("prethumb").alt = fileNm;
        getObj("filetype").value = fileType;
    } else if (sendcode =="4"){
    } else if (sendcode =="5"){
        var opName = new Array();
        opName = getObj("searchText").value.split(",");
        var html = "";
        for (var i = 0; i < opName.length-1; i++) {
            html += "<tr><td>"+ opName[i] + "</td></tr>";
        }
        var width = $("#"+sourceObj).width() + 4;
        $("#" +refObj).css({"width": width+"px"});
        $("#" +refObj).html(html);
    }
}
function ajaxDoAdd() {
    if (!checkSpecialInput()) {
        return false;
    }
    var manageID = 'A011';
    getObj('WF_RUNRESULT') =='0';
    getQAjaxRunJson("rstfld",true,1,"", manageID+"F20091208153604208.do",true,setSendData(document.form1),"afterSave();");
}

function afterSave() {
    isChanged = false;
    dataFormat();
    if (getObj('WF_RUNRESULT').value =='1') {
        Grid95_clear();
getObj('initRowGrid95').value = getObj('RowGrid95').value

        getObj("unloadCheck").value="0";
    }
}

function fileUUploadImport(id, o, p, e){
    var thumb = "";
    if (id != "") {
        thumb = $('img#'+id);
    }
    new AjaxUpload('uploadimport', {
        action: '/s/'+p+o+'import',
        enctype: 'multipart/form-data',
        name: 'ImportFilename',
        data: {
            subID : o,
            pageID : p
            ,encode : $("#encode", $("#FuncDiv")).val()
        },
        onSubmit: function(file, extension) {
            SF.loadingOn();
            //this.setData({
            //    encode : $("#encode", $("#FuncDiv")).val(),
            //    subID : o,
            //    pageID: p});
            this.setData(getParamFromPage(o,p));
            $('div.preview').addClass('loading');
        },
        onComplete: function(file, response) {
            thumb.load(function(){
                $('div.preview').removeClass('loading');
                thumb.unbind();
            });

            var myJsonObj = jsonParse(response);
            
            if (myJsonObj.e!=undefined) {
                alert(myJsonObj.e);
            } else {
                var key,idx;
                var jid;
                if (myJsonObj.v!=undefined) {
                    for (key in myJsonObj.v) {
                        idx = myJsonObj.v[key];
                        jid = "myJsonObj." + idx;
                        $("#"+idx).val(eval(jid));
                    }
                }
                if (myJsonObj.h!=undefined) {
                    for (key in myJsonObj.h) {
                        idx = myJsonObj.h[key];
                        jid = "myJsonObj." + idx;
                        $("#"+idx).html(eval(jid));
                    }
                }
                if (myJsonObj.r!=undefined) {
                    eval(myJsonObj.r);
                }
            }
            SF.loadingOff();
            $("#FuncDiv").dialog('close');
        }
    });
}

function ajaxDoImport(title,importMangeID,importItemID,headLines,encode,divideChar,fixFlg) {
    openFuncDiag(title,"turnTouinout001.do","uinout001_initFuncDialog();",720,580,'5','FuncDiv',"importMangeID="+importMangeID +"&importItemID="+importItemID+"&headLines="+headLines+"&encode="+encode+"&divideChar="+divideChar);
}

function doReturn() {
 if (WF_PageModal=="1") {
	      window.close();
	  }
		
			var prevlocobj = SF.getPrevloc();
			var prevLoc, wfpostParams;
			wfpostParams = prevlocobj[0];
			prevLoc = decodeURIComponent(prevlocobj[1]);
			if (wfpostParams != null && wfpostParams != "") {
				SF.postAfterLinkCheck(prevLoc, wfpostParams, target);
			} else {		
				location.href=prevLoc;
			}
			return false;
}
//参照データ
function ajaxQueryGridVal(reqName,tagetSubID,tagetObj,o,v){
    var row = getGridRowIndex(o,"rowseq");
 //   tagetObj = tagetObj +"_" +row;
 //   ajaxQueryVal(reqName,tagetSubID,tagetObj,v,row);
    
    var conf = "";
    if (v == "1") {
        conf =  getRadioValue(reqName);
    } else {
        conf = getObj(reqName).value;
    }
    reqName = reqName.substring(0, reqName.lastIndexOf("_"));
    ajaxReference(reqName, conf, row);
}
function ajaxQueryVal(reqName,tagetSubID,tagetObj,v,row){
    $(".ErrStyle").removeClass("ErrStyle");
    getObj("TargetObj").value = tagetObj;
    if (getObj(tagetObj)){
        getObj(tagetObj).value = "";
    }
    refObj = tagetObj;
    var conf = "";
    if (v == "1") {
        conf =  getRadioValue(reqName);
    } else {
        conf = getObj(reqName).value;
    }
    if (conf =="") {
        return false;
    }
    ajaxReference(reqName, conf, "0");
 //   var manageID = 'A011';
 //   var url = manageID + reqName + "Reference.do?"+"&targetSubID="+tagetSubID+"&pringFlg=4"+"&targetObj="+tagetObj+"&conf="+conf+"&row="+row;
  //  getQAjaxRunJson("rstfld",false,1,"",url,false,"","changeRefSpecHtml($('#"+refObj+"'));");
}

function ajaxReference (reqName,conf, row) {
 	var manageID = 'A011';
    var url = manageID + reqName + "Reference.do?"+"&conf="+conf+"&row="+row;
    getQAjaxRunJson("rstfld",false,1,"",url,false,"","");

}

function ajaxDoAddExeJs(v, param, showLoading, triggerObj, afterFun ){
	$(".ErrStyle").removeClass("ErrStyle");
	getObj("ServerScriptFlg").value= "1";
	getObj("ServerScriptID").value= v;
	if (triggerObj) {
		$("#triggerID").val(triggerObj.attr("id"));
	}
	var url = urlUserScript;
	if (param && param !="") {
		url += "?" + param;
	}
	if (afterFun==undefined) {
		afterFun = "";
	}
	getQAjaxRunJson("rstfld",false,1,"",v+".do", true,setSendData(document.form1),afterFun, showLoading);
}
function ajaxDoServerJs(v, param, div, showLoading){
    $(".ErrStyle").removeClass("ErrStyle");
    getObj("ServerScriptFlg").value= "1";
    getObj("ServerScriptID").value= v;
    var url = urlUserScript;
    var divs = "";
    if (div != undefined) {
        divs = setSendDivDataForSearch(div);
    }
    getQAjaxRunJson("rstfld",false,1,"",v+".do", true,setSpecData(param)+divs,"",showLoading);
}

function doSmartSearch(v1,v2,v3,afterFunc) {
    $(".ErrStyle").removeClass("ErrStyle");
    getObj("pringFlg").value = "2";
    getObj("SubID").value = v1;
    var manageID = 'A011';
    var url,data;
    if (v2!="") {
    	var subIDStr = v2.split(";")[0];
    	var itemIDStr = v2.split(";")[1];
    	
    	var itemIDArr = itemIDStr.split(",");
        var count = subIDStr.split(",");
        for (var i = 0; i < count.length; i++) {
            sendcode = "7";
            displayObj = "dragB" +count[i];
            url = manageID + v1+itemIDArr[i]+"SmartSearch"+".do";
            data = "toSubID="+count[i]+"&actflg="+v3+"&targetID="+displayObj+"&"+setSearchSendData(document.form1);
            //refresh page layout
            if (afterFunc != undefined && afterFunc != null) {
                getQAjaxRunJson("rstfld",false,1,"",url, false,data,"_afterDoSmartSearch("+count[i]+");" + afterFunc, true);
            } else {
                getQAjaxRunJson("rstfld",false,1,"",url, false,data,"_afterDoSmartSearch("+count[i]+");", true);
            }
            
        }
    }
}
// エクスポート
function ajaxDoExport(manageid,itemID) {
    $(".ErrStyle").removeClass("ErrStyle");
    getObj("pringFlg").value = "5";
    getObj("SubID").value = itemID;
    getQAjaxRunJson("rstfld",false,1,"",manageid+itemID+"Export.do",true,setSendData(document.form1),"exportAjax('"+manageid+"','"+itemID+"');");
}
function exportAjax(manageid,itemID) {
//	var url="/s/Export?pageID="+pageid +"&exportID="+subID+"&"+setSendData(document.form1);
//	window.open(url, '_blank');

	var url= $("#WF_PRINTFILEID").val();
  var encode= $("#WF_PRINTFILEENCODE").val();
	var top=50;
	var left=100;
	var width=800;
	var height=width/1.6;
	var arrUrl = url.split(",");
	var p ="";
	for (i = 0; i < arrUrl.length; i++) {
		p = arrUrl[i];
		var nst= manageid+itemID+"ExportFile.do?e="+ encodeURIComponent(p) + "&d=" +encode;
		var OpenWindow=window.open(nst,"_self","height="+height+",width="+width+",top="+top+",left="+left+",toolbar=no,menubar=no,scrollbars=yes, resizable=no,location=no,status=no");
	}	

}
//エクセル出力
function ajaxDoExcelPrint(manageID,itemID) {
	$(".ErrStyle").removeClass("ErrStyle");
	getObj("pringFlg").value = "1";
	getObj("SubID").value = itemID;
	getQAjaxRunJson("rstfld",false,1,"",manageID+itemID+"Print.do",true,setSendData(document.form1),"printAjax('"+manageID+"','"+itemID+"');");
}
function printAjax(manageID,itemID) {
	var url= getObj("WF_PRINTFILEID").value;
	try {
		var top=50;
		var left=100;
		var width=800;
		var height=width/1.6;
		var arrUrl = url.split(",");
		var p ="";
		for (i = 0; i < arrUrl.length; i++) {
			p = arrUrl[i];
			var nst= manageID+itemID+"PrintFile.do?f="+ encodeURIComponent(p);
			
			var OpenWindow=window.open(nst,"_blank","height="+height+",width="+width+",top="+top+",left="+left+",toolbar=no,menubar=no,scrollbars=yes, resizable=no,location=no,status=no");
		}	
	} catch (e) {
		alert('JS Error:'+e.message);
	}
}
//フィルター
function ajaxDoGridFilterList(tagetSubID,tagetObj,o, nextFunc){
    var row = getGridRowIndex(o,"rowseq");
    tagetObj = tagetObj +"_" +row;
    $("#filterRow").val(row);
    ajaxDoFilterList(tagetSubID,tagetObj, nextFunc);
}
function ajaxDoFilterList(filterItemID,tagetObj, nextFunc){
    $("#pringFlg").val("3");
    if (getObj(tagetObj)){
        $("#"+tagetObj).html("");
        document.getElementById(tagetObj).options.add(new Option('', ''));
        SF.setComboboxIndex(tagetObj, 0);
    }
    var manageID = 'A011';
    refObj= tagetObj;
    var url = manageID + filterItemID + "Filter.do";
    if (nextFunc == undefined) {
   	 	getQAjaxRunJson("rstfld",false,1,"",url,true,setSendData(document.form1),"");
    } else {
    	getQAjaxRunJson("rstfld",false,1,"",url,true,setSendData(document.form1),nextFunc);
    }    
    
}
function resetDropdownListOptionStyle(targetObj) {
    var obj = $("#" + targetObj);
    var optionObj = obj.find("option");
    if (obj[0].tagName.toLowerCase() == "select" && optionObj.length > 0) {
        optionObj.attr("style", obj.attr("style"));
    }
}
  /* filter end */
  
//*** Func Name: F20220915200012111 ***
function F20220915200012111(o){
  var row = getGridRowIndex(o,"rowseq");
/*Grid「B18」の項目「数量」*「販売単価」*/
var result = 0;

	result =Number($('#SUURYOU_'+row).val().replaceAll(",",""))*Number($('#HANBAITANKA_'+row).val().replaceAll(",",""));
/*小数点以下第「2」位を切り上げ（包括整数）*/
if (result != null) {
	result =  Math.ceil(parseFloat(result)*100)/100;

	result =  parseFloat(result).toFixed(2);
}
if ((!result && result != 0) || isNaN(result)) {
	result = '';
}
$('#HANBAIKINGAKU_'+row).val(result);
$('#HANBAIKINGAKU_'+row).blur();

}

//*** Func Name: F20220915200012131 ***
function F20220915200012131(o){
  var row = getGridRowIndex(o,"rowseq");
/*Grid「B18」の項目「販売金額」の合計*/
var result = 0;
var HANBAIKINGAKU = 0;
$("div#dragB95 input[id^=HANBAIKINGAKU").each(function(){/*「貨幣」が"0"の場合*/
var KAHEI = $('#KAHEI_'+$(this).attr("id").replaceAll("HANBAIKINGAKU"+"_","")).val();
if (KAHEI == "0") {

		HANBAIKINGAKU += Number($(this).val().replaceAll(",",""));
}
});
result = HANBAIKINGAKU;
/*小数点以下第「2」位を切り上げ（包括整数）*/
if (result != null) {
	result =  Math.ceil(parseFloat(result)*100)/100;

	result =  parseFloat(result).toFixed(2);
}
if ((!result && result != 0) || isNaN(result)) {
	result = '';
}
$('#JPYGOUKEI').val(result);
$('#JPYGOUKEI').blur();

}

//*** Func Name: F20220915200012149 ***
function F20220915200012149(o){
  var row = getGridRowIndex(o,"rowseq");
/*Grid「B18」の項目「販売金額」の合計*/
var result = 0;
var HANBAIKINGAKU = 0;
$("div#dragB95 input[id^=HANBAIKINGAKU").each(function(){/*「貨幣」が"1"の場合*/
var KAHEI = $('#KAHEI_'+$(this).attr("id").replaceAll("HANBAIKINGAKU"+"_","")).val();
if (KAHEI == "1") {

		HANBAIKINGAKU += Number($(this).val().replaceAll(",",""));
}
});
result = HANBAIKINGAKU;
/*小数点以下第「2」位を切り上げ（包括整数）*/
if (result != null) {
	result =  Math.ceil(parseFloat(result)*100)/100;

	result =  parseFloat(result).toFixed(2);
}
if ((!result && result != 0) || isNaN(result)) {
	result = '';
}
$('#RMBGOUKEI').val(result);
$('#RMBGOUKEI').blur();

}

//*** Func Name: F20220915200012169 ***
function F20220915200012169(o){
  var row = getGridRowIndex(o,"rowseq");
/*Grid「B18」の項目「販売金額」の合計*/
var result = 0;
var HANBAIKINGAKU = 0;
$("div#dragB95 input[id^=HANBAIKINGAKU").each(function(){/*「貨幣」が"2"の場合*/
var KAHEI = $('#KAHEI_'+$(this).attr("id").replaceAll("HANBAIKINGAKU"+"_","")).val();
if (KAHEI == "2") {

		HANBAIKINGAKU += Number($(this).val().replaceAll(",",""));
}
});
result = HANBAIKINGAKU;
/*小数点以下第「2」位を切り上げ（包括整数）*/
if (result != null) {
	result =  Math.ceil(parseFloat(result)*100)/100;

	result =  parseFloat(result).toFixed(2);
}
if ((!result && result != 0) || isNaN(result)) {
	result = '';
}
$('#USDGOUKEI').val(result);
$('#USDGOUKEI').blur();

}
function F20091208153604208(){if (inputDataCheck()) {ajaxDoAdd();}}

  /* define function end
  
  /* dynamic define function end */
  function printO4Check(){
if( !checkRequired(document.getElementById('CHUUBUNSHONO1'),'注文書NO',true,'項目「@@」が空白になっています。', true)) {SF.setCheckSuccess(false);}

 return true;
}
function printS4Check(){
if( !checkRequired(document.getElementById('CHUUBUNSHONO1'),'注文書NO',true,'項目「@@」が空白になっています。', true)) {SF.setCheckSuccess(false);}

 return true;
}
function printO6Check(){

 return true;
}

  /* btn check end */
function DoMustCheck(){
    for (var i=1;i<=getObj('RowGrid95').value; i++) {
	}
if( !checkRequired(document.getElementById('SHANAIKOUJIBANGOU1'),'社内工事番号',true,'項目「@@」が空白になっています。', true)) {SF.setCheckSuccess(false);}

    eval(SF.getMustCheckData());
    if (!SF.isCheckSuccess()) {
          alert(jQuery.i18n.prop("com.msg_1000803"));
        SF.setCheckSuccess(true);
        return false;
    }
    return true;
}
function resetFile() {
    $('a.lightbox')
        .unbind("click")
        .bind(
        "click", function() {
            previewImg($(this));
            return false;
        }
    ); 
}
function dataFormat(){
    
}

function DoDataCheck() {
    var alertMsg = "";
    for (var i=1;i<=getObj('RowGrid95').value; i++) {
if (getObj("Grid95flg" + i) &&  (getObj("Grid95flg" + i).value != '')) {
 		if(!isLenCheck(getObj('KUBUN_' + i), 1, "区分", true)) { alertMsg = '' + i +'行目の[区分]項目に入力できるのは[最大長さは1の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('KOUMOKU_' + i), 100, "項目", true)) { alertMsg = '' + i +'行目の[項目]項目に入力できるのは[最大長さは100の値]のみです。'; alert(alertMsg); return false; } 		if(!checkIntegerType(getObj('SUURYOU_' + i), "数量", true, "項目「@@」には数値を入力して下さい。")) { alertMsg = '' + i +'行目の[数量]項目に入力できるのは[数字+[-]]のみです。'; alert(alertMsg); return false; } 		if(!isNumericType(getObj('HANBAITANKA_' + i), "販売単価", true)) { return false;} 		if(!isLenCheck(getObj('KAHEI_' + i), 1, "貨幣", true)) { alertMsg = '' + i +'行目の[貨幣]項目に入力できるのは[最大長さは1の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('CHUUBUNSHONO2_' + i), 10, "注文書NOGIRD", true)) { alertMsg = '' + i +'行目の[注文書NOGIRD]項目に入力できるのは[最大長さは10の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('SHUKKOFURAGU_' + i), 1, "出庫フラグ", true)) { alertMsg = '' + i +'行目の[出庫フラグ]項目に入力できるのは[最大長さは1の値]のみです。'; alert(alertMsg); return false; }}	}
 if(getObj("SHUTSUNYUUKOFURAGU1")) {
	 if(!isLenMaxCheck(getObj("SHUTSUNYUUKOFURAGU1"),1,"出入庫フラグ",true)) { alertMsg = '[出入庫フラグ]項目に入力できるのは[最大長さは1の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("SHUTSUNYUUKOFURAGU1"),1,"出入庫フラグ",true,true)) { alertMsg = '[出入庫フラグ]項目に入力できるのは[最大長さは1の値]のみです。';SF.setCheckSuccess(false); }
	 if(!isDate(getObj("CHUUMONHIDZUKE1"),false,"注文日付",true)) { alertMsg = '[注文日付]項目に入力できるのは[日付]のみです。'; return false; } if(getObj("SHUKKANO1")) {
	 if(!isLenMaxCheck(getObj("SHUKKANO1"),30,"出荷NO",true)) { alertMsg = '[出荷NO]項目に入力できるのは[最大長さは30の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("SHUKKANO1"),30,"出荷NO",true,true)) { alertMsg = '[出荷NO]項目に入力できるのは[最大長さは30の値]のみです。';SF.setCheckSuccess(false); } if(getObj("MITSUMORISHONO1")) {
	 if(!isLenMaxCheck(getObj("MITSUMORISHONO1"),10,"見積書NO",true)) { alertMsg = '[見積書NO]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("MITSUMORISHONO1"),10,"見積書NO",true,true)) { alertMsg = '[見積書NO]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("KYAKUSAKIMEISHOU")) {
	 if(!isLenMaxCheck(getObj("KYAKUSAKIMEISHOU"),10,"客先名称",true)) { alertMsg = '[客先名称]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("KYAKUSAKIMEISHOU"),10,"客先名称",true,true)) { alertMsg = '[客先名称]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("KYAKUSAKITANTOU1")) {
	 if(!isLenMaxCheck(getObj("KYAKUSAKITANTOU1"),30,"客先担当",true)) { alertMsg = '[客先担当]項目に入力できるのは[最大長さは30の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("KYAKUSAKITANTOU1"),30,"客先担当",true,true)) { alertMsg = '[客先担当]項目に入力できるのは[最大長さは30の値]のみです。';SF.setCheckSuccess(false); } if(getObj("ADORESU1")) {
	 if(!isLenMaxCheck(getObj("ADORESU1"),100,"アドレス",true)) { alertMsg = '[アドレス]項目に入力できるのは[最大長さは100の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("ADORESU1"),100,"アドレス",true,true)) { alertMsg = '[アドレス]項目に入力できるのは[最大長さは100の値]のみです。';SF.setCheckSuccess(false); } if(getObj("DENWABANGOU1")) {
	 if(!isLenMaxCheck(getObj("DENWABANGOU1"),20,"電話番号",true)) { alertMsg = '[電話番号]項目に入力できるのは[最大長さは20の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("DENWABANGOU1"),20,"電話番号",true,true)) { alertMsg = '[電話番号]項目に入力できるのは[最大長さは20の値]のみです。';SF.setCheckSuccess(false); } if(getObj("RESHIITONO")) {
	 if(!isLenMaxCheck(getObj("RESHIITONO"),10,"レシートNO",true)) { alertMsg = '[レシートNO]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("RESHIITONO"),10,"レシートNO",true,true)) { alertMsg = '[レシートNO]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("SHANAIKOUJIBANGOU1")) {
	 if(!isLenMaxCheck(getObj("SHANAIKOUJIBANGOU1"),10,"社内工事番号",true)) { alertMsg = '[社内工事番号]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("SHANAIKOUJIBANGOU1"),10,"社内工事番号",true,true)) { alertMsg = '[社内工事番号]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("HINMEI1")) {
	 if(!isLenMaxCheck(getObj("HINMEI1"),50,"品名",true)) { alertMsg = '[品名]項目に入力できるのは[最大長さは50の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("HINMEI1"),50,"品名",true,true)) { alertMsg = '[品名]項目に入力できるのは[最大長さは50の値]のみです。';SF.setCheckSuccess(false); } if(getObj("TANTOUSHA")) {
	 if(!isLenMaxCheck(getObj("TANTOUSHA"),10,"担当者",true)) { alertMsg = '[担当者]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("TANTOUSHA"),10,"担当者",true,true)) { alertMsg = '[担当者]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("KEIYAKUSAKI1")) {
	 if(!isLenMaxCheck(getObj("KEIYAKUSAKI1"),100,"契約先",true)) { alertMsg = '[契約先]項目に入力できるのは[最大長さは100の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("KEIYAKUSAKI1"),100,"契約先",true,true)) { alertMsg = '[契約先]項目に入力できるのは[最大長さは100の値]のみです。';SF.setCheckSuccess(false); }
	 if(!isDate(getObj("NOUKIYOTEIBI1"),false,"納期予定日",true)) { alertMsg = '[納期予定日]項目に入力できるのは[日付]のみです。'; return false; }
	 if(!isDate(getObj("NOUNYUUBI1"),false,"納入日",true)) { alertMsg = '[納入日]項目に入力できるのは[日付]のみです。'; return false; }
    eval(SF.getItemCheckData());
    if (!SF.isCheckSuccess()) {
        alert(alertMsg);
        SF.setCheckSuccess(true);
        return false;
    }
    return true;
}
function DoBeforeSave() {
      if (''=='') {
        return true;
    } else {
      return ;
    }
}

function doLinkTrans21(){ SF.setServerExecute(true);

 pageLinkTranfer("L00030.do?","0","","KYAKUSAKI,TANTOUSHA,CHUUBUNSHONO1,CHUUMONHIDZUKE1,NYUUKINKINGAKU1,","KYAKUSAKIMEISHOU,TANTOUSHA,CHUUBUNSHONO1,CHUUMONHIDZUKE1,JPYGOUKEI,","_self","","0","1133","340");
}
function doLinkTrans35(){ SF.setServerExecute(true);

 pageLinkTranfer("L00031.do?","0","","RYOUSHUUSHONO,CHUUBUNSHONO1,","RESHIITONO,CHUUBUNSHONO1,","_self","","0","1133","340");
}
function doLinkTrans65(){ SF.setServerExecute(true);

 pageLinkTranfer("L00034.do?","0","","","","_self","","0","1150","486");
}
function doLinkTrans119(o){ SF.setServerExecute(true);

 pageLinkTranfer("L00032.do?","1",o,"BUHINCHUUBUNSHOMEISAINO,BUHINCHUUBUNSHONO,KOUJIKANRIBANGOU1,SHANAIKOUJIBANGOU,","CHUUBUNSHOMEISAINO_,CHUUBUNSHONO1,SHANAIKOUJIBANGOU1,SHANAIKOUJIBANGOU1,","_self","","0","1619","9804");
}
function doLinkTrans121(o){ SF.setServerExecute(true);

 pageLinkTranfer("L00033.do?","1",o,"BUHINCHUUBUNSHONO,BUHINCHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU1,SHANAIKOUJIBANGOU,","CHUUBUNSHONO1,CHUUBUNSHOMEISAINO_,SHANAIKOUJIBANGOU1,SHANAIKOUJIBANGOU1,","_self","","0","1619","9804");
}

function inputDataCheck(){
    $(".ErrStyle").each(function () {
        var _this = $(this);
        var parentObj = _this.parent(".WF_STABLE_CLASS_TH , .WF_STABLE_CLASS_TD");
        var isStaticTableItem = (parentObj.length > 0);
        _this.removeClass("ErrStyle");
        if (isStaticTableItem) {
            parentObj.css("background-color", "");
        }
    });
    if (popErrCheck()) {
        if(DoMustCheck())
            if (DoDataCheck())
                return DoBeforeSave();
            else 
                return false;
        else
            return false;
    } else {
        return false;
    }
}
//FileContext---start---
function getContextMenu() {

    $("img.chgAble").contextMenu({
        menu: 'imgMenu'},
        function(action, el, pos) {
            if (action =='exist') {
                if ($(el).attr("id").substr(0,5) == "thumb") {
                    s = $(el).attr("id").substr(5);
                    v = $("#"+s).val();
                    o = $("#o"+s).val();
                    openImageResource(v,s,o);
                }
            } else if (action =='clear') {
                if ($(el).attr("id").substr(0,5) == "thumb") {
                    s = $(el).attr("id").substr(5);
                    
                    var attachID = $("#"+s).val();
                    $("#"+s).val("");
                    $("#thumb"+s).attr("src","/images/nofile.gif");
                    $("#thumb"+s).attr("alt","Just Dummy");
                    if ($("#pv"+s).length) {
                        i = $("#pv"+s).html();
                        d = $("#pv"+s).get(0).parentNode;
                        d.removeChild(getObj("pv"+s));
                        $(i).appendTo(d);
                    }
                    ra = $("#o"+s).val().split(",");
                    $("#thumb"+s).width(ra[1]+"px");
                    $("#thumb"+s).height(ra[2]+"px");
                    if (ra.length == 4) {
                        var gridID = ra[3];
                        setGridChangeFlg(s, gridID, attachID);
                    }
                    getContextMenu();
                }
            }
        });
}
var self = null;
function afterSearch() {
    if (self == null) {
        ko.applyBindings(new newsViewModel());
    } 
    
    ${PageBucket.knockOutScriptMap.get("afterSearch")}
}
function newsViewModel() {
    self = this;
    // Editable data
${PageBucket.knockOutScriptMap.get("viewModel")}
${PageBucket.knockOutScriptMap.get("dropdownlist")}
}

${PageBucket.knockOutScriptMap.get("dataChange")}

  
  var Grid95;
 function setGrid95(recordsPerPage) {
var recordNum = 0;
if (recordsPerPage != undefined) {
 recordNum = recordsPerPage;
}
Grid95 = $("#Grid95").aingrid({
 	height:228,
 	width:1098,
 	displayWidth:1098,
 	isMobile:false,
 	initialLoad: false,
 	colWidths: [50,120,139,92,76,55,69,120,102,116,158,0,0,0,0,0],
 	rowClasses: ['ui-grid-row-style1', 'ui-grid-row-style2'],
 	addRowMethod: 2,
 	bodyHeight: 34,
 	hasFooter: true,
 	hasScroll: true,
 	colDataType: [0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2],
 	colDataId: ['lvl','KUBUN_','KOUMOKU_','SUURYOU_','HANBAITANKA_','KAHEI_','HANBAIKINGAKU_','TSUKAMATSUNYUUKINGAKUJPY_','TSUKAMATSUNYUUKINGAKURMB_','TSUKAMATSUNYUUKINGAKUUSD_','grdB18W18_','CHUUBUNSHONO2_','SHUKKOFURAGU_','grdB18AA18_','grdB18AB18_','CHUUBUNSHOMEISAINO_'],
 	autoRowId: false,
  colsetting: false,
 	rowActionFlg: 'Grid95flg',
 	rowDelChkFlg: 'Grid95delchk',
 	rowBegin: 1,
 	rowsObjectId: 'RowGrid95',
 	colClasses:['grid-col-num','g1','g1','g3','g3','g1','g3','g3','g3','g3','g1','g1','g1','g1','g1','g1'],
 	resizableCols: false,
 	url: 'A011GridFormFeed.do?pageID=P00013&subID=95',
 	extraParams: {},
 	paging: false,
 	recordsPerPage: recordNum,
 	totalRecords: parseInt($("#initRowGrid95").val()),
 	scrollbarW: 17,
 	sorting: false,
 	sortedCol:0,
 	sortedColDir:"asc",
 	unsortableCols: [0],
 	useTemplateRow: true,
 	actionFlg: 2,
 	onAfterDelRow: function(row){return ajaxDoAddExeJs("A011grdB181Change",null, null, $(this));},
 	allRowSent: 1,
 	rowAdd: true,
 	rowDelete:true,
 	rowUpdate:true,
  isAutoHeight:1,
 pageTargetTop:100,
 footerPosition:1,
 effectDisplay:0
});
 	$('#_ingrid_Grid95_0_b .autocomp').each(function () {
		var row = $(this).parents('tr').index() + 1;
	
	});
 SF.addGridHeadListener(95, Grid95);
}
 $(window).resize(function () {var minusHeight = 100;var browserObj = $.browser;if (browserObj.msie) minusHeight -= 3;else if (browserObj.chrome) minusHeight += 90;else if (browserObj.mozilla) minusHeight += 90;var $gridObj = $('#_ingrid_Grid95_0_b');var autoHeight = getGridAutoHeight($gridObj) - minusHeight;$gridObj.height(getGridAutoHeight($gridObj) - minusHeight);$gridObj.parent('div').height(autoHeight)});
</script>
<style type="text/css">
.WF_STABLE_CLASS input.ui-button {
    padding: 0px;
}
.tableTdAlignCenter {
    text-align: center;
}
.tableTdAlignLeft {
    text-align: left;
}
.tableTdAlignRight {
    text-align: right;
}
.tableTdVAlignMiddle {
    vertical-align: middle;
}
.tableTdVAlignTop {
    vertical-align: top;
}
.tableTdVAlignBottom {
    vertical-align: bottom;
}
 .arrowLight_red{position: relative;
background: #cc0000;
display: inline-block;
padding: 1px 10px;
font-size: 10px;
font-weight: bold;
color: #FFF;
margin-right: 5px;
/* box-shadow */box-shadow:3px 3px 0px 0px #bfbfbf;
-moz-box-shadow:3px 3px 0px 0px #bfbfbf;
-webkit-box-shadow:3px 3px 0px 0px #bfbfbf;
/* border-radius */border-radius:6px;
-moz-border-radius:6px;
-webkit-border-radius:6px;}
.arrowLight_red:after{left: 100%;
top: 50%;
border: solid transparent;
content: " ";
height: 0;
width: 0;
position: absolute;
pointer-events: none;
border-color: rgba(204, 0, 0, 0);
border-left-color: #cc0000;
border-width: 5px;
margin-top: -5px;}
.menubutton{box-shadow: 0 6px 0 #000;
position: relative;
top: 0;
background-color: #284eb4;
border-width: 0px;
border-style: none;
font-weight: bold;
color: #FFF;
width: 100%;
border-radius: 5px;
-webkit-border-radius: 5px;
-moz-border-radius: 5px;
padding-top: 10px;
padding-bottom: 10px;
cursor: pointer;}
.menubutton:hover{box-shadow:none;
top: 6px;}
.btl_btm{border-radius: 5px;
-moz-border-radius: 5px;
-webkit-border-radius: 5px;
border: 2px solid #E4E4E4;
width: 100%;
height: 100%;
padding: 0px 10px 15px;
margin-bottom: 12px;}
.select-box01{width: 100%;
padding: 5px 50px 5px 10px;
-webkit-appearance: none;
-moz-appearance: none;
appearance: none;
border: 1px solid #ccc;
background: #eee;
background: url(/webedi/common/images/arrowD.png) right 50% no-repeat, -webkit-linear-gradient(top, #fff 0%,#ededed 100%);
background: url(/webedi/common/images/arrowD.png) right 50% no-repeat, linear-gradient(to bottom, #fff 0%,#ededed 100%);
-webkit-appearance: none;
-moz-appearance: none;
appearance: none;
border-radius: 6px;
-moz-border-radius: 6px;
-webkit-border-radius: 6px;}
.help{padding-right: 10px!important;
padding-left: 10px!important;}
.button_green{box-shadow: 0 6px 0 #000;
position: relative;
top: 0;
background-color: rgb(51, 153, 102);
border-width: 0px;
border-style: none;
font-weight: bold;
color: #FFF;
width: 100%;
border-radius: 5px;
-webkit-border-radius: 5px;
-moz-border-radius: 5px;
padding-top: 10px;
padding-bottom: 10px;
cursor: pointer;}
.button_green:hover{box-shadow:none;
top: 6px;}
.arrow_blu{position: relative;
background: #87cefa;
display: inline-block;
padding: 3px 10px;
font-size: 10px;
font-weight: bold;
color: #FFF;
margin-right: 5px;
box-shadow: 3px 3px 0px 0px #bfbfbf;
-moz-box-shadow: 3px 3px 0px 0px #bfbfbf;
-webkit-box-shadow: 3px 3px 0px 0px #bfbfbf;
border-radius: 6px;
-moz-border-radius: 6px;
-webkit-border-radius: 6px;}
.buttonon{cursor: pointer;
font-family: icomoon;
background: #ffffff;
background: -moz-linear-gradient(top, #ffffff 0%, #e5e5e5 100%);
background: -webkit-linear-gradient(top, #ffffff 0%,#e5e5e5 100%);
background: linear-gradient(to bottom, #ffffff 0%,#e5e5e5 100%);
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffffff', endColorstr='#e5e5e5',GradientType=0 );
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 3px;
border: 1px solid #999;
padding-top: 5px;
padding-right: 5px;
padding-bottom: 3px;
padding-left: 5px;
color: #284eb4!important;
box-shadow: 1px 1px 1px 0px #ccc;
-moz-box-shadow: 1px 1px 1px 0px #ccc;
-webkit-box-shadow: 1px 1px 1px 0px #ccc;
width: 100%;
height: 100%;}
.buttonon:disabled{pointer-events: none;
cursor: none !important;
text-decoration: none !important;
color: #999!important;
border: 1px solid #777;
padding: 5px;
background: #ccc;
border-radius: 3px;
-webkit-border-radius: 3px;
opacity: 1;}
.buttonsend{background: #ffd65e;
background: -moz-linear-gradient(top, #ffd65e 0%, #febf04 100%);
background: -webkit-linear-gradient(top, #ffd65e 0%,#febf04 100%);
background: linear-gradient(to bottom, #ffd65e 0%,#febf04 100%);
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffd65e', endColorstr='#febf04',GradientType=0 );
border-color: #F90;
padding-right: 20px;
padding-left: 20px;

cursor: pointer;
font-family: icomoon;
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 3px;
padding-top: 5px;
padding-bottom: 3px;
color: #284eb4;
}
.button_green:disabled{top: 0!important;
background: #ccc;
cursor: none;
box-shadow: 0 6px 0 #000!important;}
.selectdwn-select{width: 100%;
position: relative;
margin: 0;
height: 28px;
line-height: 14px;
font-size: 12px;
padding: 0 2px;
border: 1px solid #ccc;
border-radius: 3px;
color: #284eb4;
align-items: center;
white-space: pre;
-webkit-rtl-ordering: logical;
cursor: default;
box-shadow: 1px 1px 1px 0px #ccc;
-moz-box-shadow: 1px 1px 1px 0px #ccc;
-webkit-box-shadow: 1px 1px 1px 0px #ccc;
}
.menublock02{padding: 3px;
background-color: #ddd;
border-top: 1px solid #fff;
border-left: 1px solid #fff;
border-bottom: 1px solid #ccc;
border-right: 1px solid #ccc;
box-shadow: 0 0 2px #000;
-moz-box-shadow: 0 0 2px #000;
-webkit-box-shadow: 0px 0px 2px #000;
margin-top: 3px;
margin-left: 3px;
height: 100%;
}
.helpbox{background-color: #FFF;
padding-top: 3px;
padding-right: 10px;
padding-bottom: 2px;
padding-left: 10px;
border: 2px solid #CCC;
border-radius: 10px;
-moz-border-radius: 10px;
-webkit-border-radius: 10px;
overflow: hidden;
display: block;}
.textbox{border: 1px solid #777;
padding: 5px;
color: #999;
background: #fff;
border-radius: 3px;
background: -webkit-gradient( linear, left top, left bottom, from(#eee), to(#fff) );
-webkit-border-radius: 3px;
background: -moz-linear-gradient( top, #eee, #fff );
-moz-border-radius: 3px;
filter: progid:DXImageTransform.Microsoft.gradient(startColorstr=#ffeeeeee,endColorstr=#ffffffff);
zoom: 1;}
.helpbox2{float: right;
width: 100%;
height: 100%;
border-radius: 10px;
-moz-border-radius: 10px;
-webkit-border-radius: 10px;
border: 1px solid #CCC;
padding: 10px;}
.tbl04_head{border-collapse: collapse;
border-top: 3px solid #F00!important;
border-bottom: #cecece 1px solid!important;
border-left: #cecece 1px solid!important;
border-right: #cecece 1px solid!important;
/*border-bottom: #e3e3e3 1px solid!important;
border-right: #e3e3e3 1px solid!important;*/
text-align: left;
padding: 5px;
font-weight: normal;
vertical-align: top;
white-space: nowrap;}
.tbl04_txt{height: 100%!important;}
.tbl04_body{border-collapse: collapse;
border-top: none!important;
border-bottom: #cecece 1px solid!important;
border-left: #cecece 1px solid!important;
border-right: #cecece 1px solid!important;
/*border-bottom: #e3e3e3 1px solid!important;
border-right: #e3e3e3 1px solid!important;*/
text-align: left;
padding: 5px;
vertical-align: top;
}
.tbl04_lbl_25{height: 25px!important;}
.tbl04_lbl_75{height: 75px!important;}
.tbl04_select{width: 100%;
padding: 5px 50px 5px 10px;
-webkit-appearance: none;
-moz-appearance: none;
appearance: none;
border: 1px solid #ccc;
background: #eee;
background: url(/webedi/common/images/arrowD.png) right 50% no-repeat, -webkit-linear-gradient(top, #fff 0%,#ededed 100%);
background: url(/webedi/common/images/arrowD.png) right 50% no-repeat, linear-gradient(to bottom, #fff 0%,#ededed 100%);
-webkit-appearance: none;
-moz-appearance: none;
appearance: none;
border-radius: 0px;
-moz-border-radius: 0px;
-webkit-border-radius: 0px;
}
.tbl04_head.readonly{background-color: #f7f7f7!important;}
.tbl04_body.readonly{background-color: #f7f7f7!important;}
.tbl04_lbl_190{height: 190px!important;}
.tbl04_btm_txt{border-collapse: collapse;
border-top: none!important;
border-bottom: #cecece 1px solid!important;
/*border-bottom: #e3e3e3 1px solid!important;
border-right: #e3e3e3 1px solid!important;*/
text-align: left;
padding: 5px;
vertical-align: top;
background-color: #f7f7f7!important;
height: 100%!important;
}
.tbl04_rb_txt{border-collapse: collapse;
border-top: none!important;
border-right: #cecece 1px solid!important;
border-bottom: #cecece 1px solid!important;
/*border-bottom: #e3e3e3 1px solid!important;
border-right: #e3e3e3 1px solid!important;*/
text-align: left;
padding: 5px;
vertical-align: top;
background-color: #f7f7f7!important;
height: 100%!important;
}
.tbl04_textarea{background-color: #f7f7f7!important;}
.tbl04_lb_txt{border-collapse: collapse;
border-top: none!important;
border-left: #cecece 1px solid!important;
border-bottom: #cecece 1px solid!important;
/*border-bottom: #e3e3e3 1px solid!important;
border-right: #e3e3e3 1px solid!important;*/
text-align: left;
padding: 5px;
vertical-align: top;
background-color: #f7f7f7!important;
height: 100%!important;
}
.tbl04_btm_lbl_25{border-collapse: collapse;
border-top: none!important;
border-bottom: #cecece 1px solid!important;
/*border-bottom: #e3e3e3 1px solid!important;
border-right: #e3e3e3 1px solid!important;*/
text-align: left;
padding: 5px;
vertical-align: top;
background-color: #f7f7f7!important;
height: 25px;
}
.tbl04_rb_lbl_25{border-collapse: collapse;
border-top: none!important;
border-right: #cecece 1px solid!important;
border-bottom: #cecece 1px solid!important;
/*border-bottom: #e3e3e3 1px solid!important;
border-right: #e3e3e3 1px solid!important;*/
text-align: left;
padding: 5px;
vertical-align: top;
background-color: #f7f7f7!important;
height: 25px;
}
.tbl04_body_with_top{border-collapse: collapse;
border-top: #cecece 1px solid!important;
border-bottom: #cecece 1px solid!important;
border-left: #cecece 1px solid!important;
border-right: #cecece 1px solid!important;
/*height: 100%!important;
border-bottom: #e3e3e3 1px solid!important;
border-right: #e3e3e3 1px solid!important;*/
text-align: left;
padding: 5px;
vertical-align: top;
}
.tbl04_lbl_with_top{border-collapse: collapse;
border-top: #cecece 1px solid!important;
border-bottom: #cecece 1px solid!important;
border-right: #cecece 1px solid!important;
/*border-bottom: #e3e3e3 1px solid!important;
border-right: #e3e3e3 1px solid!important;*/
text-align: left;
padding: 5px;
vertical-align: top;
background-color: #f7f7f7!important;
height: 25px;
}
.select-box02{padding: 5px 50px 5px 10px;
-webkit-appearance: none;
-moz-appearance: none;
appearance: none;
border: 1px solid #ccc;
background: #eee;
background: url(/webedi/common/images/arrowD.png) right 50% no-repeat, -webkit-linear-gradient(top, #fff 0%,#ededed 100%);
background: url(/webedi/common/images/arrowD.png) right 50% no-repeat, linear-gradient(to bottom, #fff 0%,#ededed 100%);
-webkit-appearance: none;
-moz-appearance: none;
appearance: none;
border-radius: 6px;
-moz-border-radius: 6px;
-webkit-border-radius: 6px;
}
.whiteSpace{white-space:pre-line;}
.grid_head_txt_linefeed{word-wrap:break-word;
word-break: break-all;
white-space:normal !important;
height:auto !important;
padding:0px;}
.button_blue{box-shadow: 0 6px 0 #000;
position: relative;
top: 0;
background-color: rgb(0, 176, 240);
border-width: 0px;
border-style: none;
font-weight: bold;
color: #FFF;
width: 100%;
border-radius: 5px;
-webkit-border-radius: 5px;
-moz-border-radius: 5px;
padding-top: 10px;
padding-bottom: 10px;
cursor: pointer;}
.button_blue:hover{box-shadow:none;
top: 6px;}
.button_blue:disabled{top: 0!important;
background: #ccc;
cursor: none;
box-shadow: 0 6px 0 #000!important;}
.button_red{box-shadow: 0 6px 0 #000;
position: relative;
top: 0;
background-color: rgb(192, 0, 0);
border-width: 0px;
border-style: none;
font-weight: bold;
color: #ffffff;
width: 100%;
border-radius: 5px;
-webkit-border-radius: 5px;
-moz-border-radius: 5px;
padding-top: 10px;
padding-bottom: 10px;
cursor: pointer;}
.button_red:hover{box-shadow:none;
top: 6px;}
.button_red:disabled{top: 0!important;
background: #ccc;
cursor: none;
box-shadow: 0 6px 0 #000!important;}
.button_yellow{box-shadow: 0 6px 0 #000;
position: relative;
top: 0;
background-color: rgb(255, 134, 24);
border-width: 0px;
border-style: none;
font-weight: bold;
color: #FFF;
width: 100%;
border-radius: 5px;
-webkit-border-radius: 5px;
-moz-border-radius: 5px;
padding-top: 10px;
padding-bottom: 10px;
cursor: pointer;}
.button_yellow:hover{box-shadow:none;
top: 6px;}
.button_yellow:disabled{top: 0!important;
background: #ccc;
cursor: none;
box-shadow: 0 6px 0 #000!important;}
.buttonon_green{cursor: pointer;
font-family: icomoon;
background: #689A04;
background: -moz-linear-gradient(top, #689A04 100%, #e5e5e5 100%);
background: -webkit-linear-gradient(top, #689A04 100%,#e5e5e5 100%);
background: linear-gradient(to bottom, #689A04 100%,#e5e5e5 100%);
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#689A04', endColorstr='#e5e5e5',GradientType=0 );
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 3px;
border: 1px solid #999;
padding-top: 5px;
padding-right: 5px;
padding-bottom: 3px;
padding-left: 5px;
color: #ffffff!important;
box-shadow: 1px 1px 1px 0px #ccc;
-moz-box-shadow: 1px 1px 1px 0px #ccc;
-webkit-box-shadow: 1px 1px 1px 0px #ccc;
width: 100%;
height: 100%;}

</style>
</head>
<body style="background-size:100% 114px;">
<div class="wrapper" style="background-color:white">
<%@ include file="../view/head.jsp" %>
<div class="contents">
<div id="main" style="padding-top:36px;"> 
   <div class="pathbox">
<ul class="path">
	<li title="ホームへ遷移">
		<a href="homePage.do?fromHome=3ked392kd9202qax" onclick="SF.resetSessionStorage();">
SF販売在庫管理システム
		</a>
	</li>
<li><span>注文書管理</span></li>
	<li class="current"><em>注文管理詳細(P00013 - A011)</em></li>
</ul>
</div>

<!-- main start --> 
<form name="form1" id="form1">
  <input type=hidden name="ServerScriptID" id="ServerScriptID" value="">
  <input type=hidden name="ServerScriptFlg" id="ServerScriptFlg" value="">
  <input type=hidden name="ServerScriptResult" id="ServerScriptResult" value="" />
  <input type=hidden name="WF_PRINTFILEID" id="WF_PRINTFILEID" value="" />
  <input type=hidden name="WF_PRINTFILEENCODE" id="WF_PRINTFILEENCODE" value="" />
  <input type=hidden name="pringFlg" id="pringFlg" value="">
  <input type=hidden name="PageID" id="PageID" value="P00013"/>
  <input type=hidden name="SubID" id="SubID" value="">
  <input type=hidden name="pageRcds" id="pageRcds" value="5">
  <input type=hidden name="currentpage" id="currentpage" value="1"/>
  <input type=hidden name="div" id="div" value="" />
  <input type=hidden name="actid" id="actid" value="100015" />
  <input type=hidden name="actflg" id="actflg" value="${requestScope.actflg}" />
  <input type=hidden name="mode" id="mode" value="${requestScope.mode}" />
  <input type=hidden name="TargetObj" id="TargetObj" value=""/>
  <input type=hidden name="filterID" id="filterID" value=""/>
  <input type=hidden name="filterRow" id="filterRow" value=""/>
  <input type=hidden name="filterError" id="filterError" value=""/>
  <input type=hidden name="recognID" id="recognID" value=""/>
  <input type=hidden name="srecognID" id="srecognID" value=""/>
  <input type=hidden name="initSearch" id="initSearch" value="">
  <input type=hidden name="sinitSearch" id="sinitSearch" value="">
  <input type=hidden name="dataControlFlg" id="dataControlFlg" value=""/>
  <input type=hidden name="uniqueId" id="uniqueId" value="" />
  <input type=hidden name="importFilePath" id="importFilePath" value="" />
  <input type=hidden name="unloadCheck" id="unloadCheck" value="" />
  <input type=hidden name="WF_RUNRESULT" id="WF_RUNRESULT" value="0">
  <input type=hidden name="WF_CURRLOC" id="WF_CURRLOC" value="">
  <input type=hidden name="WF_CUSTOMIZE-CHARTID" id="WF_CUSTOMIZE-CHARTID" value="">
  <input type=hidden name="pageFlg" id="pageFlg" value="1">
  <input type=hidden name="triggerID" id="triggerID" value="">
  
  
  
  <div id="target" style="position:absolute;border:0px" class="animsition">
  
<div id="dragB1"  style="position:absolute;top:24px;left:55px;text-align:center;vertical-align:middle;width:885px;height:37px;z-index:1;" class='userDiv' _ckf='0'><label  style='display:table-cell;width:885px;height:38px;padding:0 2px;text-align:center;vertical-align:middle;font-size:26px;font-weight:bold;background-color:#ffffff;' _subid=1 class='' id="B2">注文書管理</label></div>
<div id="dragB3"  style="position:absolute;top:24px;left:922px;text-align:right;padding-right:2px;vertical-align:bottom;width:91px;height:37px;z-index:1;" class='userDiv' _ckf='0'><label for='SHUTSUNYUUKOFURAGU1'  style='display:table-cell;width:91px;height:37px;line-height:37px;text-align:right;padding-right:2px;vertical-align:middle;font-size:12px;color:#000000;font-weight:bold;' _subid=3 class='' id="W2"><b>出入庫フラグ</b></label></div>
<div id="dragB7"  style="position:absolute;top:87px;left:55px;text-align:right;padding-right:2px;vertical-align:bottom;width:119px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='CHUUMONHIDZUKE1'  style='display:table-cell;width:119px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=7 class='' id="B4"><b>注文日付</b></label></div>
<div id="dragB11"  style="position:absolute;top:87px;left:315px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='CHUUBUNSHONO1'  style='display:table-cell;width:90px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=11 class='' id="H4"><b>注文書NO</b>:<i class='fa fa-exclamation-circle fontco01' aria-hidden='true' title='必須'></i></label></div>
<div id="dragB15"  style="position:absolute;top:87px;left:604px;text-align:left;width:119px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='O4'  name='O4'  value='社内工事番号'  style='width:119px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); if (printO4Check()) if(confirm("ファイルを出力してもよろしいですか？")) {ajaxDoExcelPrint("A011","O4");} else {SF.setServerExecute(true);}}'  tabindex='8' class='btn04' _sf_class='btn04'></div>
<div id="dragB17"  style="position:absolute;top:87px;left:762px;text-align:left;width:144px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='S4'  name='S4'  value='受注明細表'  style='width:144px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); if (printS4Check()) if(confirm("ファイルを出力してもよろしいですか？")) {ajaxDoExcelPrint("A011","S4");} else {SF.setServerExecute(true);}}'  tabindex='9' class='btn04' _sf_class='btn04'></div>
<div id="dragB19"  style="position:absolute;top:87px;left:941px;text-align:left;width:157px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='W4'  name='W4'  value='全部出庫'  style='width:157px;height:34px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;background:#008597;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("W4").value=this.value;ajaxDoAddExeJs("A011W41Click",null,null,$(this));}'  tabindex='10' class='button_blue' _sf_class='button_blue'></div>
<div id="dragB21"  style="position:absolute;top:87px;left:1166px;text-align:left;display:none;width:104px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='AA4'  name='AA4'  value='入金1'   _subid='21'  _itemname='入金1'  type='button'  style='width:102px;height:34px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' onclick='javascript:if (SF.isServerExecute()) {SF.setServerExecute(false);doLinkTrans21();}'  tabindex='11' _sf_class='btn04'></div>
<div id="dragB23"  style="position:absolute;top:146px;left:55px;text-align:right;padding-right:2px;vertical-align:bottom;width:119px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='SHUKKANO1'  style='display:table-cell;width:119px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=23 class='' id="B6"><b>出荷NO</b></label></div>
<div id="dragB27"  style="position:absolute;top:146px;left:315px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='MITSUMORISHONO1'  style='display:table-cell;width:90px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=27 class='' id="H6"><b>見積書NO</b></label></div>
<div id="dragB31"  style="position:absolute;top:146px;left:604px;text-align:left;width:302px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='O6'  name='O6'  value='領収書(50%/40%/10%)'  style='width:302px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); if (printO6Check()) if(confirm("ファイルを出力してもよろしいですか？")) {ajaxDoExcelPrint("A011","O6");} else {SF.setServerExecute(true);}}'  tabindex='16' class='btn04' _sf_class='btn04'></div>
<div id="dragB33"  style="position:absolute;top:146px;left:941px;text-align:left;width:157px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='W6'  name='W6'  value='入金'  style='width:157px;height:34px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;background:#008597;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("W6").value=this.value;ajaxDoAddExeJs("A011W61Click",null,null,$(this));}'  tabindex='17' class='button_blue' _sf_class='button_blue'></div>
<div id="dragB35"  style="position:absolute;top:146px;left:1166px;text-align:left;display:none;width:104px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='AA6'  name='AA6'  value='入金2'   _subid='35'  _itemname='入金2'  type='button'  style='width:102px;height:34px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' onclick='javascript:if (SF.isServerExecute()) {SF.setServerExecute(false);doLinkTrans35();}'  tabindex='18' _sf_class='btn04'></div>
<div id="dragB37"  style="position:absolute;top:204px;left:55px;text-align:right;padding-right:2px;vertical-align:bottom;width:119px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KYAKUSAKIMEISHOU'  style='display:table-cell;width:119px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=37 class='' id="B8"><b>客先名称</b></label></div>
<div id="dragB41"  style="position:absolute;top:204px;left:318px;text-align:right;padding-right:2px;vertical-align:bottom;width:87px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KYAKUSAKITANTOU1'  style='display:table-cell;width:87px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=41 class='' id="H8"><b>客先担当</b></label></div>
<div id="dragB45"  style="position:absolute;top:252px;left:55px;text-align:right;padding-right:2px;vertical-align:bottom;width:119px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='ADORESU1'  style='display:table-cell;width:119px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=45 class='' id="B10"><b>アドレス</b></label></div>
<div id="dragB49"  style="position:absolute;top:252px;left:318px;text-align:right;padding-right:2px;vertical-align:bottom;width:87px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='DENWABANGOU1'  style='display:table-cell;width:87px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=49 class='' id="H10"><b>電話番号</b></label></div>
<div id="dragB53"  style="position:absolute;top:252px;left:941px;text-align:left;width:157px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='W10'  name='W10'  value='保存'  style='width:157px;height:34px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("W10").value=this.value;F20091208153604208();}'  tabindex='27' class='btn02' _sf_class='btn02'></div>
<div id="dragB57"  style="position:absolute;top:300px;left:55px;text-align:right;padding-right:2px;vertical-align:bottom;width:119px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='SHANAIKOUJIBANGOU1'  style='display:table-cell;width:119px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=57 class='' id="B12"><b>社内工事番号</b>:<i class='fa fa-exclamation-circle fontco01' aria-hidden='true' title='必須'></i></label></div>
<div id="dragB61"  style="position:absolute;top:300px;left:318px;text-align:right;padding-right:2px;vertical-align:bottom;width:87px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='HINMEI1'  style='display:table-cell;width:87px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=61 class='' id="H12"><b>品名</b></label></div>
<div id="dragB65"  style="position:absolute;top:300px;left:941px;text-align:left;width:157px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='W12'  name='W12'  value='キャンセル'   _subid='65'  _itemname='キャンセル'  type='button'  style='width:155px;height:34px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' onclick='javascript:if (SF.isServerExecute()) {SF.setServerExecute(false);doLinkTrans65();}'  tabindex='33' _sf_class='btn03'></div>
<div id="dragB67"  style="position:absolute;top:348px;left:55px;text-align:right;padding-right:2px;vertical-align:bottom;width:119px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='TANTOUSHA'  style='display:table-cell;width:119px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=67 class='' id="B14"><b>担当者</b></label></div>
<div id="dragB71"  style="position:absolute;top:348px;left:318px;text-align:right;padding-right:2px;vertical-align:bottom;width:87px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KEIYAKUSAKI1'  style='display:table-cell;width:87px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=71 class='' id="H14"><b>契約先</b></label></div>
<div id="dragB75"  style="position:absolute;top:396px;left:55px;text-align:right;padding-right:2px;vertical-align:bottom;width:119px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='NOUKIYOTEIBI1'  style='display:table-cell;width:119px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=75 class='' id="B16"><b>納期予定日</b></label></div>
<div id="dragB79"  style="position:absolute;top:396px;left:318px;text-align:right;padding-right:2px;vertical-align:bottom;width:87px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='NOUNYUUBI1'  style='display:table-cell;width:87px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=79 class='' id="H16"><b>納入日</b></label></div>
<div id="dragB83"  style="position:absolute;top:396px;left:581px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='JPYGOUKEI'  style='display:table-cell;width:90px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=83 class='' id="O16"><b>JPY合計</b></label></div>
<div id="dragB87"  style="position:absolute;top:396px;left:735px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='RMBGOUKEI'  style='display:table-cell;width:90px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=87 class='' id="S16"><b>RMB合計</b></label></div>
<div id="dragB91"  style="position:absolute;top:396px;left:923px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='USDGOUKEI'  style='display:table-cell;width:90px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=91 class='' id="W16"><b>USD合計</b></label></div>
<div id="dragB95"  style="position:absolute;top:454px;left:55px;text-align:left;height:228px;z-index:1;" class='userDiv' _ckf='0'><input type='hidden' name='initRowGrid95' id='initRowGrid95' value='0'><input type='hidden' name='RowGrid95' id='RowGrid95' value='0'><table id='Grid95' name ='Grid95' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>区分</th><th style='overflow:hidden;text-align:center;'>項目</th><th style='overflow:hidden;text-align:center;'>数量</th><th style='overflow:hidden;text-align:center;'>販売単価</th><th style='overflow:hidden;text-align:center;'>貨幣</th><th style='overflow:hidden;text-align:center;'>販売金額</th><th style='overflow:hidden;text-align:center;'>仕入金額(JPY)</th><th style='overflow:hidden;text-align:center;'>仕入金額(RMB)</th><th style='overflow:hidden;text-align:center;'>仕入金額(USD)</th><th style='overflow:hidden;text-align:center;'>部品明細</th><th style='display:none'>注文書NOGIRD</th><th style='display:none'>出庫フラグ</th><th style='display:none'>部品明細next</th><th style='display:none'>部品新規</th><th style='display:none'>注文書明細NO</th></tr></thead>
<tbody>
<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0><input style='float:left;' type=checkbox id='Grid95delchk0' name='Grid95delchk0'>0<input type=hidden width=0px id='Grid95flg0' name='Grid95flg0'></td>
<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style="overflow:hidden;"><select id=KUBUN_0 name=KUBUN_0 data-bind='value: KUBUN' _req=0 class='editable' _subid=97 _itemname='区分' _gid='Grid95' _gflg='Grid95flg0' onChange ='getObj("KUBUN_0").value=this.value;cs($(this),"rowseq","Grid95flg","0");'  style='width:119px;height:27px;font-size:14px;color:#000000;font-weight:normal;'>
WFC#ROW_DROPDOWNLIST_OPTIONS#WFC97WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>
<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='KOUMOKU_0'  name='KOUMOKU_0'  class='editable' style='width:136px;height:31px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;'  _subid='99'  _itemname='項目'  type='text'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>
<td class='g3 o' _colid=3 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='SUURYOU_0'  name='SUURYOU_0'  class='editable' style='width:89px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='101'  _itemname='数量'  type='text'  onChange ='getObj("SUURYOU_0").value=this.value;F20220915200012111($(this));F20220915200012131($(this));F20220915200012149($(this));F20220915200012169($(this));cs($(this),"rowseq","Grid95flg","0");'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>
<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='HANBAITANKA_0'  name='HANBAITANKA_0'  class='editable' style='width:73px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='103'  _itemname='販売単価'  _ire='###,###,##0'  _rge='1'  type='text'  onChange ='getObj("HANBAITANKA_0").value=this.value;F20220915200012111($(this));F20220915200012131($(this));F20220915200012149($(this));F20220915200012169($(this));cs($(this),"rowseq","Grid95flg","0");'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>
<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style="overflow:hidden;"><select id=KAHEI_0 name=KAHEI_0 data-bind='value: KAHEI' _req=0 class='editable' _subid=105 _itemname='貨幣' _gid='Grid95' _gflg='Grid95flg0' onChange ='getObj("KAHEI_0").value=this.value;F20220915200012131($(this));F20220915200012149($(this));F20220915200012169($(this));cs($(this),"rowseq","Grid95flg","0");'  style='width:54px;height:27px;font-size:14px;color:#000000;font-weight:normal;'>
WFC#ROW_DROPDOWNLIST_OPTIONS#WFC105WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>
<td class='g3 o' _colid=6 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='HANBAIKINGAKU_0'  name='HANBAIKINGAKU_0'  class='readonly' readOnly style='width:66px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='107'  _itemname='販売金額'  _ire='###,###,##0'  _rge='1'  type='text'  onChange ='getObj("HANBAIKINGAKU_0").value=this.value;F20220915200012131($(this));F20220915200012149($(this));F20220915200012169($(this));cs($(this),"rowseq","Grid95flg","0");'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>
<td class='g3 o' _colid=7 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='TSUKAMATSUNYUUKINGAKUJPY_0'  name='TSUKAMATSUNYUUKINGAKUJPY_0'  class='readonly' readOnly style='width:117px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='109'  _itemname='仕入金額(JPY)'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>
<td class='g3 o' _colid=8 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='TSUKAMATSUNYUUKINGAKURMB_0'  name='TSUKAMATSUNYUUKINGAKURMB_0'  class='readonly' readOnly style='width:99px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='111'  _itemname='仕入金額(RMB)'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>
<td class='g3 o' _colid=9 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='TSUKAMATSUNYUUKINGAKUUSD_0'  name='TSUKAMATSUNYUUKINGAKUUSD_0'  class='readonly' readOnly style='width:113px;height:31px; text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='113'  _itemname='仕入金額(USD)'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>
<td class='g1 o' _colid=10><div style="overflow:hidden;"><input id='grdB18W18_0'  name='grdB18W18_0'  value='部品明細'  style='width:157px;height:29px; padding:0 2px;padding:0 2px;text-align:center;font-size:14px;color:#ffffff;font-weight:normal;background:#007b50;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("grdB18W18_0").value=this.value;ajaxDoAddExeJs("A011grdB18W181Click",null,null,$(this));}'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>
<td style ='display:none' width='0px' _colid=11><input id='CHUUBUNSHONO2_0'  name='CHUUBUNSHONO2_0'  _k='1'  type='hidden' ></div></td>
<td style ='display:none' width='0px' _colid=12><input id='SHUKKOFURAGU_0'  name='SHUKKOFURAGU_0'  type='hidden' ></div></td>
<td class='g1 o' _colid=13><div style="overflow:hidden;"><input id='grdB18AA18_0'  name='grdB18AA18_0'  value='部品明細next'   _subid='119'  _itemname='部品明細next'  type='button'  _gid='Grid95'  _gflg='Grid95flg0'  onclick='doLinkTrans119($(this));'  _sf_class='btn04'></div></td>
<td class='g1 o' _colid=14><div style="overflow:hidden;"><input id='grdB18AB18_0'  name='grdB18AB18_0'  value='部品新規'   _subid='121'  _itemname='部品新規'  type='button'  _gid='Grid95'  _gflg='Grid95flg0'  onclick='doLinkTrans121($(this));'  _sf_class='btn04'></div></td>
<td style ='display:none' width='0px' _colid=15><input id='CHUUBUNSHOMEISAINO_0'  name='CHUUBUNSHOMEISAINO_0'  value='[自動採番]'  _k='1'  type='hidden' ></div></td></tr></tbody></table></div>
<div id="dragB127"  style="position:absolute;top:787px;left:300px;text-align:left;display:none;width:105px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='JPYGOUKEI1'  style='display:table-cell;width:105px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=127 class='' id="H30"><b>JPY合計1</b></label></div>
<div id="dragB129"  style="position:absolute;top:787px;left:407px;text-align:left;display:none;width:74px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='JPYGOUKEI1'  name='JPYGOUKEI1'  value='${requestScope.JPYGOUKEI1}'  class='editable' style='width:74px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='129'  _itemname='JPY合計1'  type='text'  tabindex='64'></div>
<div id="dragB131"  style="position:absolute;top:811px;left:300px;text-align:left;display:none;width:105px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='RMBGOUKEI1'  style='display:table-cell;width:105px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=131 class='' id="H31"><b>RMB合計1</b></label></div>
<div id="dragB133"  style="position:absolute;top:811px;left:407px;text-align:left;display:none;width:74px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='RMBGOUKEI1'  name='RMBGOUKEI1'  value='${requestScope.RMBGOUKEI1}'  class='editable' style='width:74px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='133'  _itemname='RMB合計1'  type='text'  tabindex='66'></div>
<div id="dragB135"  style="position:absolute;top:835px;left:300px;text-align:left;display:none;width:105px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='USDGOUKEI1'  style='display:table-cell;width:105px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=135 class='' id="H32"><b>USD合計1</b></label></div>
<div id="dragB137"  style="position:absolute;top:835px;left:407px;text-align:left;display:none;width:74px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='USDGOUKEI1'  name='USDGOUKEI1'  value='${requestScope.USDGOUKEI1}'  class='editable' style='width:74px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='137'  _itemname='USD合計1'  type='text'  tabindex='68'></div>
<div id="dragB139"  style="position:absolute;top:3403px;left:244px;text-align:left;width:70px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label  style='display:table-cell;width:70px;height:23px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=139 class='' id="F139">0.0</label></div>
<div id="dragB5"  style="position:absolute;top:24px;left:1015px;text-align:left;width:83px;height:39px;z-index:1;" class='userDiv' _ckf='0'><select id=SHUTSUNYUUKOFURAGU1 name=SHUTSUNYUUKOFURAGU1 _req=0 class='editable chosen_dropdownlist_style ' _subid=5 _itemname='出入庫フラグ' style='width:83px;height:37px;vertical-align:middle;font-size:12px;color:#000000;font-weight:normal;' tabindex='3'><option value ='${requestScope.TYUMONSYO.getSHUTSUNYUUKOFURAGU()}' selected>${requestScope.TYUMONSYO.getSHUTSUNYUUKOFURAGU()}</option></select></div>
<div id="dragB9"  style="position:absolute;top:87px;left:177px;text-align:left;width:141px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input type=text name=CHUUMONHIDZUKE1 id=CHUUMONHIDZUKE1 data-bind='value: CHUUMONHIDZUKE1' value='' class='editable calendar' _subid=9 _itemname='注文日付' onChange ='getObj("CHUUMONHIDZUKE1").value=this.value;dateFormatChange($(this),"注文日付");'  style='width:141px;height:32px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;' tabindex='5' placeHolder=''></div>
<div id="dragB13"  style="position:absolute;top:87px;left:407px;text-align:left;width:167px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input type=text name=CHUUBUNSHONO1 id=CHUUBUNSHONO1 data-bind='value: CHUUBUNSHONO1' _k=1 value='${requestScope.TYUMONSYO.getCHUUBUNSHONO()}' class='readonly' readOnly _subid=13 _itemname='注文書NO' style='width:161px;height:28px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='7'></div>
<div id="dragB25"  style="position:absolute;top:146px;left:177px;text-align:left;width:141px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='SHUKKANO1'  name='SHUKKANO1'  value='${requestScope.TYUMONSYO.getSHUKKANO()}' data-bind='value: SHUKKANO1' class='editable' style='width:141px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='25'  _itemname='出荷NO'  type='text'  tabindex='13'></div>
<div id="dragB29"  style="position:absolute;top:146px;left:407px;text-align:left;width:167px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='MITSUMORISHONO1'  name='MITSUMORISHONO1'  value='${requestScope.TYUMONSYO.getMITSUMORISHONO()}' data-bind='value: MITSUMORISHONO1' class='editable' style='width:167px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='29'  _itemname='見積書NO'  type='text'  tabindex='15'></div>
<div id="dragB39"  style="position:absolute;top:204px;left:177px;text-align:left;width:141px;height:34px;z-index:1;" class='userDiv' _ckf='0'><select id=KYAKUSAKIMEISHOU name=KYAKUSAKIMEISHOU data-bind="options:KYAKUSAKIMEISHOU,selectedOption: KYAKUSAKIMEISHOU_selected, optionsValue: 'KYAKUSAKIMEISHOU_optionValue', optionsText: 'KYAKUSAKIMEISHOU_optionText'"  _req=0 class='editable chosen_dropdownlist_style ' _subid=39 _itemname='客先名称' _fun=ajaxDoAddExeJs("A011KYAKUSAKIMEISHOU1Change",null,null,$(this)); style='width:141px;height:32px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='20'><option value ='${requestScope.TYUMONSYO.getKYAKUSAKIID()}' selected>${requestScope.TYUMONSYO.getKYAKUSAKIID()}</option></select></div>
<div id="dragB43"  style="position:absolute;top:204px;left:407px;text-align:left;width:167px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='KYAKUSAKITANTOU1'  name='KYAKUSAKITANTOU1'  value='${requestScope.TYUMONSYO.getKYAKUSAKITANTOU()}' data-bind='value: KYAKUSAKITANTOU1' class='editable' style='width:167px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='43'  _itemname='客先担当'  type='text'  tabindex='22'></div>
<div id="dragB47"  style="position:absolute;top:252px;left:177px;text-align:left;width:141px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='ADORESU1'  name='ADORESU1'  value='${requestScope.TYUMONSYO.getADORESU()}' data-bind='value: ADORESU1' class='editable' style='width:141px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='47'  _itemname='アドレス'  type='text'  tabindex='24'></div>
<div id="dragB51"  style="position:absolute;top:252px;left:407px;text-align:left;width:167px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='DENWABANGOU1'  name='DENWABANGOU1'  value='${requestScope.TYUMONSYO.getDENWABANGOU()}' data-bind='value: DENWABANGOU1' class='editable' style='width:167px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='51'  _itemname='電話番号'  type='text'  tabindex='26'></div>
<div id="dragB55"  style="position:absolute;top:252px;left:1166px;text-align:left;display:none;width:104px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='RESHIITONO'  name='RESHIITONO'  value='${requestScope.TYUMONSYO.getRESHIITONO()}' data-bind='value: RESHIITONO' class='editable' style='width:104px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='55'  _itemname='レシートNO'  type='text'  tabindex='28'></div>
<div id="dragB59"  style="position:absolute;top:300px;left:177px;text-align:left;width:141px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='SHANAIKOUJIBANGOU1'  name='SHANAIKOUJIBANGOU1'  value='${requestScope.TYUMONSYO.getSHANAIKOUJIBANGOU()}' data-bind='value: SHANAIKOUJIBANGOU1' class='editable' style='width:141px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='59'  _itemname='社内工事番号'  type='text'  tabindex='30'></div>
<div id="dragB63"  style="position:absolute;top:300px;left:407px;text-align:left;width:167px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='HINMEI1'  name='HINMEI1'  value='${requestScope.TYUMONSYO.getHINMEI()}' data-bind='value: HINMEI1' class='editable' style='width:167px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='63'  _itemname='品名'  type='text'  tabindex='32'></div>
<div id="dragB69"  style="position:absolute;top:348px;left:177px;text-align:left;width:141px;height:34px;z-index:1;" class='userDiv' _ckf='0'><select id=TANTOUSHA name=TANTOUSHA data-bind="options:TANTOUSHA,selectedOption: TANTOUSHA_selected, optionsValue: 'TANTOUSHA_optionValue', optionsText: 'TANTOUSHA_optionText'"  _req=0 class='editable chosen_dropdownlist_style ' _subid=69 _itemname='担当者' style='width:141px;height:32px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='35'><option value ='${requestScope.TYUMONSYO.getTANTOUSHAID()}' selected>${requestScope.TYUMONSYO.getTANTOUSHAID()}</option></select></div>
<div id="dragB73"  style="position:absolute;top:348px;left:407px;text-align:left;width:167px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='KEIYAKUSAKI1'  name='KEIYAKUSAKI1'  value='${requestScope.TYUMONSYO.getKEIYAKUSAKI()}' data-bind='value: KEIYAKUSAKI1' class='editable' style='width:167px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='73'  _itemname='契約先'  type='text'  tabindex='37'></div>
<div id="dragB77"  style="position:absolute;top:396px;left:177px;text-align:left;width:141px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input type=text name=NOUKIYOTEIBI1 id=NOUKIYOTEIBI1 data-bind='value: NOUKIYOTEIBI1' value='' class='editable calendar' _subid=77 _itemname='納期予定日' onChange ='getObj("NOUKIYOTEIBI1").value=this.value;dateFormatChange($(this),"納期予定日");'  style='width:141px;height:32px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;' tabindex='39' placeHolder=''></div>
<div id="dragB81"  style="position:absolute;top:396px;left:407px;text-align:left;width:167px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input type=text name=NOUNYUUBI1 id=NOUNYUUBI1 data-bind='value: NOUNYUUBI1' value='' class='editable calendar' _subid=81 _itemname='納入日' onChange ='getObj("NOUNYUUBI1").value=this.value;dateFormatChange($(this),"納入日");'  style='width:167px;height:32px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;' tabindex='41' placeHolder=''></div>
<div id="dragB85"  style="position:absolute;top:396px;left:674px;text-align:left;width:88px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='JPYGOUKEI'  name='JPYGOUKEI'  value='${requestScope.TYUMONSYO.getSHOUHINSOUGAKUJPY()}' data-bind='value: JPYGOUKEI' class='readonly' readOnly style='width:88px;height:34px;padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='85'  _itemname='JPY合計'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  tabindex='43'></div>
<div id="dragB89"  style="position:absolute;top:396px;left:827px;text-align:left;width:114px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='RMBGOUKEI'  name='RMBGOUKEI'  value='${requestScope.TYUMONSYO.getSHOUHINSOUGAKURMB()}' data-bind='value: RMBGOUKEI' class='readonly' readOnly style='width:114px;height:34px;padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='89'  _itemname='RMB合計'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  tabindex='45'></div>
<div id="dragB93"  style="position:absolute;top:396px;left:1015px;text-align:left;width:83px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='USDGOUKEI'  name='USDGOUKEI'  value='${requestScope.TYUMONSYO.getSHOUHINSOUGAKUUSD()}' data-bind='value: USDGOUKEI' class='readonly' readOnly style='width:83px;height:34px;padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='93'  _itemname='USD合計'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  tabindex='47'></div>
   </div>
   
  <UL id=imgMenu class=contextMenu style="display:none">
  <LI class="img"><A href="#exist">ファイル変更</A></LI>
  <LI class="del"><A href="#clear">ファイルｸﾘｱ</A></LI>
  </UL>            
  <div style="display: none;"><input type = "file" name="imagesGRIDIMAGEUPLOAD" id="imagesGRIDIMAGEUPLOAD" fileIDItemID="" gridFlg="1" style="display: none;"/></div> 
</form>
</div>
</div>
</div>
<!-- main end -->


<div id=FileDiv></div><%//ファイルアップロード %>
<div id=FuncDiv></div><%//Import/Export %>
<div id="rstFld"></div>
<div id="TreeCustomDialog"></div>
<script type="text/javascript">

function previewImg(o) {
    var src = o.attr("href");
    if (!$('#FileDiv' ).dialog("isOpen")) {
        $('#FileDiv' )
            .dialog( 'option','title','ファイル表示')
            .dialog( 'option','height',430)
            .dialog( 'option','width',500)
            .dialog( 'option','position',["center","middle"]);
        $('#FileDiv').unbind( "dialogopen");
        $('#FileDiv').bind( "dialogopen", function(event, ui) {
            $('#FileDiv').append("<img src='"+src+"' width='100%' align=center valign=middle'>");
        });
        $('#FileDiv' ).dialog('open' );
    }
}
function getParam() {
    var pram=location.search;
    var path=location.pathname;
    if (!pram) return false;
    pram = pram.substring(1);
    var pair=pram.split("&");
    var i=temp="";
    var newpram="";
    var isNew = false;
    for (i=0;i<pair.length;i++){
        temp=pair[i].split("=");
        keyName=temp[0];
        keyValue=temp[1];
        if (keyName!='rand') {
            newpram+="&"+keyName+"="+keyValue;
        }
        if (keyName=='Mode'&&keyValue=='2') {
            isNew = true;
        }
    }
    newpram=path+"?"+newpram.substring(1)+getRandParam();
    getObj("WF_CURRLOC").value=newpram;
    if (isNew) {
        getObj("WF_ADDLOC").value=newpram;
    }
}
function changeDisplayIcon(o) {
    var obj = $(o);
    var _iconPath = "/images/icon/";
    var showFlg = $obj.attr("_sf");
    var eventType = event.type;
    var iconFile = "";
    var opacity;
    if (eventType == "mouseover") {
        if ("1" == showFlg) {
            iconFile = "minimum_over.jpg";
        } else {
            iconFile = "maximum_over.jpg";
        }
        opacity = 1;
    } else if (eventType == "mouseout") {
        if ("1" == showFlg) {
            iconFile = "minimum.jpg";
        } else {
            iconFile = "maximum.jpg";
        }
        opacity = 0.5;
    }
    
    if ("" != iconFile) {
        obj.attr("src", _iconPath + iconFile);
        obj.css("opacity", opacity);
    }
    
}
function setItemDisplay(o) {
    var $obj = $(o);
    var showFlg = $obj.attr("_sf");
    var divID = $obj.attr("_di");
    var divObj = $("div#" + divID);
    if ("1" == showFlg) {
        $obj.attr("_sf", "0");
        divObj.effect("fold", {}, 500);
    } else {
        $obj.attr("_sf", "1");
        divObj.show("fold", {}, 500);
    }
}
function gridImageUp (o) {
	$('#imagesGRIDIMAGEUPLOAD').attr ("fileIDItemID", o.attr("fileIDItemID"));
	$('#imagesGRIDIMAGEUPLOAD').click();
}
//-------refresh end
$(function() {
  $(".animsition").animsition({
        inClass: 'fade-in',
        outClass: 'fade-out',
        inDuration: 1500,
        outDuration: 1500,
        linkElement: '.animsition-link',
        //linkElement: 'a:not([target="_blank"]):not([href^="#"]):not(.grid-page-addrow):not(.grid-page-delrow)',
        loading: true,
        loadingParentElement: 'body', //animsition wrapper element
        loadingClass: 'animsition-loading',
        loadingInner: '', // e.g '<img src="loading.svg" />'
        timeout: false,
        timeoutCountdown: 5000,
        onLoadEvent: true,
        browser: [ 'animation-duration', '-webkit-animation-duration'],
        // "browser" option allows you to disable the "animsition" in case the css property in the array is not supported by your browser.
        // The default setting is to disable the "animsition" in a browser that does not support "animation-duration".
        overlay : false,
        overlayClass : 'animsition-overlay-slide',
        overlayParentElement : 'body',
        transition: function(url){ window.location.href = url;}
      });
    
      
      setGrid95();

    $("div.chosen_dropdownlist_style").each(function() {
        var sfClass = $("select", $(this).parent()).attr("_sf_class");
        if (sfClass) {
            $(".select2-chosen", $(this)).addClass(sfClass);
        }
    });
    
 //   getContextMenu();
    
    resetFile();
    
    SF.onChosenEventListener();
    //---calendar location start
    $.datepicker.setDefaults($.extend($.datepicker.regional['ja']));
    //---calendar location end
    
    getParam();
    //---leftside start-----
    $(window).unload(function(){
        if (clearSession) {
            var url = urlUserEdit+"?actid=100080&recognID="+getObj("srecognID").value;
            getQAjaxRunJson("rstfld",false,1,"",url,false,"","");
        }
        var url = urlUserEdit+"?actid=100080&recognID="+getObj("recognID").value;
        getQAjaxRunJson("rstfld",false,1,"",url,false,"","");
    });

    isUser = true;
    setPageLayout();
    resizeRadio();
    $('input:text,textarea').bind('blur',function(){        
         changeSpecHtml(this);
    });
  
    //---calendar text setting
    setCalendar();
    //---calendar text setting
    <%//input/export dialog%>
    
    $( "#FileDiv" ).dialog({
		autoOpen: false,
		show: "drop",
		hide: "drop",
		modal: true,
		close: function(event,ui) {
			$( "#FileDiv" ).html("");
		}
	});
    $( "#FuncDiv" ).dialog({
        autoOpen: false,
        show: "drop",
        hide: "drop",
        modal: true,
        resizable:false,
        close: function(event,ui) {
            $( "#FuncDiv" ).html("");
        }
    });

    SF.buttonInitListener();
    $("input[type=text]").each(function() {
        if ($(this).attr("_sf_class")) {
            $(this).addClass($(this).attr("_sf_class"));
        }
    });
  
    //------msg end-----
    //9:----set tooltip
    $("input,select,div.select2-container").tooltip();

    //enterKeyFlg
    enter2tab();

  
getQAjaxRunJson("rstfld",false,1,"","A011Init.do",true,setSendData(document.form1),"");
    
   
  
   
   
  $(".animsition").on("animsition.inStart", function () {
    $("#target").css("height", $(document).height() - 8);
    $("div[id^=dragB]").each(function () {
          var _this = $(this);
          if (_this.parent("fieldset").length == 0) {
              _this.css("top", parseInt(_this.css("top"), 10) + 7);
          }
      });
  });
});
</script>
</body>
</html>
