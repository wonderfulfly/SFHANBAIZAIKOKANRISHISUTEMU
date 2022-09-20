var s_draged = false;
var s_resized = false;
var s_selected = false;
var s_status = 0;//0:select; 1:drap; 2:resize
var dragpairs  = {};
var oriLeft = {};
var oriTop = {};
/*add Drag objectt with handler*/
function changeStatus() {
	if (s_status==2) {
		s_status = 0;
	} else {
		s_status = s_status + 1;
	}
	if (s_status==0) {
		s_draged = false;
		$("div.dragAble").css("background", "");
		$("div.dragAble").draggable("destroy");
		$("div.dragAble").resizable("destroy");
		$("div.dragAble").selectable("enable");
		$("div.status_icon").html("status-select");
		$("div.status_icon").css({ background:"", color: "white"});
	} else if (s_status==1) {
		s_draged = true;
		$("div.dragAble").css("background", "red");
		$("div.dragAble").selectable("disable");
		$("div.dragAble").resizable("destroy");
		initDragableFun();
		$("div.status_icon").html("status-drag");
		$("div.status_icon").css({ background:"red", color: "white"});
	} else if (s_status==2) {
		s_draged = true;
		$("div.dragAble").css("background", "green");
		$("div.dragAble").selectable("disable");
		$("div.dragAble").draggable("destroy");
		initResizableFun();
		resizeRadio();
		$("div.status_icon").html("status-resize");
		$("div.status_icon").css({ background:"green", color: "white"});
	}	
}
function addDragableHead() {
	$("div.dragAble").each(function() {
		$(this).css({
				zIndex: 100 + parseInt(this.style.zIndex,10)
			});
		$('<p class="ui-widget-header">'+this.id+'</p>')
			.css({
				top: "-20px", left: "-20px",
				position: "absolute", opacity: "0.8", zIndex: 800
			})
			.appendTo($(this));	
	});
	
}
/*textboxとtextareaを入力できないように入力枠の上にDIVを追加*/
function setSelectDiv() {
	var p,t,l,w,h;
	$("div.dragAble input[class!='butStyleMove'][type!='hidden'],textarea,select,iframe",$("#target")).each(function() {
		p = this.parentNode;
		t=p.style.top;
		l=p.style.left; 
		w=p.style.width;
		h=p.style.height;
		if (getObj(this.id+"_1"))
			p.removeChild(getObj(this.id+"_1"));
		$('<div></div>')
			.attr("id",this.id+"_1")
			.css({
				background: 'blue',
				top: 0+"px", left: 0+"px", width: w, height: h,
				position: "absolute", opacity: "0.001",  zIndex: parseInt(p.style.zIndex,10)+1
				
			})
			.appendTo(p);	
	});
}

