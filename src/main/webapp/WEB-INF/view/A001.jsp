<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8" />
<title>P00001 - 社員</title>
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
	var cWidth = 714;
	cWidth = ($(window).width()-cWidth)/2;
	$("#target").css({
		left: cWidth-10+"px",
		width: "714px"
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
    var manageID = 'A001';
    getObj('WF_RUNRESULT') =='0';
    getQAjaxRunJson("rstfld",true,1,"", manageID+"F20091208153604208.do",true,setSendData(document.form1),"afterSave();");
}

function afterSave() {
    isChanged = false;
    dataFormat();
    if (getObj('WF_RUNRESULT').value =='1') {
        
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
 //   var manageID = 'A001';
 //   var url = manageID + reqName + "Reference.do?"+"&targetSubID="+tagetSubID+"&pringFlg=4"+"&targetObj="+tagetObj+"&conf="+conf+"&row="+row;
  //  getQAjaxRunJson("rstfld",false,1,"",url,false,"","changeRefSpecHtml($('#"+refObj+"'));");
}

function ajaxReference (reqName,conf, row) {
 	var manageID = 'A001';
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
    var manageID = 'A001';
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
    var manageID = 'A001';
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
  function F20091208153604208(){if (inputDataCheck()) {ajaxDoAdd();}}

  /* define function end
  
  /* dynamic define function end */
  
  /* btn check end */
function DoMustCheck(){
    if( !checkRequired(document.getElementById('SHAINMEI1'),'社員名',true,'項目「@@」が空白になっています。', true)) {SF.setCheckSuccess(false);}
if( !checkRequired(document.getElementById('BUMON'),'部門',true,'項目「@@」が空白になっています。', true)) {SF.setCheckSuccess(false);}
if( !checkRequired(document.getElementById('ROGUINID1'),'ログインID',true,'項目「@@」が空白になっています。', true)) {SF.setCheckSuccess(false);}
if( !checkRequired(document.getElementById('PASUWAADO1'),'パスワード',true,'項目「@@」が空白になっています。', true)) {SF.setCheckSuccess(false);}

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
     if(getObj("SHAINMEI1")) {
	 if(!isLenMaxCheck(getObj("SHAINMEI1"),10,"社員名",true)) { alertMsg = '[社員名]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("SHAINMEI1"),10,"社員名",true,true)) { alertMsg = '[社員名]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("DENWABANGOU1")) {
	 if(!isLenMaxCheck(getObj("DENWABANGOU1"),20,"電話番号",true)) { alertMsg = '[電話番号]項目に入力できるのは[最大長さは20の値]のみです。'; return false; }
	 }
	 if(!isValidPhoneNumber(getObj("DENWABANGOU1"),false,20,"電話番号",true,true)) { alertMsg = '[電話番号]項目に入力できるのは[有効な電話番号]のみです。';SF.setCheckSuccess(false); }
	 if(!isLenCheck(getObj("DENWABANGOU1"),20,"電話番号",true,true)) { alertMsg = '[電話番号]項目に入力できるのは[最大長さは20の値]のみです。';SF.setCheckSuccess(false); } if(getObj("KEITAIBANGOU1")) {
	 if(!isLenMaxCheck(getObj("KEITAIBANGOU1"),20," 携帯番号",true)) { alertMsg = '[ 携帯番号]項目に入力できるのは[最大長さは20の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("KEITAIBANGOU1"),20," 携帯番号",true,true)) { alertMsg = '[ 携帯番号]項目に入力できるのは[最大長さは20の値]のみです。';SF.setCheckSuccess(false); } if(getObj("EMAIL1")) {
	 if(!isLenMaxCheck(getObj("EMAIL1"),50,"EMAIL",true)) { alertMsg = '[EMAIL]項目に入力できるのは[最大長さは50の値]のみです。'; return false; }
	 }
	 if(!isValidEmailAddress(getObj("EMAIL1"),false,"EMAIL",50,true,true)) { alertMsg = '[EMAIL]項目に入力できるのは[メール]のみです。';SF.setCheckSuccess(false); }
	 if(!isLenCheck(getObj("EMAIL1"),50,"EMAIL",true,true)) { alertMsg = '[EMAIL]項目に入力できるのは[最大長さは50の値]のみです。';SF.setCheckSuccess(false); } if(getObj("LINE1")) {
	 if(!isLenMaxCheck(getObj("LINE1"),20,"LINE",true)) { alertMsg = '[LINE]項目に入力できるのは[最大長さは20の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("LINE1"),20,"LINE",true,true)) { alertMsg = '[LINE]項目に入力できるのは[最大長さは20の値]のみです。';SF.setCheckSuccess(false); } if(getObj("BUMON")) {
	 if(!isLenMaxCheck(getObj("BUMON"),10,"部門",true)) { alertMsg = '[部門]項目に入力できるのは[最大長さは10の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("BUMON"),10,"部門",true,true)) { alertMsg = '[部門]項目に入力できるのは[最大長さは10の値]のみです。';SF.setCheckSuccess(false); } if(getObj("YUUKOUKUBUN1")) {
	 if(!isLenMaxCheck(getObj("YUUKOUKUBUN1"),1,"有効区分",true)) { alertMsg = '[有効区分]項目に入力できるのは[最大長さは1の値]のみです。'; return false; }
	 } if(getObj("ROGUINID1")) {
	 if(!isLenMaxCheck(getObj("ROGUINID1"),30,"ログインID",true)) { alertMsg = '[ログインID]項目に入力できるのは[最大長さは30の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("ROGUINID1"),30,"ログインID",true,true)) { alertMsg = '[ログインID]項目に入力できるのは[最大長さは30の値]のみです。';SF.setCheckSuccess(false); } if(getObj("PASUWAADO1")) {
	 if(!isLenMaxCheck(getObj("PASUWAADO1"),20,"パスワード",true)) { alertMsg = '[パスワード]項目に入力できるのは[最大長さは20の値]のみです。'; return false; }
	 }
	 if(!isLenCheck(getObj("PASUWAADO1"),20,"パスワード",true,true)) { alertMsg = '[パスワード]項目に入力できるのは[最大長さは20の値]のみです。';SF.setCheckSuccess(false); }
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

function doLinkTrans45(){ SF.setServerExecute(true);

 pageLinkTranfer("A001A002i.do?","0","","","","_self","","0","974","309");
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
<li><span>社員管理</span></li>
	<li class="current"><em>社員(P00001 - A001)</em></li>
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
  <input type=hidden name="PageID" id="PageID" value="P00001"/>
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
  
<div id="dragB1"  style="position:absolute;top:24px;left:97px;text-align:center;vertical-align:middle;width:580px;height:37px;z-index:1;" class='userDiv' _ckf='0'><label  style='display:table-cell;width:580px;height:38px;padding:0 2px;text-align:center;vertical-align:middle;font-size:26px;font-weight:bold;background-color:#ffffff;' _subid=1 class='' id="C2">社員管理</label></div>
<div id="dragB3"  style="position:absolute;top:111px;left:97px;text-align:right;padding-right:2px;vertical-align:bottom;width:88px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='SHAINID1'  style='display:table-cell;width:88px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=3 class='' id="C5"><b>社員ID</b></label></div>
<div id="dragB7"  style="position:absolute;top:111px;left:377px;text-align:right;padding-right:2px;vertical-align:bottom;width:102px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='SHAINMEI1'  style='display:table-cell;width:102px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=7 class='' id="K5"><b>社員名</b></label></div>
<div id="dragB11"  style="position:absolute;top:154px;left:97px;text-align:right;padding-right:2px;vertical-align:bottom;width:88px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='DENWABANGOU1'  style='display:table-cell;width:88px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=11 class='' id="C7"><b>電話番号</b></label></div>
<div id="dragB15"  style="position:absolute;top:154px;left:377px;text-align:right;padding-right:2px;vertical-align:bottom;width:102px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KEITAIBANGOU1'  style='display:table-cell;width:102px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=15 class='' id="K7"><b> 携帯番号</b></label></div>
<div id="dragB19"  style="position:absolute;top:197px;left:95px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='EMAIL1'  style='display:table-cell;width:90px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=19 class='' id="C9"><b>EMAIL</b></label></div>
<div id="dragB23"  style="position:absolute;top:197px;left:377px;text-align:right;padding-right:2px;vertical-align:bottom;width:102px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='LINE1'  style='display:table-cell;width:102px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=23 class='' id="K9"><b>LINE</b></label></div>
<div id="dragB27"  style="position:absolute;top:240px;left:65px;text-align:right;padding-right:2px;vertical-align:bottom;width:121px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='BUMON'  style='display:table-cell;width:121px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=27 class='' id="B11"><b>部門</b>:<i class='fa fa-exclamation-circle fontco01' aria-hidden='true' title='必須'></i></label></div>
<div id="dragB31"  style="position:absolute;top:240px;left:377px;text-align:right;padding-right:2px;vertical-align:bottom;width:102px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='YUUKOUKUBUN1'  style='display:table-cell;width:102px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=31 class='' id="K11"><b>有効区分</b></label></div>
<div id="dragB35"  style="position:absolute;top:282px;left:80px;text-align:right;padding-right:2px;vertical-align:bottom;width:105px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='ROGUINID1'  style='display:table-cell;width:105px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=35 class='' id="C13"><b>ログインID</b>:<i class='fa fa-exclamation-circle fontco01' aria-hidden='true' title='必須'></i></label></div>
<div id="dragB39"  style="position:absolute;top:282px;left:377px;text-align:right;padding-right:2px;vertical-align:bottom;width:102px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='PASUWAADO1'  style='display:table-cell;width:102px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=39 class='' id="K13"><b>パスワード</b>:<i class='fa fa-exclamation-circle fontco01' aria-hidden='true' title='必須'></i></label></div>
<div id="dragB43"  style="position:absolute;top:354px;left:289px;text-align:left;width:124px;height:32px;z-index:1;" class='userDiv' _ckf='0'><input id='I16'  name='I16'  value='保存'  style='width:124px;height:32px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("I16").value=this.value;F20091208153604208();}'  tabindex='22' class='button_blue' _sf_class='button_blue'></div>
<div id="dragB45"  style="position:absolute;top:354px;left:518px;text-align:left;width:125px;height:32px;z-index:1;" class='userDiv' _ckf='0'><input id='O16'  name='O16'  value='キャンセル'   _subid='45'  _itemname='キャンセル'  type='button'  style='width:123px;height:32px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' onclick='javascript:if (SF.isServerExecute()) {SF.setServerExecute(false);doLinkTrans45();}'  tabindex='23' _sf_class='button_red'></div>
<div id="dragB5"  style="position:absolute;top:111px;left:188px;text-align:left;width:154px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input type=text name=SHAINID1 id=SHAINID1 data-bind='value: SHAINID1' _k=1 value='${requestScope.SYAIN.getSHAINID()}' class='readonly' readOnly _subid=5 _itemname='社員ID' style='width:148px;height:28px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='3'></div>
<div id="dragB9"  style="position:absolute;top:111px;left:482px;text-align:left;width:161px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='SHAINMEI1'  name='SHAINMEI1'  value='${requestScope.SYAIN.getSHAINMEI()}' data-bind='value: SHAINMEI1' class='editable' style='width:161px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='9'  _itemname='社員名'  type='text'  tabindex='5'></div>
<div id="dragB13"  style="position:absolute;top:154px;left:188px;text-align:left;width:154px;height:34px;z-index:1;" class='userDiv' _ckf='1' _ck='23'><input id='DENWABANGOU1'  name='DENWABANGOU1'  value='${requestScope.SYAIN.getDENWABANGOU()}' data-bind='value: DENWABANGOU1' class='editable' style='width:154px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='13'  _itemname='電話番号'  type='text'  tabindex='7'></div>
<div id="dragB17"  style="position:absolute;top:154px;left:482px;text-align:left;width:161px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='KEITAIBANGOU1'  name='KEITAIBANGOU1'  value='${requestScope.SYAIN.getKEITAIBANGOU()}' data-bind='value: KEITAIBANGOU1' class='editable' style='width:161px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='17'  _itemname=' 携帯番号'  type='text'  tabindex='9'></div>
<div id="dragB21"  style="position:absolute;top:197px;left:188px;text-align:left;width:154px;height:34px;z-index:1;" class='userDiv' _ckf='1' _ck='5'><input id='EMAIL1'  name='EMAIL1'  value='${requestScope.SYAIN.getEMAIL()}' data-bind='value: EMAIL1' class='editable' style='width:154px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='21'  _itemname='EMAIL'  type='text'  tabindex='11'></div>
<div id="dragB25"  style="position:absolute;top:197px;left:482px;text-align:left;width:161px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='LINE1'  name='LINE1'  value='${requestScope.SYAIN.getLINE()}' data-bind='value: LINE1' class='editable' style='width:161px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='25'  _itemname='LINE'  type='text'  tabindex='13'></div>
<div id="dragB29"  style="position:absolute;top:240px;left:188px;text-align:left;width:154px;height:34px;z-index:1;" class='userDiv' _ckf='0'><select id=BUMON name=BUMON data-bind="options:BUMON,selectedOption: BUMON_selected, optionsValue: 'BUMON_optionValue', optionsText: 'BUMON_optionText'"  _req=1 class='editable chosen_dropdownlist_style ' _subid=29 _itemname='部門' style='width:154px;height:32px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='15'><option value ='${requestScope.SYAIN.getYUUZAAKENGEN()}' selected>${requestScope.SYAIN.getYUUZAAKENGEN()}</option></select></div>
<div id="dragB33"  style="position:absolute;top:240px;left:482px;text-align:left;width:161px;height:34px;z-index:1;" class='userDiv' _ckf='0'><div class='wf_checkbox' style='text-align:center;width:161px;height:34px;'><c:if test="${requestScope.SYAIN.getYUUKOUKUBUN() != null}"><input type='hidden' id='link_value_YUUKOUKUBUN1' name='link_value_YUUKOUKUBUN1' value='${requestScope.SYAIN.getYUUKOUKUBUN()}'></c:if><input type=checkbox id=YUUKOUKUBUN1 _checked=1 _uncheck=0 name=YUUKOUKUBUN1 value='<c:if test="${requestScope.SYAIN.getYUUKOUKUBUN() == '1'}">1</c:if>' <c:if test="${requestScope.SYAIN.getYUUKOUKUBUN()=='1'}">checked</c:if> class='editable' _subid=33 _itemname='有効区分' onclick='setCheckBoxVal("YUUKOUKUBUN1","YUUKOUKUBUN1")' style='text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='17'></div></div>
<div id="dragB37"  style="position:absolute;top:282px;left:188px;text-align:left;width:154px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='ROGUINID1'  name='ROGUINID1'  value='${requestScope.SYAIN.getROGUINID()}' data-bind='value: ROGUINID1' _k='1'  class='editable' style='width:154px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='37'  _itemname='ログインID'  type='text'  tabindex='19'></div>
<div id="dragB41"  style="position:absolute;top:282px;left:482px;text-align:left;width:161px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='PASUWAADO1'  name='PASUWAADO1'  value='${requestScope.SYAIN.getPASUWAADO()}' data-bind='value: PASUWAADO1' class='editable' style='width:161px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='41'  _itemname='パスワード'  type='text'  tabindex='21'></div>
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

  
getQAjaxRunJson("rstfld",false,1,"","A001Init.do",true,setSendData(document.form1),"");
    
   
  
   
   
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
