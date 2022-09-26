//var l  = (navigator.userLanguage||navigator.browserLanguage||navigator.language).substr(0,2);
var l = $.cookie("wf_saasforce_lang");
jQuery.i18n.properties({
	  name:'wonderrobot',
	  path:'../static/js/i18n/',
	  mode:'both',
	  language:l,
	  cache: true,
	  callback:function(){
	  }
});

function setVariousVal(id, val) {
	if (getObj(id).type=="checkbox") {
		setCheckBoxCheck(id, id, val);
	} else if (getObj(id).type=="radio") {
		setRadioValue(val, id);
	} else {
		$("#"+id).val(val);
	}
}
function resizeRadio() {
	//radio
	//return;
	$("#target div.wf_radio").each(function(){

		var _this = $(this);
		
		if (_this.find('table:not(".WF_STABLE_CLASS")').get(0)
				|| _this.parent("th.WF_STABLE_CLASS_TH").length > 0
				|| _this.parent("td.WF_STABLE_CLASS_TD").length > 0) {
			return;
		}
		if (!_this.find('table').get(0)) {
				var radioArr = _this.find('input[type="radio"]');
				var radioHeight = radioArr.eq(0).height();
				var radioDivObj = radioArr.parents("div.userDiv");
				if (radioDivObj.length == 0) {
					radioDivObj = _this;
				}
				var divHeight = radioDivObj.height();
				var spanArr = _this.find('span');
				var brArr = _this.find('br');
				if (radioArr.length > 0 && radioArr.length == spanArr.length && radioArr.attr("_gid") == undefined) {
					if (brArr.length == 0) {
						//横
						var allWidth = radioDivObj.width();
						var itemWidth = 0;
						var splitWidth = 0;
						var itemSplitWidth = 3;
						for (var m = 0;m < radioArr.length;m++) {
							itemWidth += radioArr.eq(m).width() + spanArr.eq(m).width() + itemSplitWidth;
						}
						splitWidth = (allWidth - itemWidth) / (radioArr.length);
						if (splitWidth<4) {
							splitWidth = 4;
						}
						var leftSpanprev = 0;
						var leftRadio = 0;
						var leftSpan = 0;
						var radioTop = (divHeight - radioHeight) / 2;
						for (var m = 1;m < radioArr.length;m++) {
							leftRadio = $(radioArr[m-1]).position().left + radioArr.eq(m-1).width() + spanArr.eq(m-1).width() + splitWidth;
							leftSpan = leftRadio + radioArr.eq(m).width() + itemSplitWidth;
							radioArr.eq(m).css({'top':radioTop+"px",'left':leftRadio+"px",'position':'absolute'});
							spanArr.eq(m).css({'top':radioTop+"px",'left':leftSpan+"px",'position':'absolute'});
							//spanArr.eq(m).css({'left':leftSpan+"px",'position':'absolute'});
						}
						radioArr.eq(0).css({'top':radioTop+"px",'left':0+"px",'position':'absolute'});
						//spanArr.eq(0).css({'top':"0px",'left':radioArr.eq(0).width() + itemSplitWidth+"px",'position':'absolute'});
						spanArr.eq(0).css({'top':radioTop+"px",'left':radioArr.eq(0).width() + itemSplitWidth+"px",'position':'absolute'});
					} else if (brArr.length == radioArr.length) {
						//縦
						var allHeight = radioDivObj.height();
						var itemHeight = 10;
						var splitHeight = (allHeight - itemHeight) / brArr.length;
						spanArr.eq(0).css({'height':splitHeight+'px','padding-left':'2px'});
						for (var m = 1;m < radioArr.length;m++) {
							spanArr.eq(m).css({'height':splitHeight+'px','padding-left':'2px'});
						}
/*						var allHeight = $(this).height();
						var itemHeight = 15;
						var splitHeight = (allHeight - itemHeight * radioArr.length) / brArr.length - 5;
						for (var m = 1;m < radioArr.length;m++) {
							var topRadio = $(radioArr[m-1]).position().top + itemHeight + splitHeight;
							var topSpan = topRadio + 4;
							radioArr.eq(m).css({'top':topRadio+"px",'position':'absolute'});
							spanArr.eq(m).css({'top':topSpan+"px",'left':"20px",'position':'absolute'});
						}*/
					}
				}
			}
	});
}

function doTraceFlg(traceFlgStr1, traceFlgStr2) {
	if (getObj("runMode").value=="0")
		getObj("runMode").value="1";
	else	
		getObj("runMode").value="0";
	
	var url = urlUserDelete+"?actid=400001&runMode="+getObj("runMode").value;
	getQAjaxRunJson("rstfld",false,1,"",url,false,"","changeRunMode('" + traceFlgStr1 + "', '" + traceFlgStr2 + "');");
}
function changeRunMode(traceFlgStr1, traceFlgStr2) {
	if (getObj("runMode").value=="0") {
		$("#traceflgstr").html(traceFlgStr1);
		$("#outtrace").attr("src","/images/main/icon2-1.png");
		$("#traceflg, #traceout").css("opacity", .5);
		$("#traceout")
		.attr("disabled", "disabled")
		.css({
			cursor: "default",
			textDecoration: "none"
		});
		$("#traceout").parent("li").css("border", "none");
	} else {
		$("#traceflgstr").html(traceFlgStr2);
		$("#outtrace").attr("src","/images/main/icon2.png");
		$("#traceflg, #traceout").css("opacity", "");
		$("#traceout")
			.removeAttr("disabled")
			.removeAttr("style");
		$("#traceout").parent("li").removeAttr("style");
	}
}
function outFileAjax(v) {
	var top=50;
	var left=100;
	var width=800;
	var height=width/1.6;

	if (v == "2") {
		if ($("#traceout").prop("disabled") == false) {
			var nst="/s/trace";
			var OpenWindow=window.open(nst,"pretarget","height="+height+",width="+width+",top="+top+",left="+left+",toolbar=no,menubar=no,scrollbars=yes, resizable=yes,location=no,status=no");
		}
	} else {
		var nst="/s/UserLogFile";
		var OpenWindow=window.open(nst,"pretarget","height="+height+",width="+width+",top="+top+",left="+left+",toolbar=no,menubar=no,scrollbars=yes, resizable=yes,location=no,status=no");
		
	}
}