function addSelectFun() {
	var startselectedobjtmp="";
	$('#target').selectable({
		filter: 'div.dragAble',//選択オブジェクトのフィルタする
		start: function(event, ui) {
			startselectedobj = "";
			selectors = "";
		},
		
		selecting: function(event, ui) {

			var $selected = $('div.ui-selecting', this);
			
			$('div.ui-selected').selectable('option', 'cancel', ':input,option,table,td,tr,span,p');
			for (var ii = 0; ii < $selected.length; ii++) {
				if (startselectedobjtmp=="") {
					//最初選択項目ID取得
					startselectedobjtmp = $selected[ii].id;
				}
			} 
			$("div.status_icon").html("status-selecting");
		},

		stop: function() {
			
			var $selected = $('div.ui-selected', this);
         	var w = false;
			for (var ij = 0; ij < $selected.length; ij++) {
				
				if (selectors=='') {
					selectors=$selected[ij].id;
				} else {
					selectors+=','+$selected[ij].id;
				}
				if (startselectedobjtmp==""||startselectedobjtmp==$selected[ij].id) {
					w=true;
				}
			}
			$("#t").val(selectors);
			if ($selected.length>0) {
				if (!w) {
					startselectedobj = $selected[0].id;
					startselectedobjtmp= startselectedobj;
				} else {
					startselectedobj = startselectedobjtmp;
				}
			}
			//Slider連動
			initAdjSlide();
			//項目属性表示
			showItemProperties();
			$("div.status_icon").html("status-selected");
		}
	});
}
function initDragableFun() {
	var x,y;
	var oriPostion = {};
	$("div.dragAble").draggable({
		cursor: 'move',
		//handle: 'p' ,
		//containment: '.pageborder',
		drag: function(event,ui) {
			var dragId = event.target.id;
			var pairId = '#' + $(dragpairs).data(dragId);
			if ($.browser.mozilla) {
				x = oriPostion.pairx + (event.pageX - oriPostion.srcx);
				y = oriPostion.pairy + (event.pageY - oriPostion.srcy);
			} else {
				x = oriPostion.pairx + (event.clientX - oriPostion.srcx);
				y = oriPostion.pairy + (event.clientY - oriPostion.srcy);
			}
			$(pairId).css({'top':y+'px','left':x+'px','position':'absolute'});
			$("div.status_icon").html("status-dragging");
		},
		start: function(event, ui) {
			
			//$('#target').selectable("disable");
			s_draged = true;
			s_resized = false; 
			var dragId = event.target.id;
			//$(this).css("background", "#9ce");
			var pairId = $(dragpairs).data(dragId);
			if (pairId != null) {
				if ($.browser.mozilla) {
					oriPostion.srcx = event.pageX;
					oriPostion.srcy = event.pageY;
					oriPostion.pairx = $('#'+pairId)[0].offsetLeft;
					oriPostion.pairy = $('#'+pairId)[0].offsetTop;
				} else {
					oriPostion.srcx = event.clientX;
					oriPostion.srcy = event.clientY;
					oriPostion.pairx = $('#'+pairId)[0].offsetLeft;
					oriPostion.pairy = $('#'+pairId)[0].offsetTop;
				}
				
			}
			$(this).attr("_e","1");
			$('#'+pairId).attr("_e","1");
			
        },
		dragging: function(event, ui) {
        	$("div.status_icon").html("status-dragging");
        },
		stop: function(event,ui) {
        	//$("div.ui-selected").each(function() {
				//alert("drag-resize:"+$(this).attr("id"));
			//})
			//$('#target').selectable("enable");
        	//$(this).css("background", "#369");
			oriPostion.srcx = 0;
			oriPostion.srcy = 0;
			oriPostion.pairx = 0;
			oriPostion.pairy = 0;
			$("div.status_icon").html("status-dragged");
		}
	});
}
function initResizableFun() {
	$("div.dragAble").resizable({
		cancel: ':input,option,b,table,span,iframe',
		ghost: true,
		animate: false,
		//handles: 'n, e, s, w' ,
//		grid: [5, 5], 
		helper: 'ui-state-highlight',
		start: function(event,ui) {
			//$('#target').selectable("disable");
			s_draged = false;
			s_resized = true;
			$(this).attr("_e","1");
		},
		resize :function(event,ui) {
			$("div.status_icon").html("status-resizing");
		},
		stop: function(event,ui) {
			var self = $(this).data("ui-resizable"), o = self.options, os = self.originalSize, op = self.originalPosition;
			var delta = {
				height: (self.size.height - os.height) || 0, 
				width: (self.size.width - os.width) || 0,
				top: (self.position.top - op.top) || 0, 
				left: (self.position.left - op.left) || 0
			};
			var w = self.size.width;
			var h= self.size.height;
			var t = self.position.top;
			var l = self.position.left;
			if ($("input:radio",$(this)).length==0) {
				if($(this).attr("_g")=="22") {//popwin
					if ($(this).find("input")) {
						w-=20;
						h-=4;
						$(this).children('input').width(w);
						$(this).children('input').height(h);
					}				
				} else {
					if ($(this).find("input,textarea,select,img,iframe")) {
						w-=4;
						h-=4;
						$(this).children('input,textarea,select,img,iframe').width(w);
						$(this).children('input,textarea,select,img,iframe').height(h);
					} else {
						$(this).width(w);
						$(this).height(h);
					}
				}
			} else {
				resizeRadioItem($(this));
			}
			
			setSelectDiv();
			$("div.status_icon").html("status-resized");
		}
	
	});

}
function resizeRadio() {
	//radio
	$('div.dragAble[class*=multiDragAble2]',$("#target"))
		.each(function(){
			if ($(this).children().get(0).tagName.toLowerCase()!='table') {
				resizeRadioItem($(this));
			}
});
}
function resizeRadioItem(r) {
	var radioArr = $(r).find('input[type=radio]');
	var spanArr = $(r).find('span');
	var brArr = $(r).find('br');
	if (radioArr.length > 0 && radioArr.length == spanArr.length) {
		if (brArr.length == 0) {
			//横
			var allWidth = $(r).width();
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
						for (var m = 1;m < radioArr.length;m++) {
							leftRadio = $(radioArr[m-1]).position().left + radioArr.eq(m-1).width() + spanArr.eq(m-1).width() + splitWidth;
							leftSpan = leftRadio + radioArr.eq(m).width() + itemSplitWidth;
							radioArr.eq(m).css({'left':leftRadio+"px",'position':'absolute'});
							spanArr.eq(m).css({'top':"6px",'left':leftSpan+"px",'position':'absolute'});
						}
		} else if (brArr.length == radioArr.length - 1) {
			//縦
			var allHeight = $(r).height();
			var itemHeight = 15;
			var splitHeight = (allHeight - itemHeight * radioArr.length) / brArr.length - 5;

			for (var m = 1;m < radioArr.length;m++) {
				var topRadio = $(radioArr[m-1]).position().top + itemHeight + splitHeight;
				var topSpan = topRadio + 4;
				radioArr.eq(m).css({'top':topRadio+'px','position':'absolute'});
				spanArr.eq(m).css({'top':topSpan+'px','left':20+'px','position':'absolute'});
			}
		}
	}
}
function refreshObjects() {
//	lbledit();
	addDragableHead();
	setSelectDiv();
//	initDragableFun();
//	$('#target').draggable("disable");
	s_draged = false;
	s_status = 0;
	
	addSelectFun();	
//	initResizableFun();
}
function enableDrag() {
	
}
$(function() {
	refreshObjects();
});	


