
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.wonderfulfly.core.util.StringUtil"%>
<%

	String importMangeID = "";
	String importItemID = "";
	String headLines = "";
	String encode = "";
	String divideChar = "";
	String fixFlg = "";
	String splitStr = "############\r\n";
		
	importMangeID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("importMangeID")));
	importItemID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("importItemID")));
	encode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("encode")));
	headLines = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("headLines")));
	divideChar = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("divideChar")));
	fixFlg = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("fixFlg")));
%>
function uinout001_initFuncDialog() {
	if ($("#encode",$('#FuncDiv')).length > 0) {
		getObj("encode").value='<%=encode%>';
	}
	$( "#inout_step2" ).dialog({
		autoOpen: false,
		show: "drop",
		hide: "drop",
		resizable:false,
		width:500,
		modal:true,
		close: function(event,ui) {
			$( "#inout_step2" ).html("");
			$("#FuncDiv").dialog('option','closeOnEscape',true);
		}
	});
	var encode = "";
	if ($("#encode",$('#FuncDiv')).length > 0) {
		encode = $("#encode",$('#FuncDiv')).val();
	}
	importFileUpload();
}
function importFileUpload () {
	
	$("input[type=file][name=<%=importItemID %>importFile]").each(function () {
		 
		var _this = $(this);
		_this.change(function(){
			var fileBtn = $(this);
			
			var imagePath = fileBtn.val();
			var fixFlg = '<%=fixFlg %>';
			if (imagePath == '') {
		    	return false;
	      	}
			var strExtension = imagePath.substr(imagePath.lastIndexOf('.') + 1); 
			if (fixFlg == '1') {
				if (strExtension != 'txt') {
		    		fileBtn.val('');
	        		alert("txtファイル選択");
	        		return false;
	     		}  
			} else if (fixFlg == '0') {
				if (strExtension != 'csv') {
		    		fileBtn.val('');
	        		alert("csvファイル選択");
	        		return false;
	     		}  
			} else if (fixFlg == '7') {
				if (strExtension != 'zip') {
		    		fileBtn.val('');
	        		alert("zipファイル選択");
	        		return false;
	     		}  
			} else if (fixFlg == '3') {
				if (strExtension != 'pdf') {
		    		fileBtn.val('');
	        		alert("pdfファイル選択");
	        		return false;
	     		}  
			} else if (fixFlg == '4') {
				if (strExtension != 'xlsx' && strExtension != 'xls') {
		    		fileBtn.val('');
	        		alert("Excelファイル選択");
	        		return false;
	     		}  
	     	}  
	     	var importUrl = '<%=importMangeID %>' + '<%=importItemID %>' + 'Import.do';
			$("#newfileForm").ajaxSubmit({
		    	type : 'POST',
				url : importUrl,
		    	success : function(data) {
		    		fileBtn.val('');
		    		getQAjaxRunJsonData(data,true,"1","","",importUrl);
		        },
				error : function() {
		    		fileBtn.val('');
					alert("ファイルアップロードが失敗しました。");
				}
			});  
		  });
	}); 
	
}
function uinout001_closeMe() {
	$("#FuncDiv").dialog('close');
}
function uinout001_nextstep(n,en) {
	var assurl;
	var width,height;
	
}

function uinout001_import(en) {
	var assurl = "/s/ImportData";
	getQAjaxRunJson("rstfld",true,1,"",assurl,true,setSendData(document.newfileForm),"");
	
}

<%=splitStr %>
<form name="newfileForm" id="newfileForm">
<table align="left" width=100% cellspacing=0 cellpadding="0">
	<tr><td>
		<table align='left' width=100% cellspacing=0 cellpadding="0">
			<tr><td>※以下のインポートファイルの形式を確認の上、インポートファイルを指定してください</td></tr>
			<tr><td height=20></td></tr>
			<%if("1".equals(fixFlg) || "0".equals(fixFlg)) {%>
			<tr>
				<td>
					<fieldset style="height:60px;vertical-align: middle">
					<legend>１．インポートファイルの形式</legend>
					<table cellspacing=0 cellpadding="0" height=40>
						<tr>
							<td width=15></td>
							<td>区切り記号付き - カンマやタブなどでフィールドが区切られている。
									&nbsp;&nbsp;&nbsp;&nbsp;フィールド区切り記号: 「&nbsp;<%=StringUtil.dspHtml(divideChar) %>&nbsp;」
							</td>
						</tr>
					</table>
					</fieldset>
				</td>
			</tr>
			<tr><td height=20></td></tr>
			<tr>
				<td>
					<fieldset>
					<legend>２．インポートファイルのエンコード</legend>
					<table cellspacing=0 cellpadding="0" width=100% height=40>						
						<tr>
						  <td width=15></td>
							<td align=left valign=middle>
								<%=encode %>
							</td>
						</tr>
						<tr>
							<td width=15></td>
							<td><font color=red>※ファイルをインポートする前に、ファイルのエンコードが指定のエンコードと一致するかを確認してください。</font></td>
						</tr>						
					</table>
					</fieldset>
				</td>
			</tr>
			<tr><td height=20></td></tr>
			<tr>
				<td>
					<fieldset style="height:60px">
					<legend>３．先頭行の利用</legend>
					<table cellspacing=0 cellpadding="0" height=40>
						<%=headLines %>
					</table>
					</fieldset>
				</td>
			</tr>
			<%}%>
					<tr><td height=20></td></tr>
					<tr><td>
						<fieldset style="height:60px">
							<legend>４．データをクリアしてインポート。</legend>
							<div style="padding-left:15px;">
								<input type=checkbox style='padding-left:5px;padding-right:3px;' id="cleanDataBeforeImport" name="cleanDataBeforeImport" value="0" onclick="setCheckBoxVal('cleanDataBeforeImport','cleanDataBeforeImport')">データをクリアしてインポート
							</div>
						</fieldset>
					</td>
					</tr>
			<tr><td height=80></td></tr>
			<tr><td align="right">
				<table cellspacing=0 cellpadding="0" width=100%>
					<tr><td align=right>		
						<input type="button"  class="btn03" value='キャンセル' title='キャンセル' onclick="uinout001_closeMe();"/>
					</td>
					<td align=right width=150>
					 	<input type='button' id=uploadimport accesskey="u" name=uploadimport value='アップロード' title="アップロード" class="btn02" onclick="javascript:$('#<%=importItemID %>importFile').click();" >
					 	<input type = "file" name="<%=importItemID %>importFile" id="<%=importItemID %>importFile" style="display: none;"/>
					</td></tr>
				</table>
			</td></tr>
		</table>
	</td>	
	</tr>
</table>
</form>
<div id="inout_step2"></div>
