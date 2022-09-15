<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8" />
<title>P00014 - 部品管理画面</title>
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
	var cWidth = 1619;
	cWidth = ($(window).width()-cWidth)/2;
	$("#target").css({
		left: cWidth-10+"px",
		width: "1619px"
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
    var manageID = 'A013';
    getObj('WF_RUNRESULT') =='0';
    getQAjaxRunJson("rstfld",true,1,"", manageID+"F20091208153604208.do",true,setSendData(document.form1),"afterSave();");
}

function afterSave() {
    isChanged = false;
    dataFormat();
    if (getObj('WF_RUNRESULT').value =='1') {
        Grid99_clear();
getObj('initRowGrid99').value = getObj('RowGrid99').value

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
 //   var manageID = 'A013';
 //   var url = manageID + reqName + "Reference.do?"+"&targetSubID="+tagetSubID+"&pringFlg=4"+"&targetObj="+tagetObj+"&conf="+conf+"&row="+row;
  //  getQAjaxRunJson("rstfld",false,1,"",url,false,"","changeRefSpecHtml($('#"+refObj+"'));");
}

function ajaxReference (reqName,conf, row) {
 	var manageID = 'A013';
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
    var manageID = 'A013';
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
    var manageID = 'A013';
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
  function A013AA41(){SF.setServerExecute(true);
/*1．「購入日付1」に""を設定する。*/
$('#KOUNYUUHIDZUKE1').val("");
$('#KOUNYUUHIDZUKE1').blur();
/*1.Grid検索処理:「B16」と関連付け,条件は「購入日付1<入荷日付,部品注文書NO=部品詳細.注文書NO,部品注文書明細NO=部品詳細.注文書明細NO」,検索後処理関数「kyoutukannsuu_nyukahidukei」。*/
doSmartSearch("197","99","2","kyoutukannsuu_nyukahidukei()");
	/*4．「確定権限制限」ボタンを実行する。*/
	SF.setServerExecute(true);
	$('#AV10').click();

	/*処理終了。*/
}

//*** Func Name: 貨幣-Click ***
function A013KAHEI1(o){
  var row = getGridRowIndex(o,"rowseq");
var row = getGridRowIndex(o,"rowseq");
var KOUNYUUTANKA = $('#KOUNYUUTANKA_'+row).val();
var KOUNYUUTANKA = $('#KOUNYUUTANKA_'+row).val();
var SEISAKUSUUQTY = getObj("SEISAKUSUUQTY").value;
var KOSUU = getObj("KOSUU_"+row).value;
var SOUKOSUU = getObj("SOUKOSUU_"+row).value;
var SHOUKEI = getObj("SHOUKEI_"+row).value;
var KOUNYUUTANKA = getObj("KOUNYUUTANKA_"+row).value;
SF.setServerExecute(true);
/*1．「購入単価」が数字でないの場合,以下の処理を行う。*/
if (parseFloat(Number(KOUNYUUTANKA)).toString() == "NaN" ) {
	/*1.「購入単価は非数字を入力できません。改めて入力してください。」メッセージを表示する。*/
	alert('購入単価は非数字を入力できません。改めて入力してください。');
	/*2.「購入単価」に""を設定する。*/
	$('#KOUNYUUTANKA_'+row).val("");
	$('#KOUNYUUTANKA_'+row).blur();
	/*処理終了。*/
}
/*2．「購入単価」が0より小さいの場合,以下の処理を行う。*/
if (KOUNYUUTANKA < 0) {
	/*1.「購入単価は負数を入力できません。改めて入力してください。」メッセージを表示する。*/
	alert('購入単価は負数を入力できません。改めて入力してください。');
	/*2.「購入単価」に""を設定する。*/
	$('#KOUNYUUTANKA_'+row).val("");
	$('#KOUNYUUTANKA_'+row).blur();
	/*処理終了。*/
}
/*3．「製作数QTY,個数,総個数,小計,購入単価」を取得。*/
/*1．変数計算:<総個数>=<個数>*<製作数QTY>。*/
SOUKOSUU=Number(isNaN(Number(KOSUU)) ? KOSUU.replaceAll(",","") : KOSUU)*Number(isNaN(Number(SEISAKUSUUQTY)) ? SEISAKUSUUQTY.replaceAll(",","") : SEISAKUSUUQTY);

/*変数計算*/
if (SOUKOSUU != null && parseInt(SOUKOSUU) != SOUKOSUU) {
	SOUKOSUU =  parseFloat(SOUKOSUU).toFixed(0);
}
if ((!SOUKOSUU && SOUKOSUU != 0) || isNaN(SOUKOSUU)) {
	SOUKOSUU = '';
}


/*2．「総個数」に<総個数>を設定する。*/
$('#SOUKOSUU_'+row).val(SOUKOSUU == null || SOUKOSUU == 'null'  ? '' : SOUKOSUU);
$('#SOUKOSUU_'+row).blur();
/*3．変数計算(double,小数点以下第2位を四捨五入):<小計>=<総個数>*<購入単価>。*/
SHOUKEI=Number(isNaN(Number(SOUKOSUU)) ? SOUKOSUU.replaceAll(",","") : SOUKOSUU)*Number(isNaN(Number(KOUNYUUTANKA)) ? KOUNYUUTANKA.replaceAll(",","") : KOUNYUUTANKA);

/*変数計算(double,小数点以下第2位を四捨五入)*/
if (SHOUKEI != null && parseInt(SHOUKEI) != SHOUKEI) {
	SHOUKEI =  parseFloat(SHOUKEI).toFixed(2);
}
if ((!SHOUKEI && SHOUKEI != 0) || isNaN(SHOUKEI)) {
	SHOUKEI = '';
}


/*4．「小計」に<小計>を設定する。*/
$('#SHOUKEI_'+row).val(SHOUKEI == null || SHOUKEI == 'null'  ? '' : SHOUKEI);
$('#SHOUKEI_'+row).blur();
/*1．関数「kyoutukansuu_keisann」を実行する。*/
kyoutukansuu_keisann();

/*処理終了。*/
}

//*** Func Name: 希望納期-Click ***
function A013KIBOUNOUKI1(o){
  var row = getGridRowIndex(o,"rowseq");
var row = getGridRowIndex(o,"rowseq");
var NYUUKABI = $('#NYUUKABI_'+row).val();
var NYUUKABI = $('#NYUUKABI_'+row).val();
var GENZAINICHIDZUKE = getObj("GENZAINICHIDZUKE").value;
var KIBOUNOUKI = $('#KIBOUNOUKI_'+row).val();
var KIBOUNOUKI = $('#KIBOUNOUKI_'+row).val();
var NYUUKABI = getObj("NYUUKABI_"+row).value;
SF.setServerExecute(true);
/*1.「入荷日付」が空白でない場合,以下の処理を行う。*/
if ((NYUUKABI != null && NYUUKABI != "" ) ) {
	/*1.「入荷日付」が「現在日付」以下の場合,以下の処理を行う。*/
	if (NYUUKABI <= GENZAINICHIDZUKE) {
		/*1.「入荷日付」を「button_red」スタイルにする。*/
		$('#NYUUKABI'+"_"+row).addClass("button_red");
		/*処理終了。*/
	}
	/*2.その他の場合,以下の処理を行う。*/ else {
		/*1.「入荷日付」のスタイル「button_red」を削除する。*/
		$('#NYUUKABI'+"_"+row).removeClass("button_red");
		/*処理終了。*/
	}
	/*処理終了。*/
}
/*2.その他の場合,以下の処理を行う。*/ else {
	/*1.「入荷日付」のスタイル「button_red」を削除する。*/
	$('#NYUUKABI'+"_"+row).removeClass("button_red");
	/*2.「入荷日付」のスタイル「button_blue」を削除する。*/
	$('#NYUUKABI'+"_"+row).removeClass("button_blue");
	/*処理終了。*/
}
/*3.「希望納期」が空白ではないの場合,以下の処理を行う。*/
if ((KIBOUNOUKI != null && KIBOUNOUKI != "" ) ) {
	/*1.「希望納期」が「入荷日付」以下の場合,以下の処理を行う。*/
	if (KIBOUNOUKI <= NYUUKABI) {
		/*1.「入荷日付」を「button_red」スタイルにする。*/
		$('#NYUUKABI'+"_"+row).addClass("button_red");
		/*処理終了。*/
	}
	/*処理終了。*/
}
/*処理終了。*/
}

//*** Func Name: 個数-Click ***
function A013KOSUU1(o){
  var row = getGridRowIndex(o,"rowseq");
var row = getGridRowIndex(o,"rowseq");
var KOSUU = $('#KOSUU_'+row).val();
var KOSUU = $('#KOSUU_'+row).val();
var SEISAKUSUUQTY = getObj("SEISAKUSUUQTY").value;
var KOSUU = getObj("KOSUU_"+row).value;
var SOUKOSUU = getObj("SOUKOSUU_"+row).value;
var SHOUKEI = getObj("SHOUKEI_"+row).value;
var KOUNYUUTANKA = getObj("KOUNYUUTANKA_"+row).value;
SF.setServerExecute(true);
/*1．「個数」が数字でないの場合,以下の処理を行う。*/
if (parseFloat(Number(KOSUU)).toString() == "NaN" ) {
	/*1.「個数は非数字を入力できません。改めて入力してください。」メッセージを表示する。*/
	alert('個数は非数字を入力できません。改めて入力してください。');
	/*2.「個数」に""を設定する。*/
	$('#KOSUU_'+row).val("");
	$('#KOSUU_'+row).blur();
	/*処理終了。*/
}
/*2．「個数」が0より小さいの場合,以下の処理を行う。*/
if (KOSUU < 0) {
	/*1.「個数は負数を入力できません。改めて入力してください。」メッセージを表示する。*/
	alert('個数は負数を入力できません。改めて入力してください。');
	/*2.「個数」に""を設定する。*/
	$('#KOSUU_'+row).val("");
	$('#KOSUU_'+row).blur();
	/*処理終了。*/
}
/*3．「製作数QTY,個数,総個数,小計,購入単価」を取得。*/
/*1．変数計算:<総個数>=<個数>*<製作数QTY>。*/
SOUKOSUU=Number(isNaN(Number(KOSUU)) ? KOSUU.replaceAll(",","") : KOSUU)*Number(isNaN(Number(SEISAKUSUUQTY)) ? SEISAKUSUUQTY.replaceAll(",","") : SEISAKUSUUQTY);

/*変数計算*/
if (SOUKOSUU != null && parseInt(SOUKOSUU) != SOUKOSUU) {
	SOUKOSUU =  parseFloat(SOUKOSUU).toFixed(0);
}
if ((!SOUKOSUU && SOUKOSUU != 0) || isNaN(SOUKOSUU)) {
	SOUKOSUU = '';
}


/*2．「総個数」に<総個数>を設定する。*/
$('#SOUKOSUU_'+row).val(SOUKOSUU == null || SOUKOSUU == 'null'  ? '' : SOUKOSUU);
$('#SOUKOSUU_'+row).blur();
/*3．変数計算(double,小数点以下第2位を四捨五入):<小計>=<総個数>*<購入単価>。*/
SHOUKEI=Number(isNaN(Number(SOUKOSUU)) ? SOUKOSUU.replaceAll(",","") : SOUKOSUU)*Number(isNaN(Number(KOUNYUUTANKA)) ? KOUNYUUTANKA.replaceAll(",","") : KOUNYUUTANKA);

/*変数計算(double,小数点以下第2位を四捨五入)*/
if (SHOUKEI != null && parseInt(SHOUKEI) != SHOUKEI) {
	SHOUKEI =  parseFloat(SHOUKEI).toFixed(2);
}
if ((!SHOUKEI && SHOUKEI != 0) || isNaN(SHOUKEI)) {
	SHOUKEI = '';
}


/*4．「小計」に<小計>を設定する。*/
$('#SHOUKEI_'+row).val(SHOUKEI == null || SHOUKEI == 'null'  ? '' : SHOUKEI);
$('#SHOUKEI_'+row).blur();
/*1．関数「kyoutukansuu_keisann」を実行する。*/
kyoutukansuu_keisann();

/*処理終了。*/
}

//*** Func Name: 購入単価-Click ***
function A013KOUNYUUTANKA1(o){
  var row = getGridRowIndex(o,"rowseq");
var row = getGridRowIndex(o,"rowseq");
var KOUNYUUTANKA = $('#KOUNYUUTANKA_'+row).val();
var KOUNYUUTANKA = $('#KOUNYUUTANKA_'+row).val();
var SEISAKUSUUQTY = getObj("SEISAKUSUUQTY").value;
var KOSUU = getObj("KOSUU_"+row).value;
var SOUKOSUU = getObj("SOUKOSUU_"+row).value;
var SHOUKEI = getObj("SHOUKEI_"+row).value;
var KOUNYUUTANKA = getObj("KOUNYUUTANKA_"+row).value;
SF.setServerExecute(true);
/*1．「購入単価」が数字でないの場合,以下の処理を行う。*/
if (parseFloat(Number(KOUNYUUTANKA)).toString() == "NaN" ) {
	/*1.「購入単価は非数字を入力できません。改めて入力してください。」メッセージを表示する。*/
	alert('購入単価は非数字を入力できません。改めて入力してください。');
	/*2.「購入単価」に""を設定する。*/
	$('#KOUNYUUTANKA_'+row).val("");
	$('#KOUNYUUTANKA_'+row).blur();
	/*処理終了。*/
}
/*2．「購入単価」が0より小さいの場合,以下の処理を行う。*/
if (KOUNYUUTANKA < 0) {
	/*1.「購入単価は負数を入力できません。改めて入力してください。」メッセージを表示する。*/
	alert('購入単価は負数を入力できません。改めて入力してください。');
	/*2.「購入単価」に""を設定する。*/
	$('#KOUNYUUTANKA_'+row).val("");
	$('#KOUNYUUTANKA_'+row).blur();
	/*処理終了。*/
}
/*3．「製作数QTY,個数,総個数,小計,購入単価」を取得。*/
/*1．変数計算:<総個数>=<個数>*<製作数QTY>。*/
SOUKOSUU=Number(isNaN(Number(KOSUU)) ? KOSUU.replaceAll(",","") : KOSUU)*Number(isNaN(Number(SEISAKUSUUQTY)) ? SEISAKUSUUQTY.replaceAll(",","") : SEISAKUSUUQTY);

/*変数計算*/
if (SOUKOSUU != null && parseInt(SOUKOSUU) != SOUKOSUU) {
	SOUKOSUU =  parseFloat(SOUKOSUU).toFixed(0);
}
if ((!SOUKOSUU && SOUKOSUU != 0) || isNaN(SOUKOSUU)) {
	SOUKOSUU = '';
}


/*2．「総個数」に<総個数>を設定する。*/
$('#SOUKOSUU_'+row).val(SOUKOSUU == null || SOUKOSUU == 'null'  ? '' : SOUKOSUU);
$('#SOUKOSUU_'+row).blur();
/*3．変数計算(double,小数点以下第2位を四捨五入):<小計>=<総個数>*<購入単価>。*/
SHOUKEI=Number(isNaN(Number(SOUKOSUU)) ? SOUKOSUU.replaceAll(",","") : SOUKOSUU)*Number(isNaN(Number(KOUNYUUTANKA)) ? KOUNYUUTANKA.replaceAll(",","") : KOUNYUUTANKA);

/*変数計算(double,小数点以下第2位を四捨五入)*/
if (SHOUKEI != null && parseInt(SHOUKEI) != SHOUKEI) {
	SHOUKEI =  parseFloat(SHOUKEI).toFixed(2);
}
if ((!SHOUKEI && SHOUKEI != 0) || isNaN(SHOUKEI)) {
	SHOUKEI = '';
}


/*4．「小計」に<小計>を設定する。*/
$('#SHOUKEI_'+row).val(SHOUKEI == null || SHOUKEI == 'null'  ? '' : SHOUKEI);
$('#SHOUKEI_'+row).blur();
/*1．関数「kyoutukansuu_keisann」を実行する。*/
kyoutukansuu_keisann();

/*処理終了。*/
}

//*** Func Name: 入荷日付-Click ***
function A013NYUUKABI1(o){
  var row = getGridRowIndex(o,"rowseq");
var row = getGridRowIndex(o,"rowseq");
var NYUUKABI = $('#NYUUKABI_'+row).val();
var NYUUKABI = $('#NYUUKABI_'+row).val();
var GENZAINICHIDZUKE = getObj("GENZAINICHIDZUKE").value;
var KIBOUNOUKI = $('#KIBOUNOUKI_'+row).val();
var KIBOUNOUKI = $('#KIBOUNOUKI_'+row).val();
var NYUUKABI = getObj("NYUUKABI_"+row).value;
SF.setServerExecute(true);
/*1.「入荷日付」が空白でない場合,以下の処理を行う。*/
if ((NYUUKABI != null && NYUUKABI != "" ) ) {
	/*1.「入荷日付」が「現在日付」以下の場合,以下の処理を行う。*/
	if (NYUUKABI <= GENZAINICHIDZUKE) {
		/*1.「入荷日付」を「button_red」スタイルにする。*/
		$('#NYUUKABI'+"_"+row).addClass("button_red");
		/*処理終了。*/
	}
	/*2.その他の場合,以下の処理を行う。*/ else {
		/*1.「入荷日付」のスタイル「button_red」を削除する。*/
		$('#NYUUKABI'+"_"+row).removeClass("button_red");
		/*処理終了。*/
	}
	/*処理終了。*/
}
/*2.その他の場合,以下の処理を行う。*/ else {
	/*1.「入荷日付」のスタイル「button_red」を削除する。*/
	$('#NYUUKABI'+"_"+row).removeClass("button_red");
	/*2.「入荷日付」のスタイル「button_blue」を削除する。*/
	$('#NYUUKABI'+"_"+row).removeClass("button_blue");
	/*処理終了。*/
}
/*3.「希望納期」が空白ではないの場合,以下の処理を行う。*/
if ((KIBOUNOUKI != null && KIBOUNOUKI != "" ) ) {
	/*1.「希望納期」が「入荷日付」以下の場合,以下の処理を行う。*/
	if (KIBOUNOUKI <= NYUUKABI) {
		/*1.「入荷日付」を「button_red」スタイルにする。*/
		$('#NYUUKABI'+"_"+row).addClass("button_red");
		/*処理終了。*/
	}
	/*処理終了。*/
}
/*処理終了。*/
}
function A013PageAfterLoad1(){var SEISAKUHINKUBUN;
var HINBANNO1;
var HINMEI;
var KOSUU;
var SOUKOSUU;
var TSUKAMATSUNYUUSAKI;
var KIBOUNOUKI;
var TANTOU;
var TEHAISAKI;
var KOUNYUUTANKA;
var KAHEI;
var TEHAIBI;
var NYUUKABI;
var SHOUKEI;
var KAKOTANKA;
var grdB16AC16;
var CHUUBUNSHOMEISAINO1;
var CHUUBUNSHONO1;
var KIBOUTANKA;
var NYUUKAYOTEIBI;
var HINBANNO;
var KAKUTEIKUBUN2;
var KOUJIKANRIBANGOU2;
var GENZAINICHIDZUKE = getObj("GENZAINICHIDZUKE").value;
var KAKUTEIKUBUN1 = getObj("KAKUTEIKUBUN1").value;
SF.setServerExecute(true);
/*Grid「B16」ループ開始。*/
var intRow = getObj("RowGrid99").value;

for (var i = 1;i <= intRow; i++) {
/* grid loop start */
	SEISAKUHINKUBUN = $('#SEISAKUHINKUBUN_'+i).val();
	HINBANNO1 = $('#HINBANNO1_'+i).val();
	HINMEI = $('#HINMEI_'+i).val();
	KOSUU = $('#KOSUU_'+i).val();
	SOUKOSUU = $('#SOUKOSUU_'+i).val();
	TSUKAMATSUNYUUSAKI = $('#TSUKAMATSUNYUUSAKI_'+i).val();
	KIBOUNOUKI = $('#KIBOUNOUKI_'+i).val();
	TANTOU = $('#TANTOU_'+i).val();
	TEHAISAKI = $('#TEHAISAKI_'+i).val();
	KOUNYUUTANKA = $('#KOUNYUUTANKA_'+i).val();
	KAHEI = $('#KAHEI_'+i).val();
	TEHAIBI = $('#TEHAIBI_'+i).val();
	NYUUKABI = $('#NYUUKABI_'+i).val();
	SHOUKEI = $('#SHOUKEI_'+i).val();
	KAKOTANKA = $('#KAKOTANKA_'+i).val();
	grdB16AC16 = $('#grdB16AC16_'+i).val();
	CHUUBUNSHOMEISAINO1 = $('#CHUUBUNSHOMEISAINO1_'+i).val();
	CHUUBUNSHONO1 = $('#CHUUBUNSHONO1_'+i).val();
	KIBOUTANKA = $('#KIBOUTANKA_'+i).val();
	NYUUKAYOTEIBI = $('#NYUUKAYOTEIBI_'+i).val();
	HINBANNO = $('#HINBANNO_'+i).val();
	KAKUTEIKUBUN2 = $('#KAKUTEIKUBUN2_'+i).val();
	KOUJIKANRIBANGOU2 = $('#KOUJIKANRIBANGOU2_'+i).val();
	/*5.「入荷日付」が空白ではないの場合,以下の処理を行う。*/
	if ((NYUUKABI != null && NYUUKABI != "" ) ) {
		/*1.変数<入荷日付>の日付表示形式を「YYYY/MM/DD」にする。*/
		NYUUKABI = moment(NYUUKABI).format("YYYY/MM/DD");

		/*2.変数<希望納期>の日付表示形式を「YYYY/MM/DD」にする。*/
		KIBOUNOUKI = moment(KIBOUNOUKI).format("YYYY/MM/DD");

		/*3.<入荷日付>が「現在日付」以下の場合,以下の処理を行う。*/
		if (NYUUKABI <= GENZAINICHIDZUKE) {
			/*1.「入荷日付」を「button_red」スタイルにする。*/
			$('#NYUUKABI'+"_"+i).addClass("button_red");
			/*処理終了。*/
		}
		/*2.その他の場合,以下の処理を行う。*/ else {
			/*1.「入荷日付」を「button_blue」スタイルにする。*/
			$('#NYUUKABI'+"_"+i).addClass("button_blue");
			/*処理終了。*/
		}
		/*処理終了。*/
	}
	/*7.「確定区分」が空白,又は「確定区分」が"0"の場合,以下の処理を行う。*/
	if ((KAKUTEIKUBUN2 == null || KAKUTEIKUBUN2 == "" )  || KAKUTEIKUBUN2 == "0") {
		/*1.「確定」ボタンに"確定"を設定する。*/
		$('#grdB16AC16_'+i).val("確定");
		$('#grdB16AC16_'+i).blur();
		/*2.Grid「B16」の行を入力可能にする。*/
		$('div#_ingrid_Grid99_0_b [id=rowseq' + i + '] td').find('.editable').attr('disabled', false).removeClass('disable0 btnmuko');
		/*処理終了。*/
	}
	/*8.その他「確定区分」が"1"の場合,以下の処理を行う。*/
	else if (KAKUTEIKUBUN2 == "1") {
		/*1.「確定」ボタンに"取消"を設定する。*/
		$('#grdB16AC16_'+i).val("取消");
		$('#grdB16AC16_'+i).blur();
		/*2.Grid「B16」の行を入力不可にする。*/
		$('div#_ingrid_Grid99_0_b [id=rowseq' + i + '] td').find('.editable').attr('disabled', true).addClass('disable0 btnmuko');
		/*処理終了。*/
	}
	/*グリッドループ終了。*/
}
/*6.「確定区分1」を取得。*/
/*9.<確定区分1>が空白でない,且つ<確定区分1>が"1"の場合,以下の処理を行う。*/
if ((KAKUTEIKUBUN1 != null && KAKUTEIKUBUN1 != "" )  && KAKUTEIKUBUN1 == "1") {
	/*1.「得意先USER」を入力不可にする。*/
	SF.setDisabled('TOKUISAKIUSER',true);
	/*2.「アセンブリライン名称」を入力不可にする。*/
	SF.setDisabled('ASENBURIRAINMEISHOU',true);
	/*3.「機械名称MC」を入力不可にする。*/
	SF.setDisabled('KIKAIMEISHOUMC',true);
	/*4.「部品名称PART」を入力不可にする。*/
	SF.setDisabled('BUHINMEISHOUPART',true);
	/*5.「製作数QTY」を入力不可にする。*/
	SF.setDisabled('SEISAKUSUUQTY',true);
	/*6.「担当者」を入力不可にする。*/
	SF.setDisabled('TANTOUSHA1',true);
	/*7.「枚数」を入力不可にする。*/
	SF.setDisabled('MAISUU1',true);
	/*8.「日付1」を入力不可にする。*/
	SF.setDisabled('HIDZUKE1',true);
	/*9.「品番NO」を入力不可にする。*/
	SF.setDisabled('HINBANNO1'+"_"+i,true);
	/*10.「P12」を入力不可にする。*/
	SF.setDisabled('KOUJIKANRIBANGOU1',true);
	/*11.「全部確定」ボタンに"全部取消"を設定する。*/
	$('#T10').val("全部取消");
	$('#T10').blur();
	/*処理終了。*/
}
/*10.「確定権限制限」ボタンを実行する。*/
SF.setServerExecute(true);
$('#AV10').click();

/*処理終了。*/
}
function A013SEISAKUSUUQTY1(){var SEISAKUSUUQTY = getObj("SEISAKUSUUQTY").value;
var SEISAKUHINKUBUN;
var HINBANNO1;
var HINMEI;
var KOSUU;
var SOUKOSUU;
var TSUKAMATSUNYUUSAKI;
var KIBOUNOUKI;
var TANTOU;
var TEHAISAKI;
var KOUNYUUTANKA;
var KAHEI;
var TEHAIBI;
var NYUUKABI;
var SHOUKEI;
var KAKOTANKA;
var grdB16AC16;
var CHUUBUNSHOMEISAINO1;
var CHUUBUNSHONO1;
var KIBOUTANKA;
var NYUUKAYOTEIBI;
var HINBANNO;
var KAKUTEIKUBUN2;
var KOUJIKANRIBANGOU2;
SF.setServerExecute(true);
/*1．「製作数QTY」を取得。*/
/*1.Grid「B16」ループ開始。*/
var intRow = getObj("RowGrid99").value;

for (var i = 1;i <= intRow; i++) {
/* grid loop start */
	SEISAKUHINKUBUN = $('#SEISAKUHINKUBUN_'+i).val();
	HINBANNO1 = $('#HINBANNO1_'+i).val();
	HINMEI = $('#HINMEI_'+i).val();
	KOSUU = $('#KOSUU_'+i).val();
	SOUKOSUU = $('#SOUKOSUU_'+i).val();
	TSUKAMATSUNYUUSAKI = $('#TSUKAMATSUNYUUSAKI_'+i).val();
	KIBOUNOUKI = $('#KIBOUNOUKI_'+i).val();
	TANTOU = $('#TANTOU_'+i).val();
	TEHAISAKI = $('#TEHAISAKI_'+i).val();
	KOUNYUUTANKA = $('#KOUNYUUTANKA_'+i).val();
	KAHEI = $('#KAHEI_'+i).val();
	TEHAIBI = $('#TEHAIBI_'+i).val();
	NYUUKABI = $('#NYUUKABI_'+i).val();
	SHOUKEI = $('#SHOUKEI_'+i).val();
	KAKOTANKA = $('#KAKOTANKA_'+i).val();
	grdB16AC16 = $('#grdB16AC16_'+i).val();
	CHUUBUNSHOMEISAINO1 = $('#CHUUBUNSHOMEISAINO1_'+i).val();
	CHUUBUNSHONO1 = $('#CHUUBUNSHONO1_'+i).val();
	KIBOUTANKA = $('#KIBOUTANKA_'+i).val();
	NYUUKAYOTEIBI = $('#NYUUKAYOTEIBI_'+i).val();
	HINBANNO = $('#HINBANNO_'+i).val();
	KAKUTEIKUBUN2 = $('#KAKUTEIKUBUN2_'+i).val();
	KOUJIKANRIBANGOU2 = $('#KOUJIKANRIBANGOU2_'+i).val();
	/*1．「確定区分」が空白,又は「確定区分」が"0"の場合,以下の処理を行う。*/
	if ((KAKUTEIKUBUN2 == null || KAKUTEIKUBUN2 == "" )  || KAKUTEIKUBUN2 == "0") {
		/*1．変数計算:<総個数>=<個数>*<製作数QTY>。*/
		SOUKOSUU=Number(isNaN(Number(KOSUU)) ? KOSUU.replaceAll(",","") : KOSUU)*Number(isNaN(Number(SEISAKUSUUQTY)) ? SEISAKUSUUQTY.replaceAll(",","") : SEISAKUSUUQTY);

		/*変数計算*/
if (SOUKOSUU != null && parseInt(SOUKOSUU) != SOUKOSUU) {
	SOUKOSUU =  parseFloat(SOUKOSUU).toFixed(0);
}
if ((!SOUKOSUU && SOUKOSUU != 0) || isNaN(SOUKOSUU)) {
	SOUKOSUU = '';
}


		/*2．「総個数」に<総個数>を設定する。*/
		$('#SOUKOSUU_'+i).val(SOUKOSUU == null || SOUKOSUU == 'null'  ? '' : SOUKOSUU);
		$('#SOUKOSUU_'+i).blur();
		/*3．変数計算(double,小数点以下第2位を四捨五入):<小計>=<総個数>*<購入単価>。*/
		SHOUKEI=Number(isNaN(Number(SOUKOSUU)) ? SOUKOSUU.replaceAll(",","") : SOUKOSUU)*Number(isNaN(Number(KOUNYUUTANKA)) ? KOUNYUUTANKA.replaceAll(",","") : KOUNYUUTANKA);

		/*変数計算(double,小数点以下第2位を四捨五入)*/
if (SHOUKEI != null && parseInt(SHOUKEI) != SHOUKEI) {
	SHOUKEI =  parseFloat(SHOUKEI).toFixed(2);
}
if ((!SHOUKEI && SHOUKEI != 0) || isNaN(SHOUKEI)) {
	SHOUKEI = '';
}


		/*4．「小計」に<小計>を設定する。*/
		$('#SHOUKEI_'+i).val(SHOUKEI == null || SHOUKEI == 'null'  ? '' : SHOUKEI);
		$('#SHOUKEI_'+i).blur();
		/*1.グリッドループ終了。*/
	}
	/*1．関数「kyoutukansuu_keisann」を実行する。*/
	kyoutukansuu_keisann();

	/*処理終了。*/
}
/*処理終了。*/
}

//*** Func Name: 小計-Click ***
function A013SHOUKEI1(o){
  var row = getGridRowIndex(o,"rowseq");
SF.setServerExecute(true);
/*1．関数「kyoutukansuu_keisann」を実行する。*/
kyoutukansuu_keisann();

/*処理終了。*/
}
function A013T41(){SF.setServerExecute(true);
/*1.Grid検索処理:「B16」と関連付け,条件は「単価未定HIDEが部品詳細.購入単価値なし,部品注文書明細NO=部品詳細.注文書明細NO,部品注文書NO=部品詳細.注文書NO」,検索後処理関数「kyoutukannsuu_nyukahidukei」。*/
doSmartSearch("195","99","2","kyoutukannsuu_nyukahidukei()");
	/*3．「確定権限制限」ボタンを実行する。*/
	SF.setServerExecute(true);
	$('#AV10').click();

	/*処理終了。*/
}
function A013W41(){SF.setServerExecute(true);
/*2．「購入日付1」に今日を設定する。*/
$('#KOUNYUUHIDZUKE1').val(moment().format('YYYY/MM/DD'));
$('#KOUNYUUHIDZUKE1').blur();
/*1.Grid検索処理:「B16」と関連付け,条件は「購入日付1<入荷日付,部品注文書NO=部品詳細.注文書NO,部品注文書明細NO=部品詳細.注文書明細NO」,検索後処理関数「kyoutukannsuu_nyukahidukei」。*/
doSmartSearch("196","99","2","kyoutukannsuu_nyukahidukei()");
	/*処理終了。*/
}
function kyoutukannsuu_nyukahidukei(){var SEISAKUHINKUBUN;
var HINBANNO1;
var HINMEI;
var KOSUU;
var SOUKOSUU;
var TSUKAMATSUNYUUSAKI;
var KIBOUNOUKI;
var TANTOU;
var TEHAISAKI;
var KOUNYUUTANKA;
var KAHEI;
var TEHAIBI;
var NYUUKABI;
var SHOUKEI;
var KAKOTANKA;
var grdB16AC16;
var CHUUBUNSHOMEISAINO1;
var CHUUBUNSHONO1;
var KIBOUTANKA;
var NYUUKAYOTEIBI;
var HINBANNO;
var KAKUTEIKUBUN2;
var KOUJIKANRIBANGOU2;
var GENZAINICHIDZUKE = getObj("GENZAINICHIDZUKE").value;
var KAKUTEIKUBUN1 = "";
SF.setServerExecute(true);
/*Grid「B16」ループ開始。*/
var intRow = getObj("RowGrid99").value;

for (var i = 1;i <= intRow; i++) {
/* grid loop start */
	SEISAKUHINKUBUN = $('#SEISAKUHINKUBUN_'+i).val();
	HINBANNO1 = $('#HINBANNO1_'+i).val();
	HINMEI = $('#HINMEI_'+i).val();
	KOSUU = $('#KOSUU_'+i).val();
	SOUKOSUU = $('#SOUKOSUU_'+i).val();
	TSUKAMATSUNYUUSAKI = $('#TSUKAMATSUNYUUSAKI_'+i).val();
	KIBOUNOUKI = $('#KIBOUNOUKI_'+i).val();
	TANTOU = $('#TANTOU_'+i).val();
	TEHAISAKI = $('#TEHAISAKI_'+i).val();
	KOUNYUUTANKA = $('#KOUNYUUTANKA_'+i).val();
	KAHEI = $('#KAHEI_'+i).val();
	TEHAIBI = $('#TEHAIBI_'+i).val();
	NYUUKABI = $('#NYUUKABI_'+i).val();
	SHOUKEI = $('#SHOUKEI_'+i).val();
	KAKOTANKA = $('#KAKOTANKA_'+i).val();
	grdB16AC16 = $('#grdB16AC16_'+i).val();
	CHUUBUNSHOMEISAINO1 = $('#CHUUBUNSHOMEISAINO1_'+i).val();
	CHUUBUNSHONO1 = $('#CHUUBUNSHONO1_'+i).val();
	KIBOUTANKA = $('#KIBOUTANKA_'+i).val();
	NYUUKAYOTEIBI = $('#NYUUKAYOTEIBI_'+i).val();
	HINBANNO = $('#HINBANNO_'+i).val();
	KAKUTEIKUBUN2 = $('#KAKUTEIKUBUN2_'+i).val();
	KOUJIKANRIBANGOU2 = $('#KOUJIKANRIBANGOU2_'+i).val();
	/*2.「入荷日付」が空白ではないの場合,以下の処理を行う。*/
	if ((NYUUKABI != null && NYUUKABI != "" ) ) {
		/*1.変数<入荷日付>の日付表示形式を「YYYY/MM/DD」にする。*/
		NYUUKABI = moment(NYUUKABI).format("YYYY/MM/DD");

		/*2.「入荷日付」が「現在日付」以下の場合,以下の処理を行う。*/
		if (NYUUKABI <= GENZAINICHIDZUKE) {
			/*1.「入荷日付」を「button_red」スタイルにする。*/
			$('#NYUUKABI'+"_"+i).addClass("button_red");
			/*処理終了。*/
		}
		/*2.その他の場合,以下の処理を行う。*/ else {
			/*1.「入荷日付」のスタイル「button_red」を削除する。*/
			$('#NYUUKABI'+"_"+i).removeClass("button_red");
			/*処理終了。*/
		}
		/*処理終了。*/
	}
	/*5.<確定区分>が空白でない,且つ<確定区分>が"1"の場合,以下の処理を行う。*/
	if ((KAKUTEIKUBUN2 != null && KAKUTEIKUBUN2 != "" )  && KAKUTEIKUBUN2 == "1") {
		/*1.「確定」ボタンに"取消"を設定する。*/
		$('#grdB16AC16_'+i).val("取消");
		$('#grdB16AC16_'+i).blur();
		/*2.Grid「B16」の行を入力不可にする。*/
		$('div#_ingrid_Grid99_0_b [id=rowseq' + i + '] td').find('.editable').attr('disabled', true).addClass('disable0 btnmuko');
		/*処理終了。*/
	}
	/*6.その他の場合,以下の処理を行う。*/ else {
		/*1.「確定」ボタンに"確定"を設定する。*/
		$('#grdB16AC16_'+i).val("確定");
		$('#grdB16AC16_'+i).blur();
		/*2.Grid「B16」の行を入力可能にする。*/
		$('div#_ingrid_Grid99_0_b [id=rowseq' + i + '] td').find('.editable').attr('disabled', false).removeClass('disable0 btnmuko');
		/*処理終了。*/
	}
	/*グリッドループ終了。*/
}
/*7．関数「kyoutukansuu_syoukei」を実行する。*/
kyoutukansuu_syoukei();

/*8.<確定区分1>が空白でない,且つ<確定区分1>が"1"の場合,以下の処理を行う。*/
if ((KAKUTEIKUBUN1 != null && KAKUTEIKUBUN1 != "" )  && KAKUTEIKUBUN1 == "1") {
	/*1.「得意先USER」を入力不可にする。*/
	SF.setDisabled('TOKUISAKIUSER',true);
	/*2.「アセンブリライン名称」を入力不可にする。*/
	SF.setDisabled('ASENBURIRAINMEISHOU',true);
	/*3.「機械名称MC」を入力不可にする。*/
	SF.setDisabled('KIKAIMEISHOUMC',true);
	/*4.「部品名称PART」を入力不可にする。*/
	SF.setDisabled('BUHINMEISHOUPART',true);
	/*5.「製作数QTY」を入力不可にする。*/
	SF.setDisabled('SEISAKUSUUQTY',true);
	/*6.「担当者」を入力不可にする。*/
	SF.setDisabled('TANTOUSHA1',true);
	/*7.「枚数」を入力不可にする。*/
	SF.setDisabled('MAISUU1',true);
	/*8.「日付1」を入力不可にする。*/
	SF.setDisabled('HIDZUKE1',true);
	/*9.「品番NO」を入力不可にする。*/
	SF.setDisabled('HINBANNO1'+"_"+i,true);
	/*10.「P12」を入力不可にする。*/
	SF.setDisabled('KOUJIKANRIBANGOU1',true);
	/*11.「全部確定」ボタンに"全部取消"を設定する。*/
	$('#T10').val("全部取消");
	$('#T10').blur();
	/*処理終了。*/
}
/*9．「確定権限制限」ボタンを実行する。*/
SF.setServerExecute(true);
$('#AV10').click();

/*処理終了。*/
}
function kyoutukansuu_keisann(){var I31JPY = getObj("I31JPY").value;
var I32RMB = getObj("I32RMB").value;
var I33USD = getObj("I33USD").value;
var SEISAKUHINKUBUN;
var HINBANNO1;
var HINMEI;
var KOSUU;
var SOUKOSUU;
var TSUKAMATSUNYUUSAKI;
var KIBOUNOUKI;
var TANTOU;
var TEHAISAKI;
var KOUNYUUTANKA;
var KAHEI;
var TEHAIBI;
var NYUUKABI;
var SHOUKEI;
var KAKOTANKA;
var grdB16AC16;
var CHUUBUNSHOMEISAINO1;
var CHUUBUNSHONO1;
var KIBOUTANKA;
var NYUUKAYOTEIBI;
var HINBANNO;
var KAKUTEIKUBUN2;
var KOUJIKANRIBANGOU2;
SF.setServerExecute(true);
/*3．「I31JPY,I32RMB,I33USD」を取得。*/
/*Grid「B16」ループ開始。*/
var intRow = getObj("RowGrid99").value;

for (var i = 1;i <= intRow; i++) {
/* grid loop start */
	SEISAKUHINKUBUN = $('#SEISAKUHINKUBUN_'+i).val();
	HINBANNO1 = $('#HINBANNO1_'+i).val();
	HINMEI = $('#HINMEI_'+i).val();
	KOSUU = $('#KOSUU_'+i).val();
	SOUKOSUU = $('#SOUKOSUU_'+i).val();
	TSUKAMATSUNYUUSAKI = $('#TSUKAMATSUNYUUSAKI_'+i).val();
	KIBOUNOUKI = $('#KIBOUNOUKI_'+i).val();
	TANTOU = $('#TANTOU_'+i).val();
	TEHAISAKI = $('#TEHAISAKI_'+i).val();
	KOUNYUUTANKA = $('#KOUNYUUTANKA_'+i).val();
	KAHEI = $('#KAHEI_'+i).val();
	TEHAIBI = $('#TEHAIBI_'+i).val();
	NYUUKABI = $('#NYUUKABI_'+i).val();
	SHOUKEI = $('#SHOUKEI_'+i).val();
	KAKOTANKA = $('#KAKOTANKA_'+i).val();
	grdB16AC16 = $('#grdB16AC16_'+i).val();
	CHUUBUNSHOMEISAINO1 = $('#CHUUBUNSHOMEISAINO1_'+i).val();
	CHUUBUNSHONO1 = $('#CHUUBUNSHONO1_'+i).val();
	KIBOUTANKA = $('#KIBOUTANKA_'+i).val();
	NYUUKAYOTEIBI = $('#NYUUKAYOTEIBI_'+i).val();
	HINBANNO = $('#HINBANNO_'+i).val();
	KAKUTEIKUBUN2 = $('#KAKUTEIKUBUN2_'+i).val();
	KOUJIKANRIBANGOU2 = $('#KOUJIKANRIBANGOU2_'+i).val();
	/*1.<貨幣>が"0"の場合,以下の処理を行う。*/
	if (KAHEI == "0") {
		/*1.変数計算(double,小数点以下第2位を四捨五入):<I31JPY>=<I31JPY>+<小計>。*/
		I31JPY=Number(isNaN(Number(I31JPY)) ? I31JPY.replaceAll(",","") : I31JPY)+Number(isNaN(Number(SHOUKEI)) ? SHOUKEI.replaceAll(",","") : SHOUKEI);

		/*変数計算(double,小数点以下第2位を四捨五入)*/
if (I31JPY != null && parseInt(I31JPY) != I31JPY) {
	I31JPY =  parseFloat(I31JPY).toFixed(2);
}
if ((!I31JPY && I31JPY != 0) || isNaN(I31JPY)) {
	I31JPY = '';
}


		/*処理終了。*/
	}
	/*2.<貨幣>が"1"の場合,以下の処理を行う。*/
	if (KAHEI == "1") {
		/*1.変数計算:<I32RMB>=<I32RMB>+<小計>。*/
		I32RMB=Number(isNaN(Number(I32RMB)) ? I32RMB.replaceAll(",","") : I32RMB)+Number(isNaN(Number(SHOUKEI)) ? SHOUKEI.replaceAll(",","") : SHOUKEI);

		/*変数計算*/
if (I32RMB != null && parseInt(I32RMB) != I32RMB) {
	I32RMB =  parseFloat(I32RMB).toFixed(0);
}
if ((!I32RMB && I32RMB != 0) || isNaN(I32RMB)) {
	I32RMB = '';
}


		/*処理終了。*/
	}
	/*3.<貨幣>が"2"の場合,以下の処理を行う。*/
	if (KAHEI == "2") {
		/*1.変数計算(double,小数点以下第2位を四捨五入):<I33USD>=<I33USD>+<小計>。*/
		I33USD=Number(isNaN(Number(I33USD)) ? I33USD.replaceAll(",","") : I33USD)+Number(isNaN(Number(SHOUKEI)) ? SHOUKEI.replaceAll(",","") : SHOUKEI);

		/*変数計算(double,小数点以下第2位を四捨五入)*/
if (I33USD != null && parseInt(I33USD) != I33USD) {
	I33USD =  parseFloat(I33USD).toFixed(2);
}
if ((!I33USD && I33USD != 0) || isNaN(I33USD)) {
	I33USD = '';
}


		/*処理終了。*/
	}
	/*グリッドループ終了。*/
}
/*1．「JPY合計」に<I31JPY>を設定する。*/
$('#JPYGOUKEI').val(I31JPY == null || I31JPY == 'null'  ? '' : I31JPY);
$('#JPYGOUKEI').blur();
/*2．「RMB合計」に<I32RMB>を設定する。*/
$('#RMBGOUKEI').val(I32RMB == null || I32RMB == 'null'  ? '' : I32RMB);
$('#RMBGOUKEI').blur();
/*3．「USD合計」に<I33USD>を設定する。*/
$('#USDGOUKEI').val(I33USD == null || I33USD == 'null'  ? '' : I33USD);
$('#USDGOUKEI').blur();
/*処理終了。*/
}
function kyoutukansuu_syoukei(){SF.setServerExecute(true);
/*1．関数「kyoutukansuu_keisann」を実行する。*/
kyoutukansuu_keisann();

/*処理終了。*/
}
function F20091208153604208(){if (inputDataCheck()) {ajaxDoAdd();}}
function F20091210135248447(){doReturn();}function A013PageAfterLoad1(){var SEISAKUHINKUBUN;
var HINBANNO1;
var HINMEI;
var KOSUU;
var SOUKOSUU;
var TSUKAMATSUNYUUSAKI;
var KIBOUNOUKI;
var TANTOU;
var TEHAISAKI;
var KOUNYUUTANKA;
var KAHEI;
var TEHAIBI;
var NYUUKABI;
var SHOUKEI;
var KAKOTANKA;
var grdB16AC16;
var CHUUBUNSHOMEISAINO1;
var CHUUBUNSHONO1;
var KIBOUTANKA;
var NYUUKAYOTEIBI;
var HINBANNO;
var KAKUTEIKUBUN2;
var KOUJIKANRIBANGOU2;
var GENZAINICHIDZUKE = getObj("GENZAINICHIDZUKE").value;
var KAKUTEIKUBUN1 = getObj("KAKUTEIKUBUN1").value;
SF.setServerExecute(true);
/*Grid「B16」ループ開始。*/
var intRow = getObj("RowGrid99").value;

for (var i = 1;i <= intRow; i++) {
/* grid loop start */
	SEISAKUHINKUBUN = $('#SEISAKUHINKUBUN_'+i).val();
	HINBANNO1 = $('#HINBANNO1_'+i).val();
	HINMEI = $('#HINMEI_'+i).val();
	KOSUU = $('#KOSUU_'+i).val();
	SOUKOSUU = $('#SOUKOSUU_'+i).val();
	TSUKAMATSUNYUUSAKI = $('#TSUKAMATSUNYUUSAKI_'+i).val();
	KIBOUNOUKI = $('#KIBOUNOUKI_'+i).val();
	TANTOU = $('#TANTOU_'+i).val();
	TEHAISAKI = $('#TEHAISAKI_'+i).val();
	KOUNYUUTANKA = $('#KOUNYUUTANKA_'+i).val();
	KAHEI = $('#KAHEI_'+i).val();
	TEHAIBI = $('#TEHAIBI_'+i).val();
	NYUUKABI = $('#NYUUKABI_'+i).val();
	SHOUKEI = $('#SHOUKEI_'+i).val();
	KAKOTANKA = $('#KAKOTANKA_'+i).val();
	grdB16AC16 = $('#grdB16AC16_'+i).val();
	CHUUBUNSHOMEISAINO1 = $('#CHUUBUNSHOMEISAINO1_'+i).val();
	CHUUBUNSHONO1 = $('#CHUUBUNSHONO1_'+i).val();
	KIBOUTANKA = $('#KIBOUTANKA_'+i).val();
	NYUUKAYOTEIBI = $('#NYUUKAYOTEIBI_'+i).val();
	HINBANNO = $('#HINBANNO_'+i).val();
	KAKUTEIKUBUN2 = $('#KAKUTEIKUBUN2_'+i).val();
	KOUJIKANRIBANGOU2 = $('#KOUJIKANRIBANGOU2_'+i).val();
	/*5.「入荷日付」が空白ではないの場合,以下の処理を行う。*/
	if ((NYUUKABI != null && NYUUKABI != "" ) ) {
		/*1.変数<入荷日付>の日付表示形式を「YYYY/MM/DD」にする。*/
		NYUUKABI = moment(NYUUKABI).format("YYYY/MM/DD");

		/*2.変数<希望納期>の日付表示形式を「YYYY/MM/DD」にする。*/
		KIBOUNOUKI = moment(KIBOUNOUKI).format("YYYY/MM/DD");

		/*3.<入荷日付>が「現在日付」以下の場合,以下の処理を行う。*/
		if (NYUUKABI <= GENZAINICHIDZUKE) {
			/*1.「入荷日付」を「button_red」スタイルにする。*/
			$('#NYUUKABI'+"_"+i).addClass("button_red");
			/*処理終了。*/
		}
		/*2.その他の場合,以下の処理を行う。*/ else {
			/*1.「入荷日付」を「button_blue」スタイルにする。*/
			$('#NYUUKABI'+"_"+i).addClass("button_blue");
			/*処理終了。*/
		}
		/*処理終了。*/
	}
	/*7.「確定区分」が空白,又は「確定区分」が"0"の場合,以下の処理を行う。*/
	if ((KAKUTEIKUBUN2 == null || KAKUTEIKUBUN2 == "" )  || KAKUTEIKUBUN2 == "0") {
		/*1.「確定」ボタンに"確定"を設定する。*/
		$('#grdB16AC16_'+i).val("確定");
		$('#grdB16AC16_'+i).blur();
		/*2.Grid「B16」の行を入力可能にする。*/
		$('div#_ingrid_Grid99_0_b [id=rowseq' + i + '] td').find('.editable').attr('disabled', false).removeClass('disable0 btnmuko');
		/*処理終了。*/
	}
	/*8.その他「確定区分」が"1"の場合,以下の処理を行う。*/
	else if (KAKUTEIKUBUN2 == "1") {
		/*1.「確定」ボタンに"取消"を設定する。*/
		$('#grdB16AC16_'+i).val("取消");
		$('#grdB16AC16_'+i).blur();
		/*2.Grid「B16」の行を入力不可にする。*/
		$('div#_ingrid_Grid99_0_b [id=rowseq' + i + '] td').find('.editable').attr('disabled', true).addClass('disable0 btnmuko');
		/*処理終了。*/
	}
	/*グリッドループ終了。*/
}
/*6.「確定区分1」を取得。*/
/*9.<確定区分1>が空白でない,且つ<確定区分1>が"1"の場合,以下の処理を行う。*/
if ((KAKUTEIKUBUN1 != null && KAKUTEIKUBUN1 != "" )  && KAKUTEIKUBUN1 == "1") {
	/*1.「得意先USER」を入力不可にする。*/
	SF.setDisabled('TOKUISAKIUSER',true);
	/*2.「アセンブリライン名称」を入力不可にする。*/
	SF.setDisabled('ASENBURIRAINMEISHOU',true);
	/*3.「機械名称MC」を入力不可にする。*/
	SF.setDisabled('KIKAIMEISHOUMC',true);
	/*4.「部品名称PART」を入力不可にする。*/
	SF.setDisabled('BUHINMEISHOUPART',true);
	/*5.「製作数QTY」を入力不可にする。*/
	SF.setDisabled('SEISAKUSUUQTY',true);
	/*6.「担当者」を入力不可にする。*/
	SF.setDisabled('TANTOUSHA1',true);
	/*7.「枚数」を入力不可にする。*/
	SF.setDisabled('MAISUU1',true);
	/*8.「日付1」を入力不可にする。*/
	SF.setDisabled('HIDZUKE1',true);
	/*9.「品番NO」を入力不可にする。*/
	SF.setDisabled('HINBANNO1'+"_"+i,true);
	/*10.「P12」を入力不可にする。*/
	SF.setDisabled('KOUJIKANRIBANGOU1',true);
	/*11.「全部確定」ボタンに"全部取消"を設定する。*/
	$('#T10').val("全部取消");
	$('#T10').blur();
	/*処理終了。*/
}
/*10.「確定権限制限」ボタンを実行する。*/
SF.setServerExecute(true);
$('#AV10').click();

/*処理終了。*/
}

  /* define function end
  
  /* dynamic define function end */
  function smart147Check(){

 return true;
}
function smart149Check(){

 return true;
}
function smart194Check(){

 return true;
}
function smart195Check(){

 return true;
}
function smart196Check(){

 return true;
}
function smart197Check(){

 return true;
}

  /* btn check end */
function DoMustCheck(){
    for (var i=1;i<=getObj('RowGrid99').value; i++) {
	if (getObj("Grid99flg" + i)) if (getObj("Grid99flg" + i).value != '0') {
		if( !checkRequired(getObj('SEISAKUHINKUBUN_' + i),"区分",true,"第"+i+"行項目「@@」が空白になっています。")) return false;	}
	if (getObj("Grid99flg" + i)) if (getObj("Grid99flg" + i).value != '0') {
		if( !checkRequired(getObj('HINMEI_' + i),"品名",true,"第"+i+"行項目「@@」が空白になっています。")) return false;	}
	if (getObj("Grid99flg" + i)) if (getObj("Grid99flg" + i).value != '0') {
		if( !checkRequired(getObj('KOSUU_' + i),"個数",true,"第"+i+"行項目「@@」が空白になっています。")) return false;	}
	if (getObj("Grid99flg" + i)) if (getObj("Grid99flg" + i).value != '0') {
		if( !checkRequired(getObj('TSUKAMATSUNYUUSAKI_' + i),"仕入先",true,"第"+i+"行項目「@@」が空白になっています。")) return false;	}
	}
if( !checkRequired(document.getElementById('KOUJIKANRIBANGOU1'),'工事管理番号',true,'項目「@@」が空白になっています。', true)) {SF.setCheckSuccess(false);}

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
    for (var i=1;i<=getObj('RowGrid99').value; i++) {
if (getObj("Grid99flg" + i) &&  (getObj("Grid99flg" + i).value != '')) {
 		if(!isLenCheck(getObj('SEISAKUHINKUBUN_' + i), 1, "区分", true)) { alertMsg = '' + i +'行目の[区分]項目に入力できるのは[最大長さは1の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('HINBANNO1_' + i), 10, "品番NO", true)) { alertMsg = '' + i +'行目の[品番NO]項目に入力できるのは[最大長さは10の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('HINMEI_' + i), 50, "品名", true)) { alertMsg = '' + i +'行目の[品名]項目に入力できるのは[最大長さは50の値]のみです。'; alert(alertMsg); return false; } 		if(!checkIntegerType(getObj('KOSUU_' + i), "個数", true, "項目「@@」には数値を入力して下さい。")) { alertMsg = '' + i +'行目の[個数]項目に入力できるのは[数字+[-]]のみです。'; alert(alertMsg); return false; }
	 if(!checkIntegerType(getObj('KOSUU_' + i),"個数",true,true)) { alertMsg = '' + i +'行目の[個数]項目に入力できるのは[数字+[-]]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('TSUKAMATSUNYUUSAKI_' + i), 50, "仕入先", true)) { alertMsg = '' + i +'行目の[仕入先]項目に入力できるのは[最大長さは50の値]のみです。'; alert(alertMsg); return false; } 		if(!isDate(getObj('KIBOUNOUKI_' + i), false, "希望納期", true)) { alertMsg = '' + i +'行目の[希望納期]項目に入力できるのは[日付]のみです。'; alert(alertMsg); return false; }
	 if(!isDate(getObj('KIBOUNOUKI_' + i),false,"希望納期",true,true)) { alertMsg = '' + i +'行目の[希望納期]項目に入力できるのは[日付]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('TANTOU_' + i), 10, "担当", true)) { alertMsg = '' + i +'行目の[担当]項目に入力できるのは[最大長さは10の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('TEHAISAKI_' + i), 50, "手配先", true)) { alertMsg = '' + i +'行目の[手配先]項目に入力できるのは[最大長さは50の値]のみです。'; alert(alertMsg); return false; } 		if(!isNumericType(getObj('KOUNYUUTANKA_' + i), "購入単価", true)) { return false;}
	 if(!isUnsignedNumeric(getObj('KOUNYUUTANKA_' + i),false,10,"購入単価", true, true)) { alertMsg = '' + i +'行目の[購入単価]項目に入力できるのは[数字と[.]のみ]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('KAHEI_' + i), 1, "貨幣", true)) { alertMsg = '' + i +'行目の[貨幣]項目に入力できるのは[最大長さは1の値]のみです。'; alert(alertMsg); return false; } 		if(!isDate(getObj('TEHAIBI_' + i), false, "購入日付", true)) { alertMsg = '' + i +'行目の[購入日付]項目に入力できるのは[日付]のみです。'; alert(alertMsg); return false; } 		if(!isDate(getObj('NYUUKABI_' + i), false, "入荷日付", true)) { alertMsg = '' + i +'行目の[入荷日付]項目に入力できるのは[日付]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('CHUUBUNSHOMEISAINO1_' + i), 10, "注文書明細NO", true)) { alertMsg = '' + i +'行目の[注文書明細NO]項目に入力できるのは[最大長さは10の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('CHUUBUNSHONO1_' + i), 10, "注文書NO", true)) { alertMsg = '' + i +'行目の[注文書NO]項目に入力できるのは[最大長さは10の値]のみです。'; alert(alertMsg); return false; } 		if(!isNumericType(getObj('KIBOUTANKA_' + i), "希望単価", true)) { return false;} 		if(!isDate(getObj('NYUUKAYOTEIBI_' + i), false, "入荷予定日", true)) { alertMsg = '' + i +'行目の[入荷予定日]項目に入力できるのは[日付]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('KOUJIKANRIBANGOU2_' + i), 10, "工事管理番号hide", true)) { alertMsg = '' + i +'行目の[工事管理番号hide]項目に入力できるのは[最大長さは10の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('KAKUTEIKUBUN2_' + i), 1, "確定区分", true)) { alertMsg = '' + i +'行目の[確定区分]項目に入力できるのは[最大長さは1の値]のみです。'; alert(alertMsg); return false; }}	}
 if(getObj("TOKUISAKIUSER")) {
	 if(!isLenMaxCheck(getObj("TOKUISAKIUSER"),100,"得意先USER",true)) { alertMsg = '[得意先USER]項目に入力できるのは[最大長さは100の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("TOKUISAKIUSER"),100,"得意先USER",true,true)) { alertMsg = '[得意先USER]項目に入力できるのは[最大長さは100の値]のみです。';SF.setCheckSuccess(false); } if(getObj("MAISUU1")) {
	 if(!isLenMaxCheck(getObj("MAISUU1"),10,"枚数",true)) { alertMsg = '[枚数]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("MAISUU1"),10,"枚数",true,true)) { alertMsg = '[枚数]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("ASENBURIRAINMEISHOU")) {
	 if(!isLenMaxCheck(getObj("ASENBURIRAINMEISHOU"),100,"アセンブリライン名称",true)) { alertMsg = '[アセンブリライン名称]項目に入力できるのは[最大長さは100の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("ASENBURIRAINMEISHOU"),100,"アセンブリライン名称",true,true)) { alertMsg = '[アセンブリライン名称]項目に入力できるのは[最大長さは100の値]のみです。';SF.setCheckSuccess(false); } if(getObj("KAKUTEIKUBUN1")) {
	 if(!isLenMaxCheck(getObj("KAKUTEIKUBUN1"),1,"確定区分1",true)) { alertMsg = '[確定区分1]項目に入力できるのは[最大長さは1の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("KAKUTEIKUBUN1"),1,"確定区分1",true,true)) { alertMsg = '[確定区分1]項目に入力できるのは[最大長さは1の値]のみです。';SF.setCheckSuccess(false); } if(getObj("KIKAIMEISHOUMC")) {
	 if(!isLenMaxCheck(getObj("KIKAIMEISHOUMC"),50,"機械名称MC",true)) { alertMsg = '[機械名称MC]項目に入力できるのは[最大長さは50の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("KIKAIMEISHOUMC"),50,"機械名称MC",true,true)) { alertMsg = '[機械名称MC]項目に入力できるのは[最大長さは50の値]のみです。';SF.setCheckSuccess(false); } if(getObj("BUHINMEISHOUPART")) {
	 if(!isLenMaxCheck(getObj("BUHINMEISHOUPART"),50,"部品名称PART",true)) { alertMsg = '[部品名称PART]項目に入力できるのは[最大長さは50の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("BUHINMEISHOUPART"),50,"部品名称PART",true,true)) { alertMsg = '[部品名称PART]項目に入力できるのは[最大長さは50の値]のみです。';SF.setCheckSuccess(false); } if(getObj("BUHINCHUUBUNSHONO")) {
	 if(!isLenMaxCheck(getObj("BUHINCHUUBUNSHONO"),10,"部品注文書NO",true)) { alertMsg = '[部品注文書NO]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("BUHINCHUUBUNSHONO"),10,"部品注文書NO",true,true)) { alertMsg = '[部品注文書NO]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); }
	 if(!checkIntegerType(getObj("SEISAKUSUUQTY"),"製作数QTY",true)) { alertMsg = '[製作数QTY]項目に入力できるのは[数字+[-]]のみです。'; return false; }
	 if(!checkIntegerType(getObj("SEISAKUSUUQTY"),"製作数QTY",true,true)) { alertMsg = '[製作数QTY]項目に入力できるのは[数字+[-]]のみです。';SF.setCheckSuccess(false); } if(getObj("TANTOUSHA1")) {
	 if(!isLenMaxCheck(getObj("TANTOUSHA1"),10,"担当者",true)) { alertMsg = '[担当者]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("TANTOUSHA1"),10,"担当者",true,true)) { alertMsg = '[担当者]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("KOUJIKANRIBANGOU1")) {
	 if(!isLenMaxCheck(getObj("KOUJIKANRIBANGOU1"),10,"工事管理番号",true)) { alertMsg = '[工事管理番号]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("KOUJIKANRIBANGOU1"),10,"工事管理番号",true,true)) { alertMsg = '[工事管理番号]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("SHUKKANO1")) {
	 if(!isLenMaxCheck(getObj("SHUKKANO1"),30,"出荷NO",true)) { alertMsg = '[出荷NO]項目に入力できるのは[最大長さは30の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("SHUKKANO1"),30,"出荷NO",true,true)) { alertMsg = '[出荷NO]項目に入力できるのは[最大長さは30の値]のみです。';SF.setCheckSuccess(false); } if(getObj("BUHINCHUUBUNSHOMEISAINO")) {
	 if(!isLenMaxCheck(getObj("BUHINCHUUBUNSHOMEISAINO"),10,"部品注文書明細NO",true)) { alertMsg = '[部品注文書明細NO]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("BUHINCHUUBUNSHOMEISAINO"),10,"部品注文書明細NO",true,true)) { alertMsg = '[部品注文書明細NO]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); }
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

  
  var Grid99;
 function setGrid99(recordsPerPage) {
var recordNum = 0;
if (recordsPerPage != undefined) {
 recordNum = recordsPerPage;
}
Grid99 = $("#Grid99").aingrid({
 	height:257,
 	width:1437,
 	displayWidth:1437,
 	isMobile:false,
 	initialLoad: false,
 	colWidths: [50,75,78,98,66,73,146,91,72,148,82,74,82,87,56,73,85,0,0,0,0,0,0,0],
 	rowClasses: ['ui-grid-row-style1', 'ui-grid-row-style2'],
 	addRowMethod: 2,
 	bodyHeight: 29,
 	hasFooter: true,
 	hasScroll: true,
 	colDataType: [0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2],
 	colDataId: ['lvl','SEISAKUHINKUBUN_','HINBANNO1_','HINMEI_','KOSUU_','SOUKOSUU_','TSUKAMATSUNYUUSAKI_','KIBOUNOUKI_','TANTOU_','TEHAISAKI_','KOUNYUUTANKA_','KAHEI_','TEHAIBI_','NYUUKABI_','SHOUKEI_','KAKOTANKA_','grdB16AC16_','CHUUBUNSHOMEISAINO1_','CHUUBUNSHONO1_','KIBOUTANKA_','NYUUKAYOTEIBI_','HINBANNO_','KOUJIKANRIBANGOU2_','KAKUTEIKUBUN2_'],
 	autoRowId: false,
  colsetting: false,
 	rowActionFlg: 'Grid99flg',
 	rowDelChkFlg: 'Grid99delchk',
 	rowBegin: 1,
 	rowsObjectId: 'RowGrid99',
 	colClasses:['grid-col-num','g1','g1','g1','g3','g3','g1','g2','g1','g1','g3','g1','g2','g2','g3','g1','g1','g1','g1','g3','g2','g1','g1','g1'],
 	resizableCols: false,
 	url: 'A013GridFormFeed.do?pageID=P00014&subID=99',
 	extraParams: {},
 	paging: false,
 	recordsPerPage: recordNum,
 	totalRecords: parseInt($("#initRowGrid99").val()),
 	scrollbarW: 17,
 	sorting: false,
 	sortedCol:0,
 	sortedColDir:"asc",
 	unsortableCols: [0],
 	useTemplateRow: true,
 	actionFlg: 2,
 	allRowSent: 1,
 	rowAdd: false,
 	rowDelete:false,
 	rowUpdate:true,
  isAutoHeight:1,
 pageTargetTop:100,
 footerPosition:1,
 effectDisplay:0
});
 	$('#_ingrid_Grid99_0_b .autocomp').each(function () {
		var row = $(this).parents('tr').index() + 1;
	
	});
 SF.addGridHeadListener(99, Grid99);
}
 $(window).resize(function () {var minusHeight = 100;var browserObj = $.browser;if (browserObj.msie) minusHeight -= 3;else if (browserObj.chrome) minusHeight += 90;else if (browserObj.mozilla) minusHeight += 90;var $gridObj = $('#_ingrid_Grid99_0_b');var autoHeight = getGridAutoHeight($gridObj) - minusHeight;$gridObj.height(getGridAutoHeight($gridObj) - minusHeight);$gridObj.parent('div').height(autoHeight)});
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
	<li class="current"><em>部品管理画面(P00014 - A013)</em></li>
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
  <input type=hidden name="PageID" id="PageID" value="P00014"/>
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
  
<div id="dragB1"  style="position:absolute;top:24px;left:36px;text-align:center;vertical-align:middle;width:1591px;height:37px;z-index:1;" class='userDiv' _ckf='0'><label  style='display:table-cell;width:1591px;height:38px;padding:0 2px;text-align:center;vertical-align:middle;font-size:24px;font-weight:bold;background-color:#ffffff;' _subid=1 class='' id="B2">部品詳細表</label></div>
<div id="dragB3"  style="position:absolute;top:87px;left:67px;text-align:right;padding-right:2px;vertical-align:bottom;width:120px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='TOKUISAKIUSER'  style='display:table-cell;width:120px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=3 class='' id="D4"><b>得意先USER</b></label></div>
<div id="dragB7"  style="position:absolute;top:87px;left:731px;text-align:left;width:147px;height:59px;z-index:1;" class='userDiv' _ckf='0'><input id='T4'  name='T4'  value='単価未定'  style='width:147px;height:59px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("T4").value=this.value;A013T41();}'  tabindex='4' class='button_blue' _sf_class='button_blue'></div>
<div id="dragB9"  style="position:absolute;top:87px;left:959px;text-align:left;width:154px;height:59px;z-index:1;" class='userDiv' _ckf='0'><input id='W4'  name='W4'  value='納期遅延'  style='width:154px;height:59px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("W4").value=this.value;A013W41();}'  tabindex='5' class='button_blue' _sf_class='button_blue'></div>
<div id="dragB11"  style="position:absolute;top:87px;left:1201px;text-align:left;width:212px;height:59px;z-index:1;" class='userDiv' _ckf='0'><input id='AA4'  name='AA4'  value='全部表示'  style='width:212px;height:59px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("AA4").value=this.value;A013AA41();}'  tabindex='6' class='button_blue' _sf_class='button_blue'></div>
<div id="dragB13"  style="position:absolute;top:87px;left:2254px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:102px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='MAISUU1'  style='display:table-cell;width:102px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=13 class='' id="AO4"><b>枚数</b></label></div>
<div id="dragB17"  style="position:absolute;top:87px;left:2541px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:53px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='KUDARISUU'  style='display:table-cell;width:53px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=17 class='' id="AT4"><b>行数</b></label></div>
<div id="dragB19"  style="position:absolute;top:87px;left:2596px;text-align:left;display:none;width:120px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='KUDARISUU'  name='KUDARISUU'  value='${requestScope.KUDARISUU}'  class='editable' style='width:120px;height:35px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='19'  _itemname='行数'  type='text'  tabindex='10'></div>
<div id="dragB21"  style="position:absolute;top:147px;left:22px;text-align:right;padding-right:2px;vertical-align:bottom;width:165px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='ASENBURIRAINMEISHOU'  style='display:table-cell;width:165px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=21 class='' id="C6"><b>アセンブリライン名称</b></label></div>
<div id="dragB25"  style="position:absolute;top:147px;left:2254px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:102px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KAKUTEIKUBUN1'  style='display:table-cell;width:102px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=25 class='' id="AO6"><b>確定区分1</b></label></div>
<div id="dragB29"  style="position:absolute;top:147px;left:2489px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:105px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='SHANAIKOUJIBANGOU'  style='display:table-cell;width:105px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=29 class='' id="AT6"><b>社内工事番号</b></label></div>
<div id="dragB31"  style="position:absolute;top:147px;left:2596px;text-align:left;display:none;width:120px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='SHANAIKOUJIBANGOU'  name='SHANAIKOUJIBANGOU'  value='${requestScope.SHANAIKOUJIBANGOU}'  class='editable' style='width:120px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='31'  _itemname='社内工事番号'  type='text'  tabindex='16'></div>
<div id="dragB33"  style="position:absolute;top:181px;left:731px;text-align:left;width:147px;height:58px;z-index:1;" class='userDiv' _ckf='0'><input id='T7'  name='T7'  value='部品詳細インポート'  style='width:147px;height:58px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);ajaxDoImport("部品詳細インポート","A013","T7","0","shift-jis",",","4");}'  tabindex='17' class='button_green' _sf_class='button_green'></div>
<div id="dragB35"  style="position:absolute;top:181px;left:1201px;text-align:left;width:212px;height:58px;z-index:1;" class='userDiv' _ckf='0'><input id='AA7'  name='AA7'  value='処理済リスト'  style='width:212px;height:58px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("AA7").value=this.value;ajaxDoAddExeJs("A013AA71",null,null,$(this));}'  tabindex='18' class='btn04' _sf_class='btn04'></div>
<div id="dragB37"  style="position:absolute;top:205px;left:82px;text-align:right;padding-right:2px;vertical-align:bottom;width:105px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KIKAIMEISHOUMC'  style='display:table-cell;width:105px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=37 class='' id="D8"><b>機械名称MC</b></label></div>
<div id="dragB41"  style="position:absolute;top:205px;left:2254px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:102px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KOUNYUUHIDZUKE1'  style='display:table-cell;width:102px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=41 class='' id="AO8"><b>購入日付1</b></label></div>
<div id="dragB43"  style="position:absolute;top:205px;left:2360px;text-align:left;display:none;width:120px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='KOUNYUUHIDZUKE1'  name='KOUNYUUHIDZUKE1'  value='${requestScope.KOUNYUUHIDZUKE1}'  class='editable' style='width:120px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='43'  _itemname='購入日付1'  type='text'  tabindex='22'></div>
<div id="dragB45"  style="position:absolute;top:205px;left:2534px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:60px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='HIDZUKE1'  style='display:table-cell;width:60px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=45 class='' id="AT8"><b>日付1</b></label></div>
<div id="dragB47"  style="position:absolute;top:205px;left:2596px;text-align:left;display:none;width:120px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='HIDZUKE1'  name='HIDZUKE1'  value='${requestScope.HIDZUKE1}'  class='editable' style='width:120px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='47'  _itemname='日付1'  type='text'  tabindex='24'></div>
<div id="dragB49"  style="position:absolute;top:264px;left:52px;text-align:right;padding-right:2px;vertical-align:bottom;width:135px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='BUHINMEISHOUPART'  style='display:table-cell;width:135px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=49 class='' id="D10"><b>部品名称PART</b></label></div>
<div id="dragB53"  style="position:absolute;top:264px;left:731px;text-align:left;width:147px;height:59px;z-index:1;" class='userDiv' _ckf='0'><input id='T10'  name='T10'  value='全部確定'  style='width:147px;height:59px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;background:#008597;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("T10").value=this.value;ajaxDoAddExeJs("A013T101Click",null,null,$(this));}'  tabindex='27' class='button_blue' _sf_class='button_blue'></div>
<div id="dragB55"  style="position:absolute;top:264px;left:959px;text-align:left;width:154px;height:59px;z-index:1;" class='userDiv' _ckf='0'><input id='W10'  name='W10'  value='保存'  style='width:154px;height:59px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("W10").value=this.value;F20091208153604208();}'  tabindex='28' class='btn02' _sf_class='btn02'></div>
<div id="dragB57"  style="position:absolute;top:264px;left:1201px;text-align:left;width:212px;height:59px;z-index:1;" class='userDiv' _ckf='0'><input id='AA10'  name='AA10'  value='キャンセル'  style='width:212px;height:59px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("AA10").value=this.value;F20091210135248447();}'  tabindex='29' class='btn03' _sf_class='btn03'></div>
<div id="dragB59"  style="position:absolute;top:264px;left:2236px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:120px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='BUHINCHUUBUNSHONO'  style='display:table-cell;width:120px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=59 class='' id="AO10"><b>部品注文書NO</b></label></div>
<div id="dragB63"  style="position:absolute;top:264px;left:2596px;text-align:left;display:none;width:120px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='AV10'  name='AV10'  value='確定権限制限'  style='width:120px;height:35px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("AV10").value=this.value;ajaxDoAddExeJs("A013AV101Click",null,null,$(this));}'  tabindex='32' class='btn04' _sf_class='btn04'></div>
<div id="dragB65"  style="position:absolute;top:324px;left:82px;text-align:right;padding-right:2px;vertical-align:bottom;width:105px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='SEISAKUSUUQTY'  style='display:table-cell;width:105px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=65 class='' id="D12"><b>製作数QTY</b></label></div>
<div id="dragB69"  style="position:absolute;top:324px;left:286px;text-align:right;padding-right:2px;vertical-align:bottom;width:63px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='TANTOUSHA1'  style='display:table-cell;width:63px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=69 class='' id="I12"><b>担当者</b></label></div>
<div id="dragB73"  style="position:absolute;top:324px;left:462px;text-align:right;padding-right:2px;vertical-align:bottom;width:105px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='KOUJIKANRIBANGOU1'  style='display:table-cell;width:105px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=73 class='' id="N12"><b>工事管理番号</b></label></div>
<div id="dragB77"  style="position:absolute;top:324px;left:2254px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:102px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='SHUKKANO1'  style='display:table-cell;width:102px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=77 class='' id="AO12"><b>出荷NO</b></label></div>
<div id="dragB81"  style="position:absolute;top:383px;left:97px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='JPYGOUKEI'  style='display:table-cell;width:90px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=81 class='' id="D14"><b>JPY合計</b></label></div>
<div id="dragB85"  style="position:absolute;top:383px;left:259px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='RMBGOUKEI'  style='display:table-cell;width:90px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=85 class='' id="I14"><b>RMB合計</b></label></div>
<div id="dragB89"  style="position:absolute;top:383px;left:469px;text-align:right;padding-right:2px;vertical-align:bottom;width:98px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='USDGOUKEI'  style='display:table-cell;width:98px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=89 class='' id="N14"><b>USD合計</b></label></div>
<div id="dragB93"  style="position:absolute;top:383px;left:2206px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:150px;height:33px;z-index:1;" class='userDiv' _ckf='0'><label for='BUHINCHUUBUNSHOMEISAINO'  style='display:table-cell;width:150px;height:33px;line-height:33px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=93 class='' id="AO14"><b>部品注文書明細NO</b></label></div>
<div id="dragB97"  style="position:absolute;top:383px;left:2596px;text-align:left;display:none;width:120px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='AV14'  name='AV14'  value='関数利用'  style='width:120px;height:35px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("AV14").value=this.value;kyoutukansuu_syoukei();}'  tabindex='49' class='btn04' _sf_class='btn04'></div>
<div id="dragB99"  style="position:absolute;top:443px;left:36px;text-align:left;height:257px;z-index:1;" class='userDiv' _ckf='0'><input type='hidden' name='initRowGrid99' id='initRowGrid99' value='0'><input type='hidden' name='RowGrid99' id='RowGrid99' value='0'><table id='Grid99' name ='Grid99' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>区分*</th><th style='overflow:hidden;text-align:center;'>品番NO</th><th style='overflow:hidden;text-align:center;'>品名*</th><th style='overflow:hidden;text-align:center;'>個数*</th><th style='overflow:hidden;text-align:center;'>総個数*</th><th style='overflow:hidden;text-align:center;'>仕入先*</th><th style='overflow:hidden;text-align:center;'>希望納期</th><th style='overflow:hidden;text-align:center;'>担当</th><th style='overflow:hidden;text-align:center;'>手配先</th><th style='overflow:hidden;text-align:center;'>購入単価</th><th style='overflow:hidden;text-align:center;'>貨幣</th><th style='overflow:hidden;text-align:center;'>購入日付</th><th style='overflow:hidden;text-align:center;'>入荷日付</th><th style='overflow:hidden;text-align:center;'>小計</th><th style='overflow:hidden;text-align:center;'>過去単価</th><th style='overflow:hidden;text-align:center;'>確定</th><th style='display:none'>注文書明細NO</th><th style='display:none'>注文書NO</th><th style='display:none'>希望単価</th><th style='display:none'>入荷予定日</th><th style='display:none'>品番Nohide</th><th style='display:none'>工事管理番号hide</th><th style='display:none'>確定区分</th></tr></thead>
<tbody>
<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0>0<input type=hidden width=0px id='Grid99flg0' name='Grid99flg0'></td>
<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style="overflow:hidden;"><select id=SEISAKUHINKUBUN_0 name=SEISAKUHINKUBUN_0 data-bind='value: SEISAKUHINKUBUN' _req=1 class='editable' _subid=101 _itemname='区分' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj("SEISAKUHINKUBUN_0").value=this.value;cs($(this),"rowseq","Grid99flg","0");'  style='width:74px;height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'>
WFC#ROW_DROPDOWNLIST_OPTIONS#WFC101WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>
<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='HINBANNO1_0'  name='HINBANNO1_0'  class='editable' style='width:75px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='103'  _itemname='品番NO'  type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>
<td class='g1 o' _colid=3 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='HINMEI_0'  name='HINMEI_0'  class='editable' style='width:95px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='105'  _itemname='品名'  type='text'  onChange ='getObj("HINMEI_0").value=this.value;ajaxDoAddExeJs("A013HINMEI1Change",null,null,$(this));cs($(this),"rowseq","Grid99flg","0");'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>
<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='KOSUU_0'  name='KOSUU_0'  class='editable' style='width:63px;height:26px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='107'  _itemname='個数'  type='text'  onChange ='getObj("KOSUU_0").value=this.value;A013KOSUU1($(this));cs($(this),"rowseq","Grid99flg","0");'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>
<td class='g3 o' _colid=5 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='SOUKOSUU_0'  name='SOUKOSUU_0'  class='readonly' readOnly style='width:70px;height:26px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='109'  _itemname='総個数' onblur='changeSpecHtml(this);' type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>
<td class='g1 o' _colid=6 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='TSUKAMATSUNYUUSAKI_0'  name='TSUKAMATSUNYUUSAKI_0'  class='editable' style='width:143px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='111'  _itemname='仕入先'  type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>
<td class='g2 o' _colid=7 style ='vertical-align:middle;'><div style="overflow:hidden;"><input type=text name=KIBOUNOUKI_0 id=KIBOUNOUKI_0 data-bind='value: KIBOUNOUKI' value='' class='editable calendar' _subid=113 _itemname='希望納期' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj("KIBOUNOUKI_0").value=this.value;dateFormatChange($(this),"希望納期");A013KIBOUNOUKI1($(this));cs($(this),"rowseq","Grid99flg","0");'  style='width:88px;height:24px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>
<td class='g1 o' _colid=8 style ='vertical-align:middle;'><div style="overflow:hidden;"><select id=TANTOU_0 name=TANTOU_0 data-bind='value: TANTOU' _req=0 class='editable' _subid=115 _itemname='担当' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj("TANTOU_0").value=this.value;cs($(this),"rowseq","Grid99flg","0");'  style='width:71px;height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'>
WFC#ROW_DROPDOWNLIST_OPTIONS#WFC115WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>
<td class='g1 o' _colid=9 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='TEHAISAKI_0'  name='TEHAISAKI_0'  class='editable' style='width:145px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='117'  _itemname='手配先'  _rge='2'  type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>
<td class='g3 o' _colid=10 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='KOUNYUUTANKA_0'  name='KOUNYUUTANKA_0'  class='editable' style='width:79px;height:26px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='119'  _itemname='購入単価'  _rge='2'  type='text'  onChange ='getObj("KOUNYUUTANKA_0").value=this.value;A013KOUNYUUTANKA1($(this));cs($(this),"rowseq","Grid99flg","0");'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>
<td class='g1 o' _colid=11 style ='vertical-align:middle;'><div style="overflow:hidden;"><select id=KAHEI_0 name=KAHEI_0 data-bind='value: KAHEI' _req=0 class='editable' _subid=121 _itemname='貨幣' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj("KAHEI_0").value=this.value;A013KAHEI1($(this));cs($(this),"rowseq","Grid99flg","0");'  style='width:73px;height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'>
WFC#ROW_DROPDOWNLIST_OPTIONS#WFC121WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>
<td class='g2 o' _colid=12 style ='vertical-align:middle;'><div style="overflow:hidden;"><input type=text name=TEHAIBI_0 id=TEHAIBI_0 data-bind='value: TEHAIBI' value='' class='editable calendar' _subid=123 _itemname='購入日付' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj("TEHAIBI_0").value=this.value;dateFormatChange($(this),"購入日付");cs($(this),"rowseq","Grid99flg","0");'  style='width:79px;height:24px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>
<td class='g2 o' _colid=13 style ='vertical-align:middle;'><div style="overflow:hidden;"><input type=text name=NYUUKABI_0 id=NYUUKABI_0 data-bind='value: NYUUKABI' value='' class='editable calendar' _subid=125 _itemname='入荷日付' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj("NYUUKABI_0").value=this.value;dateFormatChange($(this),"入荷日付");A013NYUUKABI1($(this));cs($(this),"rowseq","Grid99flg","0");'  style='width:84px;height:24px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>
<td class='g3 o' _colid=14 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='SHOUKEI_0'  name='SHOUKEI_0'  class='readonly' readOnly style='width:53px;height:26px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='127'  _itemname='小計'  _ire='###,###,##0'  _rge='1'  type='text'  onChange ='getObj("SHOUKEI_0").value=this.value;A013SHOUKEI1($(this));cs($(this),"rowseq","Grid99flg","0");'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>
<td class='g1 o' _colid=15 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='KAKOTANKA_0'  name='KAKOTANKA_0'  class='readonly' readOnly style='width:70px;height:26px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='129'  _itemname='過去単価'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>
<td class='g1 o' _colid=16><div style="overflow:hidden;"><input id='grdB16AC16_0'  name='grdB16AC16_0'  value='確定'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("grdB16AC16_0").value=this.value;ajaxDoAddExeJs("A013grdB16AC161Click",null,null,$(this));}'  _gid='Grid99'  _gflg='Grid99flg0'  class='buttonon' _sf_class='buttonon'></div></td>
<td style ='display:none' width='0px' _colid=17><input id='CHUUBUNSHOMEISAINO1_0'  name='CHUUBUNSHOMEISAINO1_0'  _k='1'  type='hidden' ></div></td>
<td style ='display:none' width='0px' _colid=18><input id='CHUUBUNSHONO1_0'  name='CHUUBUNSHONO1_0'  _k='1'  type='hidden' ></div></td>
<td style ='display:none' width='0px' _colid=19><input id='KIBOUTANKA_0'  name='KIBOUTANKA_0'  type='hidden' ></div></td>
<td style ='display:none' width='0px' _colid=20><input id='NYUUKAYOTEIBI_0'  name='NYUUKAYOTEIBI_0'  type='hidden' ></div></td>
<td style ='display:none' width='0px' _colid=21><input id='HINBANNO_0'  name='HINBANNO_0'  value='[自動採番]'  _k='1'  type='hidden' ></div></td>
<td style ='display:none' width='0px' _colid=22><input id='KOUJIKANRIBANGOU2_0'  name='KOUJIKANRIBANGOU2_0'  type='hidden' ></div></td>
<td style ='display:none' width='0px' _colid=23><input id='KAKUTEIKUBUN2_0'  name='KAKUTEIKUBUN2_0'  type='hidden' ></div></td></tr></tbody></table></div>
<div id="dragB147"  style="position:absolute;top:443px;left:2360px;text-align:left;display:none;width:120px;height:29px;z-index:1;" class='userDiv' _ckf='0'><input id='AQ16'  name='AQ16'  value='検索'  style='width:120px;height:29px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); doSmartSearch("AQ16","99;grdB16","1");}'  tabindex='73' class='btn01' _sf_class='btn01'></div>
<div id="dragB149"  style="position:absolute;top:472px;left:2360px;text-align:left;display:none;width:120px;height:29px;z-index:1;" class='userDiv' _ckf='0'><input id='AQ17'  name='AQ17'  value='検索1'  style='width:120px;height:29px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); doSmartSearch("AQ17","99;grdB16","1");}'  tabindex='74' class='btn04' _sf_class='btn04'></div>
<div id="dragB151"  style="position:absolute;top:472px;left:2596px;text-align:left;display:none;width:120px;height:29px;z-index:1;" class='userDiv' _ckf='0'><input id='AV17'  name='AV17'  value='関数利用B'  style='width:120px;height:29px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("AV17").value=this.value;kyoutukannsuu_nyukahidukei();}'  tabindex='75' class='btn04' _sf_class='btn04'></div>
<div id="dragB153"  style="position:absolute;top:530px;left:2254px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:102px;height:27px;z-index:1;" class='userDiv' _ckf='0'><label for='GENZAINICHIDZUKE'  style='display:table-cell;width:102px;height:27px;line-height:27px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=153 class='' id="AO19"><b>現在日付</b></label></div>
<div id="dragB155"  style="position:absolute;top:530px;left:2360px;text-align:left;display:none;width:120px;height:29px;z-index:1;" class='userDiv' _ckf='0'><input id='GENZAINICHIDZUKE'  name='GENZAINICHIDZUKE'  value='${requestScope.GENZAINICHIDZUKE}'  class='editable' style='width:120px;height:29px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='155'  _itemname='現在日付'  type='text'  tabindex='77'></div>
<div id="dragB157"  style="position:absolute;top:530px;left:2596px;text-align:left;display:none;width:120px;height:29px;z-index:1;" class='userDiv' _ckf='0'><input id='AV19'  name='AV19'  value='関数利用C'  style='width:120px;height:29px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("AV19").value=this.value;kyoutukansuu_keisann();}'  tabindex='78' class='btn04' _sf_class='btn04'></div>
<div id="dragB159"  style="position:absolute;top:588px;left:2221px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:135px;height:27px;z-index:1;" class='userDiv' _ckf='0'><label for='TANKAMITEIHIDE'  style='display:table-cell;width:135px;height:27px;line-height:27px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=159 class='' id="AO21"><b>単価未定HIDE</b></label></div>
<div id="dragB161"  style="position:absolute;top:588px;left:2360px;text-align:left;display:none;width:120px;height:29px;z-index:1;" class='userDiv' _ckf='0'><input id='TANKAMITEIHIDE'  name='TANKAMITEIHIDE'  value='${requestScope.TANKAMITEIHIDE}'  class='editable' style='width:120px;height:29px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='161'  _itemname='単価未定HIDE'  type='text'  tabindex='80'></div>
<div id="dragB163"  style="position:absolute;top:646px;left:2254px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:102px;height:27px;z-index:1;" class='userDiv' _ckf='0'><label for='KETSUGOUMOJI1'  style='display:table-cell;width:102px;height:27px;line-height:27px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=163 class='' id="AO23"><b>結合文字1</b></label></div>
<div id="dragB165"  style="position:absolute;top:646px;left:2360px;text-align:left;display:none;width:120px;height:29px;z-index:1;" class='userDiv' _ckf='0'><input id='KETSUGOUMOJI1'  name='KETSUGOUMOJI1'  value='${requestScope.KETSUGOUMOJI1}'  class='editable' style='width:120px;height:29px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='165'  _itemname='結合文字1'  type='text'  tabindex='82'></div>
<div id="dragB167"  style="position:absolute;top:704px;left:2254px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:102px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='KETSUGOUMOJI2'  style='display:table-cell;width:102px;height:22px;line-height:22px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=167 class='' id="AO25"><b>結合文字2</b></label></div>
<div id="dragB169"  style="position:absolute;top:704px;left:2360px;text-align:left;display:none;width:120px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='KETSUGOUMOJI2'  name='KETSUGOUMOJI2'  value='${requestScope.KETSUGOUMOJI2}'  class='editable' style='width:120px;height:24px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='169'  _itemname='結合文字2'  type='text'  tabindex='84'></div>
<div id="dragB171"  style="position:absolute;top:848px;left:181px;text-align:left;display:none;width:105px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='I31JPY'  style='display:table-cell;width:105px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=171 class='' id="H31"><b>I31JPY</b></label></div>
<div id="dragB173"  style="position:absolute;top:848px;left:286px;text-align:left;display:none;width:63px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='I31JPY'  name='I31JPY'  value='${requestScope.I31JPY}'  class='editable' style='width:63px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='173'  _itemname='I31JPY'  type='text'  tabindex='86'></div>
<div id="dragB175"  style="position:absolute;top:872px;left:181px;text-align:left;display:none;width:105px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='I32RMB'  style='display:table-cell;width:105px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=175 class='' id="H32"><b>I32RMB</b></label></div>
<div id="dragB177"  style="position:absolute;top:872px;left:286px;text-align:left;display:none;width:63px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='I32RMB'  name='I32RMB'  value='${requestScope.I32RMB}'  class='editable' style='width:63px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='177'  _itemname='I32RMB'  type='text'  tabindex='88'></div>
<div id="dragB179"  style="position:absolute;top:896px;left:181px;text-align:left;display:none;width:105px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='I33USD'  style='display:table-cell;width:105px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=179 class='' id="H33"><b>I33USD</b></label></div>
<div id="dragB181"  style="position:absolute;top:896px;left:286px;text-align:left;display:none;width:63px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='I33USD'  name='I33USD'  value='${requestScope.I33USD}'  class='editable' style='width:63px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='181'  _itemname='I33USD'  type='text'  tabindex='90'></div>
<div id="dragB183"  style="position:absolute;top:968px;left:241px;text-align:right;padding-right:2px;vertical-align:bottom;display:none;width:45px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='II'  style='display:table-cell;width:45px;height:22px;line-height:22px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=183 class='' id="H36"><b>II</b></label></div>
<div id="dragB185"  style="position:absolute;top:968px;left:286px;text-align:left;display:none;width:63px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='II'  name='II'  value='${requestScope.II}'  class='editable' style='width:63px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='185'  _itemname='II'  type='text'  tabindex='92'></div>
<div id="dragB187"  style="position:absolute;top:1016px;left:151px;text-align:left;display:none;width:135px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='SHOUHINNUMBER'  style='display:table-cell;width:135px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=187 class='' id="H38"><b>商品NUMBER</b></label></div>
<div id="dragB189"  style="position:absolute;top:1016px;left:286px;text-align:left;display:none;width:63px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='SHOUHINNUMBER'  name='SHOUHINNUMBER'  value='${requestScope.SHOUHINNUMBER}'  class='editable' style='width:63px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='189'  _itemname='商品NUMBER'  type='text'  tabindex='94'></div>
<div id="dragB191"  style="position:absolute;top:1760px;left:36px;text-align:left;width:35px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label  style='display:table-cell;width:35px;height:23px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=191 class='' id="B69">      処理終了。 </label></div>
<div id="dragB193"  style="position:absolute;top:9752px;left:30px;text-align:left;width:6px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label  style='display:table-cell;width:6px;height:23px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=193 class='' id="A402">「項目処理」</label></div>
<div id="dragB194"  style="position:absolute;top:10px;left:155px;text-align:left;display:none;width:100px;height:30px;z-index:3;" class='userDiv' _ckf='0'><input id='P00014194'  name='P00014194'  value='P00014194'  style='width:100px;height:30px;padding:0 2px;text-align:center;font-weight:bold;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); doSmartSearch("P00014194","99;grdB16","1");}'  tabindex='-1'></div>
<div id="dragB195"  style="position:absolute;top:10px;left:155px;text-align:left;display:none;width:100px;height:30px;z-index:3;" class='userDiv' _ckf='0'><input id='P00014195'  name='P00014195'  value='P00014195'  style='width:100px;height:30px;padding:0 2px;text-align:center;font-weight:bold;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); doSmartSearch("P00014195","99;grdB16","1");}'  tabindex='-1'></div>
<div id="dragB196"  style="position:absolute;top:10px;left:155px;text-align:left;display:none;width:100px;height:30px;z-index:3;" class='userDiv' _ckf='0'><input id='P00014196'  name='P00014196'  value='P00014196'  style='width:100px;height:30px;padding:0 2px;text-align:center;font-weight:bold;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); doSmartSearch("P00014196","99;grdB16","1");}'  tabindex='-1'></div>
<div id="dragB197"  style="position:absolute;top:10px;left:155px;text-align:left;display:none;width:100px;height:30px;z-index:3;" class='userDiv' _ckf='0'><input id='P00014197'  name='P00014197'  value='P00014197'  style='width:100px;height:30px;padding:0 2px;text-align:center;font-weight:bold;display:none;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); doSmartSearch("P00014197","99;grdB16","1");}'  tabindex='-1'></div>
<div id="dragB5"  style="position:absolute;top:87px;left:188px;text-align:left;width:507px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='TOKUISAKIUSER'  name='TOKUISAKIUSER'  value='${requestScope.BUHIN.getTOKUISAKI()}' data-bind='value: TOKUISAKIUSER' class='editable' style='width:507px;height:35px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='5'  _itemname='得意先USER'  type='text'  tabindex='3'></div>
<div id="dragB15"  style="position:absolute;top:87px;left:2360px;text-align:left;display:none;width:120px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='MAISUU1'  name='MAISUU1'  value='${requestScope.BUHIN.getMAISUU()}' data-bind='value: MAISUU1' class='editable' style='width:120px;height:35px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='15'  _itemname='枚数'  type='text'  tabindex='8'></div>
<div id="dragB23"  style="position:absolute;top:147px;left:188px;text-align:left;width:507px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='ASENBURIRAINMEISHOU'  name='ASENBURIRAINMEISHOU'  value='${requestScope.BUHIN.getASENBURIRAIN()}' data-bind='value: ASENBURIRAINMEISHOU' class='editable' style='width:507px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='23'  _itemname='アセンブリライン名称'  type='text'  tabindex='12'></div>
<div id="dragB27"  style="position:absolute;top:147px;left:2360px;text-align:left;display:none;width:120px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='KAKUTEIKUBUN1'  name='KAKUTEIKUBUN1'  value='${requestScope.BUHIN.getKAKUTEIKUBUN()}' data-bind='value: KAKUTEIKUBUN1' class='editable' style='width:120px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='27'  _itemname='確定区分1'  type='text'  tabindex='14'></div>
<div id="dragB39"  style="position:absolute;top:205px;left:188px;text-align:left;width:507px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='KIKAIMEISHOUMC'  name='KIKAIMEISHOUMC'  value='${requestScope.BUHIN.getKIKAIMEISHOU()}' data-bind='value: KIKAIMEISHOUMC' class='editable' style='width:507px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;font-weight:normal;'  _subid='39'  _itemname='機械名称MC'  type='text'  tabindex='20'></div>
<div id="dragB51"  style="position:absolute;top:264px;left:188px;text-align:left;width:507px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='BUHINMEISHOUPART'  name='BUHINMEISHOUPART'  value='${requestScope.BUHIN.getBUHINMEISHOU()}' data-bind='value: BUHINMEISHOUPART' class='editable' style='width:507px;height:35px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='51'  _itemname='部品名称PART'  type='text'  tabindex='26'></div>
<div id="dragB61"  style="position:absolute;top:264px;left:2360px;text-align:left;display:none;width:120px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='BUHINCHUUBUNSHONO'  name='BUHINCHUUBUNSHONO'  value='${requestScope.BUHIN.getCHUUBUNSHONO()}' data-bind='value: BUHINCHUUBUNSHONO' _k='1'  class='editable' style='width:120px;height:35px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='61'  _itemname='部品注文書NO'  type='text'  tabindex='31'></div>
<div id="dragB67"  style="position:absolute;top:324px;left:188px;text-align:left;width:97px;height:35px;z-index:1;" class='userDiv' _ckf='1' _ck='2'><input id='SEISAKUSUUQTY'  name='SEISAKUSUUQTY'  value='${requestScope.BUHIN.getSEISAKUSUU()}' data-bind='value: SEISAKUSUUQTY' class='editable' style='width:97px;height:35px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='67'  _itemname='製作数QTY'  type='text'  onChange ='if (SF.isServerExecute()) {getObj("SEISAKUSUUQTY").value=this.value;A013SEISAKUSUUQTY1();}'  tabindex='34'></div>
<div id="dragB71"  style="position:absolute;top:324px;left:351px;text-align:left;width:117px;height:35px;z-index:1;" class='userDiv' _ckf='0'><select id=TANTOUSHA1 name=TANTOUSHA1 data-bind="options:TANTOUSHA1,selectedOption: TANTOUSHA1_selected, optionsValue: 'TANTOUSHA1_optionValue', optionsText: 'TANTOUSHA1_optionText'"  _req=0 class='editable chosen_dropdownlist_style ' _subid=71 _itemname='担当者' style='width:117px;height:33px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='36'><option value ='${requestScope.BUHIN.getTANTOUSHA()}' selected>${requestScope.BUHIN.getTANTOUSHA()}</option></select></div>
<div id="dragB75"  style="position:absolute;top:324px;left:569px;text-align:left;width:126px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='KOUJIKANRIBANGOU1'  name='KOUJIKANRIBANGOU1'  value='${requestScope.BUHIN.getKOUJIKANRIBANGOU()}' data-bind='value: KOUJIKANRIBANGOU1' _k='1'  class='editable' style='width:126px;height:35px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='75'  _itemname='工事管理番号'  type='text'  tabindex='38'></div>
<div id="dragB79"  style="position:absolute;top:324px;left:2360px;text-align:left;display:none;width:120px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='SHUKKANO1'  name='SHUKKANO1'  value='${requestScope.BUHIN.getSHUKKANO()}' data-bind='value: SHUKKANO1' class='editable' style='width:120px;height:35px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='79'  _itemname='出荷NO'  type='text'  tabindex='40'></div>
<div id="dragB83"  style="position:absolute;top:383px;left:188px;text-align:left;width:97px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='JPYGOUKEI'  name='JPYGOUKEI'  value='${requestScope.BUHIN.getJPYGOUKEIKINGAKU()}' data-bind='value: JPYGOUKEI' class='readonly' readOnly style='width:97px;height:35px;padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='83'  _itemname='JPY合計'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  tabindex='42'></div>
<div id="dragB87"  style="position:absolute;top:383px;left:351px;text-align:left;width:117px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='RMBGOUKEI'  name='RMBGOUKEI'  value='${requestScope.BUHIN.getRMBGOUKEIKINGAKU()}' data-bind='value: RMBGOUKEI' class='readonly' readOnly style='width:117px;height:35px;padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='87'  _itemname='RMB合計'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  tabindex='44'></div>
<div id="dragB91"  style="position:absolute;top:383px;left:569px;text-align:left;width:126px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='USDGOUKEI'  name='USDGOUKEI'  value='${requestScope.BUHIN.getUSDGOUKEIKINGAKU()}' data-bind='value: USDGOUKEI' class='readonly' readOnly style='width:126px;height:35px;padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='91'  _itemname='USD合計'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  tabindex='46'></div>
<div id="dragB95"  style="position:absolute;top:383px;left:2360px;text-align:left;display:none;width:120px;height:35px;z-index:1;" class='userDiv' _ckf='0'><input id='BUHINCHUUBUNSHOMEISAINO'  name='BUHINCHUUBUNSHOMEISAINO'  value='${requestScope.BUHIN.getCHUUBUNSHOMEISAINO()}' data-bind='value: BUHINCHUUBUNSHOMEISAINO' _k='1'  class='editable' style='width:120px;height:35px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='95'  _itemname='部品注文書明細NO'  type='text'  tabindex='48'></div>
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
    
      
      setGrid99();

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

  
//*** 部品管理画面PageAfterLoad ***
A013PageAfterLoad1();

getQAjaxRunJson("rstfld",false,1,"","A013Init.do",true,setSendData(document.form1),"");
    
   
  
   
   
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