function getClickedColInfo(divId,x) {
	var colIndex = -1;

	var th = $(divId)[0].childNodes[0].rows[0].childNodes;
	if (th.length == 1) {
		colIndex = 0;
	} else {
		for (var i = 0;i < th.length-1;i++) {
			if (x <= (th[i+1].offsetLeft + $(divId)[0].offsetLeft)) {
				colIndex = i;
				break;
			}
	
			if (i == th.length - 2) {
				//last node
				colIndex = th.length - 1;
			}
		}
	}

	var retObj = {
		colIndex : colIndex,
		colContent : th[colIndex].innerText
	};
	return retObj;
}
function getClickedColIndex(divId,cellIndex) {
	var colIndex = cellIndex;
	var retObj;
	if (cellIndex!=-1) {
		var th = $(divId)[0].childNodes[0].rows[0].childNodes;
		retObj = {
			tblid:$(divId)[0],
			colIndex:cellIndex,
			colContent:th[colIndex].innerText,
			id:th[colIndex].id,
			border:th[colIndex].style.border
		};
		if (th.length > 1) {
			if (colIndex == 0) {
				retObj.colContentUpd = th[1].innerText;
			} else if (colIndex == th.length - 1) {
				retObj.colContentUpd = th[colIndex-1].innerText;
			}
		}
	} else {
		retObj = {
				tblid:$(divId)[0],
				colIndex:cellIndex
		};
	}
	//alert(retObj.tblid.id + ":"+retObj.colIndex);
	return retObj;
}
function changeMenuContext(divId,menuId,x) {
	var contentTh = getClickedColInfo(divId,x).colContent;
	$(menuId)[0].childNodes[1].childNodes[0].innerHTML = '[' + contentTh + ']' + jQuery.i18n.prop("common.wfdm_lbl00001");
	$(menuId)[0].childNodes[4].childNodes[0].innerHTML = '[' + contentTh + ']' + jQuery.i18n.prop("common.wfdm_lbl00002");
}

function colAdd(divId,cellIndex,isAfter,id) {
	var index = cellIndex;
	var param= {
		tid : id,
		colIndex : isAfter ? (index+1) : index
	}
	savetmp(3,param);
}
function colDel(divId,cellIndex,msg) {
	var colObj = getClickedColIndex(divId,cellIndex);
	delItemConfirm(0,colObj.id.substr(5),msg+"["+colObj.colContent+"]",colObj.colIndex,colObj.tblid);
}
//
function editThead(e) {
	var input = $('<input id="editorHead" type="text" value="' + e.innerText + '" onblur="afterEdit(this)">');
	input.width(e.clientWidth);
	e.innerText = "";
	$(e).append(input);
	$(input[0]).focus();
	$(input[0]).select();
}
function afterEdit(e) {
	var inputValue = e.value;
	var table = $("table",$(e).parents());
	var colIndex = $(e).parent().attr("cellIndex");
	$(e).parent().attr("_e","1");
	if (colIndex == 0) {
		$(e).parent().html(getFirstHead($(e).parent().get(0).id, inputValue));
	} else if (colIndex == $("th",table).length - 1) {
		$(e).parent().html(getLastHead($(e).parent().get(0).id, inputValue));
	} else {
		$(e).parent().html(getHead($(e).parent().get(0).id, inputValue));
	}
	
}
function getPosX(e) {
	var posX = 0;
	if (typeof e.offsetParent != 'undefined') {
		do {
			posX += e.offsetLeft;
		} while (e = e.offsetParent)
	} else {
		posX += e.x;
	}

	return posX;
}

