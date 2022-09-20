function selectPreImage(v1,v2,v3){
	document.getElementById("attachID").value = document.getElementById("attachID"+v1).value;
	document.getElementById("realurl").value = document.getElementById("fileRealUrl"+v1).value;
	document.getElementById("filetype").value = document.getElementById("fileType"+v1).value;
	document.getElementById("prethumb").src = v2;
	document.getElementById("prethumb").alt =v3;
	document.getElementById("fileName").value = v3;
	
}
function setGridChangeFlg(o, gridID, attachID){
	var g = "",c, a;
	if (gridID != undefined) {
		g = gridID;
		a = attachID;
	} else if (getObj("ugridID") != undefined) {
		g = getObj("ugridID").value;
		a = document.getElementById("attachID").value;
	}
	if (g != "") {
		c = g + "flg";
		c = c+o.substring(o.indexOf("_")+1);
		if (getObj(c).value!="2") {
			if (document.getElementById(o).value != a) {
				getObj(c).value = "1";
			}
		}
	}
}
function selectImage(v){
	setGridChangeFlg(v);
	document.getElementById(v).value = document.getElementById("attachID").value;
	document.getElementById("thumb"+v).src = document.getElementById("prethumb").src;
	document.getElementById("thumb"+v).alt = document.getElementById("prethumb").alt;
	if ($("#pv"+v).length) {
		$("#pv"+v).attr("href",document.getElementById("realurl").value);
		$("#pv"+v).attr("title",document.getElementById("fileName").value);
		if (getObj("filetype").value=="02"||getObj("filetype").value=="06") {
			h = $("#pv"+v).attr("href");
			t = $("#pv"+v).attr("title");
			i = $("#pv"+v).html();
			o = $("#pv"+v).get(0).parentNode;
			o.removeChild(getObj("pv"+v));
			$("<a id=\"pv"+v+"\" href='"+h+"' title='"+t+"' class='lightbox'></a>").appendTo(o);
			$("#pv"+v).html(i);
			var naturalWidth = document.getElementById("thumb"+v).naturalWidth;
			var naturalHeight = document.getElementById("thumb"+v).naturalHeight;
			var width = $("#thumb"+v).parents("div[id^=dragB]").width();
			var height = $("#thumb"+v).parents("div[id^=dragB]").height();
			if (naturalWidth < naturalHeight) {
				$("#thumb"+v).height(height);
				$("#thumb"+v).css("width", "");
			} else {
				if (width < height) {
					$("#thumb"+v).width(width);
					$("#thumb"+v).css("height", "");
				} else {
					if ($("#thumb"+v).parents("td").length == 0) {
						$("#thumb"+v).height(height);
					}
					$("#thumb"+v).css("width", "");
				}
			}
//			$("#thumb"+v).width(getObj("width").value);
//			$("#thumb"+v).height(getObj("height").value);
		} else {
			h = jQuery.trim($("#pv"+v).attr("href"));
			t = $("#pv"+v).attr("title");
			i = $("#pv"+v).html();
			o = $("#pv"+v).get(0).parentNode;
			td = $(o).parent("td");
			o.removeChild(getObj("pv"+v));
			$(o).children("div.fileDescr").remove();
			
			$("<a id=\"pv"+v+"\" href='"+h+"' title='"+t+"' target='_blank'></a>"
					+ "<div class='fileDescr'"
					+ (td.length > 0 ? " title='" + t + "' style='width: 100%; white-space: nowrap; overflow: hidden; text-overflow: ellipsis;'" : "")
					+ ">"
					+ "<a href='"+h+"' target='_blank'>" + t + "</a></div>").appendTo(o);
			
			$("#pv"+v).html(i);
			$("#thumb"+v).width("");
			$("#thumb"+v).height("");
		}
	} else {
		h = document.getElementById("realurl").value;
		t = document.getElementById("fileName").value;
		o = $("#thumb"+v).get(0).parentNode;
		i = $(o).html();
		o.removeChild(getObj("thumb"+v));
		if (getObj("filetype").value=="02"||getObj("filetype").value=="06") {
			$("<a id=\"pv"+v+"\" href='"+h+"' title='"+t+"' class='lightbox'></a>").appendTo(o);
			$("#pv"+v).html(i);
			$("#thumb"+v).width(getObj("width").value);
			$("#thumb"+v).height(getObj("height").value);
		} else {
			$("<a id=\"pv"+v+"\" href='"+h+"' title='"+t+"' target='_blank'></a>").appendTo(o);
			$("#pv"+v).html(i);
			$("#thumb"+v).width("");
			$("#thumb"+v).height("");
		}		
		
	}
	if (!(getObj("filetype").value=="02"||getObj("filetype").value=="06")) {
		if (getObj("ugridID").value!="") {
			$("#thumb"+v).width("18");
			$("#thumb"+v).height("18");
		}
	}
	//tb_remove();
	$('#FileDiv' ).dialog('close' );
	resetFile();
	getContextMenu();
}
function openImageResource(v1,v2,o){
	if (!$('#FileDiv' ).dialog("isOpen")) {
		$('#FileDiv' )
			.dialog( 'option','height',470)
			.dialog( 'option','width',520)
			.dialog( 'option','title','File Upload')
			.dialog( 'option','position',["center","middle"]);
		$('#FileDiv').unbind( "dialogopen");
		$('#FileDiv').bind( "dialogopen", function(event, ui) {
			var ra = o.split(",");
			var paramString="";
			if (ra.length==3){
				paramString= "attachID=" + jQuery.trim(v1)+"&objID="+jQuery.trim(v2)+"&r="+ra[0]+"&w="+ra[1]+"&h="+ra[2];
			} else if (ra.length==4){
				paramString= "attachID=" + jQuery.trim(v1)+"&objID="+jQuery.trim(v2)+"&r="+ra[0]+"&w="+ra[1]+"&h="+ra[2]+"&g="+ra[3];
			}
			var assurl = "/user/uinu011.jsp";
	
			//getQAjaxRun(oneFieldId,messageFlg,lasturl,async,paramdata,nextFunc, changeFlg, changeObjID, changeType)
			getQAjaxRun("rstfld1",true,assurl,true,paramString,"uinu011_initFileUploadDialog()","5","FileDiv","div");
		});
		$('#FileDiv' ).dialog('open' );
	}
}

