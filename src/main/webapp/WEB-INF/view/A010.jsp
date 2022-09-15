<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8" />
<title>P00012 - 注文管理検索</title>
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
	var cWidth = 1150;
	cWidth = ($(window).width()-cWidth)/2;
	$("#target").css({
		left: cWidth-10+"px",
		width: "1150px"
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
    var manageID = 'A010';
    getObj('WF_RUNRESULT') =='0';
    getQAjaxRunJson("rstfld",true,1,"", manageID+"F20091208153604208.do",true,setSendData(document.form1),"afterSave();");
}

function afterSave() {
    isChanged = false;
    dataFormat();
    if (getObj('WF_RUNRESULT').value =='1') {
        Grid43_clear();
getObj('initRowGrid43').value = getObj('RowGrid43').value

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
 //   var manageID = 'A010';
 //   var url = manageID + reqName + "Reference.do?"+"&targetSubID="+tagetSubID+"&pringFlg=4"+"&targetObj="+tagetObj+"&conf="+conf+"&row="+row;
  //  getQAjaxRunJson("rstfld",false,1,"",url,false,"","changeRefSpecHtml($('#"+refObj+"'));");
}

function ajaxReference (reqName,conf, row) {
 	var manageID = 'A010';
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
    var manageID = 'A010';
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
    var manageID = 'A010';
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
  
//*** Func Name: 削除-Click ***
function A010grdC10AA101(o){
  var row = getGridRowIndex(o,"rowseq");
var row = getGridRowIndex(o,"rowseq");
var KETSUGOUMOJI = getObj("KETSUGOUMOJI").value;
var CHUUBUNSHONO = getObj("CHUUBUNSHONO_"+row).value;
SF.setServerExecute(true);
/*1．「結合文字」を取得。*/
/*2.<結合文字>が"当該注文"と「注文書NO」と"の情報がすべて削除するので,削除しますか？"の結合文字。*/
KETSUGOUMOJI = "当該注文" + CHUUBUNSHONO + "の情報がすべて削除するので,削除しますか？";

/*3.<結合文字>メッセージの確認でOKの場合,以下の処理を行う。*/
if (confirm(KETSUGOUMOJI)) {
	/*4．「削除確認」ボタンを実行する。*/
	SF.setServerExecute(true);
	$('#grdC10AA10_'+row).parents("tr").find("input[id^=grdC10AD10_]").click();

	/*処理終了。*/
}
/*処理終了。*/
}

  /* define function end
  
  /* dynamic define function end */
  function printW2Check(){

 return true;
}
function smart35Check(){

 return true;
}

  /* btn check end */
function DoMustCheck(){
    for (var i=1;i<=getObj('RowGrid43').value; i++) {
	}

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
    for (var i=1;i<=getObj('RowGrid43').value; i++) {
if (getObj("Grid43flg" + i) &&  (getObj("Grid43flg" + i).value != '')) {
 		if(!isLenCheck(getObj('KYAKUSAKITANTOU_' + i), 30, "客先担当", true)) { alertMsg = '' + i +'行目の[客先担当]項目に入力できるのは[最大長さは30の値]のみです。'; alert(alertMsg); return false; }}	}

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

function doLinkTrans37(){ SF.setServerExecute(true);

 pageLinkTranfer("L00028.do?","0","","","","_self","","0","1157","3455");
}
function doLinkTrans61(o){ SF.setServerExecute(true);

 pageLinkTranfer("L00029.do?","1",o,"CHUUBUNSHONO1,","CHUUBUNSHONO_,","_self","","0","1157","3455");
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

  
  var Grid43;
 function setGrid43(recordsPerPage) {
var recordNum = 0;
if (recordsPerPage != undefined) {
 recordNum = recordsPerPage;
}
Grid43 = $("#Grid43").aingrid({
 	height:199,
 	width:1031,
 	displayWidth:1031,
 	isMobile:false,
 	initialLoad: false,
 	colWidths: [50,107,129,138,77,98,101,100,113,63,54,0,0],
 	rowClasses: ['ui-grid-row-style1', 'ui-grid-row-style2'],
 	addRowMethod: 2,
 	bodyHeight: 34,
 	hasFooter: true,
 	hasScroll: true,
 	colDataType: [0,2,2,2,2,2,2,2,2,2,2,2,2],
 	colDataId: ['lvl','CHUUBUNSHONO_','MITSUMORISHONO_','CHUUMONHIDZUKE_','SHOUHINSOUGAKUJPY_','SHANAIKOUJIBANGOU_','KYAKUSAKIID1_','SHUTSUNYUUKOFURAGU_','TANTOUSHAID1_','grdC10Z10_','grdC10AA10_','KYAKUSAKITANTOU_','grdC10AD10_'],
 	autoRowId: false,
  colsetting: false,
 	rowActionFlg: 'Grid43flg',
 	rowDelChkFlg: 'Grid43delchk',
 	rowBegin: 1,
 	rowsObjectId: 'RowGrid43',
 	colClasses:['grid-col-num','g1','g1','g2','g3','g1','g1','g1','g1','g1','g1','g1','g1'],
 	resizableCols: false,
 	url: 'A010GridFormFeed.do?pageID=P00012&subID=43',
 	extraParams: {},
 	paging: false,
 	recordsPerPage: recordNum,
 	totalRecords: parseInt($("#initRowGrid43").val()),
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
 	$('#_ingrid_Grid43_0_b .autocomp').each(function () {
		var row = $(this).parents('tr').index() + 1;
	
	});
 SF.addGridHeadListener(43, Grid43);
}
 $(window).resize(function () {var minusHeight = 100;var browserObj = $.browser;if (browserObj.msie) minusHeight -= 3;else if (browserObj.chrome) minusHeight += 90;else if (browserObj.mozilla) minusHeight += 90;var $gridObj = $('#_ingrid_Grid43_0_b');var autoHeight = getGridAutoHeight($gridObj) - minusHeight;$gridObj.height(getGridAutoHeight($gridObj) - minusHeight);$gridObj.parent('div').height(autoHeight)});
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
	<li class="current"><em>注文管理検索(P00012 - A010)</em></li>
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
  <input type=hidden name="PageID" id="PageID" value="P00012"/>
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
  
<div id="dragB1"  style="position:absolute;top:24px;left:85px;text-align:right;padding-right:2px;vertical-align:bottom;width:104px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='CHUUMONNO'  style='display:table-cell;width:104px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=1 class='' id="C2"><b>注文NO</b></label></div>
<div id="dragB3"  style="position:absolute;top:24px;left:192px;text-align:left;width:216px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='CHUUMONNO'  name='CHUUMONNO'  value='${requestScope.CHUUMONNO}'  class='editable' style='width:216px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='3'  _itemname='注文NO'  type='text'  tabindex='2'></div>
<div id="dragB5"  style="position:absolute;top:24px;left:487px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='MITSUMORINO'  style='display:table-cell;width:90px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=5 class='' id="N2"><b>見積NO </b></label></div>
<div id="dragB7"  style="position:absolute;top:24px;left:579px;text-align:left;width:253px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='MITSUMORINO'  name='MITSUMORINO'  value='${requestScope.MITSUMORINO}'  class='editable' style='width:253px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='7'  _itemname='見積NO '  type='text'  tabindex='4'></div>
<div id="dragB9"  style="position:absolute;top:24px;left:858px;text-align:left;width:151px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='W2'  name='W2'  value='見積書台帳'  style='width:151px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); if (printW2Check()) if(confirm("ファイルを出力してもよろしいですか？")) {ajaxDoExcelPrint("A010","W2");} else {SF.setServerExecute(true);}}'  tabindex='5' class='btn04' _sf_class='btn04'></div>
<div id="dragB11"  style="position:absolute;top:83px;left:85px;text-align:right;padding-right:2px;vertical-align:bottom;width:104px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KOUJIBANGOU'  style='display:table-cell;width:104px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=11 class='' id="C4"><b>工事番号</b></label></div>
<div id="dragB13"  style="position:absolute;top:83px;left:192px;text-align:left;width:216px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='KOUJIBANGOU'  name='KOUJIBANGOU'  value='${requestScope.KOUJIBANGOU}'  class='editable' style='width:216px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='13'  _itemname='工事番号'  type='text'  tabindex='7'></div>
<div id="dragB15"  style="position:absolute;top:83px;left:487px;text-align:right;padding-right:2px;vertical-align:bottom;width:90px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='TANTOUSHAID'  style='display:table-cell;width:90px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=15 class='' id="N4"><b>担当者ID</b></label></div>
<div id="dragB17"  style="position:absolute;top:83px;left:579px;text-align:left;width:253px;height:34px;z-index:1;" class='userDiv' _ckf='0'><select id=TANTOUSHAID name=TANTOUSHAID _req=0 class='editable chosen_dropdownlist_style ' _subid=17 _itemname='担当者ID' style='width:253px;height:32px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='9'><option value ='${requestScope.TANTOUSHAID}' selected>${requestScope.TANTOUSHAID}</option></select></div>
<div id="dragB19"  style="position:absolute;top:83px;left:858px;text-align:left;display:none;width:151px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='W4'  name='W4'  value='注文書一覧表'  style='width:151px;height:34px;padding:0 2px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' type='button'  tabindex='10' class='btn04' _sf_class='btn04'></div>
<div id="dragB21"  style="position:absolute;top:142px;left:85px;text-align:right;padding-right:2px;vertical-align:bottom;width:104px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='CHUUMONBI'  style='display:table-cell;width:104px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=21 class='' id="C6"><b>注文日</b></label></div>
<div id="dragB23"  style="position:absolute;top:142px;left:192px;text-align:left;width:78px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input type=text name=CHUUMONBI id=CHUUMONBI value='' class='editable calendar' _subid=23 _itemname='注文日' style='width:78px;height:32px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='12' placeHolder=''></div>
<div id="dragB25"  style="position:absolute;top:142px;left:270px;text-align:center;vertical-align:middle;width:50px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='_'  style='display:table-cell;width:50px;height:32px;line-height:32px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=25 class='' id="H6"><b>~</b></label></div>
<div id="dragB27"  style="position:absolute;top:142px;left:321px;text-align:left;width:87px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input type=text name=_ id=_ value='' class='editable calendar' _subid=27 _itemname='~' style='width:87px;height:32px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='14' placeHolder=''></div>
<div id="dragB29"  style="position:absolute;top:142px;left:502px;text-align:right;padding-right:2px;vertical-align:bottom;width:75px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KYAKUSAKIID'  style='display:table-cell;width:75px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=29 class='' id="N6"><b>客先ID</b></label></div>
<div id="dragB31"  style="position:absolute;top:142px;left:579px;text-align:left;width:253px;height:34px;z-index:1;" class='userDiv' _ckf='0'><select id=KYAKUSAKIID name=KYAKUSAKIID _req=0 class='editable chosen_dropdownlist_style ' _subid=31 _itemname='客先ID' style='width:253px;height:32px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' tabindex='16'><option value ='${requestScope.KYAKUSAKIID}' selected>${requestScope.KYAKUSAKIID}</option></select></div>
<div id="dragB33"  style="position:absolute;top:142px;left:858px;text-align:left;width:151px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='W6'  name='W6'  value='見積書インポート'  style='width:151px;height:34px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);ajaxDoImport("見積書インポート","A010","W6","0","shift-jis",",","4");}'  tabindex='17' class='button_green' _sf_class='button_green'></div>
<div id="dragB35"  style="position:absolute;top:201px;left:270px;text-align:left;width:137px;height:32px;z-index:1;" class='userDiv' _ckf='0'><input id='H8'  name='H8'  value='検索'  style='width:137px;height:32px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); doSmartSearch("H8","43;grdC10","1");}'  tabindex='18' class='button_blue' _sf_class='button_blue'></div>
<div id="dragB37"  style="position:absolute;top:201px;left:687px;text-align:left;width:144px;height:32px;z-index:1;" class='userDiv' _ckf='0'><input id='S8'  name='S8'  value='新規'   _subid='37'  _itemname='新規'  type='button'  style='width:142px;height:32px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' onclick='javascript:if (SF.isServerExecute()) {SF.setServerExecute(false);doLinkTrans37();}'  tabindex='19' _sf_class='button_blue'></div>
<div id="dragB39"  style="position:absolute;top:201px;left:858px;text-align:center;vertical-align:middle;display:none;width:87px;height:30px;z-index:1;" class='userDiv' _ckf='0'><label for='SHUKKOJOUTAI'  style='display:table-cell;width:87px;height:30px;line-height:30px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=39 class='' id="W8"><b>出庫状態</b></label></div>
<div id="dragB41"  style="position:absolute;top:201px;left:946px;text-align:left;display:none;width:115px;height:32px;z-index:1;" class='userDiv' _ckf='0'><select id=SHUKKOJOUTAI name=SHUKKOJOUTAI _req=0 class='editable chosen_dropdownlist_style ' _subid=41 _itemname='出庫状態' style='width:115px;height:30px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' tabindex='21'><option value ='${requestScope.SHUKKOJOUTAI}' selected>${requestScope.SHUKKOJOUTAI}</option></select></div>
<div id="dragB43"  style="position:absolute;top:257px;left:85px;text-align:left;height:199px;z-index:1;" class='userDiv' _ckf='0'><input type='hidden' name='initRowGrid43' id='initRowGrid43' value='0'><input type='hidden' name='RowGrid43' id='RowGrid43' value='0'><table id='Grid43' name ='Grid43' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>注文書NO*</th><th style='overflow:hidden;text-align:center;'>見積書NO</th><th style='overflow:hidden;text-align:center;'>注文日付</th><th style='overflow:hidden;text-align:center;'>商品総額</th><th style='overflow:hidden;text-align:center;'>社内工事番号</th><th style='overflow:hidden;text-align:center;'>客先</th><th style='overflow:hidden;text-align:center;'>出入庫状態</th><th style='overflow:hidden;text-align:center;'>担当者</th><th style='overflow:hidden;text-align:center;'>編集</th><th style='overflow:hidden;text-align:center;'>削除</th><th style='display:none'>客先担当</th><th style='display:none'>削除確認</th></tr></thead>
<tbody>
<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0>0<input type=hidden width=0px id='Grid43flg0' name='Grid43flg0'></td>
<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='CHUUBUNSHONO_0'  name='CHUUBUNSHONO_0'  value='[自動採番]'  _k='1'  class='readonly' readOnly style='width:102px;height:25px;text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='45'  _itemname='注文書NO' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg0' ></div></td>
<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='MITSUMORISHONO_0'  name='MITSUMORISHONO_0'  class='readonly' readOnly style='width:126px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='47'  _itemname='見積書NO' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg0' ></div></td>
<td class='g2 o' _colid=3 style ='vertical-align:middle;'><div style="overflow:hidden;"><input type=text name=CHUUMONHIDZUKE_0 id=CHUUMONHIDZUKE_0 data-bind='value: CHUUMONHIDZUKE' value='' class='readonly' readOnly _subid=49 _itemname='注文日付' _gid='Grid43' _gflg='Grid43flg0' onChange ='getObj("CHUUMONHIDZUKE_0").value=this.value;dateFormatChange($(this),"注文日付");cs($(this),"rowseq","Grid43flg","0");'  style='width:135px;height:29px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>
<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='SHOUHINSOUGAKUJPY_0'  name='SHOUHINSOUGAKUJPY_0'  class='readonly' readOnly style='width:74px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='51'  _itemname='商品総額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg0' ></div></td>
<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='SHANAIKOUJIBANGOU_0'  name='SHANAIKOUJIBANGOU_0'  class='readonly' readOnly style='width:95px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='53'  _itemname='社内工事番号'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg0' ></div></td>
<td class='g1 l' _colid=6 style='word-wrap: break-word;'><input type=text name=showKYAKUSAKIID1_0 id=showKYAKUSAKIID1_0 value='WFC#ITEM_SHOW_VALUE#WFC55WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=55 _itemname='客先' style='width:100px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=KYAKUSAKIID1_0 id=KYAKUSAKIID1_0 value='WFC#COLUMN_VALUE#WFC55WFC#COLUMN_VALUE#WFC'></td>
<td class='g1 l' _colid=7 style='word-wrap: break-word;'><input type=text name=showSHUTSUNYUUKOFURAGU_0 id=showSHUTSUNYUUKOFURAGU_0 value='WFC#ITEM_SHOW_VALUE#WFC57WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=57 _itemname='出入庫状態' style='width:99px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=SHUTSUNYUUKOFURAGU_0 id=SHUTSUNYUUKOFURAGU_0 value='WFC#COLUMN_VALUE#WFC57WFC#COLUMN_VALUE#WFC'></td>
<td class='g1 l' _colid=8 style='word-wrap: break-word;'><input type=text name=showTANTOUSHAID1_0 id=showTANTOUSHAID1_0 value='WFC#ITEM_SHOW_VALUE#WFC59WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=59 _itemname='担当者' style='width:112px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=TANTOUSHAID1_0 id=TANTOUSHAID1_0 value='WFC#COLUMN_VALUE#WFC59WFC#COLUMN_VALUE#WFC'></td>
<td class='g1 o' _colid=9><div style="overflow:hidden;"><input id='grdC10Z10_0'  name='grdC10Z10_0'  value='編集'   _subid='61'  _itemname='編集'  type='button'  _gid='Grid43'  _gflg='Grid43flg0'  onclick='doLinkTrans61($(this));'  _sf_class='button_blue'></div></td>
<td class='g1 o' _colid=10><div style="overflow:hidden;"><input id='grdC10AA10_0'  name='grdC10AA10_0'  value='削除'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("grdC10AA10_0").value=this.value;A010grdC10AA101($(this));}'  _gid='Grid43'  _gflg='Grid43flg0'  class='button_red' _sf_class='button_red'></div></td>
<td style ='display:none' width='0px' _colid=11><input id='KYAKUSAKITANTOU_0'  name='KYAKUSAKITANTOU_0'  type='hidden' ></div></td>
<td class='g1 o' _colid=12><div style="overflow:hidden;"><input id='grdC10AD10_0'  name='grdC10AD10_0'  value='削除確認'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj("grdC10AD10_0").value=this.value;ajaxDoAddExeJs("A010grdC10AD101Click",null,null,$(this));}'  _gid='Grid43'  _gflg='Grid43flg0'  class='btn04' _sf_class='btn04'></div></td></tr></tbody></table></div>
<div id="dragB69"  style="position:absolute;top:561px;left:195px;text-align:left;display:none;width:75px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='KETSUGOUMOJI'  style='display:table-cell;width:75px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=69 class='' id="G21"><b>結合文字</b></label></div>
<div id="dragB71"  style="position:absolute;top:561px;left:270px;text-align:left;display:none;width:50px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='KETSUGOUMOJI'  name='KETSUGOUMOJI'  value='${requestScope.KETSUGOUMOJI}'  class='editable' style='width:50px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='71'  _itemname='結合文字'  type='text'  tabindex='35'></div>
<div id="dragB73"  style="position:absolute;top:585px;left:210px;text-align:left;display:none;width:60px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='RMB'  style='display:table-cell;width:60px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=73 class='' id="G22"><b>RMB</b></label></div>
<div id="dragB75"  style="position:absolute;top:585px;left:270px;text-align:left;display:none;width:50px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='RMB'  name='RMB'  value='${requestScope.RMB}'  class='editable' style='width:50px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='75'  _itemname='RMB'  type='text'  tabindex='37'></div>
<div id="dragB77"  style="position:absolute;top:609px;left:210px;text-align:left;display:none;width:60px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='JPY'  style='display:table-cell;width:60px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=77 class='' id="G23"><b>JPY</b></label></div>
<div id="dragB79"  style="position:absolute;top:609px;left:270px;text-align:left;display:none;width:50px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='JPY'  name='JPY'  value='${requestScope.JPY}'  class='editable' style='width:50px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='79'  _itemname='JPY'  type='text'  tabindex='39'></div>
<div id="dragB81"  style="position:absolute;top:633px;left:210px;text-align:left;display:none;width:60px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='USD'  style='display:table-cell;width:60px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=81 class='' id="G24"><b>USD</b></label></div>
<div id="dragB83"  style="position:absolute;top:633px;left:270px;text-align:left;display:none;width:50px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='USD'  name='USD'  value='${requestScope.USD}'  class='editable' style='width:50px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='83'  _itemname='USD'  type='text'  tabindex='41'></div>
<div id="dragB85"  style="position:absolute;top:657px;left:195px;text-align:left;display:none;width:75px;height:22px;z-index:1;" class='userDiv' _ckf='0'><label for='STOP'  style='display:table-cell;width:75px;height:22px;line-height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;' _subid=85 class='' id="G25"><b>STOP</b></label></div>
<div id="dragB87"  style="position:absolute;top:657px;left:270px;text-align:left;display:none;width:50px;height:24px;z-index:1;" class='userDiv' _ckf='0'><input id='STOP'  name='STOP'  value='${requestScope.STOP}'  class='editable' style='width:50px;height:24px;padding:0 2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;display:none;'  _subid='87'  _itemname='STOP'  type='text'  tabindex='43'></div>
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
    
      
      setGrid43();

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

  
getQAjaxRunJson("rstfld",false,1,"","A010Init.do",true,setSendData(document.form1),"");
    
   
  
   
   
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