//
function beforeMove(e) {
	if ($.browser.mozilla) {
		var table = $("table",$(e.target).parents());
		var th = $(e.target).parent();
	} else {
		var table = $("table",$(e.srcElement).parents());
		var th = $(e.srcElement).parent();
	}
	chgColData(table,$(th).prev(),th);
	$(th).attr("_e","1");
	$(th).prev().attr("_e","1");

}
function afterMove(e) {
	if ($.browser.mozilla) {
		var table = $("table",$(e.target).parents());
		var th = $(e.target).parent();
	} else {
		var table = $("table",$(e.srcElement).parents());
		var th = $(e.srcElement).parent();
	}
	chgColData(table,$(th),$(th).next());
	$(th).attr("_e","1");
	$(th).next().attr("_e","1");
}
function setDisplayPro(a,t) {
	if (a=='0') {
		return "<font class=GridHiddenTH>"+t+"</font>";
	} else {
		return t;
	}
}
function chgColData(table,th_prev,th) {
	var colIndex1 = parseInt($(th_prev)[0].cellIndex,10);
	var colIndex2 = parseInt($(th)[0].cellIndex,10);
	var _a1 = $(th_prev).attr("_a");
	var _a2 = $(th).attr("_a");
	var cw1,cw2,pm1,pm2,m1,m2;
	var icw1,icw2,ipm1,ipm2,im1,im2;
	var id = $(th).attr("id");
	var id_prev = $(th_prev).attr("id");

	for (var i = 0;i < $(table).get(0).rows.length;i++) {
		var tds = $(table).get(0).rows[i].childNodes;
		if (i == 0) {
			cw1 = th_prev.width();
			cw2 = th.width();
			pm1 = th_prev.position().left;
			m1 = th.position().left;
			ipm1 = pm1;
			icw1 = cw1;
			im1 = m1;
			icw2 = cw2;
			if (tds.length == 3) {
				var cell1 = setDisplayPro(_a1,$(tds[colIndex1]).text());
				var cell2 = setDisplayPro(_a2,tds[colIndex2].innerText);
				
				tds[colIndex1].innerHTML = getFirstHead($(th).attr("id"), cell2,ipm1+icw2-12);
				tds[colIndex2].innerHTML = getLastHead($(th_prev).attr("id"),cell1,ipm1+icw2);
			} else {
				if (colIndex1 == 1 && colIndex2 == 2) {
					var cell1 = setDisplayPro(_a1,$(tds[colIndex1]).text());
					var cell2 = setDisplayPro(_a2,$(tds[colIndex2]).text());
					tds[colIndex1].innerHTML = getFirstHead($(th).attr("id"),cell2,ipm1+icw2-12);
					tds[colIndex2].innerHTML = getHead($(th_prev).attr("id"),cell1,ipm1+icw2,ipm1+icw1+icw2-12);
				} else if (colIndex1 == 2 && colIndex2 == 1) {
					var cell1 = setDisplayPro(_a1,$(tds[colIndex1]).text());
					var cell2 = setDisplayPro(_a2,$(tds[colIndex2]).text());
					
					tds[colIndex1].innerHTML = getFirstHead($(th).attr("id"), cell2,ipm1+icw2-12);
					tds[colIndex2].innerHTML = getHead($(th_prev).attr("id"),cell1,ipm1+icw2,ipm1+icw1+icw2-12);
				} else if (colIndex1 == tds.length - 2 && colIndex2 == tds.length - 1) {
					var cell1 = setDisplayPro(_a1,$(tds[colIndex1]).text());
					var cell2 = setDisplayPro(_a2,$(tds[colIndex2]).text());
					
					tds[colIndex1].innerHTML = getHead($(th).attr("id"), cell2,ipm1,ipm1+icw2-12);
					tds[colIndex2].innerHTML = getLastHead($(th_prev).attr("id"),cell1,ipm1+icw2);
				} else if (colIndex1 == tds.length - 1 && colIndex2 == tds.length - 2) {
					var cell1 = setDisplayPro(_a1,$(tds[colIndex1]).text());
					var cell2 = setDisplayPro(_a2,$(tds[colIndex2]).text());
					tds[colIndex1].innerHTML = getLastHead($(th).attr("id"), cell2,ipm1,ipm1+icw2-12);
					tds[colIndex2].innerHTML = getHead($(th_prev).attr("id"),cell1,ipm1+icw2);

				} else {
					var cell1 = tds[colIndex1].innerHTML;
					var cell2 = tds[colIndex2].innerHTML;
					tds[colIndex1].innerHTML = cell2;
					tds[colIndex2].innerHTML = cell1;
					$("#l_"+th.attr('id')).css('left',ipm1+'px');
					$("#r_"+th.attr('id')).css('left',parseInt(ipm1+icw2-12,10)+'px');
					$("#l_"+th_prev.attr('id')).css('left',parseInt(ipm1+icw2,10)+'px');
					$("#r_"+th_prev.attr('id')).css('left',parseInt(ipm1+icw1+icw2-12,10)+'px');
				}
			}
			
			th_prev.attr("id",id)
				.css("width",cw2+'px')
				.css('left',ipm1+'px')
				.attr('_a',_a2);
			th.attr("id",id_prev)
				.css("width",cw1+'px')
			    .css('left',parseInt(ipm1+icw2,10)+'px')
			    .attr('_a',_a1);

		} else {
			var cell1 = tds[colIndex1].innerHTML;
			var cell2 = tds[colIndex2].innerHTML;
			tds[colIndex1].innerHTML = cell2;
			tds[colIndex2].innerHTML = cell1;
		}

	}
}
function getFirstHead(id,text,rleft) {
	var ret = '';
	ret = $('<th onMouseOver="showMove(this);" onMouseOut="hideMove(this);" id='+id+' ondblclick="editThead(this)">' + text + '<input type="button" id="r_'+id+'" style="left:'+rleft+'px;" class="butStyleMove" onclick="afterMove(event)" value="&gt;"></th>');
	return ret.html();
}
function getLastHead(id,text,lleft) {
	var ret = '';
	ret = $('<th onMouseOver="showMove(this);" onMouseOut="hideMove(this);" id='+id+' ondblclick="editThead(this)"><input type="button" id="l_'+id+'" style="left:'+lleft+'px;" class="butStyleMove butStyleMovel" onclick="beforeMove(event)" value="&lt;">'+text+'</th>');
	return ret.html();
}
function getHead(id,text,lleft,rleft) {
	var ret = '';
	ret = $('<th onMouseOver="showMove(this);" onMouseOut="hideMove(this)" id='+id+' ondblclick="editThead(this)"><input type="button" id="l_'+id+'" style="left:'+lleft+'px;" class="butStyleMove butStyleMovel" onclick="beforeMove(event)" value="&lt;">'+text+'<input type="button" id="r_'+id+'" style="left:'+rleft+'px;" class="butStyleMove  butStyleMover" onclick="afterMove(event)" value="&gt;"></th>');
	return ret.html();
}