function fileUpload(id,v,v1){
	var thumb = "";
	if (id != "") {
		thumb = $('img#'+id);
	}
	
	new AjaxUpload('imageUpload'+v, {
		action: '/s/UploadFile',
		enctype: 'multipart/form-data',
		name: 'AttachFilename',
		responseType: json,
		data: {
			uploadid: "00"
		},
		onSubmit: function(file, extension) {
			$('div.preview').addClass('loading');
		},
		onComplete: function(file, response) {
			thumb.load(function(){
				$('div.preview').removeClass('loading');
				thumb.unbind();
			});
			var returnVal = response.split(",");
			if (id != "") {
				thumb.attr('src', '/img/'+returnVal[0]);
			}
			
			document.getElementById(v1).value = returnVal[1];
		}
	});
}
function fileUUpload(id,v,v1,o,r,w,h){
	var thumb = "";
	if (id != "") {
		thumb = $('img#'+id);
	}
	
	new AjaxUpload('imageUpload'+v, {
		action: '/s/UploadFile',
		enctype: 'multipart/form-data',
		name: 'AttachFilename',
		data: {
			uploadid: o,
			DoResize: r,
			width: w,
			height: h,
			thumbSrcFlg: 1,
			thumbUrlFlg: 2,
			retValID: v1
		},
		onSubmit: function(file, extension) {
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
				uinu011_ajaxQueryImg();
			}

		}
	});
}
function fileUUUpload(id,v,v1,o,r,w,h){
	var thumb = "";
	if (id != "") {
		thumb = $('img#'+id);
	}

	new AjaxUpload(v, {
		action: '/s/UploadFile',
		enctype: 'multipart/form-data',
		name: 'AttachFilename',
		data: {
			uploadid: o,
			DoResize: r,
			width: w,
			height: h,
			thumbSrcFlg: 1,
			thumbUrlFlg: 2,
			retValID: o
		},
		onSubmit: function(file, extension) {
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
						if (idx=='realurl') {//thumbtxt8
							$("#thumb"+o).attr('src',eval(jid));
							$("#thumb"+o).parent().attr('href',eval(jid));
						} else {
							$("#"+idx).val(eval(jid));
						}
					}
				}
				if (myJsonObj.h!=undefined) {
					for (key in myJsonObj.h) {
						idx = myJsonObj.h[key];
						jid = "myJsonObj." + idx;
						$("#"+idx).html(eval(jid));
					}
				}
			}
		}
	});
}
function getParamFromPage(o, p) {
	var json;
	json = setSendJsonData(document.form1);
	json["encode"] = $("#encode", $("#FuncDiv")).val();
	json["subID"] = o;
	json["pageID"] = p;
	return json;
}
function fileUUploadImport(id, o, p, e){
	var thumb = "";
	if (id != "") {
		thumb = $('img#'+id);
	}
	new AjaxUpload('uploadimport', {
		action: '/s/import',
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
			//	encode : $("#encode", $("#FuncDiv")).val(),
			//	subID : o,
			//	pageID: p});
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

function imageUploadImport(id,v,v1){
	var thumb = "";
	if (id != "") {
		thumb = $('img#'+id);
	}

	new AjaxUpload('imageUpload'+v, {
		action: '/s/UploadFile',
		enctype: 'multipart/form-data',
		name: 'AttachFilename',
		data: {
			Catalogid: 'image'
		},
		onComplete: function(file, response) {
			thumb.load(function(){
				thumb.unbind();
			});

			var myJsonObj = jsonParse(response);
			
			if (myJsonObj.e!=undefined) {
				alert(myJsonObj.e);
			} else {
				$("#"+v1).val(file);
			}
		}
	});
}

