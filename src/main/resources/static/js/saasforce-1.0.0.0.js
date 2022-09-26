(function(window, undefined){
	var SF = function(id) {
		return document.getElementById(id);
	},
	
	copyItemArray = new Array(),
	
	operatorHistoryArray = new Array(),
	
	//local history index
	operatorHistoryIndex = -1,
	
	//total server history index
	serverHistoryIndex = -1,
	serverCurrentHistoryIndex = -1,
	
	selected_static_table_item_subids = new Array(),
	
	copyReadyMap = new Object(),
	
	__isCheckSuccess = true,
	
	__mobileFlg = (/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|ipad|iris|kindle|Android|Silk|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino/i).test(navigator.userAgent) 
	|| (/1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i).test(navigator.userAgent.substr(0,4)),
	//__mobileFlg = (/android|webos|iphone|ipad|ipod|blackberry|iemobile|opera mini/i.test(navigator.userAgent.toLowerCase())),

	__iosFlg = (/(iPhone|iPad|iPod|iphone|ipad|ipod)/i).test(navigator.userAgent.toLowerCase()),
	__androidFlg = (/(android)/i).test(navigator.userAgent.toLowerCase()),

	
	__mustCheckData = "",
	
	__itemCheckData = "",
	
	WIDGET_COORDINATE_TOP_GAP = 5,
	
	changeTopStepNumber = WIDGET_COORDINATE_TOP_GAP,
	
	WIDGET_COORDINATE_LEFT_GAP = 5,
	
	changeLeftStepNumber = WIDGET_COORDINATE_LEFT_GAP,
	
	__SET_PROPERTY_OPERATOR_TYPE = 0,
	__SET_SERVER_OPERATOR_TYPE = 1,
	
	__WIDTH_HEIGHT_REG = /(width|height)$/,
	
	__MONEY_FORMAT_REG = /(\d+)(\d{3})/,
	
	__JQUERY_SIGN_SUFFIX = "#",
	
	__SELECT2_SIGN_SUFFIX = "#s2id_",
	
	__SELECT2_EVENT_VAL = "val",
	
	__EVENT_TYPE_SUBMIT = "onsubmit",
	
	__WIDGET_PROPERTY_CHECKED = 'checked',
	
	__WIDGET_PROPERTY_SAAS = "saas_",
	
	__WIDGET_TAGNAME_BODY = "body",
	
	__WIDGET_TAGNAME_TABLE = "TABLE",
	
	__WIDGET_TAGNAME_INPUT = "INPUT",
	
	__WIDGET_TAGNAME_LABEL = "LABEL",
	
	__WIDGET_TAGNAME_SELECT = "SELECT",

	__WIDGET_TYPE_BUTTON = "button",
	
	__WIDGET_TYPE_TEXT = "text",
	
	__WIDGET_TYPE_CHECKBOX = "checkbox",
	
	__HEADER_SUFFIX = "_HEADER",
	
	__CONTENT_SUFFIX = "_CONTENT",
	
	__TABLE_HEADER_SUFFIX = "_TABLE_HEAD",
	
	__TABLE_CONTENT_SUFFIX = "_TABLE_CONTENT",
	
	__CUSTOM_WIDGET_TARGET = '#target',
	
	__CUSTOM_WIDGET_LOADING_AREA = "#loadingArea",
	
	__CUSTOM_WIDGET_CONTAINER_SHADE = "containerShade",
	
	__CUSTOM_WIDGET_CONTAINER = "#widgetContainer",
	
	__CUSTOM_WIDGET_TREE = "#TreeCustomDialog",
	
	__DIALOG_STATUS_OPEN = "isOpen",
	
	__DIALOG_EVENT_DIALOGOPEN = "dialogopen",
	
	__SCROLL_EVENT_MOVE = "scroll",
	
	__DIALOG_EVENT_OPEN = "open",
	
	__WINDOW_OPEN_METHOD = 'about:blank',
	
	__STYLE_TYPE_DISPLAY = 'display',
	__STYLE_TYPE_DISABLED = 'disabled',
	__STYLE_TYPE_POSITION = 'position',
	__STYLE_TYPE_TOP = "top",
	__STYLE_TYPE_LEFT = "left",
	__STYLE_TYPE_FONT_SIZE = "font-size", // for operator history
	__STYLE_TYPE_FONT_COLOR = "color", // for operator history
	
	__STYLE_TYPE_OVERFLOW_X = "overflow-x",
	
	__STYLE_TYPE_OVERFLOW_Y = "overflow-y",
	
	__STYLE_VALUE_AUTO = "auto",
	
	__STYLE_VALUE_HIDDEN = "hidden",
	
	__STYLE_VALUE_ABSOLUTE = 'absolute',
	
	__STATIC_TABLE_CLASS = '.WF_STABLE_CLASS',
	
	__ITEM_OBJECT_SELECTION = 'input:text,input:button,span,select,option,legend,fieldset,textarea,label,img,iframe',
	
	__USER_ACTION_URL = "/user/inup017.jsp",
	
	CHOSEN_DROPDOWNLIST_STYLE = "chosen_dropdownlist_style",
	
	__doServerExecuteFlag = true,
	
	__childWindow = undefined;
	
	_createHtmlObject = {
		clearRadioboxChecked : __clearRadioboxChecked,
		createSaasforceHtml : __createSaasforceHtml,
		createChartHtml : __createChartHtml,
		clearItemValues : __clearItemValues,
		clearStaticTableMaxWidth : __clearStaticTableMaxWidth,
		clearStaticTableMaxHeight : __clearStaticTableMaxHeight,
		createTree : __createTree,
		createTreeForHtml : __createTreeForHtml,
		hideStaticTabelColumn : __hideStaticTabelColumn,
		isChildWindowOpen : __isChildWindowOpen,
		setComboboxIndex : __setComboboxIndex,
		setComboboxValue : __setComboboxValue,
		setComboboxSelectedByValue : __setComboboxSelectedByValue,
		setRadioboxChecked : __setRadioboxChecked,
		setTextValue : __setTextValue,
		setMinDate : __setMinDate,
		setMaxDate : __setMaxDate,
		setStaticTableScrollSync : __setStaticTableScrollSync,
		setStaticTableWidthInit : __setStaticTableWidthInit,
		setTabsInit : __setTabsInit,
		setWindowOpen : __setWindowOpen,
		setWindowOpenByName: __setWindowOpenByName,
		setModalDialog : __setModalDialog,
		setWindowSize: __setWindowSize,
		setOnStaticTableClickListener : __setOnStaticTableClickListener,
		setStaticTableMaxWidth : __setStaticTableMaxWidth,
		setStaticTableMaxHeight : __setStaticTableMaxHeight,
		setCheckboxChecked : __setCheckboxChecked,
		setVisbled : __setVisbled,
		setDisabled : __setDisabled,
		setRadioDisabled : __setRadioDisabled,
		treeDialogClose : __treeDialogClose
	},
	
	_htmlrightFunction = {
		codeShow : __codeShow,
		findStaticTableCell : __findStaticTableCell
	},
	
	_functionForDesignMenu = {
		adjustWidgetCoordinate : adjustWidgetCoordinate,
		setCustomClass : __setCustomClass,
		setUseCustomPosition : __setUseCustomPosition,
		setUseCustomClass : __setUseCustomClass,
		setItemProperties : __setItemProperties,
		lockControl : __lockControl,
		createShadeHtml : createShadeHtml,
		removeShadeHtml : removeShadeHtml,
		hideHiddenObj : hideHiddenObj,
		showHiddenObj : showHiddenObj,
		openStaticTableProDiv : openStaticTableProDiv,
		setDesignStaticTableWidthInit : __setDesignStaticTableWidthInit,
		changeStaticTableProValues : changeStaticTableProValues,
		staticTableProSetListener : __staticTableProSetListener,
		getStaticTableItemObj : __getStaticTableItemObj,
		isStaticTableOnlySelected : isStaticTableOnlySelected,
		isLabelOnlySelected : isLabelOnlySelected,
		widgetEdit : widgetEdit,
		designSaveSkip : designSaveSkip
	},
	
	_functionForUserMenu = {
		fileImport : __fileImport,
		setCheckSuccess : __setCheckSuccess,
		isCheckSuccess : __isCheckSuccessFun,
		setMustCheckData : __setMustCheckData,
		getMustCheckData : __getMustCheckData,
		setItemCheckData : __setItemCheckData,
		getItemCheckData : __getItemCheckData,
		buttonInitListener : __buttonInitListener,
		headerShowAndHide : __headerShowAndHide,
		initHeaderHide : __initHeaderHide
	},
	
	_utilFunction = {
		makeItemAttributesForSendData : makeItemAttributesForSendData,
		makeItemAttributesForSpecData: makeItemAttributesForSpecData,
		getLabelText : getLabelText,
		createUiButton : __createUiButton,
		isServerExecute : __isServerExecute,
		setServerExecute : __setServerExecute,
		fileDownload : __fileDownload,
		fileDownloadEncry : __fileDownloadEncry,
		setItemAttributes : setItemAttributes,
		getItemAttributes : getItemAttributes,
		loadingOn : loadingOn,
		loadingOff : loadingOff,
		getWindowParent : getWindowParent,
		confirm : confirm,
		pageSize : pageSize,
		stopPropagation : __stopPropagation,
		getSameColumnByUser : getSameColumnByUser,
		getSameColumn : getSameColumn,
		formatMoney : __formatMoney,
		getCurrentDate : __getCurrentDate,
		setEvnThemeStyle : __setEvnThemeStyle,
		setGradientBgDblColor : __setGradientBgDblColor,
		setMenuEvent : __setMenuEvent,
		getSelect2DisplayObj : __getSelect2DisplayObj,
		getFrameDocumentsByType : __getFrameDocumentsByType,
		setOptionStyleBySelect : __setOptionStyleBySelect,
		getPrecisionTime : __getPrecisionTime,
		isTimeAfter : __isTimeAfter,
		getTimeDifference : __getTimeDifference,
		setJSByScriprFile: __setJSByScriprFile,
		getTimeMinute: __getTimeMinute,
		getHHmm: __getHHmm,
		isMobile : __isMobile,
		isIos : __isIos,
		isAndroid: __isAndroid		
	},
	
	_keyListener = {
		onScrollEventListener : __onScrollEventListener,
		onChosenEventListener : __onChosenEventListener,
		onKeyEventListener : __onKeyEventListener
	};
	
	_operatorHistory = {
		operatorRedo : operatorRedo,
		operatorRollback : operatorRollback,
		addOperatorHistoryList : addOperatorHistoryList,
		addOperatorHistory : addOperatorHistory,
		getOperatorHistory : getOperatorHistory,
		getOperatorHistoryLen : getOperatorHistoryLen,
		delPreviousOperator : delPreviousOperator,
		clearOperatorHistoryArray : clearOperatorHistoryArray,
		setServerHistoryIndex : setServerHistoryIndex,
		setServerCurrentHistoryIndex : setServerCurrentHistoryIndex,
		getServerCurrentHistoryIndex : getServerCurrentHistoryIndex
	};
	
	_constants = {
		SET_PROPERTY_OPERATOR_TYPE : __SET_PROPERTY_OPERATOR_TYPE,
		SET_SERVER_OPERATOR_TYPE : __SET_SERVER_OPERATOR_TYPE,
		CHOSEN_DROPDOWNLIST_STYLE : CHOSEN_DROPDOWNLIST_STYLE
	};
		
	SF.extend = function() {
		var target = arguments[0] || {}, i = 1, length = arguments.length, source;
		if (length == i) {
			source = target;
			target = this;
		} else {
			source = arguments[i];
		}
		for (var property in source) {
			target[property] = source[property];
		}
		return target;
	};
	
	function __setComboboxIndex(id, index) {
		if ($(__JQUERY_SIGN_SUFFIX + id).length > 0) {
			$(__JQUERY_SIGN_SUFFIX + id)[0].selectedIndex = index;
		}
		$(__JQUERY_SIGN_SUFFIX + id).select2(__SELECT2_EVENT_VAL, $(__JQUERY_SIGN_SUFFIX + id).val());
	}
	
	function __setComboboxValue(id, value) {
		$(__JQUERY_SIGN_SUFFIX + id).val(value);
		$(__JQUERY_SIGN_SUFFIX + id).select2(__SELECT2_EVENT_VAL, $(__JQUERY_SIGN_SUFFIX + id).val());
	}
	
	function __setComboboxSelectedByValue(id, value) {
		var selectedIndex = 0;
		$("#"+id+" option").each(function(index) {
			if (this.value == value) {
				this.selected = true;
				selectedIndex = index;
			}
		});
		if ($(__JQUERY_SIGN_SUFFIX + id).length > 0) {
			$(__JQUERY_SIGN_SUFFIX + id)[0].selectedIndex = selectedIndex;
		}
	}
	
	function __setRadioboxChecked(id, value) {
		$("input[name="+id+"][value="+value+"]").attr(__WIDGET_PROPERTY_CHECKED, true);
	}
	
	function __setTextValue(id, value) {
		var obj = $(__JQUERY_SIGN_SUFFIX + id);
		if (obj.length > 0) {
			if (obj[0].tagName == __WIDGET_TAGNAME_TABLE) {
				$("td", obj).html(value);
			} else if (obj[0].tagName == __WIDGET_TAGNAME_INPUT && obj[0].type == __WIDGET_TYPE_BUTTON) {
				obj.val(value);
			} else {
				obj.html(value);
			}
		}
	}
	
	function __setMinDate(id, value) {
		$(__JQUERY_SIGN_SUFFIX + id).datepicker('option', 'minDate', value);
	}
	
	function __setMaxDate(id, value) {
		$(__JQUERY_SIGN_SUFFIX + id).datepicker('option', 'maxDate', value);
	}
	
	function __clearRadioboxChecked(id) {
		$("input[name="+id+"]").attr(__WIDGET_PROPERTY_CHECKED, false);
	}
	
	function __createSaasforceHtml(id, html) {
		if ($(__JQUERY_SIGN_SUFFIX + id).length > 0) {
			if ($(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).length > 0) {
				$(__JQUERY_SIGN_SUFFIX + id).parent().parent().html(html);
			} else {
				$(__JQUERY_SIGN_SUFFIX + id).parent().parent().html(html);
			}
		} else {
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().parent().html(html);
		}
	}
	
	function __createChartHtml(id, imageUrl, mapFlg, mapContent) {
		chartDirectorControl($('#'+id, $('#target')), 1);
		$('#'+id, $('#target')).attr('src','/user/action/chart/getchart.jsp?' + imageUrl + getRandParam());
		$('#'+id, $('#target')).attr('usemap','#' + id + '_map');
		if ($('#'+id +'_map', $('#target'))) {
			$('#'+id +'_map', $('#target')).remove();
		}
		if($.browser.msie){
			 if($.browser.version == "8.0" ) {
				 
			 } else {
				 if (mapFlg ) {
					 $('#'+id, $('#target')).append('<map name=\"'+id+'_map\">'+mapContent+'</map>');
				 }
			 }
		} else {
			 if (mapFlg ) {
				 $('#'+id, $('#target')).append('<map name=\"'+id+'_map\">'+mapContent+'</map>');
			 }
		}
	}
	
	function __clearItemValues(type, array) {
		if (type == "combobox") {
			$("select" + createExclude(array)).empty();
		} else if (type == "checkbox") {
			$("input[type='checkbox']" + createExclude(array)).attr(__WIDGET_PROPERTY_CHECKED, false);
		} else if (type == "radio") {
			$("input[type='radio']" + createExclude(array)).each(function() {
				$(this).attr(__WIDGET_PROPERTY_CHECKED, false);
			});
		} else if (type == __WIDGET_TYPE_TEXT) {
			$("input[type='text']" + createExclude(array)).each(function() {
				$(this).val("");
			});
		}
	}
	
	function __createTreeForHtml(html, htmlid) {
		var tWidth, tHeight;
		var kakuninbtn=jQuery.i18n.prop("saasforce.btn_00001");
		var kyannserubtn=jQuery.i18n.prop("saasforce.btn_00002");
		d = new dTree("d", "/images","",false,'');
		eval(html);
		$("#"+htmlid).html($("<div class='dtree'>" + d + "</div>"));
	}

	function __createTree(html, title, width, height) {
		var tWidth, tHeight;
		var kakuninbtn=jQuery.i18n.prop("saasforce.btn_00001");
		var kyannserubtn=jQuery.i18n.prop("saasforce.btn_00002");
		if (width==undefined) {
			tWidth = 700;
		} else {
			tWidth = width;
		}
		if (height==undefined) {
			tHeight = 500;
		} else {
			tHeight = height;
		}
		d = new dTree("d", "/images","",false,'');
		eval(html);
		$(__CUSTOM_WIDGET_TREE).append($("<div class='dtree'>" + d + "</div>"));
		$(__CUSTOM_WIDGET_TREE).dialog({
			width: tWidth,
			height: tHeight,
			buttons: {
				kakuninbtn: function() {
					var note = d.getSelected();
					if (note==undefined) {
						alert($.i18n.prop("com.msg_0010067"));
					} else {
						window[note.fun](note.param);
					}
				},
				kyannserubtn: function() {
			    	$(__CUSTOM_WIDGET_TREE).dialog("close");
				}
			}
		});
		if (!$(__CUSTOM_WIDGET_TREE).dialog(__DIALOG_STATUS_OPEN)) {
			$(__CUSTOM_WIDGET_TREE).unbind(__DIALOG_EVENT_DIALOGOPEN);
			$(__CUSTOM_WIDGET_TREE).bind( __DIALOG_EVENT_DIALOGOPEN, function(event, ui) {
				if (title) {
					$(__CUSTOM_WIDGET_TREE).dialog( 'option','title', title);
				}
			});
			$(__CUSTOM_WIDGET_TREE).dialog(__DIALOG_EVENT_OPEN);
			//d.openAll();
			d.closeAll();
		}
	}
	
	function __treeDialogClose() {
		$(__CUSTOM_WIDGET_TREE).dialog("close");
	}
	
	function __setStaticTableWidthInit(id, width) {
		$(__JQUERY_SIGN_SUFFIX + id).width(width);
		if ($(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).length > 0) {
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).find("th").each(function() {
				$(this).width(parseInt($(this).attr("_cw"), 10) - 1);
			});
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).width(width);
			//$(__JQUERY_SIGN_SUFFIX + id).find("td.WF_STABLE_CLASS_TD").each(function() {
			//	$(this).width(parseInt($(this).attr("_cw"), 10) - 1);
			//});
		}
		$(__JQUERY_SIGN_SUFFIX + id).parent().width(parseInt(width, 10) - 30);
		$(__JQUERY_SIGN_SUFFIX + id).parent().height(parseInt($(__JQUERY_SIGN_SUFFIX + id).height(), 10) - 22);
		__buttonInitListener();
	}
	
	function __setDesignStaticTableWidthInit(id, width) {
		$(__JQUERY_SIGN_SUFFIX + id).width(width);
		$(__JQUERY_SIGN_SUFFIX + id).find("th").each(function() {
			$(this).width(parseInt($(this).attr("_cw"), 10) - 1);
		});
		$(__JQUERY_SIGN_SUFFIX + id).find("td.WF_STABLE_CLASS_TD").each(function() {
			$(this).width(parseInt($(this).attr("_cw"), 10) - 1);
		});
		$(__JQUERY_SIGN_SUFFIX + id).parent().width(parseInt(width, 10) - 30);
		$(__JQUERY_SIGN_SUFFIX + id).parent().height(parseInt($(__JQUERY_SIGN_SUFFIX + id).height(), 10) - 22);
		__buttonInitListener();
	}
	
	function __setTabsInit(id) {
		var tabs = $(__JQUERY_SIGN_SUFFIX + id).tabs();
		var fun = $(__JQUERY_SIGN_SUFFIX + id).attr("_fun");
		if (fun) {
			tabs.on("tabsactivate", function() {
				var index = $(__JQUERY_SIGN_SUFFIX + id).tabs("option", "active");
				window[fun](null, index);
			});
		}
	}
	
	function __hideStaticTabelColumn() {
		var length = arguments.length;
		if (length > 1) {
			for (var int = 1; int < length; int++) {
				getSameColumnByUser(arguments[0], arguments[int]).hide();
				getSameHeadColumnByUser(arguments[0], arguments[int]).hide();
				return;
				var objs = getSameColumnByUser(arguments[0], arguments[int]);
				if (objs.length > 0) {
					objs.each(function() {
						$(this).hide();
					});
				} else {
					objs = getSameHeadColumnByUser(arguments[0], arguments[int]);
					objs.each(function() {
						$(this).hide();
					});
				}
			}
		}
	}
	
	function __setStaticTabelVisibleColumnWidth(id) {
		$(__JQUERY_SIGN_SUFFIX + id).parent().parent().find("th:visible").each(function() {
			var index = $(this).attr("_index");
			var width = $(this).width() + 1;
			$(__JQUERY_SIGN_SUFFIX + id).find("td.WF_STABLE_CLASS_TD[_index="+index+"]").width(width);
		});
	}
	
	function __isChildWindowOpen() {
		return __childWindow != undefined && !__childWindow.closed;
	}
	
	function __setWindowOpen(param, width, height, url) {
		if (__isChildWindowOpen()) {
			alert(jQuery.i18n.prop("saasforce.msg_00001"));
			return false;
		}
		if (url == undefined || url == "") {
			url = __USER_ACTION_URL;
		}
		var dd = new Date();
		var windowName = "saasWindowName"+dd.getHours()+"_"+dd.getMinutes()+"_"+dd.getSeconds();
		var tempForm = $("<form></form>");
		tempForm.attr("id", "windowOpenId");
		tempForm.attr("method", "post");
		tempForm.attr("action", url);
		tempForm.attr("target", windowName);
		var params = param.split(",");
		for (var paramKey in params) {
			var paramValue = params[paramKey];
			tempForm.append($("<input type='hidden' name='"+paramValue.split("=")[0]+"' value='"+paramValue.split("=")[1]+"'>"));
		}
		tempForm.bind(__EVENT_TYPE_SUBMIT, function() {
			var options = "height="+height+",width="+width+",top=0,left=0,toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no,status=no";
			__childWindow = window.open(__WINDOW_OPEN_METHOD, windowName, options);
		});
		$(__WIDGET_TAGNAME_BODY).append(tempForm);
		tempForm.trigger(__EVENT_TYPE_SUBMIT);
		tempForm[0].submit();
		tempForm.remove();
	}
	
	function __setWindowOpenByName(param, width, height, windowName, url) {
		if (__isChildWindowOpen()) {
			alert(jQuery.i18n.prop("saasforce.msg_00001"));
			return false;
		}
		if (url == undefined || url == "") {
			url = __USER_ACTION_URL;
		}
		var dd = new Date();
		var tempForm = $("<form></form>");
		tempForm.attr("id", "windowOpenId");
		tempForm.attr("method", "post");
		tempForm.attr("action", url);
		tempForm.attr("target", windowName);
		if (param === undefined || param === null || param === "") {
			
		} else {
			for (var paramKey in params) {
				var paramValue = params[paramKey];
				tempForm.append($("<input type='hidden' name='"+paramValue.split("=")[0]+"' value='"+paramValue.split("=")[1]+"'>"));
			}
		}
		tempForm.bind(__EVENT_TYPE_SUBMIT, function() {
			var options = "height="+height+",width="+width+",top=0,left=0,toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no,status=no";
			__childWindow = window.open(__WINDOW_OPEN_METHOD, windowName, options);
		});
		$(__WIDGET_TAGNAME_BODY).append(tempForm);
		tempForm.trigger(__EVENT_TYPE_SUBMIT);
		tempForm[0].submit();
		tempForm.remove();
	}
	
	function __setModalDialog(pageId, param, from, mbWidth, mbHeight) {
		var url = __USER_ACTION_URL;
		var dd = new Date();
		var windowName = "saasWindowName"+dd.getHours()+"_"+dd.getMinutes()+"_"+dd.getSeconds();
		
	    SF.setServerExecute(true);
	    if (mbWidth==undefined || mbWidth=='0') {
	      mbWidth = "400px";
	      mbHeight = "300px";
	    } else {
	      mbWidth = mbWidth + "px";
	      mbHeight = mbHeight + "px";
	    }
	    var options = "dialogWidth=" + mbWidth + ";dialogHeight=" + mbHeight + ";toolbar=0;center=1;status=1;scroll=1;resizable=1;minimize=0;maximize=0;";
	    
	    url += "?";
		var params = param.split(",");
		for (var paramKey in params) {
			var paramValue = params[paramKey];
			url +=paramValue+"&";
		}

	    window.showModalDialog(url+"&modalFlg=1&isShowAtmplanHead=0", windowName, options);
	
	}

	function __setOnStaticTableClickListener(id) {
		$("td.WF_STABLE_CLASS_TD,th.WF_STABLE_CLASS_TH", $(__JQUERY_SIGN_SUFFIX + id)).unbind();
		$("td.WF_STABLE_CLASS_TD,th.WF_STABLE_CLASS_TH", $(__JQUERY_SIGN_SUFFIX + id)).each(function() {
			var fun = $(this).attr("_fun");
			var tdObject = this;
			if (fun) {
				var child = $(this).children();
				if (child.length != 0) {
					var obj = new Object();
					var attributes = this.attributes;
					for (var i = 0; i < attributes.length; i++) {
						if (!attributes[i].name.indexOf(__WIDGET_PROPERTY_SAAS)) {
							obj[jQuery.camelCase(attributes[i].name.substring(5))] = attributes[i].value;
						} else {
							obj[jQuery.camelCase(attributes[i].name)] = attributes[i].value;
						}
					}
					if (child[0].tagName == __WIDGET_TAGNAME_INPUT && child[0].type == __WIDGET_TYPE_BUTTON) {
						$(this).children().unbind("click");
						$(this).children().click(function(event) {
							window[fun](null, obj, this, tdObject);
							__stopPropagation(event);
						});
					} else if (child[0].tagName == __WIDGET_TAGNAME_INPUT && child[0].type == __WIDGET_TYPE_TEXT) {
						if ($(this).children().hasClass("readonly")) {
							$(this).unbind("click");
							$(this).click(function(event) {
								window[fun](null, obj, this, tdObject);
								__stopPropagation(event);
							});
						} else {
							$(this).children().unbind("change");
							$(this).children().change(function(event) {
								window[fun](null, obj, this, tdObject);
								__stopPropagation(event);
							});
						}
					} else if ($("div.wf_checkbox",$(this)).length==1) {
						if ($(this).children().children().hasClass("readonly")) {
							$(this).children().children().unbind("click");
						} else {
							$(this).children().children().unbind("click");
							$(this).children().children().click(function(event) {
								window[fun](null, obj, this, tdObject);
								__stopPropagation(event);
							});
						}
					} else if (child[0].tagName == __WIDGET_TAGNAME_SELECT) {
						if ($(this).hasClass("readonly")) {
							$(this).unbind("click");
							$(this).click(function(event) {
								window[fun](null, obj, this, tdObject);
								__stopPropagation(event);
							});
						} else {
							$(this).children().unbind("change");
							$(this).children().change(function(event) {
								window[fun](null, obj, this, tdObject);
								__stopPropagation(event);
							});
						}
					} else if (child[0].tagName == __WIDGET_TAGNAME_LABEL) {
						$(this).unbind("click");
						$(this).click(function(event) {
							window[fun](null, obj, this, tdObject);
							__stopPropagation(event);
						});
					} else {
						$(this).unbind("click");
						$(this).click(function(event) {
							window[fun](null, obj, this, tdObject);
							__stopPropagation(event);
						});
					}
				} else {
					$(this).unbind("click");
					$(this).click(function(event) {
						var obj = new Object();
						var attributes = this.attributes;
						for (var i = 0; i < attributes.length; i++) {
							if (!attributes[i].name.indexOf(__WIDGET_PROPERTY_SAAS)) {
								obj[jQuery.camelCase(attributes[i].name.substring(5))] = attributes[i].value;
							} else {
								obj[jQuery.camelCase(attributes[i].name)] = attributes[i].value;
							}
						}
						window[fun](null, obj, this, tdObject);
						__stopPropagation(event);
					});
				}
			}
		});
	}
	
	function __setStaticTableMaxWidth(id, width) {
		
		if ($(__JQUERY_SIGN_SUFFIX + id).parent().length > 0) {
			$(__JQUERY_SIGN_SUFFIX + id).parent().width(width);
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().width(width-17);
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().css(__STYLE_TYPE_OVERFLOW_X, __STYLE_VALUE_HIDDEN);
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().css(__STYLE_TYPE_OVERFLOW_Y, __STYLE_VALUE_HIDDEN);
			$(__JQUERY_SIGN_SUFFIX + id).parent().css(__STYLE_TYPE_OVERFLOW_X, __STYLE_VALUE_AUTO);
		} else {
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().width(width-17);
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().css(__STYLE_TYPE_OVERFLOW_X, __STYLE_VALUE_AUTO);
		}
	}
	
	function __setStaticTableScrollSync(id) {
		$(__JQUERY_SIGN_SUFFIX + id + __TABLE_CONTENT_SUFFIX).scroll(function() {
			$(__JQUERY_SIGN_SUFFIX + id + __TABLE_HEADER_SUFFIX).scrollLeft($(__JQUERY_SIGN_SUFFIX + id + __TABLE_CONTENT_SUFFIX).scrollLeft());
		});
		
	}
	
	function __clearStaticTableMaxWidth(id) {
		return;
		$(__JQUERY_SIGN_SUFFIX + id).parent().css(__STYLE_TYPE_OVERFLOW_X, __STYLE_VALUE_HIDDEN);
	}
	
	function __setStaticTableMaxHeight(id, height) {
		var head_height = $(__JQUERY_SIGN_SUFFIX + id + __TABLE_HEADER_SUFFIX).height();
		var content_height = $(__JQUERY_SIGN_SUFFIX + id + __TABLE_CONTENT_SUFFIX).height();
		if (content_height < height) {
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().width($(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().width()+17);
		}
		if ($(__JQUERY_SIGN_SUFFIX + id).parent().length > 0) {
			$(__JQUERY_SIGN_SUFFIX + id).parent().height(height - head_height);
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().parent().height(height);
			$(__JQUERY_SIGN_SUFFIX + id).parent().css(__STYLE_TYPE_OVERFLOW_Y, __STYLE_VALUE_AUTO);
		} else {
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().height(height);
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().parent().height(height);
			$(__JQUERY_SIGN_SUFFIX + id + __HEADER_SUFFIX).parent().css(__STYLE_TYPE_OVERFLOW_Y, __STYLE_VALUE_AUTO);
		}
	}
	
	function __clearStaticTableMaxHeight(id) {
		return;
		$(__JQUERY_SIGN_SUFFIX + id).parent().css(__STYLE_TYPE_OVERFLOW_Y, __STYLE_VALUE_HIDDEN);
	}
	
	function __setCheckboxChecked(id, checked) {
		$(__JQUERY_SIGN_SUFFIX + id).attr(__WIDGET_PROPERTY_CHECKED, checked);
	}
	
	function __setVisbled(id, visibled) {
		var obj;
		if ($(__SELECT2_SIGN_SUFFIX + id).length > 0) {
			obj = $(__SELECT2_SIGN_SUFFIX + id);
		} else {
			obj = $(__JQUERY_SIGN_SUFFIX + id);
		}
		obj.css(__STYLE_TYPE_DISPLAY, visibled);
		obj.parent().css(__STYLE_TYPE_DISPLAY, visibled);
		if (obj.parent().find(__STATIC_TABLE_CLASS).length > 0) {
			if (obj.parent().attr("id").indexOf("_TABLE_CONTENT") != -1) {
				obj.parent().parent().css(__STYLE_TYPE_DISPLAY, visibled);
			} else {
				obj.parent().parent().css(__STYLE_TYPE_DISPLAY, visibled);
			}
		}
	}
	
	function __setDisabled(id, disabled) {
		$(__JQUERY_SIGN_SUFFIX + id).attr(__STYLE_TYPE_DISABLED, disabled);
		if ($(__JQUERY_SIGN_SUFFIX + id).hasClass("ui-button")) {
			$(__JQUERY_SIGN_SUFFIX + id).button("refresh");
		} else if ($(__SELECT2_SIGN_SUFFIX + id).length > 0) {
			$(__JQUERY_SIGN_SUFFIX + id).select2("enable", !disabled);
		}
	}
	
	function __setRadioDisabled(id, disabled) {
		$("input[name="+id+"]").attr(__STYLE_TYPE_DISABLED, disabled);
	}
	
	function adjustWidgetCoordinate(obj) {
		var top = parseInt(obj.css(__STYLE_TYPE_TOP), 10);
		top -= (top - 111) % WIDGET_COORDINATE_TOP_GAP;
		obj.css(__STYLE_TYPE_TOP, top);
		var left = parseInt(obj.css(__STYLE_TYPE_LEFT), 10);
		left -= left % WIDGET_COORDINATE_LEFT_GAP;
		obj.css(__STYLE_TYPE_LEFT, left);
	}
	
	function __setCustomClass(obj) {
		$("div.ui-selected").each(function() {
			var selectDiv = $(this);
			if (selectDiv.find(__STATIC_TABLE_CLASS).length > 0) {
				var selectTable = selectDiv.find(__STATIC_TABLE_CLASS);
				if (selectTable.find(".selected").length > 0) {
					selectTable.find(".selected").each(function() {
						if ($(this).hasClass("WF_STABLE_CLASS_TH") || $(this).hasClass("WF_STABLE_CLASS_TD")) {
							var $t = $(__ITEM_OBJECT_SELECTION,$(this));
							$t.attr("_cls", $(obj).val());
							selectDiv.attr("_e","1");
							$('#WF_CHANGEFLG').val("1");
						}
					});
				} else {
					selectDiv.attr("_cls", $(obj).val());
					selectDiv.attr("_e","1");
					$('#WF_CHANGEFLG').val("1");
				}
			} else {
				selectDiv.attr("_cls", $(obj).val());
				selectDiv.attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
	}
	
	function __setUseCustomPosition(obj) {
		var isUseCustomClass = "0";
		if (obj.checked) {
			isUseCustomClass = "1";
		}
		$("div.ui-selected").each(function() {
			var selectDiv = $(this);
			if (selectDiv.find(__STATIC_TABLE_CLASS).length > 0) {
				var selectTable = selectDiv.find(__STATIC_TABLE_CLASS);
				if (selectTable.find(".selected").length > 0) {
					selectTable.find(".selected").each(function() {
						if ($(this).hasClass("WF_STABLE_CLASS_TH") || $(this).hasClass("WF_STABLE_CLASS_TD")) {
							var $t = $(__ITEM_OBJECT_SELECTION,$(this));
							$t.attr("_ucp", isUseCustomClass);
							selectDiv.attr("_e","1");
							$('#WF_CHANGEFLG').val("1");
						}
					});
				} else {
					selectDiv.attr("_ucp", isUseCustomClass);
					selectDiv.attr("_e","1");
					$('#WF_CHANGEFLG').val("1");
				}
			} else {
				selectDiv.attr("_ucp", isUseCustomClass);
				selectDiv.attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
	}
	function __lockControl() {
		var itemid = "";
	
		$("div.ui-selected").each(function() {
			var selectDiv = $(this);
			if (selectDiv==undefined) {
				itemid = $("input[id=v_subid]", $("#proptbl")).val();
			}
			itemid = selectDiv.attr("id");
			if ($("#"+itemid).hasClass("cancelSelect")) {
				$("#"+itemid)
				.removeClass("cancelSelect")
				.draggable( "enable" )
				.resizable( "enable" )
				.attr("_lf", "0")
				.find(".ui-widget-header").show()
				;
			} else {
				$("#"+itemid)
					.addClass("cancelSelect")
					.draggable( "disable" )
					.resizable( "disable" ).removeClass('ui-state-disabled')
					.attr("_lf", "1")
					.find(".ui-widget-header").hide()
					;
			}
			$("#"+itemid).attr("_e","1");
			$('#WF_CHANGEFLG').val("1");
		});
		if (itemid==undefined || itemid=="") {
			itemid = $("input[id=v_subid]", $("#proptbl")).val();
			if ($("#"+itemid).hasClass("cancelSelect")) {
				$("#"+itemid)
				.removeClass("cancelSelect")
				.draggable( "enable" )
				.resizable( "enable" )
				.attr("_lf", "0")
				.find(".ui-widget-header").show()
				;
				
			} else {
				$("#"+itemid)
					.addClass("cancelSelect")
					.draggable( "disable" )
					.resizable( "disable" ).removeClass('ui-state-disabled')
					.attr("_lf", "1")
					.find(".ui-widget-header").hide()
					;
			}
			$("#"+itemid).attr("_e","1");
			$('#WF_CHANGEFLG').val("1");
		}
	}
	function __setItemProperties(obj) {
		var oid = obj.id;
		var itemid = $("input[id=v_subid]", $("#proptbl")).val();
		if (oid=="v_itemID") {
			$("#"+itemid).attr("_f", $("#v_itemID").val());
		} else if (oid=="v_regexKind") {
			$("#"+itemid).attr("_rk", $("#v_regexKind").val());
			var type = $("#v_regexKind").val();
			if (type == "1") {
				$("#v_inputRegex").val("###,###,##0");
				$("input:text", $("#"+itemid)).css("text-align","right");
			} else if (type == "2"){
				$("#v_inputRegex").val("yyyy/MM/dd");
				$("input:text", $("#"+itemid)).css("text-align","center");
			} else if (type == "3"){
				$("#v_inputRegex").val("yyyy/MM/dd HH:mm");
				$("input:text", $("#"+itemid)).css("text-align","center");
			} else if (type == "4"){
				$("#v_inputRegex").val("HH:mm");
				$("input:text", $("#"+itemid)).css("text-align","center");
			} else {
				$("#v_inputRegex").val("");
				$("input:text", $("#"+itemid)).css("text-align","left");
			}
			$("#"+itemid).attr("_p", $("#v_inputRegex").val());
		} else if (oid=="v_inputRegex") {
			$("#"+itemid).attr("_p", $("#v_inputRegex").val());
		} else if (oid=="v_zIndex") {
			$("#"+itemid).css("z-index", $("#v_zIndex").val());
		} else if (oid=="v_tableid") {
			$("#"+itemid).attr("_l", $("#v_tableid").val());
		} else if (oid=="v_fieldid") {
			$("#"+itemid).attr("_m", $("#v_fieldid").val());
		} else if (oid=="v_mininput") {
			$("#"+itemid).attr("_j", $("#v_mininput").val());
		} else if (oid=="v_maxinput") {
			$("#"+itemid).attr("_k", $("#v_maxinput").val());
		} else if (oid=="v_tabindex") {
			$("#"+itemid).attr("_idx", $("#v_tabindex").val());
		} else if (oid=="v_itemNm") {
			$("#"+itemid).attr("_o", $("#v_itemNm").val());
		} else if (oid=="v_posTop") {
			$("#"+itemid).css("top", $("#v_posTop").val()+"px");
		} else if (oid=="v_posLeft") {
			$("#"+itemid).css("left", $("#v_posLeft").val()+"px");
		}
		$("#"+itemid).attr("_e","1");
		$('#WF_CHANGEFLG').val("1");
	}
	
	function __setUseCustomClass(obj) {
		var isUseCustomClass = "0";
		if (obj.checked) {
			isUseCustomClass = "1";
		}
		$("div.ui-selected").each(function() {
			var selectDiv = $(this);
			if (selectDiv.find(__STATIC_TABLE_CLASS).length > 0) {
				var selectTable = selectDiv.find(__STATIC_TABLE_CLASS);
				if (selectTable.find(".selected").length > 0) {
					selectTable.find(".selected").each(function() {
						if ($(this).hasClass("WF_STABLE_CLASS_TH") || $(this).hasClass("WF_STABLE_CLASS_TD")) {
							var $t = $(__ITEM_OBJECT_SELECTION,$(this));
							$t.attr("_ucs", isUseCustomClass);
							selectDiv.attr("_e","1");
							$('#WF_CHANGEFLG').val("1");
						}
					});
				} else {
					selectDiv.attr("_ucs", isUseCustomClass);
					selectDiv.attr("_e","1");
					$('#WF_CHANGEFLG').val("1");
				}
			} else {
				selectDiv.attr("_ucs", isUseCustomClass);
				selectDiv.attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
	}
	
	function createShadeHtml() {
		if ($("#" + __CUSTOM_WIDGET_CONTAINER_SHADE).length == 0) {
			var rows = 10, columns = 10, rowHeight = WIDGET_COORDINATE_TOP_GAP * 2, columnWidth = WIDGET_COORDINATE_LEFT_GAP * 2;
			columns = parseInt($(__CUSTOM_WIDGET_CONTAINER).width(), 10) / (columnWidth + 1) - 1;
			rows = parseInt($(__CUSTOM_WIDGET_CONTAINER).height(), 10) / (rowHeight + 1);
			var table_html = '<table border="0" cellspacing="0" cellpadding="0" z-index=-2 style="border-collapse: collapse;background-color:#fff;">';
			for (var i = 0; i < rows; i++) {
				table_html += '<tr>';
				for (var j = 0; j < columns; j++) {
					table_html += '<td width="'+columnWidth+'px" height="'+rowHeight+'px" style="border:1px #ccc solid"></td>';
				}
				table_html += '</tr>';
			}
			table_html += '</table>';
			
			var shade = $('<div id='+__CUSTOM_WIDGET_CONTAINER_SHADE+'>'+table_html+'</div>');
			shade.width($(__CUSTOM_WIDGET_CONTAINER).width());
			shade.height($(__CUSTOM_WIDGET_CONTAINER).height());
			shade.css({'top':'0px','left':'0px','position':'absolute'});
			$(__CUSTOM_WIDGET_CONTAINER).append(shade);
		} else {
			$("#" + __CUSTOM_WIDGET_CONTAINER_SHADE).show();
		}
	}
	
	function hideHiddenObj() {
		$("div.dragAble[_g='6'],div.dragAble[_a='0']", $("#target")).hide();
	}
	
	function showHiddenObj() {
		$("div.dragAble[_g='6'],div.dragAble[_a='0']", $("#target")).show();
	}
	
	function removeShadeHtml() {
		$("#" + __CUSTOM_WIDGET_CONTAINER_SHADE).hide();
	}
	
	function openStaticTableProDiv() {
		var selectDiv;
		$("div.ui-selected").each(function() {
			selectDiv = $(this);
			if (selectDiv.find(__STATIC_TABLE_CLASS).length > 0) {
				var selectTable = selectDiv.find(__STATIC_TABLE_CLASS);
				selectTable.find(".selected").each(function() {
					if ($(this).hasClass("WF_STABLE_CLASS_TH") || $(this).hasClass("WF_STABLE_CLASS_TD")) {
						selected_static_table_item_subids.push($(this).attr("_csid"));
					}
				});
				changeStaticTableProValues(selectTable.find(".selected:last"), selectDiv);
				if (!$('#StaticTablePro' ).dialog(__DIALOG_STATUS_OPEN)) {
					$('#StaticTablePro' )
					.dialog( 'option','height',565)
					.dialog( 'option','width',380)
					.dialog( 'option',__STYLE_TYPE_POSITION,["right",__STYLE_TYPE_TOP])
					.dialog( 'option','title',$('#ProDiv' ).dialog( 'option','title'));
					$('#StaticTablePro' ).dialog('open' );
				}
				return false;
			} else {
				openProDiv();
			}
		});
		if (selectDiv==undefined || selectDiv == "") {
			openProDiv();
		}
		return true;
	}
	
	function isStaticTableOnlySelected() {
		if ($("div.ui-selected").length == 1 && $("div.ui-selected").find(__STATIC_TABLE_CLASS).length > 0) {
			return true;
		}
		return false;
	}
	
	function isLabelOnlySelected() {
		if ($("div.ui-selected").length == 1 && $("div.ui-selected").attr("_g") == "13") {
			return true;
		}
		return false;
	}
	
	function getObjOnlySelected() {
		return $("div.ui-selected");
	}
	
	function __staticTableProSetListener() {
		$("#staticTableProItemItemId").change(function() {
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			var itemId = this.value;
			if (subid == null || subid == "" || itemId == null || itemId == "" || tableSubid == null || tableSubid == "") {
				return;
			}
			var url = urlAddEdit + "?actid=100171";
			var params = "subid=" + subid + "&itemId=" + itemId + "&pageID=" + $("#PageID").val();
			getQAjaxRunJson("rstfld", true, 1, "", url, false, params,"regetHO(null, '"+tableSubid+"');");
		});
		$("#staticTableProItemFontSize").change(function() {
			var changeValue = this.value;
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']").children(__STATIC_TABLE_CLASS);
				if ($("#staticTableAllSelectedChange").attr("checked")) {
					staticTableObj.find(".selected").each(function() {
						__getStaticTableItemObj($(this)).css("font-size", changeValue + "px");
					});
				} else {
					__getStaticTableItemObj(staticTableObj.find(".selected[_csid='"+subid+"']")).css("font-size", changeValue + "px");
				}
				staticTableObj.parent().attr("_e","1");
		        $('#WF_CHANGEFLG').val("1");
			}
		});
		$("#staticTableCellWidth").change(function() {
			var changeValue = this.value;
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']").children(__STATIC_TABLE_CLASS);
				if ($("#staticTableAllCellSelectedChange").attr("checked")) {
					staticTableObj.find(".selected").each(function() {
						changeStaticTableWidth($(this), changeValue);
					});
				} else {
					changeStaticTableWidth(staticTableObj.find(".selected[_csid='"+subid+"']"), changeValue);
				}
				staticTableObj.parent().attr("_e","1");
		        $('#WF_CHANGEFLG').val("1");
			}
		});
		$("#staticTableCellHeight").change(function() {
			var changeValue = this.value;
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']").children(__STATIC_TABLE_CLASS);
				if ($("#staticTableAllCellSelectedChange").attr("checked")) {
					staticTableObj.find(".selected").each(function() {
						changeStaticTableHeight($(this), changeValue);
					});
				} else {
					changeStaticTableHeight(staticTableObj.find(".selected[_csid='"+subid+"']"), changeValue);
				}
				staticTableObj.parent().attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
		$("#staticTableItemWidth").change(function() {
			var changeValue = this.value;
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']").children(__STATIC_TABLE_CLASS);
				if ($("#staticTableAllSelectedChange").attr("checked")) {
					staticTableObj.find(".selected").each(function() {
						__getStaticTableItemObj($(this)).width(changeValue);
					});
				} else {
					__getStaticTableItemObj(staticTableObj.find(".selected[_csid='"+subid+"']")).width(changeValue);
				}
				staticTableObj.parent().attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
		$("#staticTableItemHeight").change(function() {
			var changeValue = this.value;
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']").children(__STATIC_TABLE_CLASS);
				if ($("#staticTableAllSelectedChange").attr("checked")) {
					staticTableObj.find(".selected").each(function() {
						__getStaticTableItemObj($(this)).height(changeValue);
					});
				} else {
					__getStaticTableItemObj(staticTableObj.find(".selected[_csid='"+subid+"']")).height(changeValue);
				}
				staticTableObj.parent().attr("_e","1");
		        $('#WF_CHANGEFLG').val("1");
			}
		});
		$("#styleListTable").change(function() {
			var changeValue = this.value;
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']").children(__STATIC_TABLE_CLASS);
				if ($("#staticTableAllSelectedChange").attr("checked")) {
					staticTableObj.find(".selected").each(function() {
						__getStaticTableItemObj($(this)).attr("_cls", changeValue);
					});
				} else {
					__getStaticTableItemObj(staticTableObj.find(".selected[_csid='"+subid+"']")).attr("_cls", changeValue);
				}
				staticTableObj.parent().attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
		$("#styleListTableSingle").change(function() {
			var changeValue = this.value;
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']");
				staticTableObj.attr("_cls", changeValue);
				staticTableObj.attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
		$("#useCustomStyleTableSingle").change(function() {
			var changeValue = "0";
			if (this.checked) {
				changeValue = "1";
			}
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']");
				staticTableObj.attr("_ucs", changeValue);
				staticTableObj.attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
		$("#useCustomStyleTable").change(function() {
			var changeValue = "0";
			if (this.checked) {
				changeValue = "1";
			}
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']").children(__STATIC_TABLE_CLASS);
				if ($("#staticTableAllSelectedChange").attr("checked")) {
					staticTableObj.find(".selected").each(function() {
						__getStaticTableItemObj($(this)).attr("_ucs", changeValue);
					});
				} else {
					__getStaticTableItemObj(staticTableObj.find(".selected[_csid='"+subid+"']")).attr("_ucs", changeValue);
				}
				staticTableObj.parent().attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
		$("#useCustomPositionTable").change(function() {
			var changeValue = "0";
			if (this.checked) {
				changeValue = "1";
			}
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			if (tableSubid != "") {
				var staticTableObj = $("div[_h='"+tableSubid+"']").children(__STATIC_TABLE_CLASS);
				if ($("#staticTableAllSelectedChange").attr("checked")) {
					staticTableObj.find(".selected").each(function() {
						__getStaticTableItemObj($(this)).attr("_ucp", changeValue);
					});
				} else {
					__getStaticTableItemObj(staticTableObj.find(".selected[_csid='"+subid+"']")).attr("_ucp", changeValue);
				}
				staticTableObj.parent().attr("_e","1");
				$('#WF_CHANGEFLG').val("1");
			}
		});
		$("#staticTableProItemObjKind").change(function() {
			var subid = $("#staticTableProItemSubidHid").val();
			var tableSubid = $("#staticTableSubidHid").val();
			var objectKind = this.value;
			if (subid == null || subid == "" || objectKind == null || objectKind == "" || tableSubid == null || tableSubid == "") {
				return;
			}
			var url = urlAddEdit + "?actid=100172";
			var params = "subid=" + subid + "&objectKind=" + objectKind + "&pageID=" + $("#PageID").val();
			getQAjaxRunJson("rstfld", true, 1, "", url, false, params,"regetHO(null, '"+tableSubid+"');");
		});
	}
	
	function changeStaticTableWidth(obj, changeValue) {
		var oldWidth = obj.width();
		var changeWidth = parseInt(changeValue, 10) - oldWidth;
		var thisChangeValue = parseInt(changeValue, 10) + 1;
		var objs = getSameColumn(obj);
		objs.each(function() {
			$(this).width(thisChangeValue);
		});
		var staticTableObj = obj.parent().parent().parent();
		var selectTablePro = staticTableObj.width() + changeWidth;
		staticTableObj.width(selectTablePro);
		var selectDivPro = staticTableObj.parent().width() + changeWidth;
		staticTableObj.parent().width(selectDivPro);
	}
	
	function changeStaticTableHeight(obj, changeValue) {
		var oldHeight = obj.height();
		var changeHeight = changeValue - oldHeight;
		changeValue++;
		var objs = getSameTrColumn(obj);
		objs.each(function() {
			$(this).height(changeValue);
		});
		var staticTableObj = obj.parent().parent().parent();
		var selectTablePro = staticTableObj.height() + changeHeight;
		staticTableObj.height(selectTablePro);
		var selectDivPro = staticTableObj.parent().height() + changeHeight;
		staticTableObj.parent().height(selectDivPro);
	}
	
	function changeStaticTableProValues(obj, parentObj) {
		var d = obj.parent().parent().parent().parent();
		if (d.length == 0 && parentObj) {
			d = parentObj;
		}
		selected_static_table_item_subids = new Array();
		if (d.length > 0) {
			$("#styleListTableSingle").val(d.attr("_cls"));
			if (d.attr("_ucs") == "1") {
				$("#useCustomStyleTableSingle").attr("checked", true);
			} else {
				$("#useCustomStyleTableSingle").attr("checked", false);
			}
		}
		d.find(".selected").each(function() {
			if ($(this).hasClass("WF_STABLE_CLASS_TH") || $(this).hasClass("WF_STABLE_CLASS_TD")) {
				selected_static_table_item_subids.push($(this).attr("_csid"));
			}
		});
		if (!obj.hasClass("selected")) {
			if (d.find(".selected").length == 0) {
				obj = null;
			} else {
				obj = d.find(".selected:last");
			}
		}
		if (obj != null) {
			$("#staticTableProItemSubid").html(obj.attr("_csid"));
			$("#staticTableProItemSubidHid").val(obj.attr("_csid"));
			$("#staticTableSubidHid").val(d.attr("_h"));
			$("#staticTableProItemItemId").val(obj.attr("_cii"));
			$("#staticTableProItemObjKind").val(obj.attr("_cok"));
			$("#staticTableProItemFontSize").val(replaceAll(__getStaticTableItemObj(obj).css("font-size"), "px", ""));
			$("#staticTableItemWidth").val(__getStaticTableItemObj(obj).width());
			$("#staticTableItemHeight").val(__getStaticTableItemObj(obj).height());
			$("#styleListTable").val(__getStaticTableItemObj(obj).attr("_cls"));
			if (__getStaticTableItemObj(obj).attr("_ucs") == "1") {
				$("#useCustomStyleTable").attr("checked", true);
			} else {
				$("#useCustomStyleTable").attr("checked", false);
			}
			if (__getStaticTableItemObj(obj).attr("_ucp") == "1") {
				$("#useCustomPositionTable").attr("checked", true);
			} else {
				$("#useCustomPositionTable").attr("checked", false);
			}
			$("#staticTableCellWidth").val(obj.width());
			$("#staticTableCellHeight").val(obj.height());
		} else {
			$("#staticTableProItemSubid").html("");
			$("#staticTableProItemSubidHid").val("");
			$("#staticTableSubidHid").val("");
			$("#staticTableProItemItemId").val("");
			$("#staticTableProItemObjKind").val("");
			$("#staticTableProItemFontSize").val("");
			$("#staticTableItemWidth").val("");
			$("#staticTableItemHeight").val("");
			$("#staticTableCellWidth").val("");
			$("#staticTableCellHeight").val("");
		}
	}
	
	function __getStaticTableItemObj(obj) {
		return $(__ITEM_OBJECT_SELECTION, obj);
	}
	
	function createLoadingHtml(s) {
		if (s == null || s == "") {
			s = jQuery.i18n.prop("com.msg_0010100");
		}
		var html = '<div id="loadingArea" class="loading">';
		html += '<table cellspacing="0" cellpadding="5" style="width: 400px;height:150px;">';
		html += '<tr valign="middle" align="center">';
		html += '<td>';
		html += '<table style="width: 150px;border: 0;" cellspacing="0" cellpadding="0">';
		html += '<tr>';
		html += '<td align="center" valign="middle" nowrap="nowrap">';
		html += '<b><span id="FS_0001" style="font-size:16px;">'+s+'</span></b>';
		html += '</td>';
		html += '</tr>';
		html += '<tr>';
		html += '<td align="center" nowrap="nowrap" height="10px">';
		html += '</td>';
		html += '</tr>';
		html += '<tr height="20px">';
		html += '<td align="center" nowrap="nowrap" height="30px">';
		html += '&nbsp;';
		html += '</td>';
		html += '</tr>';
//		html += '<tr>';
//		html += '<td align="center" nowrap="nowrap">';
//		html += '<img alt="loading..." src="/images/ajax-loader.gif">';
//		html += '</td>';
//		html += '</tr>';
		html += '</table>';
		html += '</td>';
		html += '</tr>';
		html += '</table>';
		html += '</div>';
		return html;
	}
	
	function pageSize() {
		var xScroll, yScroll, scrollLeft, scrollTop;
		if (window.innerHeight && window.scrollMaxY) {
			xScroll = window.innerWidth + window.scrollMaxX;
			yScroll = window.innerHeight + window.scrollMaxY;
		} else if (document.body.scrollHeight > document.body.offsetHeight) {
			xScroll = document.body.scrollWidth;
			yScroll = document.body.scrollHeight;
		} else {
			xScroll = document.body.offsetWidth;
			yScroll = document.body.offsetHeight;
		}
		if (window.pageYOffset) {
			scrollTop = window.pageYOffset;
			scrollLeft = window.pageXOffset;
		} else if (document.documentElement && document.documentElement.scrollTop) {
			scrollTop = document.documentElement.scrollTop;
			scrollLeft = document.documentElement.scrollLeft;
		} else if (document.body) {
			scrollTop = document.body.scrollTop;
			scrollLeft = document.body.scrollLeft;
		}
		
		var windowWidth, windowHeight, pageWidth, pageHeight;
		if (self.innerHeight) {
			if (document.documentElement.clientWidth) {
				windowWidth = document.documentElement.clientWidth;
			} else {
				windowWidth = self.innerWidth;
			}
			windowHeight = self.innerHeight;
		} else if (document.documentElement && document.documentElement.clientHeight) {
			windowWidth = document.documentElement.clientWidth;
			windowHeight = document.documentElement.clientHeight;
		} else if (document.body) {
			windowWidth = document.body.clientWidth;
			windowHeight = document.body.clientHeight;
		}
		
		if (yScroll < windowHeight) {
			pageHeight = windowHeight;
		} else {
			pageHeight = yScroll;
		}
		if (xScroll < windowWidth) {
			pageWidth = windowWidth;
		} else {
			pageWidth = xScroll;
		}
		var arrayPageSize = new Array(pageWidth, pageHeight, windowWidth, windowHeight, scrollLeft, scrollTop);
		return arrayPageSize;
	}
	
	function __stopPropagation(e) {
		if (e.stopPropagation) {
			e.stopPropagation();
		} else {
			e.returnValue = false;
			e.cancelBubble = true;
		}
	}
	
	function designSaveSkip() {
		ajaxDoPositionUpt();
		$('#logDialog').dialog("close"); 
		$("#textarea").val("");
	}
	function __setTrigerDone(o) {
		if ($(o).attr("_sf_class_done")==undefined || $(o).attr("_sf_class_done")=="") {
			$(o).attr("_sf_class_done", "1"); 
			return true;
		} else {
			return false;
		}
	}
	function __buttonInitListener() {
		$("input[type=button]").each(function() {
			if (__setTrigerDone(this)) {
				if ($(this).attr("_sf_class")) {
					var newObj = $("<div>");
					newObj.attr("class", $(this).attr("_sf_class"));
					$("body").append(newObj);
					var backgourndcolor = newObj.css("background-color");
					newObj.remove();
					if (!backgourndcolor || backgourndcolor == "rgba(0, 0, 0, 0)" || backgourndcolor == "transparent") {
						$(this).button();
					}
					var className = $(this).attr("class");
					if (className) {
						className += " " + $(this).attr("_sf_class");
					} else {
						className = $(this).attr("_sf_class");
					}
					$(this).attr("class", className + " ui-corner-all");
				} else {
					$(this).button();
				}
			}
		});
		$("input[type=text]").each(function() {
			if (__setTrigerDone(this)) {
				if ($(this).attr("_sf_class")) {
					$(this).addClass($(this).attr("_sf_class"));
				}
				if ($(this).attr("_ire")) {
					var ire = $(this).attr("_ire");
					var rge = $(this).attr("_rge");
					$(this).blur(function() {
						if (rge == "1") {
							if ("###,###,##0" == ire) {
								$(this).val(__formatMoney($(this).val()));
							}
						} else if (rge == "2") {
							//ATMシステム対応のため削除
							if ($(this).val()!=""){
								$(this).val(__formatDate($(this).val(), ire));
							}
						}
					});
					$(this).focus(function() {
						if (rge == "1") {
							if ("###,###,##0" == ire) {
								var val = $(this).val();
								while (val.indexOf(",") != -1) {
									val = val.replace(",", "");
								}
								$(this).val(val);
							}
						} else if (rge == "2") {
							//ATMシステム対応のため削除
							var val = $(this).val();
							if (val!=""){
								$(this).val(__removeformatDate($(this).val(), ire));
							}
						}
					});
				}
			}
		});
	}
	
	function __fileImport(filePath, fun) {
		$("#importFilePath").val(filePath);
		if (fun != '') {
			ajaxDoAddExeJs(fun);
		}
	}
	
	function __formatMoney(money) {
		money += "";
		var x = money.split(".");
		var x1 = x[0];
		var x2 = x.length > 1 ? "." + x[1] : "";
		while (__MONEY_FORMAT_REG.test(x1)) {
			x1 = x1.replace(__MONEY_FORMAT_REG, "$1" + "," + "$2");
		}
		return x1 + x2;
	}
	
	function __getCurrentDate() {
		var cdate = new Date();
		var year = cdate.getFullYear();
		var month = cdate.getMonth() + 1;
		var date = cdate.getDate();
		if (month < 10) {
			month = "0" + month;
		}
		if (date < 10) {
			date = "0" + date;
		}
		var strDate = year + "/" + month + "/" + date;
		return strDate;
	}
	
	function __formatDate(date, rge) {
		date = date.replace(/[Ａ-Ｚａ-ｚ０-９]/g,function(s){
	          return String.fromCharCode(s.charCodeAt(0)-0xFEE0);
        });
		date += "";
		var delim;
		var hyphenPos = date.indexOf( "-" );
		var slashPos = date.indexOf( "/" );
		if ( hyphenPos >= 0 && slashPos < 0 ) {
			delim = "-";
		} else if ( slashPos >= 0 && hyphenPos < 0 ) {
			delim = "/";
		} else {
			if (date.length==8 || date.length==6) {
				date = date.split("/").join("").split("-").join("");
				rge = rge.replace("yyyy",date.substr(0,4));
				rge = rge.replace("MM",date.substr(4,2));
				rge = rge.replace("dd",date.substr(6,2));
			} else {
				alert($.i18n.prop("com.msg_0010068")+rge+$.i18n.prop("com.msg_0010069") );
				date = date.split("/").join("").split("-").join("");
				rge = rge.replace("yyyy",date.substr(0,4));
				rge = rge.replace("MM",date.substr(4,2));
				rge = rge.replace("dd",date.substr(6,2));
			}
			return rge;
		}
		var digits = date.split( delim );
		if (digits.length == 3) {
			if ( digits[ 0 ].length == 0 || digits[ 1 ].length == 0 || digits[ 2 ].length == 0 
					|| digits[ 0 ].length > 5 || digits[ 1 ].length > 2 || digits[ 2 ].length > 2 ) {
				alert( $.i18n.prop("com.msg_0010068")+rge+$.i18n.prop("com.msg_0010069") );
				return date;
			}
		} else if (digits.length == 2) {
			if ( digits[ 0 ].length == 0 || digits[ 1 ].length == 0 
					|| digits[ 0 ].length > 5 || digits[ 1 ].length > 2  ) {
				alert( $.i18n.prop("com.msg_0010068")+rge+$.i18n.prop("com.msg_0010069") );
				return date;
			}
		} else {
			alert( $.i18n.prop("com.msg_0010068")+rge+$.i18n.prop("com.msg_0010069") );
			return date;
		}
		var year = eval( digits[ 0 ] );
		var month = eval( digits[ 1 ] );
		var day;
		if (digits.length == 3) {
			day = eval( digits[ 2 ] );
		}
		daysOfMonthInNormalYear = new Array( 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 );
		daysOfMonthInLeapYear = new Array( 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 );
		if ( month <= 0 || month > daysOfMonthInNormalYear.length ) {
			alert( $.i18n.prop("com.msg_0010070") );
			return date;
		}
		if (digits.length == 3) {
			if ( ( year % 4 ) == 0 && ( year % 100 ) != 0 || ( year % 400 ) == 0 ) {
				if ( day <= 0 || day > daysOfMonthInLeapYear[ month - 1 ] ) {
					alert( $.i18n.prop("com.msg_0010071") );
					return date;
				}
			} else {
				if ( day <= 0 || day > daysOfMonthInNormalYear[ month - 1 ] ) {
					alert( $.i18n.prop("com.msg_0010071") );
					return date;
				}
			}
		}
		if( month < 10){
			month = "0" + month;
		}
		if (digits.length == 3) {
			if( day < 10){
				day = "0" + day;
			}
			rge = year + delim + month + delim + day;
		} else {
			rge = year + delim + month;
		}
		return rge;
	}
	function __removeformatDate(date, rge) {
		date = date.split("/").join("").split("-").join("");
		return date;
	}
	function __setCheckSuccess(flg) {
		__isCheckSuccess = flg;
	}
	
	function __isCheckSuccessFun() {
		return __isCheckSuccess;
	}
	
	function __setMustCheckData(data, first) {
		if (first) {
			__mustCheckData = "";
		}
		__mustCheckData += data;
	}
	
	function __setItemCheckData(data, first) {
		if (first) {
			__itemCheckData = "";
		}
		__itemCheckData += data;
	}
	
	function __setWindowSize(width, height) {
		resizeTo(width, height);
	}
	function __getMustCheckData() {
		return __mustCheckData;
	}
	
	function __getItemCheckData() {
		return __itemCheckData;
	}
	
	function makeItemAttributesForSendData(element) {
		var result = "";
		var attributes;
		attributes = element.attributes;
		for (var i = 0; i < attributes.length; i++) {
			if (!attributes[i].name.indexOf(__WIDGET_PROPERTY_SAAS)) {
				result += jQuery.camelCase(attributes[i].name.substring(5)) + ":" + attributes[i].value + ";";
			} 
		}
		return result;
	}
	
	function makeItemAttributesForSpecData(element) {
		var result = "";
		var elements;
		var attributes;
		if (element.indexOf(":",0)>0) {
			elements = element.split(":");
			if (elements[1]=="*") {
				attributes = getObj(elements[0]).attributes;
				for (var i = 0; i < attributes.length; i++) {
					if (!attributes[i].name.indexOf(__WIDGET_PROPERTY_SAAS)) {
						result += jQuery.camelCase(attributes[i].name.substring(5)) + ":" + attributes[i].value + ";";
					} 
				}
			} else {
				result += elements[1] + ":" + $("#"+elements[0]).attr(__WIDGET_PROPERTY_SAAS+elements[1]) + ";";
			}
			return elements[0] + "=" + result;
		}
		return result;
	}	
	
	function getLabelText(id) {
		var obj = $(__JQUERY_SIGN_SUFFIX + id);
		if (obj[0].tagName == __WIDGET_TAGNAME_TABLE) {
			return $("td", obj).html();
		}
		return obj.html();
	}
	
	function __createUiButton(id) {
		$(__JQUERY_SIGN_SUFFIX + id).buttonset();
	}
	
	function __isServerExecute() {
		return __doServerExecuteFlag;
	}
	
	function __setServerExecute(flg) {
		__doServerExecuteFlag = flg;
	}
	
	function __fileDownload(url) {
		var i;
		try {
			var top=50;
			var left=100;
			var width=800;
			var height=width/1.6;
			var arrUrl = url.split(",");
			var p ="";
			for (i = 0; i < arrUrl.length; i++) {
				p = arrUrl[i];
				var nst= "/s/ExcelFile?f="+ p + "&downloadType=1";
				var OpenWindow=window.open(nst,"_blank","height="+height+",width="+width+",top="+top+",left="+left+",toolbar=no,menubar=no,scrollbars=yes, resizable=no,location=no,status=no");
			}	
		} catch (e) {
			alert('JS Error:'+e.message);
		}
	}
	
	function __fileDownloadEncry(url) {
		var i;
		try {
			var top=50;
			var left=100;
			var width=800;
			var height=width/1.6;
			var arrUrl = url.split(",");
			var p ="";
			for (i = 0; i < arrUrl.length; i++) {
				p = arrUrl[i];
				var nst= "/s/ExcelFile?f="+ p + "&downloadType=2";
				var OpenWindow=window.open(nst,"_blank","height="+height+",width="+width+",top="+top+",left="+left+",toolbar=no,menubar=no,scrollbars=yes, resizable=no,location=no,status=no");
			}	
		} catch (e) {
			alert('JS Error:'+e.message);
		}
	}
	
	
	function setItemAttributes(id, key, value) {
		$(__JQUERY_SIGN_SUFFIX + id).attr(__WIDGET_PROPERTY_SAAS + key, value);
	}
	
	function getItemAttributes(id, key) {
		return $(__JQUERY_SIGN_SUFFIX + id).attr(__WIDGET_PROPERTY_SAAS + key);
	}
	
	function loadingOn() {
		if ($(__CUSTOM_WIDGET_LOADING_AREA).length == 0) {
			$(__WIDGET_TAGNAME_BODY).append(createLoadingHtml());
			if ($(__CUSTOM_WIDGET_LOADING_AREA).length > 0) {
				$(__CUSTOM_WIDGET_LOADING_AREA).dialog({
					autoOpen: true,
					show: "drop",
					width: 420,
					height: 220,
					bgiframe: true,
					modal:true,
					resizable:false,
					closeOnEscape: false,
					open:function() {
						$(".ui-dialog-titlebar-close", $(this).parent()).hide();
					}
				});
			}
		}
	}
	
	function loadingOff() {
		if ($(__CUSTOM_WIDGET_LOADING_AREA).length > 0) {
			$(__CUSTOM_WIDGET_LOADING_AREA).hide();
			$(__CUSTOM_WIDGET_LOADING_AREA).remove();
		}
	}
	
	function getWindowParent() {
		var frameObj = window.parent;
		while(frameObj) {
			if (frameObj == frameObj.parent) {
				return frameObj;
			} else {
				frameObj = frameObj.parent;
			}
		}
		return frameObj;
	}
	
	function confirm(msg, fun) {
		iconfirm(msg, fun);
	}
	
	function createExclude(array) {
		if (array == null || array == undefined || array.length == 0) {
			return "";
		}
		var excludeDecribe = ":not(";
		for (var id in array) {
			excludeDecribe += __JQUERY_SIGN_SUFFIX + array[id] + ",";
		}
		excludeDecribe = excludeDecribe.substring(0, excludeDecribe.length - 1);
		excludeDecribe += ")";
		return excludeDecribe;
	}
	
	function __codeShow(el, pos, pageID, subId, msg, obj) {
		var childSubId = __findStaticTableCell(obj).attr("_csid");
		showTextOfRigthWin('6', pageID, childSubId) ;
	}
	
	function __findStaticTableCell(obj) {
		var selectRowObj = $(obj);
		while(!selectRowObj.hasClass("WF_STABLE_CLASS_TD") && !selectRowObj.hasClass("WF_STABLE_CLASS_TH") && !selectRowObj.hasClass("tableGuideClass")) {
			selectRowObj = selectRowObj.parent();
		}
		return selectRowObj;
	}
	
	function copyEvent() {
		copyReadyMap = new Object();
		copyItemArray = new Array();
		$("div.ui-selected").each(function() {
			var subId = $(this).attr("_h");
			var fromSubid = $(this).attr("_i");
			var itemID = $(this).attr("_f");
			var fieldName = $(this).attr("_o");
			var objKind = $(this).attr("_g");
			if (objKind == "42") {
				return;
			}
			if (copyReadyMap[subId] == null) {
				var objstr = subId +
					"," + fromSubid +
					"," + itemID +
					"," + fieldName +
					"," + objKind;
				copyItemArray.push(objstr);
				copyReadyMap[subId] = subId;
				
				var pairId = $(dragpairs).data(this.id);
				if (pairId !== null && pairId !== undefined && $(__JQUERY_SIGN_SUFFIX + pairId).length > 0) {
					var pairSubId = $(__JQUERY_SIGN_SUFFIX + pairId).attr("_h");
					var pairFromSubid = subId;
					var pairItemID = $(__JQUERY_SIGN_SUFFIX + pairId).attr("_f");
					var pairFieldName = $(__JQUERY_SIGN_SUFFIX + pairId).attr("_o");
					var pairObjKind = $(__JQUERY_SIGN_SUFFIX + pairId).attr("_g");
					if (copyReadyMap[pairSubId] == null) {
						var objstr = pairSubId +
							"," + pairFromSubid +
							"," + pairItemID +
							"," + pairFieldName +
							"," + pairObjKind;
						copyItemArray.push(objstr);
						copyReadyMap[pairSubId] = pairSubId;
					}
				}
			}
		});
	}
	
	function parseEvent() {
		if (copyItemArray.length == 0) {
			return;
		}
		var copystr = "";
		for (var i = 0; i < copyItemArray.length; i++) {
			copystr += copyItemArray[i] + __JQUERY_SIGN_SUFFIX;
		}
		var url = urlAddEdit + "?actid=100162";
		var params = "copystr=" + copystr + "&pageID=" + $("#PageID").val();
		getQAjaxRunJson("rstfld", false, 1, "", url, false, params, "onCopyEnd();");
	}
	
	
	function changePropertyEvent(type, count) {
		var objList = new Array();
		$("div.ui-selected").each(function() {
			var selectDiv = $(this);
			if (selectDiv.find(__STATIC_TABLE_CLASS).length > 0) {
				var selectTable = selectDiv.find(__STATIC_TABLE_CLASS);
				selectTable.find(".selected").each(function() {
					if ($(this).hasClass("WF_STABLE_CLASS_TH") || $(this).hasClass("WF_STABLE_CLASS_TD")) {
						var objs = getSameColumn($(this));
						var heightNum;
						
						if (type == "height") {
							objs = getSameTrColumn($(this));
							heightNum = parseInt(objs.height(), 10) + 1 + count;
						}
						var changeFlg = true;
						objs.each(function() {
							if (changeFlg) {
								var pro = parseInt($(this).width(), 10) + 1 + count;
								if (count > 0) {
									changeFlg = false;
								}
								if (type == "height") {
									pro = heightNum;
								}
								if (type == "height") {
									$(this).height(pro);
								} else {
									$(this).width(pro);
								}
							}
						});
						$(this).each(function(){
							$(this).find("input[type=text]")
								.width($(this).width()-10)
								.height($(this).height()-10);
							$(this).find("select")
								.width($(this).width()-10)
								.height($(this).height()-10);
							$(this).find("input[type=button]")
								.width($(this).width()-30)
								.height($(this).height()-20);							
							$(this).find("textarea")
								.width($(this).width()-10)
								.height($(this).height()-10);
						});
						if ($.ui.ie && type == "height") {
							var selectTablePro = parseInt(objs.parent().css(type), 10);
							objs.parent().css(type, (selectTablePro + count) + "px");
						}
						if (type != "height") {
							var selectTablePro = parseInt(selectTable.css(type), 10);
							selectTable.css(type, (selectTablePro + count) + "px");
						}
						var selectDivPro = parseInt(selectDiv.css(type), 10);
						selectDiv.css(type, (selectDivPro + count) + "px");
					}
				});
			} else {
				var paramObj = new Object();
				paramObj[type] = $(this).css(type);
				objList.push(addOperatorHistory(this.id, __SET_PROPERTY_OPERATOR_TYPE, paramObj));
				var width = parseInt($(this).css(type)) + count;
				$(this).css(type, width);
				$(this).children(":first").css(type, width);
			}
			$(this).attr("_e","1");
			$('#WF_CHANGEFLG').val("1");
		});
		addOperatorHistoryList(objList);
	}
	
	function onkeydownEvent(e) {
		var isInput = false;
		var nodeObj = event.srcElement;
		var nodeName = event.srcElement.nodeName;
		if (nodeName != undefined && nodeName != null) {
			nodeName = nodeName.toUpperCase();
		}
		var nodeType = event.srcElement.type;
		if (nodeType != undefined && nodeType != null) {
			nodeType = nodeType.toUpperCase();
		}
		if ((nodeName == __WIDGET_TAGNAME_INPUT && nodeType == "TEXT" && !$("#"+nodeObj.id).attr("_ucs")) 
				|| nodeName == "TEXTAREA" || $('#PropertyDiv' ).dialog(__DIALOG_STATUS_OPEN)) {
			isInput = true;
		}
		switch (e.keyCode) {
		
		case 13:/*enter*/
			if (e.ctrlKey) {
				if (!openStaticTableProDiv()) {
					return false;
				}
			}
			break;
		case 27:/*escape*/
			$("div.ui-selected", $("#target")).removeClass(".ui-selected").removeClass("ui-selected");
		case 37:/*left*/
			if (!isInput) {
				if (e.altKey) {
					changePropertyEvent("width", -1);
				} else {
					if (e.shiftKey) {
						changeLeftStepNumber = 1;
					} else {
						changeLeftStepNumber = WIDGET_COORDINATE_LEFT_GAP;
					}
					decreaseLeftEvent();
				}
				return false;
			}
		case 38:/*up*/
			if (!isInput) {
				if (e.altKey) {
					changePropertyEvent("height", -1);
				} else {
					if (e.shiftKey) {
						changeTopStepNumber = 1;
					} else {
						changeTopStepNumber = WIDGET_COORDINATE_TOP_GAP;
					}
					decreaseTopEvent();
				}
				return false;
			}
		case 39:/*right*/
			if (!isInput) {
				if (e.altKey) {
					changePropertyEvent("width", 1);
				} else {
					if (e.shiftKey) {
						changeLeftStepNumber = 1;
					} else {
						changeLeftStepNumber = WIDGET_COORDINATE_LEFT_GAP;
					}
					increaseLeftEvent();
				}
				return false;
			}
		case 40:/*down*/
			if (!isInput) {
				if (e.altKey) {
					changePropertyEvent("height", 1);
				} else {
					if (e.shiftKey) {
						changeTopStepNumber = 1;
					} else {
						changeTopStepNumber = WIDGET_COORDINATE_TOP_GAP;
					}
					increaseTopEvent();
				}
				return false;
			}
		case 46:/* del*/	
			if (!isInput) {
				delConfirm('1');
				return false;
			}
		case 65: /*ctrl + a*/
			if (e.ctrlKey) {
				
				$("div.dragAble",$("#target")).addClass(".ui-selected").addClass("ui-selected");
				$("div.dragAble", $("div.WF_TAB_CLASS","#target")).removeClass(".ui-selected").removeClass("ui-selected");
				return false;
			} 
		case 67:/* ctrl + c*/
			if (!isInput) {
				if (e.ctrlKey) {
					copyEvent();
				}
			}
			break;
		case 78:/* ctrl + n*/
			if (e.ctrlKey || e.altKey) {
				addObjWin('P00298');
				return false;
			}
			break;
		case 83:/* ctrl + s*/
			if (e.ctrlKey) {
				if (!$('#logDialog').dialog(__DIALOG_STATUS_OPEN)) {
					if ($("#iconSave").css("display") != "none") {
						$('#logDialog').dialog('open');
					}
				} else {
					designSaveSkip();
				}
				return false;
			} else if (e.altKey) {
				//$('#altSFlg').val("1");
				designSaveSkip();
			}
		case 86:/* ctrl + v*/
			if (!isInput) {
				if (e.ctrlKey) {
					parseEvent();
				}
			}
			break;
		case 89:// ctrl + y
			if (!isInput) {
				if (e.ctrlKey) {
					operatorRedo();
				}
			}
			break;
		case 90:/* ctrl + z*/
			if (!isInput) {
				if (e.ctrlKey) {
					operatorRollback();
				}
			}
			break;
		case 113:/* F2*/
			if ($("div.ui-selected.dragAble[class*=multiDragAble1][_g!='35'][_g!='42']").length == 1) {
				widgetEdit(getObjOnlySelected());
			}
			return false;
		case 114:/* F3*/
			if (!openStaticTableProDiv()) {
				return false;
			}
			break;
		case 116:/* F5*/
			regetHO('0', false, true);
			return false;

		default:
			break;
		}
	}
	
	function getSameColumn(obj, index) {
		if (index == undefined) {
			index = obj.attr("_index");
		}
		return obj.parent().parent().parent().find("th.WF_STABLE_CLASS_TH[_index="+index+"],th.rowGuideClass[_index="+index+"],td.WF_STABLE_CLASS_TD[_index="+index+"]");
	}
	
	function getSameColumnByUser(id, index) {
		return $(__JQUERY_SIGN_SUFFIX + id).parent().parent().find("th.WF_STABLE_CLASS_TH[_index="+index+"],td.WF_STABLE_CLASS_TD[_index="+index+"]");
	}
	
	function getSameHeadColumnByUser(id, index) {
		return $(__JQUERY_SIGN_SUFFIX + id + "_HEADER").find("th.WF_STABLE_CLASS_TH[_index="+index+"]");
	}
	
	function __onScrollEventListener() {
		$(document).scroll(function() {
			$("#glayoutFrame").css(__STYLE_TYPE_TOP, (SF.pageSize()[5]));
		});
	}
	
	function __onChosenEventListener() {
		$("." + CHOSEN_DROPDOWNLIST_STYLE + ":not(.select2-container)").each(function() {
			if ($(this).attr("add_search_key_moudle")) {
				$(this).select2({add_search_key_moudle:true});
			} else {
				$(this).select2();
			}
			var border = document.getElementById($(this)[0].id).style.border;
			$(this).siblings().children("a.select2-choice").css("border",border);
			$(this).siblings().css("border","");
			var fun = $(this).attr("_fun");
			if (fun) {
				$(this).on("change", function() {
					if (fun.indexOf("F") == 0) {
						if (fun.indexOf("\"") != -1) {
							fun = fun.replaceAll("(", "").replaceAll(")", "").replaceAll(";", "");
							var funs = fun.split("\"");
							window[funs[0] + funs[2]](funs[1]);
						} else {
							if (fun.indexOf("(") == fun.indexOf(")")-1) {
								fun = fun.replaceAll("(", "").replaceAll(")", "").replaceAll(";", "");
								window[fun]();
							} else {
								var param  = fun.substring(fun.indexOf("(")+1, fun.indexOf(")"));
								fun = fun.replaceAll(param, "").replaceAll("(", "").replaceAll(")", "").replaceAll(";", "");
								window[fun](param);
							}
						}
					} else {
						eval(fun);
					}
				});
			}
		});
	}
	
	function __onKeyEventListener() {
		$(document).keydown(onkeydownEvent);
	}
	
	function __each(options, sign) {
		var ret = "";
		$.each(options, function(i, name) {
			ret += name + sign;
		});
		return ret.substring(0, ret.length - 1);
	}
	
	function doOperation(moveIndex) {
		console.log("operatorHistoryIndex:" + operatorHistoryIndex);
		var objList = operatorHistoryArray[operatorHistoryIndex];

		for (var i = 0; i < objList.length; i++) {
			var operatorObj = objList[i];
			var type = operatorObj.type;
			switch (type) {
			case __SET_PROPERTY_OPERATOR_TYPE:
				var operatorParam = operatorObj.param;
				for ( var param in operatorParam) {
					$(__JQUERY_SIGN_SUFFIX + operatorObj.id).css(param, operatorParam[param]);
					if (__WIDTH_HEIGHT_REG.test(param)) {
						$(__JQUERY_SIGN_SUFFIX + operatorObj.id).children(":first").css(param, operatorParam[param]);
					}
				}
				break;
			case __SET_SERVER_OPERATOR_TYPE:
					
				wf_moveHis($("#PageID").val(), operatorObj.id);

				break;
			default:
				break;
			}
		}
			
	}
	
	function operatorRedo() {
		var moveIndex = -1;
		if (operatorHistoryIndex == operatorHistoryArray.length - 1) {
			return;
		} else {
			operatorHistoryIndex++;
			moveIndex = 1;
		}
		doOperation(moveIndex);
	}
	
	function operatorRollback() {
		var moveIndex = -1;
		if (operatorHistoryIndex < 0) {
			return;
		} else if (operatorHistoryIndex == 0) {
			moveIndex = 0;
		} else {
			operatorHistoryIndex--;
			moveIndex = 0;
		}
		doOperation(moveIndex);
		

	}
	
	function delPreviousOperator() {
		console.log("before del: " + operatorHistoryArray.length);
		if (operatorHistoryArray.length > 0) {
			operatorHistoryArray.splice(operatorHistoryArray.length - 1, 1);
		}
		operatorHistoryIndex--;
		console.log("after del: " + operatorHistoryArray.length);
	}
	function getOperatorHistoryLen() {
		return operatorHistoryArray.length;
	}
	function getOperatorHistory() {
		return operatorHistoryArray;
	}
	function setServerHistoryIndex(idx) {
		serverHistoryIndex = idx;
		console.log("serverHistoryIndex:" + serverHistoryIndex);
	}
	function getServerHistoryIndex() {
		return serverHistoryIndex;
	}
	function setServerCurrentHistoryIndex(idx) {
		serverCurrentHistoryIndex = idx;
		console.log("serverCurrentHistoryIndex:" + serverCurrentHistoryIndex);
	}
	function getServerCurrentHistoryIndex() {
		return serverCurrentHistoryIndex;
	}
	function addOperatorHistory(id, type, operatorParam) {
		var operatorObj = new Object();
		operatorObj.id = id;
		operatorObj.type = type;
		switch (type) {
		case __SET_PROPERTY_OPERATOR_TYPE:
			operatorObj.param = operatorParam;
			break;

		default:
			break;
		}
		return operatorObj;
	}
	
	function addOperatorHistoryList(objList) {
		if (operatorHistoryIndex < operatorHistoryArray.length - 1) {
			operatorHistoryArray.splice(operatorHistoryIndex + 1, operatorHistoryArray.length - 1 - operatorHistoryIndex);
		}
		operatorHistoryArray.push(objList);
		operatorHistoryIndex = operatorHistoryArray.length - 1;
		console.log("operatorHistoryIndex:" + operatorHistoryIndex);
		console.log(operatorHistoryArray);
	}

	function clearOperatorHistoryArray() {
		operatorHistoryArray = new Array();
		operatorHistoryIndex = -1;
	}
	
	function decreaseTopEvent() {
		var objList = new Array();
		$("div.ui-selected").each(function() {
			adjustWidgetTopCoordinate(this, -1, objList);
			$(this).attr("_e","1");
			$('#WF_CHANGEFLG').val("1");
		});
		addOperatorHistoryList(objList);
	}
	
	function increaseTopEvent() {
		var objList = new Array();
		$("div.ui-selected").each(function() {
			adjustWidgetTopCoordinate(this, 1, objList);
			$(this).attr("_e","1");
			$('#WF_CHANGEFLG').val("1");
		});
		addOperatorHistoryList(objList);
		console.log("end: " + getOperatorHistoryLen());
		console.log(getOperatorHistory());

	}
	
	function adjustWidgetTopCoordinate(obj, operation, objList) {
		var top = parseInt($(obj).css(__STYLE_TYPE_TOP)) + WIDGET_COORDINATE_TOP_GAP * operation / changeTopStepNumber;
		objList.push(addOperatorHistory(obj.id, __SET_PROPERTY_OPERATOR_TYPE, {"left" : $(obj).css(__STYLE_TYPE_LEFT), "top" : top }));
		$(obj).css(__STYLE_TYPE_TOP, top);
		if (changeTopStepNumber == 1) {
			adjustWidgetCoordinate($(obj));
		}
		var pairId = __JQUERY_SIGN_SUFFIX + $(dragpairs).data(obj.id);
		if ($(pairId).length > 0) {
			top = parseInt($(pairId).css(__STYLE_TYPE_TOP)) + WIDGET_COORDINATE_TOP_GAP * operation / changeTopStepNumber;
			objList.push(addOperatorHistory($(dragpairs).data(obj.id), __SET_PROPERTY_OPERATOR_TYPE, {"left" : $(obj).css(__STYLE_TYPE_LEFT), "top" : top}));
			$(pairId).css(__STYLE_TYPE_TOP, top);
			if (changeTopStepNumber == 1) {
				adjustWidgetCoordinate($(pairId));
			}
		}
	}

	function decreaseLeftEvent() {
		var objList = new Array();
		$("div.ui-selected").each(function() {
			adjustWidgetLeftCoordinate(this, -1, objList);
			$(this).attr("_e","1");
			$('#WF_CHANGEFLG').val("1");
		});
		addOperatorHistoryList(objList);
	}
	
	function increaseLeftEvent() {
		var objList = new Array();
		$("div.ui-selected").each(function() {
			adjustWidgetLeftCoordinate(this, 1, objList);
			$(this).attr("_e","1");
			$('#WF_CHANGEFLG').val("1");
		});
		addOperatorHistoryList(objList);
	}
	
	function adjustWidgetLeftCoordinate(obj, operation, objList) {
		var left = parseInt($(obj).css(__STYLE_TYPE_LEFT), 10) + WIDGET_COORDINATE_LEFT_GAP * operation / changeLeftStepNumber;
		objList.push(addOperatorHistory(obj.id, __SET_PROPERTY_OPERATOR_TYPE, {"left" : left, "top" : $(obj).css(__STYLE_TYPE_TOP)}));
		$(obj).css(__STYLE_TYPE_LEFT, left);
		if (changeLeftStepNumber == 1) {
			adjustWidgetCoordinate($(obj));
		}
		var pairId = __JQUERY_SIGN_SUFFIX + $(dragpairs).data(obj.id);
		if ($(pairId).length > 0) {
			left = parseInt($(pairId).css(__STYLE_TYPE_LEFT)) + WIDGET_COORDINATE_LEFT_GAP * operation / changeLeftStepNumber;
			objList.push(addOperatorHistory($(dragpairs).data(obj.id), __SET_PROPERTY_OPERATOR_TYPE, {"left" : left, "top" : $(obj).css(__STYLE_TYPE_TOP)}));
			$(pairId).css(__STYLE_TYPE_LEFT, top);
			if (changeLeftStepNumber == 1) {
				adjustWidgetCoordinate($(pairId));
			}
		}
	}

	function getSameColumn(obj, index) {
		if (index == undefined) {
			index = obj.attr("_index");
		}
		return obj.parent().parent().parent().find("th.WF_STABLE_CLASS_TH[_index="+index+"],th.rowGuideClass[_index="+index+"],td.WF_STABLE_CLASS_TD[_index="+index+"]");
	}
	
	function getSameColumnByUser(id, index) {
		return $(__JQUERY_SIGN_SUFFIX + id).parent().parent().find("th.WF_STABLE_CLASS_TH[_index="+index+"],td.WF_STABLE_CLASS_TD[_index="+index+"]");
	}

	function getSameTrColumn(obj) {
		return obj.parent().children();
	}

	function widgetEdit(obj) {
		if (!s_draged&&!s_resized) {
			obj.attr("_e","1");
			$('#WF_CHANGEFLG').val("1");
    
			var $c = $("span,input:button,legend,label",obj);
			if( $c.length && !( $("input:text",$c).length) ){ 
				if ($c.get(0).tagName.toLowerCase()=="td" && obj.attr("_i")=='-1'){//string
					w = obj.width();
				} else if ($c.get(0).tagName.toLowerCase()=="legend") {
					w = $c.width();
					if (w<50)w=50;
				} else {
					w = $c.parent().width();
				}
				if ($c.get(0).tagName.toLowerCase()=="td" && obj.attr("_i")=='-1'){//string
					h = obj.height();
				} else if ($c.get(0).tagName.toLowerCase()=="span") {
					h = $c.height()-4;
				} else if ($c.get(0).tagName.toLowerCase()=="legend") {
					h = $c.height()+4;
					if (h<23)h=23;
				} else {
					h = $c.parent().height();
				}
				l = getObjectParentByTagname(obj,"div")[0].offsetLeft+20;
				t = getObjectParentByTagname(obj,"div")[0].offsetTop+20;
				
				
				var v;
				if ($c.get(0).tagName.toLowerCase()=="label" && obj.attr("_i")=='-1'){//string
					v = $c.html();
					if (h<200) h=200;
					if (w<250) w=250;
					if (!$('#StrDiv' ).dialog(__DIALOG_STATUS_OPEN)) {
						$('#StrDiv' )
							.dialog( 'option','height',h+120)
							.dialog( 'option','width',w+40)
							.dialog( 'option',__STYLE_TYPE_POSITION,[l,t])
							.dialog( 'option','title',obj.attr("_o")+$('#StrDiv' ).dialog( 'option','title'))
							.dialog( 'option','buttons',
								[{
								 	text: "OK",
							        click: function() {
										/*var s = escapeHtml($(this).find('textarea').val());*/
							        	var s = escapeHtmlWithTag($(this).find('textarea').val());
										$c.html(s);
										$(this).dialog("close");
									},
									height:28},{
									text: "Cancel",
									click: function() {
											$(this).dialog("close");
										},
									height:28}
							    ]);
						$('#StrDiv').html('<textarea>'+ escapeText(v) +'</textarea>')
									.find('textarea')
									.css({width:w, height:h})
									.keydown(function(evt) {
										if (evt.keyCode == 13 && evt.ctrlKey) {
											var s = escapeHtml($(this).val());
											$c.html(s);
											$('#StrDiv').dialog("close");
											return false;
										}
									});
						$('#StrDiv').dialog('open' );
					}
				} else if ($c.get(0).tagName.toLowerCase()=="span" 
							|| $c.get(0).tagName.toLowerCase()=="legend"
							|| $c.get(0).tagName.toLowerCase()=="label") {//label or legend
					v = $c.text();
					if (obj.attr("_c")=="1") {
						v=v.substring(0,v.length-2);
					}
					$c.html('<input type="text" value="'+ v +'" style="min-width:'+w+'px; max-width:'+obj.width()+'px"/>')
						.find('input:text').focus()
						.blur(function(){
							v = $(this).val();
							if (getObjectParentByTagname($(this),"div").attr("_c")=="1") {
								/*required item*/
								$c.html(v+requiredmark);
							} else {
								$c.html(v);
							}
						}).keydown(function(evt) {
							if (evt.keyCode == 27 || evt.keyCode == 13) {
								$(this).blur();
								return false;
							}
						});
					$("input:text",$c).outerWidth(w);
					$("input:text",$c).outerHeight(h).textGrow({ pad: 5 });
					$("input:text",$c).focus().select();
				} else {//button
					s = $c.parent().html();
					if ($c.get(0).tagName == __WIDGET_TAGNAME_INPUT) {
						v =$c.val();
					} else {
						v = $c.html();
						
					}
					var $d = $c.parent();
					$d.html('<input type="text" value="'+v +'" style="min-width:'+w+'px;max-width:'+obj.width()+'px"/>')
						.find('input:text').focus()
						.blur(function(){
							v = $(this).val();
							/*remove input*/
							$d.html(s);
							$(__WIDGET_TAGNAME_INPUT,$d).val(v);
						}).keydown(function(evt) {
							if (evt.keyCode == 27 || evt.keyCode == 13 ) {
								$(this).blur();
								return false;
							}
						});
					if (w<25)
						$("input:text",$d).outerWidth(25);
					else 
						$("input:text",$d).outerWidth(w);
					$("input:text",$d).outerHeight(h).textGrow({ pad: 10 }); 
					$("input:text",$d).focus().select();
					
				}
				
			}
		} else {
			s_resized = false;
			s_draged = false;
		}
	}
	
	function __getFrameDocuments(frameName) {
		var frameObjJson = new Array();
		if (frameName != undefined) {
			frameObjJson[0] = $(window.parent.frames[frameName].document);
		} else {
			__getFrameDocumentsByType("frame").each(function (index) {
				frameObjJson[index] = $(this.contentWindow.document);
			});
		}
		return frameObjJson;
	}
	
	function __getFrameDocumentsByType(frameType) {
		return $(window.parent.frames.document).find(frameType);
	}
	
	function __initHeaderHide() {
		if (sessionStorage.getItem("showFlg") == "0") {
			__getFrameDocumentsByType("frameset").attr("rows", "0, *");
			$("#WF_MENU_TR").hide();
			$("#menuShowAndHide").val("show");
			$("div[id^=dragB]", $("#target")).each(function() {
				$(this).css("top", parseInt($(this).css("top"),10) - 35);
			});
		}
	}

	function __headerShowAndHide() {
		if (sessionStorage.getItem("showFlg") == null || sessionStorage.getItem("showFlg") == ""
				|| sessionStorage.getItem("showFlg") == "1") {
			__getFrameDocumentsByType("frameset").attr("rows", "0, *");
			$("#WF_MENU_TR").hide();
			sessionStorage.setItem("showFlg", "0");
			$("#menuShowAndHide").attr("show", "0").val("show");
			$("div[id^=dragB]", $("#target")).each(function() {
				$(this).css("top", parseInt($(this).css("top"),10) - 35);
			});
		} else {
			__getFrameDocumentsByType("frameset").attr("rows", "81, *");
			$("#WF_MENU_TR").show();
			sessionStorage.setItem("showFlg", "1");
			$("#menuShowAndHide").attr("show", "1").val("hide");
			$("div[id^=dragB]", $("#target")).each(function() {
				$(this).css("top", parseInt($(this).css("top"),10) + 35);
			});
		}
	}

	function __setEvnThemeStyle(filePath, frameName) {
		var frameDocuments = __getFrameDocuments(frameName);
		if (frameDocuments != undefined && frameDocuments.length > 0) {
			for (var i = 0; i < frameDocuments.length; i++) {
				var frameObj = frameDocuments[i];
				__setThemeStyle(
						frameObj.find("link.evnThemeStyleLink"),
						filePath,
						frameObj.find("body"));
			}
		} else {
			__setThemeStyle(
					$("link.evnThemeStyleLink"),
					filePath,
					$("body")
					);
		}
	}
	
	function __setThemeStyle(evnThemeStyleLinkObj, filePath, tbodyObj) {
		if (evnThemeStyleLinkObj.length > 0) {
			evnThemeStyleLinkObj.attr("href", filePath);
		}
		tbodyObj.addClass("ui-widget-content");
	}
	
	function __setGradientBgDblColor($obj, gradientType, direction, startPosition, endPosition, startColor, endColor) {
		$obj.css({
			"FILTER" : "progid:DXImageTransform.Microsoft.Gradient(gradientType=" + gradientType + ", startColorStr=" + startColor + ", endColorStr=" + endColor + ")", /*IE6 7 8*/
			"background" : "-ms-linear-gradient(" + direction + ", " + startColor + ", " + endColor + ")", /*IE10*/
			"background" : "-moz-linear-gradient(" + direction + ", " + startColor + ", " + endColor + ")", /*firefox*/
			"background" : "-webkit-gradient(linear, " + startPosition + ", " + endPosition + ", " + startColor + ", to(" + endColor + "))", /*Safari4~5Chrome1~9*/
			"background" : "-webkit-linear-gradient(" + direction + ", " + startColor + ", " + endColor + ")", /*Safari5.1, Chrome10+*/
			"background" : "-o-linear-gradient(" + direction + ", " + startColor + ", " + endColor + ")" /*Opera11.10+*/
		});
	}

	function __setMenuEvent() {
		$("ul.sub_menu")
		.menu()
		.hide();
		
		var $lvlone = $("td.lvlone");
		
		$lvlone
		.mouseover(function () {
			var _this = $(this);
			_this.children("ul").show();
			_this.addClass("ui-state-focus");
		}).mouseleave(function () {
			var _this = $(this);
			
			var ulObj = _this.children("ul");
			ulObj.hide();
			ulObj.find("li a").removeClass("ui-state-active");
			
			_this.removeClass("ui-state-focus");
		});
		
		$lvlone.each(function () {
			var $liObj = $("li.lvltwo", $(this));
			var liObjLength = $liObj.length;
			if (liObjLength > 1) {
				$liObj.each(function (index) {
					var _this = $(this);
					if (index < liObjLength - 1) {
						_this.addClass("ui-menu-item-border");
					}

					__setLvloneBottomBorder(_this);
				});
			} else {
				__setLvloneBottomBorder($(this));
			}
		});
	}
	
	function __setLvloneBottomBorder($obj) {
		var $liObj = $("li.ui-menu-item", $obj);
		var liObjLength = $liObj.length;
		if (liObjLength > 1) {
			$liObj.each(function (index) {
				if (index < liObjLength - 1) {
					$(this).addClass("ui-menu-item-border");
				}
			});
		}
	}
	
	function __getSelect2DisplayObj($dropDownListObj) {
		return $dropDownListObj.siblings(".select2-container").find("a span.select2-chosen");
	}
	
	function __setOptionStyleBySelect($o) {
		var tagName = $o[0].tagName.toLowerCase();
		var selectObj = $o;
		if ("select" != tagName) {
			selectObj = $o.find("select.editable");
		}
		if (selectObj.length > 0) {
			var optionObj = selectObj.find("option");
			optionObj.attr("style", selectObj.attr("style"));
		}
	}
	
	function __getPrecisionTime(timeStr) {
		var timeArray = timeStr.split(":");
		var precisionTime = 0;
		if (timeArray.length <= 3) {
			for (var i = timeArray.length - 1; i >= 0; i--) {
				precisionTime += parseInt(timeArray[timeArray.length - (i + 1)], 10) * Math.pow(60, i);
			}
		}
		return precisionTime;
	}
	
	function __isTimeAfter(targetTime, compareTime) {
		var isTimeAfter = false;
		if (targetTime && "" != $.trim(targetTime) && compareTime && "" != $.trim(compareTime)) {
			isTimeAfter = __getPrecisionTime(targetTime) > __getPrecisionTime(compareTime);
		}
		return isTimeAfter;
	}
	
	function __getTimeDifference(currentTime, targetTime, digit) {
		return parseFloat(((__getPrecisionTime(currentTime) - __getPrecisionTime(targetTime)) / Math.pow(60, currentTime.split(":").length - 1)).toFixed(digit), 10);
	}
	
	function __setJSByScriprFile(scriptFile) {
		var script = document.createElement('script');
		script.src = scriptFile;//'/js/jipdec/jipdec.js';
		script.type = 'text/javascript';
		document.getElementsByTagName('head')[0].appendChild(script);
	}
	
	function __setJSByScriprFile(scriptFile) {
		var script = document.createElement('script');
		script.src = scriptFile;//'/js/jipdec/jipdec.js';
		script.type = 'text/javascript';
		document.getElementsByTagName('head')[0].appendChild(script);
	}
	
	function __getTimeMinute(time) {
	    var hour = time.split(":")[0];
	    var minute = time.split(":")[1];
	    return parseInt(hour, 10) * 60 + parseInt(minute, 10);
	}
	
	function __getHHmm(minutes) {
	    if (minutes == "") {
	      return "";
	    }
	    var hh = Math.floor(minutes/60);
	    var mm = minutes - hh * 60;
	    var mmlbl = "", hhlbl = "";
	    if (mm < 10) {
	      mmlbl = "0" + mm;
	    } else {
	      mmlbl = mm;
	    }
	    if (hh < 10) {
	    	hhlbl = "0" + hh;
	    } else {
	    	hhlbl = hh;
	    }
	    return hhlbl + ":" + mmlbl;
	    
	}

	function __isMobile() {
		return __mobileFlg;
	}

	function __isIos() {
		return __iosFlg;
	}
	
	function __isAndroid() {
		return __androidFlg;
	}
	SF.extend(_constants);
	SF.extend(_operatorHistory);
	SF.extend(_keyListener);
	SF.extend(_createHtmlObject);
	SF.extend(_functionForUserMenu);
	SF.extend(_utilFunction);
	SF.extend(_htmlrightFunction);
	window.SF = SF;
})(window);