//move down up
var moveState = 0;
function judgeCursor(e) {
	var ret = false;

	if ($.browser.mozilla) {
		var x = e.pageX;
		var y = e.pageY;
		var movex = e.pageX;
		var movey = e.pageY;
		var left = e.target.offsetLeft;
		var width = e.target.offsetWidth;
		var topY = e.target.offsetTop;
		var target = e.target;
	} else {
		var pos = getPos(e.srcElement.parentNode);
		var x = e.clientX - pos.posX;
		var y = e.clientY - pos.posY;
		var movex = e.clientX;
		var movey = e.clientY;
		var left = e.srcElement.offsetLeft;
		var width = e.srcElement.offsetWidth;
		var topY = pos.posY;
		var target = e.srcElement;
	}
	if (target.nodeName.toUpperCase() != 'TH') {
		return false;
	} else {
		if (target.cellIndex == 0) { 
			return false;
		}
	}

	var diff1 = x - left;
	var diff2 = x - left - width;
	if (diff2 >= -3 && diff2 <= 3) {
		ret = true;
	} else {
		ret = false;
	}

	return {
		isSplit : ret,
		colIndex : target.cellIndex,
		oldWidth : width,
		minWidth : 50,
		topY : topY,
		srcTable : target.parentNode.parentNode,
		startX : x
	};
}
function move(e) {
	if ($.browser.mozilla) {
		var target = e.target;
	} else {
		var target = e.srcElement;
	}
	
	if (judgeCursor(e).isSplit) {
		$(target).css('cursor','e-resize');
	} else {
		$(target).css('cursor','default');
	}
}

