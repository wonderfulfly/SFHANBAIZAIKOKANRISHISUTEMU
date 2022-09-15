<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8" />
<title>P00006 - 会社検索</title>
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
	var cWidth = 974;
	cWidth = ($(window).width()-cWidth)/2;
	$("#target").css({
		left: cWidth-10+"px",
		width: "974px"
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
    var manageID = 'A015';
    getObj('WF_RUNRESULT') =='0';
    getQAjaxRunJson("rstfld",true,1,"", manageID+"F20091208153604208.do",true,setSendData(document.form1),"afterSave();");
}

function afterSave() {
    isChanged = false;
    dataFormat();
    if (getObj('WF_RUNRESULT').value =='1') {
        Grid13_clear();
getObj('initRowGrid13').value = getObj('RowGrid13').value

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
 //   var manageID = 'A015';
 //   var url = manageID + reqName + "Reference.do?"+"&targetSubID="+tagetSubID+"&pringFlg=4"+"&targetObj="+tagetObj+"&conf="+conf+"&row="+row;
  //  getQAjaxRunJson("rstfld",false,1,"",url,false,"","changeRefSpecHtml($('#"+refObj+"'));");
}

function ajaxReference (reqName,conf, row) {
 	var manageID = 'A015';
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
    var manageID = 'A015';
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
    var manageID = 'A015';
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
  
  /* define function end
  
  /* dynamic define function end */
  function smart11Check(){

 return true;
}

  /* btn check end */
function DoMustCheck(){
    for (var i=1;i<=getObj('RowGrid13').value; i++) {
	if (getObj("Grid13flg" + i)) if (getObj("Grid13flg" + i).value != '0') {
		if( !checkRequired(getObj('KAISHAMEI1_' + i),"会社名",true,"第"+i+"行項目「@@」が空白になっています。")) return false;	}
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
    for (var i=1;i<=getObj('RowGrid13').value; i++) {
if (getObj("Grid13flg" + i) &&  (getObj("Grid13flg" + i).value != '')) {
 		if(!isLenCheck(getObj('KAISHAMEI1_' + i), 100, "会社名", true)) { alertMsg = '' + i +'行目の[会社名]項目に入力できるのは[最大長さは100の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('KAISHARYAKUSHOU_' + i), 100, "会社略称", true)) { alertMsg = '' + i +'行目の[会社略称]項目に入力できるのは[最大長さは100の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('ADORESU_' + i), 100, "アドレス", true)) { alertMsg = '' + i +'行目の[アドレス]項目に入力できるのは[最大長さは100の値]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('RENRAKUSAKI_' + i), 20, "連絡先", true)) { alertMsg = '' + i +'行目の[連絡先]項目に入力できるのは[最大長さは20の値]のみです。'; alert(alertMsg); return false; } 		if(!checkIntegerType(getObj('SHIHARAIKIGEN_' + i), "支払期限", true, "項目「@@」には数値を入力して下さい。")) { alertMsg = '' + i +'行目の[支払期限]項目に入力できるのは[数字+[-]]のみです。'; alert(alertMsg); return false; } 		if(!isLenCheck(getObj('KAISHAKUBUN_' + i), 1, "会社区分", true)) { alertMsg = '' + i +'行目の[会社区分]項目に入力できるのは[最大長さは1の値]のみです。'; alert(alertMsg); return false; }}	}

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

function doLinkTrans9(){ SF.setServerExecute(true);

 pageLinkTranfer("L00037.do?","0","","","","_self","","0","705","384");
}
function doLinkTrans29(o){ SF.setServerExecute(true);

 pageLinkTranfer("L00038.do?","1",o,"KAISHAID1,","KAISHAID1_,","_self","","0","705","384");
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

  
  var Grid13;
 function setGrid13(recordsPerPage) {
var recordNum = 0;
if (recordsPerPage != undefined) {
 recordNum = recordsPerPage;
}
Grid13 = $("#Grid13").aingrid({
 	height:141,
 	width:901,
 	displayWidth:901,
 	isMobile:false,
 	initialLoad: false,
 	colWidths: [50,89,118,114,127,127,115,96,64],
 	rowClasses: ['ui-grid-row-style1', 'ui-grid-row-style2'],
 	addRowMethod: 2,
 	bodyHeight: 34,
 	hasFooter: true,
 	hasScroll: true,
 	colDataType: [0,2,2,2,2,2,2,2,2],
 	colDataId: ['lvl','KAISHAID1_','KAISHAMEI1_','KAISHARYAKUSHOU_','ADORESU_','RENRAKUSAKI_','SHIHARAIKIGEN_','KAISHAKUBUN_','grdB6W6_'],
 	autoRowId: false,
  colsetting: false,
 	rowActionFlg: 'Grid13flg',
 	rowDelChkFlg: 'Grid13delchk',
 	rowBegin: 1,
 	rowsObjectId: 'RowGrid13',
 	colClasses:['grid-col-num','g1','g1','g1','g1','g1','g3','g1','g1'],
 	resizableCols: false,
 	url: 'A015GridFormFeed.do?pageID=P00006&subID=13',
 	extraParams: {},
 	paging: false,
 	recordsPerPage: recordNum,
 	totalRecords: parseInt($("#initRowGrid13").val()),
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
 	$('#_ingrid_Grid13_0_b .autocomp').each(function () {
		var row = $(this).parents('tr').index() + 1;
	
	});
 SF.addGridHeadListener(13, Grid13);
}
 $(window).resize(function () {var minusHeight = 100;var browserObj = $.browser;if (browserObj.msie) minusHeight -= 3;else if (browserObj.chrome) minusHeight += 90;else if (browserObj.mozilla) minusHeight += 90;var $gridObj = $('#_ingrid_Grid13_0_b');var autoHeight = getGridAutoHeight($gridObj) - minusHeight;$gridObj.height(getGridAutoHeight($gridObj) - minusHeight);$gridObj.parent('div').height(autoHeight)});
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
<li><span>会社管理</span></li>
	<li class="current"><em>会社検索(P00006 - A015)</em></li>
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
  <input type=hidden name="PageID" id="PageID" value="P00006"/>
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
  
<div id="dragB1"  style="position:absolute;top:24px;left:74px;text-align:right;padding-right:2px;vertical-align:bottom;width:75px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KAISHAID'  style='display:table-cell;width:75px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=1 class='' id="C2"><b>会社ID</b></label></div>
<div id="dragB3"  style="position:absolute;top:24px;left:151px;text-align:left;width:136px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='KAISHAID'  name='KAISHAID'  value='${requestScope.KAISHAID}'  class='editable' style='width:136px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='3'  _itemname='会社ID'  type='text'  tabindex='2'></div>
<div id="dragB5"  style="position:absolute;top:24px;left:437px;text-align:right;padding-right:2px;vertical-align:bottom;width:69px;height:32px;z-index:1;" class='userDiv' _ckf='0'><label for='KAISHAMEI'  style='display:table-cell;width:69px;height:32px;line-height:32px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;' _subid=5 class='' id="M2"><b>会社名</b></label></div>
<div id="dragB7"  style="position:absolute;top:24px;left:508px;text-align:left;width:125px;height:34px;z-index:1;" class='userDiv' _ckf='0'><input id='KAISHAMEI'  name='KAISHAMEI'  value='${requestScope.KAISHAMEI}'  class='editable' style='width:125px;height:34px;padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='7'  _itemname='会社名'  type='text'  tabindex='4'></div>
<div id="dragB9"  style="position:absolute;top:82px;left:321px;text-align:left;width:115px;height:32px;z-index:1;" class='userDiv' _ckf='0'><input id='K4'  name='K4'  value='新規'   _subid='9'  _itemname='新規'  type='button'  style='width:113px;height:32px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' onclick='javascript:if (SF.isServerExecute()) {SF.setServerExecute(false);doLinkTrans9();}'  tabindex='5' _sf_class='button_green'></div>
<div id="dragB11"  style="position:absolute;top:82px;left:508px;text-align:left;width:125px;height:32px;z-index:1;" class='userDiv' _ckf='0'><input id='O4'  name='O4'  value='検索'  style='width:125px;height:32px;padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;font-weight:normal;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false); doSmartSearch("O4","13;grdB6","1");}'  tabindex='6' class='button_blue' _sf_class='button_blue'></div>
<div id="dragB13"  style="position:absolute;top:138px;left:61px;text-align:left;height:141px;z-index:1;" class='userDiv' _ckf='0'><input type='hidden' name='initRowGrid13' id='initRowGrid13' value='0'><input type='hidden' name='RowGrid13' id='RowGrid13' value='0'><table id='Grid13' name ='Grid13' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>会社ID</th><th style='overflow:hidden;text-align:center;'>会社名</th><th style='overflow:hidden;text-align:center;'>会社略称</th><th style='overflow:hidden;text-align:center;'>アドレス</th><th style='overflow:hidden;text-align:center;'>連絡先</th><th style='overflow:hidden;text-align:center;'>支払期限</th><th style='overflow:hidden;text-align:center;'>会社区分</th><th style='overflow:hidden;text-align:center;'>編集</th></tr></thead>
<tbody>
<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0>0<input type=hidden width=0px id='Grid13flg0' name='Grid13flg0'></td>
<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='KAISHAID1_0'  name='KAISHAID1_0'  value='[自動採番]'  _k='1'  class='readonly' readOnly style='width:84px;height:25px;text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='15'  _itemname='会社ID' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>
<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='KAISHAMEI1_0'  name='KAISHAMEI1_0'  class='editable' style='width:115px;height:31px; padding:0 2px;text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='17'  _itemname='会社名'  type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>
<td class='g1 o' _colid=3 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='KAISHARYAKUSHOU_0'  name='KAISHARYAKUSHOU_0'  class='editable' style='width:111px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='19'  _itemname='会社略称'  type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>
<td class='g1 o' _colid=4 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='ADORESU_0'  name='ADORESU_0'  class='editable' style='width:124px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='21'  _itemname='アドレス'  type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>
<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='RENRAKUSAKI_0'  name='RENRAKUSAKI_0'  class='editable' style='width:124px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='23'  _itemname='連絡先'  type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>
<td class='g3 o' _colid=6 style ='vertical-align:middle;'><div style="overflow:hidden;"><input id='SHIHARAIKIGEN_0'  name='SHIHARAIKIGEN_0'  class='editable' style='width:112px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='25'  _itemname='支払期限'  type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>
<td class='g1 o' _colid=7 style ='vertical-align:middle;'><div style="overflow:hidden;"><select id=KAISHAKUBUN_0 name=KAISHAKUBUN_0 data-bind='value: KAISHAKUBUN' _req=0 class='editable' _subid=27 _itemname='会社区分' _gid='Grid13' _gflg='Grid13flg0' onChange ='getObj("KAISHAKUBUN_0").value=this.value;cs($(this),"rowseq","Grid13flg","0");'  style='width:95px;height:27px;font-size:14px;color:#000000;font-weight:normal;'>
WFC#ROW_DROPDOWNLIST_OPTIONS#WFC27WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>
<td class='g1 o' _colid=8><div style="overflow:hidden;"><input id='grdB6W6_0'  name='grdB6W6_0'  value='編集'   _subid='29'  _itemname='編集'  type='button'  _gid='Grid13'  _gflg='Grid13flg0'  onclick='doLinkTrans29($(this));'  _sf_class='button_red'></div></td></tr></tbody></table></div>
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
    
      
      setGrid13();

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

  
getQAjaxRunJson("rstfld",false,1,"","A015Init.do",true,setSendData(document.form1),"");
    
   
  
   
   
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