function down(e){
	var judgeRes = judgeCursor(e);
	if (judgeRes.isSplit) {
		var colIndex = judgeRes.colIndex;
		var srcTable = judgeRes.srcTable;
		var oldWidth = judgeRes.oldWidth;
		var startX = $(e.srcElement).offset().left+oldWidth;
		var minWidth = judgeRes.minWidth;
		var topY = judgeRes.topY;
		if ($.browser.mozilla) {
			var x = e.pageX;
		} else {
			var x = e.clientX;
		}
		moveState = 1;
		$('#split').show();
		$('#split').css({
			position: 'absolute',
			left:x+'px',
			top:topY+'px',
			background:'red',
			height:100+'px',
			zIndex: '0'
		});	
		
		jQuery('body').bind('mousemove', {}, function(e){
			if ($.browser.mozilla) {
				var movex = e.pageX;
			} else {
				var movex = e.clientX;
			}
			
			$('#split').show();
			$('#split').css({
				position: 'absolute',
				left:movex+'px',
				top:topY+'px',
				background:'red',
				height:100+'px',
				zIndex: '0'
			});																		
		});
		jQuery('body').bind('mouseup', {}, function(e){
			$('#split').hide();
			jQuery(this).unbind('mousemove').unbind('mouseup');

			var endX = 0;
			if ($.browser.mozilla) {
				var endX = e.pageX;
				//var endX = $(e.target).offset().left;
			} else {
				var endX = e.clientX;
				//var endX = $(e.srcElement).offset().left;
				if (endX<0) {
					endX = endX * -1;
				}
			}
			var newWidth = oldWidth + (endX - startX);
			if (newWidth < minWidth) {
				newWidth = minWidth;
			}
			
			//reset column size
			for (var i = 0;i < srcTable.rows.length;i++) {
				var row = srcTable.rows[i];
				var td = row.childNodes[colIndex];
				if (td.id != "") {
					$(td).attr("_e","1");
				}
				$(td).css({
					width : newWidth+"px"
				});
			}

			//update to server
			getObj("tableColPosID").value = colIndex;
	      	getObj("tableColPosWidth").value = newWidth;
		});
	}
}
function up(e) {
	moveState = 0;
	$('#split').hide();
}
function getPos(e) {
	var posX = 0;
	var posY = 0;
	if (typeof e.offsetParent != 'undefined') {
		do {
			posX += e.offsetLeft;
			posY += e.offsetTop;
		} while (e = e.offsetParent)
	} else {
		posX += e.x;
		posY += e.y;
	}

	return {
		posX : posX,
		posY : posY};
}
function showItemProperties() {
	var v;
	if (startselectedobj == undefined) {
		$("#v_itemID").val("-");
		$("#v_regexKind").val("-");
		$("#v_inputRegex").val("-");
		$("#v_zIndex").val("-");
	} else {
		if (selectors=="") {
			$("#v_itemID").val("-");
			$("#v_regexKind").val("-");
			$("#v_inputRegex").val("-");
			$("#v_zIndex").val("-");
			$("#v_tableid").val("-");
			$("#v_fieldid").val("-");
			$("#v_mininput").val("-");
			$("#v_maxinput").val("-");
		} else {
			$("#v_itemID").val("");
			$("#v_regexKind").val("");
			$("#v_inputRegex").val("");
			$("#v_zIndex").val("");
			$("#v_tableid").val("");
			$("#v_fieldid").val("");
			$("#v_mininput").val("");
			$("#v_maxinput").val("");
			if (selectors.split(",").length >1) {
				var a=selectors.split(",");
				for (var i = 0; i < a.length; i++) {
					if (i==0) {
						$("#v_itemID").val($(getObj(a[i])).attr("_f"));
						$("#v_regexKind").val($(getObj(a[i])).attr("_r"));
						$("#v_inputRegex").val($(getObj(a[i])).attr("_n"));
						$("#v_zIndex").val(getObj(a[i]).style.zIndex);
						$("#v_tableid").val($(getObj(a[i])).attr("_l"));
						$("#v_fieldid").val($(getObj(a[i])).attr("_m"));
						$("#v_mininput").val($(getObj(a[i])).attr("_j"));
						$("#v_maxinput").val($(getObj(a[i])).attr("_k"));
					} else {
						$("#v_itemID").val($("#v_itemID").val()+","+$(getObj(a[i])).attr("_f"));
						$("#v_regexKind").val($("#v_regexKind").val()+","+$(getObj(a[i])).attr("_r"));
						$("#v_inputRegex").val($("#v_inputRegex").val()+","+$(getObj(a[i])).attr("_n"));
						$("#v_zIndex").val($("#v_zIndex").val()+","+getObj(a[i]).style.zIndex);
						$("#v_tableid").val($("#v_tableid").val()+","+$(getObj(a[i])).attr("_l"));
						$("#v_fieldid").val($("#v_fieldid").val()+","+$(getObj(a[i])).attr("_m"));
						$("#v_mininput").val($("#v_mininput").val()+","+$(getObj(a[i])).attr("_j"));
						$("#v_maxinput").val($("#v_maxinput").val()+","+$(getObj(a[i])).attr("_k"));
					}
				}
			} else {
				$("#v_itemID").val($(getObj(startselectedobj)).attr("_f"));
				$("#v_regexKind").val($(getObj(startselectedobj)).attr("_r"));
				$("#v_inputRegex").val($(getObj(startselectedobj)).attr("_n"));
				$("#v_zIndex").val(getObj(startselectedobj).style.zIndex);
				$("#v_tableid").val($(getObj(startselectedobj)).attr("_l"));
				$("#v_fieldid").val($(getObj(startselectedobj)).attr("_m"));
				$("#v_mininput").val($(getObj(startselectedobj)).attr("_j"));
				$("#v_maxinput").val($(getObj(startselectedobj)).attr("_k"));
			}

		}
	}
	$("#v_regexKind_new").val("");
	$("#v_inputRegex_new").val("");
	$("#v_zIndex_new").val("");
	$("#v_tableid_new").val("");
	$("#v_fieldid_new").val("");
	$("#v_mininput_new").val("");
	$("#v_maxinput_new").val("");
}
//設定
function getCation(d) {
	var caption = "";
	if ((($("td",$(d)).length==1)&&($("input:radio",$(d)).length==0))) {//string
		caption = escapeText($(d+ " td").html());
		if (caption.toUpperCase().substring(caption.length-9)=="* </FONT>") {
			caption = caption.substring(0, caption.toUpperCase().indexOf("<FONT")-1) ;
		}
		if (caption.substring(caption.length-1)==":") {
			caption = caption.substring(0, caption.length-1) ;
		}
	}
	return caption;
}
function getPropertiesValue() {
	var iTop,iLeft,iWidth,iHeight,caption,iAlign="",iBold="",iItalic="",iUl="",iOl="",iLt="",iFcolor="",iBgcolor="",iFs="",ia="",ib="",ic="",id="",ie="";
	var ig = "", ih = "", ii = "";
	var subArray = getObj("hidSubID").value;
	var opc =  subArray.split(",");
	var subpos = "",cf;
	getObj("SubIDPosition").value ="";
	for(var i=0;i<opc.length;i++){
		//alert("dragB"+opc[i] + " : " + $("#dragB"+opc[i]).get(0).tagName + " : " + $("#dragB"+opc[i]).hasClass("multiDragAble1"));
		var $d = $("#dragB"+opc[i]);
		var $c = $("input:button,legend",$d);
		var $t = $("input:text,input:button,span,select,option,legend,fieldset,textarea,td.img",$d);
		cf = $d.attr("_e");
		if (cf=="1") {
			caption = "";
			if( $c.length ){
				if ($c.get(0).tagName.toLowerCase()=="input"
					&&$d.get(0).tagName.toLowerCase()!="th"
					&&$d.children().get(0).tagName.toLowerCase()!="table") {
					caption = $c.val();
				} else if ($c.get(0).tagName.toLowerCase()=="legend") {
					caption = $c.text();
				}
				if (caption.toUpperCase().substring(caption.length-8)=="*</FONT>") {
					caption = caption.substring(0, caption.toUpperCase().indexOf("<FONT")-1) 
					//caption = caption.substring(0,caption.length-1);
				}
				if ($d.get(0).tagName.toLowerCase()=="th") {
					caption = $d.text();
				}
			} else {
				caption = getCation("#dragB"+opc[i]);
			}
			//実際項目textなど
			if (caption=="") {
				
				var dragId = "dragB"+opc[i];
				var pairId = $(dragpairs).data(dragId);
				if (pairId != undefined) {
					caption = getCation("#"+pairId);
				}
			}
			
			caption=replaceAll(caption,"#","%WFS%");
			caption=replaceAll(caption,",","%WFC%");
			
			if ($d.attr("_a")==undefined||$d.attr("_a")=="0"){
				ia="0";
			}else if ($d.attr("_a")=="1"){ 
				ia="1";
			}else if ($d.attr("_a")=="2"){ 
				ia="2";
			} 
			
			iAlign=" ";
			iBold="0";
			iUl="0";
			iOl="0";
			iLt="0";
			iLt="0";
			iFs=" ";
			iFcolor=" ";iBgcolor=" ";iItalic="0";
			if (ok!='31') {			
				iAlign = $t.css("text-align");
				if (iAlign==undefined) {
					iAlign=" ";
				}
				if ($t.css("font-weight")=="700") {
					iBold="1";
				}else{
					iBold="0";
				}
				if ($t.css("text-decoration")=="underline"){ 
					iUl="1";
				}else{
					iUl="0";
				}
				if ($t.css("text-decoration")=="overline"){ 
					iOl="1";
				}else{
					iOl="0";
				}
				if ($t.css("text-decoration")=="line-through"){ 
					iLt="1";
				}else{
					iLt="0";
				}
				if ($t.css("font-size")==undefined){
					iFs=" ";
				} else {
					iFs = replaceAll($t.css("font-size"),"px","");
				}
	
				if (ia==0) {
					iFcolor=" ";iBgcolor=" ";iItalic="0";
				} else {
					iFcolor = $t.css("color");
					var color = new RGBColor(iFcolor);
					iFcolor = color.toHex();
					if (iFcolor==undefined||iFcolor=='transparent'){
						iFcolor=" ";
					}else{
						iFcolor=iFcolor.replace("#","");
					}
					
					iBgcolor = $t.get(0).style.backgroundColor;
					color = new RGBColor(iBgcolor);
					iBgcolor = color.toHex();
					if (iBgcolor==undefined||iBgcolor=='transparent'||$t.attr("_bc")=="0"){
						iBgcolor=" ";
						ie = "1";
					}else{
						iBgcolor=iBgcolor.replace("#","");
						if ($t.css("opacity") == "") {
							ie = "1";
						} else {
							ie = $t.css("opacity");
						}
					}
					
					if ($t.css("font-style")=="italic" || $t.css("font-style")=="oblique") {
						iItalic="1";
					}else{
						iItalic="0";
					}
					
				}
			}
			if ($d.attr("_b")==undefined||$d.attr("_b")=="0"){
				ib="0";
			}else{ 
				ib="1";
			} 
			if ($d.attr("_c")==undefined||$d.attr("_c")=="0") {
				ic="0"; 
			}else{ 
				ic="1";
			} 
			if ($d.attr("_d")==undefined||$d.attr("_d")=="0"){
				id="0";
			}else if ($d.attr("_d")=="1"){ 
				id="1";
			}else if ($d.attr("_d")=="2"){ 
				id="2";
			}
			if ($t.get(0).style.borderWidth == undefined) {
				ig = " ";
			} else {
				ig = replaceAll($t.get(0).style.borderWidth,"px","");;
			}
			if ($t.get(0).style.borderStyle == undefined) {
				ih = " ";
			} else {
				ih = $t.get(0).style.borderStyle;
			}
			if ($t.get(0).style.borderColor == undefined) {
				ii = " ";
			} else {
				ii = $t.get(0).style.borderColor;
				color = new RGBColor(ii);
				ii = color.toHex();
				ii=ii.replace("#","");
			}
			if ($d.get(0).tagName!="TH") {
				iTop = parseInt(getObj("dragB"+opc[i]).style.top,10);
				if (iTop<0) iTop=0;
				iLeft = parseInt(getObj("dragB"+opc[i]).style.left,10);
				if (iLeft<0) iLeft=0;
				iWidth = chgNaNtoBlank(String(parseInt(getObj("dragB"+opc[i]).style.width,10)));
				iHeight = chgNaNtoBlank(String(parseInt(getObj("dragB"+opc[i]).style.height,10)));
				izIndex = chgNaNtoBlank(String(parseInt(getObj("dragB"+opc[i]).style.zIndex,10)-100));
				standbysort = 0;
				subpos += opc[i] +","+String(iTop) +","+String(iLeft) +","+iWidth +","+iHeight +","+izIndex +","+String(standbysort) +","+caption+","+cf+","+iAlign+","+iFcolor+","+iBgcolor+","+iBold+","+iItalic+","+iUl+","+iOl+","+iLt+","+ia+","+ib+","+ic+","+id+","+iFs+","+ie+",#";
			} else {
				iTop = 0;
				iLeft = 0;
				iWidth = chgNaNtoBlank(String($d[0].offsetWidth));
				iHeight = chgNaNtoBlank(String($d[0].offsetHeight));
				izIndex = chgNaNtoBlank(String(parseInt(getObj("dragB"+opc[i]).style.zIndex,10)-100));
				standbysort = parseInt($d.attr("cellIndex"),10);
				subpos += opc[i] +","+String(iTop) +","+String(iLeft) +","+iWidth +","+iHeight +","+izIndex +","+String(standbysort) +","+caption+","+cf+","+iAlign+","+iFcolor+","+iBgcolor+","+iBold+","+iItalic+","+iUl+","+iOl+","+iLt+","+ia+","+ib+","+ic+","+id+","+iFs+","+ie+",#";
			}
			getObj("SubIDPosition").value = subpos;
		}
	}
}
//left mouse click to control for mobile
function displayObjHandle(o) {
	var s = '';

	s = '<p><input type=button id=\'wf'+o.attr('id')+'\' name=\'wf'+o.attr('id')+'\' value=\'Upload\'>';
	s+= '<input type=button id=\'wfi'+o.attr('id')+'\' name=\'wfi'+o.attr('id')+'\' value=\'Preview\' onclick=\'previewImg($("#'+o.attr('id')+'").parent());\'>';
	s+= '<input type=button id=\'wfc'+o.attr('id')+'\' name=\'wfc'+o.attr('id')+'\' value=\'Close\' onclick=\'displayFileHandle($("#'+o.attr('id')+'"));\'></p>';
	if (!o.hasClass('setFiled')) {
		
		$(s)
			.css({
				//top: "-5px", left: "-5px",
				top:(o.position().top-10)+"px", left: o.position().left+"px",
				position: "absolute", opacity: "0.5", zIndex: 800
			})
			.appendTo(o.parent().parent());
		o.addClass('setFiled');
		doExistAct($('#wf'+o.attr('id')));
	} else {
		$('#wf'+o.attr('id')).parent().remove();
		o.removeClass('setFiled');
	}	
}
function resetFile() {
	$('a.lightbox')
		.unbind("click")
		.bind(
		"click", function() {
			displayFileHandle($("img.chgAble", $(this)));
			return false;
		}
	); 
}
//Slide対応start
function initAdjSlide() {
	var v;
	if (getRadioValue("adjMth")==1) {
		if (startselectedobj == undefined) {
			$("#amount").val("-");
		} else {
			if (getRadioValue("adjProp")==1) {
				v = $(getObj(startselectedobj)).width();
			}
			if (getRadioValue("adjProp")==2) {
				v = $(getObj(startselectedobj)).height();
			}
			if (getRadioValue("adjProp")==3) {
				if ($(getObj(startselectedobj)).children('input,span,textarea').css("font-size")!=null) {
					v = $(getObj(startselectedobj)).children('input,span,textarea').css("font-size");
					v = parseFloat(v, 10); 
				} else {
					$("#amount").val("-");
					return;
				}
			}
			if (getRadioValue("adjProp")==4) {
				v = $(getObj(startselectedobj)).offset().top;
			}
			if (getRadioValue("adjProp")==5) {
				v = $(getObj(startselectedobj)).offset().left;
			}
			$("#amount").val(v);
			$("#adjSlider" ).slider( "option", "value", v );	
			$("#adjSlider").slider("option","min",0);
			$("#adjSlider").slider("option","max",1000);
		}
	} else {
		$("#amount").val(0);
		$("#adjSlider").slider("option","min",-500);
		$("#adjSlider").slider("option","max",500);
		$("#adjSlider" ).slider( "option", "value", 0 );
	}
}
function adjMthClicked() {
	if (getRadioValue("adjMth")==2) {
		$("#amount").val(0);
		$("#adjSlider").slider("option","min",-500);
		$("#adjSlider").slider("option","max",500);
		$("#adjSlider" ).slider( "option", "value", 0 );
	} else {
		$("#adjSlider").slider("option","min",0);
		$("#adjSlider").slider("option","max",1000);
		initAdjSlide();
	}
}
function ajustItem(v) {
	var $selected = $('.ui-selected');
	var v,m;
	for (var i = 0; i < $selected.length; i++) {
		if (getRadioValue("adjMth")==1) {
			if (getRadioValue("adjProp")==1) {
				
				if ($("input:radio",$selected[i]).length==0) {
					if($(getObj($selected[i].id)).attr("_g")=="22") {//popwin
						$(getObj($selected[i].id)).children('input').width(gi(v)-24);
					} else if ($(getObj($selected[i].id)).attr("_g")=="10") {//image
						$(getObj($selected[i].id)).children('input').width(gi(v)-2);
					} else {
						$(getObj($selected[i].id)).children('input,img,select,textarea').width(gi(v)-1);
					}
				} else {
					resizeRadioItem($selected[i]);
				}
				$(getObj($selected[i].id)).width(parseInt(v,10)+2);
				
			}
			if (getRadioValue("adjProp")==2) {
				if ($("input:radio",$selected[i]).length==0) {
					if ($(getObj($selected[i].id)).attr("_g")=="22") {//popwin
						$(getObj($selected[i].id)).children('input').height(gi(v)-4);
					} else if ($(getObj($selected[i].id)).attr("_g")=="10") {//image
						$(getObj($selected[i].id)).children('img').height(gi(v)-6);
					} else if ($(getObj($selected[i].id)).attr("_g")=="11"
						 || $(getObj($selected[i].id)).attr("_g")=="12") {//btn/link
						$(getObj($selected[i].id)).children('input').height(gi(v)-2);
					} else {
						$(getObj($selected[i].id)).children('input,img.select,textarea').height(gi(v)-4);
					}
				} else {
					resizeRadioItem($selected[i]);
				}
				$(getObj($selected[i].id)).height(parseInt(v,10)+2);
			}
			if (getRadioValue("adjProp")==3) {
				$(getObj($selected[i].id)).children('input,span,select,textarea').css("font-size",v);
			}
			if (getRadioValue("adjProp")==4) {
				$(getObj($selected[i].id)).css("top", v+'px');
			}
			if (getRadioValue("adjProp")==5) {
				$(getObj($selected[i].id)).css("left", v+'px');
			}
		} else if (getRadioValue("adjMth")==2) {
			if (getRadioValue("adjProp")==4) {
				m = parseInt($(oriTop).data($selected[i].id)) + v;
				$(getObj($selected[i].id)).css("top", m+"px");
			}
			if (getRadioValue("adjProp")==5) {
				m = parseInt($(oriLeft).data($selected[i].id)) + v;
				$(getObj($selected[i].id)).css("left", m+"px");
			}
		}
		$(getObj($selected[i].id)).attr("_e","1");
	}
	
}
//Slider対応end