/**
 * action grid plugin for 1_8_17
 * 
 * JSP need following code
 * 1. clear every rows action flag after updating
 *    ListTable_clear();
 * 2. create hide item for every rows' action flag
 *    <input type=hidden id="ListTableflg<%=i+1%>" name="ListTableflg<%=i+1%>">
 * 3. set useTemplateRow to True if the first row is template row
 * 
 * TODO:
 * 1. add right del・create row
 * 2. paging
 * 3. client sort
 */
jQuery.fn.aingrid = function(o){

	var cfg = {
		height: 200, 							// height of our datagrid (scrolling body area)
		width: 200,								// width of all column width sum
		displayWidth: 0,						// width of grid display width
		isMobile: false,
		gridClass: 'datagrid',					// class of head & body

		savedStateLoad : false,					// when Ingrid is initialized, should it load data from a previously saved state?
		initialLoad : false,					// when Ingrid is initialized, should it load data immediately?
		headHeight: 30,						// height of our header
//		headerClass: 'grid-header-bg',			// header bg
		headerClass: 'tbl_design01',			// header bg

		bodyHeight: 25,							// height of body row
		hasFooter: true,						// create footer
		hasScroll: true,						// create scroll
		colsetting : true,						// セル項目が定義適用Flg
		colClasses: [],							// array of classes : i.e. ['','grid-col-2','','']
		colWidths: [225,225,225,225],			// width of each column
		minColWidth: 30,						// minimum column width
		addRowMethod: 1,						// 行追加方法定義 1:一行目からｺﾋﾟｰ,2:最後行目からｺﾋﾟｰ
		colDataType: [],						// ﾃﾞｰﾀﾀｲﾌﾟを定義 0:連番,1:値なし, 2:値あり
		colDataId: [],							// 各ﾃﾞｰﾀID、i.e. ['1','table_-field','table_-field','table_-field']

		resizableCols: true,					// make columns resizable via drag + drop
		
		autoRowId: true,
		rowClasses: [],							// list of row classes (selected by cursor)
//		rowHoverClass: 'grid-row-hover',		// hovering over a row? use this class
		rowHoverClass: '',		// hovering over a row? use this class
		rowSelection: true,						// allow row selection?
		rowSelectedClass: 'grid-row-sel',		// selecting a row? use this class
		onRowSelect: function(tr, selected){},	// function to call when row is clicked
		//onRowAction: function(actionflg,row){}, // function to call when row is after added(1) or after deleted(0) or before add(3) or before delete(2) or before paging(4) or after paging(5)
		onBeforeAddRow: function(row){}, // function to call when row is after added(1) or after deleted(0) or before add(3) or before delete(2) or before paging(4) or after paging(5)
		onAfterAddRow: function(row){}, // function to call when row is after added(1) or after deleted(0) or before add(3) or before delete(2) or before paging(4) or after paging(5)
		onBeforeDelRow: function(row){}, // function to call when row is after added(1) or after deleted(0) or before add(3) or before delete(2) or before paging(4) or after paging(5)
		onAfterDelRow: function(row){}, // function to call when row is after added(1) or after deleted(0) or before add(3) or before delete(2) or before paging(4) or after paging(5)
		onBeforePaging: function(){}, // function to call when row is after added(1) or after deleted(0) or before add(3) or before delete(2) or before paging(4) or after paging(5)
		onAfterPaging: function(){}, // function to call when row is after added(1) or after deleted(0) or before add(3) or before delete(2) or before paging(4) or after paging(5)

		allRowSent: 1,              //全行データ送信　0:edited rows only 1:all rows
 		isHavingContextMenu: true,
		
		gridborderWidth: 1,						// grid left+right border width
		
		rowsObjectId: 'lists',					// ﾃﾞｰﾀ総件数（削除ﾃﾞｰﾀを含む）を格納するｵﾌﾞｼﾞｪｸﾄID
		rowId: 'rowseq',						// 行単位ID、必要なければ変更不要
		rowBegin: 0,							// 最初行の開始カウント数字:項目の後ろにつける、行ごとに加算  
		rowsMax: 0,								// Gridに最大追加件数
		rowsMaxMessage: jQuery.i18n.prop("jquery.ingrid_action_msg_00001"), // Gridの最大追加件数を超える時に表示ｴﾗｰﾒｯｾｰｼﾞ
		rowActionFlg: 'flg',					// 行操作ﾌﾗｸﾞID
		rowDelChkFlg: 'delchk',					// 行削除Checkbox	
		rowAdd: true,
		rowDelete: true,
		rowUpdate: true,
		rowHeight: 0,							// row height
		rowUpdateFlgEnable: false,				// when updated, [rowActionFlg] is set to 1 automatically
		
		/* template row */
		useTemplateRow: false,					// if using template row to add row, addRowMethod will not be used
		
		AjaxDoneScriptId: 'ad',					// function to call when row is clicked
		
		/* sorting */
		sorting: true,
		colSortParams: [],						// value to pass as sort param when header clicked (i.e. '&sort=param') ex: ['col1','col2','col3','col4']
		sortAscParam: 'asc',					// param passed on ascending sort (i.e. '&dir=asc)
		sortDescParam: 'desc',					// param passed on ascending sort (i.e. '&dir=desc)
		sortedCol: '1',							// current data's sorted column (can be a key from 'colSortParams', or an int 0-n (for n columns)
		sortedColDir: 'asc',					// current data's sorted directions
		sortDefaultDir: 'asc',					// on 1st click, sort tihs direction
		sortAscClass: 'grid-sort-asc',			// class for ascending sorted col
		sortDescClass: 'grid-sort-desc',		// class for descending sorted col
		sortNoneClass: 'grid-sort-none',		// ... not sorted? use this class
		sortDisableClass: 'grid-sort-disable',
		unsortableCols: [],						// do not make theses columns sortable
		onAfterSort: function(){},				// function to call after sorting finished
		
		/* paging */
		paging: true,							// create a paging toolbar
		showPaging: true,						// paging controller display control
		actionFlg: 1,							// actflg's value of page 1:new mode 2:update mode
		pageNumber: 1,
		recordsPerPage: 10,
		totalRecords: 30,						// 全ﾃﾞｰﾀ数、ﾃﾞｰﾀない場合、Grid追加権限あり場合ｻﾝﾌﾟﾙRowを元に一行作成、ﾃﾞｰﾀ数を一行とする
		pageToolbarHeight: 20,
		pageToolbarClass: 'grid-page-toolbar',
		pageStartClass: 'grid-page-start',
		pagePrevClass: 'grid-page-prev',
		pageInfoClass: 'grid-page-info',
		pageInputClass: 'grid-page-input',
		pageNextClass: 'grid-page-next',
		pageEndClass: 'grid-page-end',
		pageLoadingClass: 'grid-page-loading',
		pageLoadingDoneClass: 'grid-page-loading-done',
		pageViewingRecordsInfoClass: 'grid-page-viewing-records-info',
		pageAddrowClass: 'fa fa-plus-circle',
		pageDelrowClass: 'fa fa-minus-circle',
		isShowpageChangeConfirmMsg: false,
		pageChangeConfirmMsg: jQuery.i18n.prop("jquery.ingrid_action_msg_00002"),
		pageChangeAddedErr: jQuery.i18n.prop("jquery.ingrid_action_msg_00003"),
		pageChangeAddRowConfirmMsg: jQuery.i18n.prop("jquery.ingrid_action_msg_00004"),
		pageChangeTargetErr: jQuery.i18n.prop("jquery.ingrid_action_msg_00005"),
		fixColumn: false,
		
		/* ajax stuff */
		url: '/ajax/XRRunSearch.jsp',			// url to fetch data
		type: 'POST',							// 'POST' or 'GET'
		dataType: 'html',						// 'html' or 'json' - expected dataType returned
		extraParams: {},						// a map of extra params to send to the server 				
		loadingClass: 'grid-loading',			// loading modalmask div
		loadingHtml: '<div>&nbsp;</div>',			
		
		/* should seldom change */
		resizeHandleHtml: '',					// resize handle html + css
		resizeHandleClass: 'grid-col-resize',
		scrollbarW: 17,							// width allocated for scrollbar
		gapId: 'gapid', 
		columnIDAttr: '_colid',					// attribute name used to groups TDs in columns
		ingridIDPrefix: '_ingrid',				// prefix used to create unique IDs for Ingrid
		ingridIDForDelPrefix: '_dingrid',		// prefix used to create unique IDs for Ingrid deleted rows
		
		/* cookie, for saving state */
		cookieExpiresDays: 360,
		cookiePath: '/',
		
		/* not yet implemented */
		minHeight: 100,
		resizableGrid: true,
		dragDropCols: true,
		sortType: 'server|client|none',
		
		/* cfg functions */
		isSortableCol : function(colIndex) {
			if (cfg.unsortableCols.length==0 || jQuery.inArray(colIndex, cfg.unsortableCols)==-1) {
				return true;
			}
			return false;
		},
		isAutoHeight : "",
		pageTargetTop : 0,
		footerPosition : "",
		effectDisplay : "",
		setSelect2ItemIDs: []
	};
	jQuery.extend(cfg, o);

	// break into 4 tables: header, body, delete-body, template-row-body
	// create header table
	var cols = new Array();
	// previous page href anchar
	var ab_id =	cfg.ingridIDPrefix + '_' + jQuery( this ).attr('id') + '_' + '_ab';
	// nextpage href anchar
	var db_id =	cfg.ingridIDPrefix + '_' + jQuery( this ).attr('id') + '_' + '_db';;
	
	
	//画面開いている間に全行数（削除しても、削除してから更新しても、画面リフレッシュしない限りずっと加算）
	var rows ;
	var rb;//RowBegin
	if (cfg.useTemplateRow) {
		rb = 0;
	} else {
		rb = cfg.rowBegin;
	}
	
	var h = jQuery('<table cellpadding="0" cellspacing="0" style="table-layout:fixed;word-break:break-all;"></table>')
					.width(cfg.width)
					.addClass(cfg.gridClass)
					.addClass(cfg.headerClass)
					.height(cfg.headHeight)
					.extend({
						cols : cols
					});
	var hdiv = jQuery('<div />').width(cfg.width).append(h);
	// initialize columns
	var w;
	var scrollcover;
	for (i=cfg.colWidths.length-1; i>-1; i--) {
		if (cfg.colWidths[i]>0) {
			scrollcover = i;
			break;
		}
	}
	this.find('th').each(function(i){
		if (i==scrollcover){//cfg.colWidths.length-1) {
			h.append("<col width="+(parseInt(cfg.colWidths[i])+parseInt(cfg.scrollbarW)+1)+"px />");
		} else {
			h.append("<col width="+cfg.colWidths[i]+"px />");
		}
		
		$(this).attr("_col", i);
		var labelstr = jQuery(this).html();
		// put column text in a div, make unselectable
		var col_label = jQuery('<div />')
										.css('-moz-user-select', 'none')
										.css('-khtml-user-select', 'none')
										.css('user-select', 'none')
										.addClass('userSort')
										.attr('unselectable', 'on');
    
		// column sorting?
		if (cfg.sorting && cfg.isSortableCol(i)) {
			var key = cfg.colSortParams[i] ? cfg.colSortParams[i] : i;
			// is this column the default sorted column?
			var cls = (key == cfg.sortedCol || i == cfg.sortedCol) ? 
									( cfg.sortedColDir == cfg.sortAscParam ? cfg.sortAscClass : cfg.sortDescClass ) :
									( cfg.sortNoneClass );
			col_label.addClass(cls).click(function(){
				var dir = col_label.hasClass(cfg.sortNoneClass) ? 
										cfg.sortDefaultDir : ( col_label.hasClass(cfg.sortAscClass) ? cfg.sortDescParam : cfg.sortAscParam );
      
				var params = {page: $('input.' + cfg.pageInputClass).val() , sort : key, dir : dir };
				
				g.load( params, function(){						
					var cls = col_label.hasClass(cfg.sortNoneClass) ? 
											( cfg.sortDefaultDir == cfg.sortAscParam ? cfg.sortAscClass : cfg.sortDescClass ) :
											( col_label.hasClass(cfg.sortAscClass) ? cfg.sortDescClass : cfg.sortAscClass );

					// re-init sortable cols
					var i2 = 0;
					g.getHeaders(function(col){
						col.find('div:first').each(function() {
							if(cfg.isSortableCol(i2++))
								jQuery(this).addClass(cfg.sortNoneClass).removeClass(cfg.sortAscClass).removeClass(cfg.sortDescClass);
						});
					});
					col_label.removeClass(cfg.sortAscClass).removeClass(cfg.sortDescClass).addClass(cls).removeClass(cfg.sortNoneClass);

				});
			});
		} else {
			col_label.addClass(cfg.sortDisableClass); 
		}
        
		if (cfg.fixColumn) {
			var col_fixcolumn = jQuery('<div />').addClass("grid-fixcolumn")
			jQuery(this).append(col_label).append(col_fixcolumn);
		} else {
			jQuery(this).append(col_label);
		}
    
	});
	h.append(this.find('thead'))
	$("thead>tr:first",h).height(cfg.headHeight);

	
	// create body table. surround body with container div for scrolling
	// setting width on first row keeps it from "blinking"
	var bt = jQuery('<table cellpadding="0" cellspacing="0" style="table-layout:fixed;word-break:break-all;"></table>');
	var b = jQuery('<div />')
					.html(bt);
	
	var row = this.find('tr:first')
	jQuery(row).find('td').each(function(i){
		bt.append("<col width="+cfg.colWidths[i]+">");
	});
	
	bt.append( this.find('tbody') )
		.addClass(cfg.gridClass)
		.width(cfg.width);
	
	b.css('float', 'left')
		.width((cfg.width+cfg.scrollbarW))
		.scroll(function() {
		    hdiv.scrollLeft($(this).scrollLeft());
		});

	// create a paging toolbar
	var totr  = b.find('tr').length-1;
	
	if (cfg.hasScroll) {
		b.css('overflow-y', 'scroll')
		.css('border-left', '1px solid #CCCCCC')
		.height((cfg.height-cfg.pageToolbarHeight-cfg.headHeight));
	}

	if (cfg.hasFooter) {
		var pv;
		pv = jQuery('<div />')
						.addClass(cfg.pageViewingRecordsInfoClass)
						.css({
							"float": "right",
							"color": "#FFF"
						})
						.extend({
							updateViewInfo : function(loaded_rows, page){
								var _start;
								if (cfg.paging) {
									if (loaded_rows>0)
										_start = (cfg.recordsPerPage * (page - 1) + 1);
									else
										_start = 0;
								} else{getGridRowIndex
									_start = (loaded_rows * (page - 1) + 1);
								}
									
								var _end;
								if (cfg.paging) {
									_end   = ( (cfg.recordsPerPage * page) > cfg.totalRecords ? cfg.totalRecords : cfg.recordsPerPage * page );
								} else {
									_end = cfg.totalRecords;
								}
								this.html('Viewing Rows ' + _start + ' - ' + _end + ' of ' + cfg.totalRecords+'  &nbsp;').addClass("ui-grid-footer");
								return this;
							}
						});
		// update the "viewing x of y" record info
		pv.updateViewInfo(totr, cfg.pageNumber);	
		
		// create our paging control container
		var p 		= jQuery('<div />')
								.addClass(cfg.pageToolbarClass)
//								.height(cfg.pageToolbarHeight)
								.width(b.width())
								.css({
									"float": "left",
									"padding": "3px"
								}).addClass("blueGradientBgcolor")
								.extend({										
										setPage : function(p){
											//Before Paging Action
											var rdo = cfg.onBeforePaging();
											if (rdo!=undefined) {
												if (!rdo) {
													return;
												}
											}
											
											var input = this.find('input.' + cfg.pageInputClass);
											pload.removeClass(cfg.pageLoadingDoneClass);
											g.load( {page : p}, function(){
												input.val(p);
												if (cfg.totalRecords > 0) {
													totr = b.find('tr').length;
													pv.updateViewInfo(totr, p);
												}
												pload.addClass(cfg.pageLoadingDoneClass);
												//add 20120424 jquery
												$("input[type=button]").button();
												setCalendar();
												//After Paging Action
												//cfg.onRowAction("5",totr);
												cfg.onAfterPaging();
											});
											
											return this;
										},
										getPage : function(){
											var p = Number(this.find('input.' + cfg.pageInputClass).val());
											if (isNaN(p)){
												p = 1;
											}
											return p;
										},
										isPageValModified: function() {
											var p = false;
											$("input[name^="+cfg.rowActionFlg+"][type='hidden'][value!='']",b).each(function() {
												p = true;
											});
											$("input[name^="+cfg.rowActionFlg+"][type='hidden']",d).each(function() {
												p = true;
											});
											
											return p;
										},
										isPageDataAdded: function() {
											var p = false;
											$("input[name^="+cfg.rowActionFlg+"][type='hidden'][value='2']",b).each(function() {
												p = true;
											});
											return p;
										},
										delRow : function() {
											var rdo = cfg.onBeforeDelRow(totr);
											if (rdo!=undefined) {
												if (!rdo) {
													return;
												}
											}
											if (cfg.totalRecords > 0) {
												var selrows = g.getSelectedRowIds();
												var changeitemNum;
												var rowid_s, rowid_d;
												var tr_html;
												for (i=0; i<selrows.length; i++) {
													//直接削除しなく、ｱｸｼｮﾝﾌﾗｸﾞに0を立てる
													//getObj(jQuery(rows[i]).attr('id')).style.display='none';
													rowid_s = selrows[i];
													//alert(rowid_s);
													if (cfg.useTemplateRow) {
														changeitemNum = parseInt(rowid_s.substring(cfg.rowId.length)) + cfg.rowBegin-1;
													} else {
														changeitemNum = parseInt(rowid_s.substring(cfg.rowId.length)) + cfg.rowBegin;
													}
													if ($("#"+cfg.rowActionFlg+changeitemNum,b).val()!="2") {
														$("#"+cfg.rowActionFlg+changeitemNum,b).val("0");
														tr_html = jQuery("#"+rowid_s,b).html();
														g.delRowForBody($("#"+rowid_s,b)[0],$("#"+rowid_s,b).get(0).rowIndex);
		
														rowid_d = $("table",d).find('tr').length+"_d";
														var r = $("table",d).append($("<tr id="+rowid_d+">")
																			.html(tr_html));
													} else {
														g.delRowForBody($("#"+rowid_s,b)[0],$("#"+rowid_s,b).get(0).rowIndex);
													}
													cfg.totalRecords--;

												}
												totr = b.find('tr').length;
												pv.updateViewInfo(totr, p.getPage());
												if (!cfg.hasScroll) {
													b.height(totr * cfg.bodyHeight + 1);
												}
												g.initStylesAndWidths();
												cfg.onAfterDelRow(totr);
											}
										},
										addRow : function() {
											var rdo = cfg.onBeforeAddRow(totr);
											if (rdo!=undefined) {
												if (!rdo) {
													return;
												};
											}
											if (cfg.totalRecords > 0 && cfg.rowsMax>0 && cfg.totalRecords>cfg.rowsMax-1) {
												alert(cfg.rowsMaxMessage);
												return;
											}
											totr = b.find('tr').length;
											var trs;
											var td_html,preitemid;
											//copy source
											if (cfg.useTemplateRow) {
												//ﾃﾝﾌﾟﾚｰﾄ行を利用の場合
												trs = t.find('tbody>tr:first');
												preitemid = "0";
											} else {
												if (totr > 0) {
												if (cfg.addRowMethod==1) {
														//ｺﾋﾟｰ元は一行目ﾃﾞｰﾀ場合
														trs = b.find('tbody>tr:first');
														
													} else if (cfg.addRowMethod==2) {
														//ｺﾋﾟｰ元は最後行目ﾃﾞｰﾀ場合
														trs = b.find('tbody>tr:last');
													}
													preitemid = trs.attr("id");
													preitemid = preitemid.substring(cfg.rowId.length);
												} else {
													//Grid行全削除の場合
													trs = t.find('tbody>tr:first');
													preitemid = cfg.rowBegin;
												}
											}
											//add row to body
											b.find('tbody').append($("<tr id="+cfg.rowId + rows+">"));

											//get body's last row
											var trl =  $("#"+cfg.rowId+rows,b);
											//row's label
											var itemlabel;
											var ci,co,oi,rc;
											var tdstyle;
											
											if (cfg.useTemplateRow) {
												itemlabel = parseInt(rows);
												oi = 0;
												rc = parseInt(rows) + cfg.rowBegin-1;
											} else {
												itemlabel =parseInt(rows)+1;
												oi = parseInt(preitemid) + cfg.rowBegin;
												rc = parseInt(rows) + cfg.rowBegin;
											}

											//cells of copy source 
											$("td", trs).each(function(){
												//alert($(this).width());
												td_html = $(this).html();
												ci = cfg.colDataId[$(this).attr("_colid")];
												co = ci + oi;
												if (td_html.indexOf(co)>-1) {
													var suffixs = td_html.split(co);
													td_html = "";
													for (var indexSu = 0; indexSu < suffixs.length; indexSu++) {
														if (indexSu == suffixs.length - 1) {
															td_html += suffixs[indexSu].replace('[0]','['+(rc-1)+']');
														} else {
															td_html += suffixs[indexSu].replace('[0]','['+(rc-1)+']') + ci+rc;
														}
													}
												}
												if ($(this).css("width")=="0px") {
													tdstyle = " _colid='"+$(this).attr("_colid")+"'";
												} else {
													tdstyle = " _colid='"+$(this).attr("_colid")+"'";
												}
												if (cfg.colDataType[$(this).attr("_colid")] == '0') {
													actflg = cfg.rowActionFlg+rc;
													delchkflg = cfg.rowDelChkFlg+rc;
													//ｱｸｼｮﾝﾌﾗｸﾞを2（追加ﾌﾗｸﾞ）設定
													trl.append(
															$("<td "+tdstyle+">")
																	.html("<input style='float:left;' type=checkbox id='"+ delchkflg+"' name='"+delchkflg+ "'>"+itemlabel+"<input type=hidden id="+actflg+" name="+actflg+" value='2'/>")
																	.addClass(cfg.colClasses[0])
																	.addClass("l")
																	.css("width",(cfg.colWidths[$(this).attr("_colid")]-3)+"px")
													);
												} else if (cfg.colDataType[$(this).attr("_colid")] == '2') {
													//alert(tdstyle);
													var e;
													if( $("textarea,select",$(this)).length ){
														e=3;
														//alert($("textarea,select",$(this)).width());
													} else if( $("input:checkbox",$(this)).length ){
														e=0;
													} else {
														e=2;
													}
													trl.append(
															$("<td "+tdstyle+" style=\"overflow:hidden;\">")
																	.html(td_html)
																	.addClass(cfg.colClasses[$(this).attr("_colid")])
																	.addClass("o")
																	//.width(cfg.colWidths[$(this).attr("_colid")]-e+"px")
																	//.html( jQuery('<div />').html(td_html).css('overflow', 'hidden') )
																	//.innerWidth($(this).width())
													);

												} else if (cfg.colDataType[$(this).attr("_colid")] == '1') {
													trl.append(
															$("<td "+tdstyle+">")
																	.html(td_html)
																	.addClass(cfg.colClasses[$(this).attr("_colid")])
																	.addClass("o")
																	//.css("width",cfg.colWidths[$(this).attr("_colid")]+"px")
																
													);
												}
											});
											$("td", trl).each(function(){
												td_html = $(this).html();
												if (cfg.colDataType[$(this).attr("_colid")] == '0') {

												} else if (cfg.colDataType[$(this).attr("_colid")] == '2') {

													$('input.calendar',$(this)).datepicker({showButtonPanel:true});
																								
												} else if (cfg.colDataType[$(this).attr("_colid")] == '1') {
													$('input:text,input:hidden',$(this)).val("");
																						
													$('textarea',$(this)).val("");
													
													$("input[type='radio']:checked" ,$(this)).attr("checked",false);
													
													$('select option:selected' ,$(this)).attr("checked",false);

													$('input.calendar',$(this)).datepicker({changeMonth: true,changeYear: true});
													
												}
												
												// select項目のoptionスタイル対応（グリッド行追加時）
												SF.setOptionStyleBySelect($(this));
												
											});
											
											totr = b.find('tr').length;
											if (cfg.hasScroll) {
												b.scrollTop(totr * cfg.bodyHeight);
											} else {
												b.height(totr * (cfg.bodyHeight) + 1);
											}
											g.initStylesAndWidths();
											cfg.onAfterAddRow(rows);
											cfg.totalRecords++;
											rows ++;
											pv.updateViewInfo(totr, p.getPage());
											//ﾘｽﾄのﾃﾞｰﾀ件数をhtmlｵﾌﾞｼﾞｪｸﾄの値に設定する
											g.setRowsToObject();
											g.setKeyDownbind(b);
											if (cfg.isHavingContextMenu) {
												getContextMenu();
												resetFile();
											}
											
											if (cfg.setSelect2ItemIDs.length > 0) {
												for (var i = 0; i < cfg.setSelect2ItemIDs.length; i++) {
													var $obj = $("select[id^=" + cfg.setSelect2ItemIDs[i] + "]", trl);
													$obj.select2();
													var select2Div = $("div#s2id_" + $obj.attr("id"));
													select2Div.height(select2Div.height() + 2);
													if (select2Div.find("a span").length > 0) {
														$(select2Div.find("a span")[0]).css("text-align", "left");
													}
												}
											}
											
											SF.buttonInitListener();
											$('input',trl).iCheck({
										        checkboxClass: 'icheckbox_flat-green',
										        radioClass: 'iradio_flat-green'
										    });
											$("input:radio",trl).unbind("ifChecked").bind("ifChecked", function () {
									            $(this).trigger("click");
									        });
											$("input:checkbox",trl).unbind("ifChanged").bind("ifChanged", function (e) {
									            $(this).trigger("click");
									            if ($(this).prop("checked")) {
										    		$(this).val("1");
										    	} else {
										    		$(this).val("0");
										    	}
									        });
											$('input.calendar',trl).removeClass("hasDatepicker");
											SF.setCalendar();
									}
										
								});
		var pb1, pb2, pb3, pload, pform, pb4, addrowofpaging, delrowofpaging, totp;
		if (cfg.totalRecords > 0) {
			totp = Math.ceil(cfg.totalRecords / totr);
		} else {
			totp = 1;
		}
		if (cfg.paging) {
			var pinfo = jQuery('<div />')
						.addClass(cfg.pageInfoClass)
			// first page button
			pb1		= jQuery('<a style=\'cursor: pointer;\'>&laquo;</a>').addClass(cfg.pageStartClass).click(function(){
										if (p.isPageValModified()) {
											if (p.isPageDataAdded()) {
												alert(cfg.pageChangeAddedErr);
												return false;
											}
											if (cfg.isShowpageChangeConfirmMsg && !confirm(cfg.pageChangeConfirmMsg)) {
												return false;
											} else {
												cfg.totalRecords= d.find('tr').length +cfg.totalRecords;
												totr = b.find('tr').length;
												pv.updateViewInfo(totr, p.getPage());
											}
										}
										if (p.getPage() > 1) {
											p.setPage(1);
										}
									});
		
			// prev page button
			pb2		= jQuery('<a style=\'cursor: pointer;\'>&lt;</a>').addClass(cfg.pagePrevClass).click(function(){
										if (p.isPageValModified()) {
											if (p.isPageDataAdded()) {
												alert(cfg.pageChangeAddedErr);
												return false;
											}
											if (cfg.isShowpageChangeConfirmMsg && !confirm(cfg.pageChangeConfirmMsg)) {
												return false;
											} else {
												cfg.totalRecords= d.find('tr').length +cfg.totalRecords;
												totr = b.find('tr').length;
												pv.updateViewInfo(totr, p.getPage());
											}
										}
										var _p = p.getPage();
										if (_p > 1) {
											_p--;
											p.setPage(_p);
										}										
									});
		
			// next page button
			pb3		= jQuery('<a style=\'cursor: pointer;\'>&gt;</a>').addClass(cfg.pageNextClass).click(function(){
										if (p.isPageValModified()) {
											if (p.isPageDataAdded()) {
												alert(cfg.pageChangeAddedErr);
												return false;
											}
											if (cfg.isShowpageChangeConfirmMsg && !confirm(cfg.pageChangeConfirmMsg)) {
												return false;
											} else {
												cfg.totalRecords= d.find('tr').length +cfg.totalRecords;
												totr = b.find('tr').length;
												pv.updateViewInfo(totr, p.getPage());
											}
										}
										var _p = p.getPage(); //get current page
										_p++;	//page plus
										// if next page is not big than total pages
										if (_p <= totp) p.setPage(_p);
									});

			// loading indicator
			pload	= jQuery('<div />').addClass(cfg.pageLoadingClass).addClass(cfg.pageLoadingDoneClass);
			var pfld;
			if (cfg.showPaging) {
				// page field & form
				pfld  = jQuery('<input type="text" value="' + cfg.pageNumber + '"/>').addClass(cfg.pageInputClass);
			} else {
				// page field & form
				pfld  = jQuery('<input type="text" value="' + cfg.pageNumber + '" readonly/>').addClass(cfg.pageInputClass);
			}
				pinfo.append(pfld);
				pform = jQuery('<form></form>').append(pinfo).submit(function(){
										if (p.isPageValModified()) {
											if (p.isPageDataAdded()) {
												alert(cfg.pageChangeAddedErr);
												return false;
											}
											if (cfg.isShowpageChangeConfirmMsg && !confirm(cfg.pageChangeConfirmMsg)) {
												return false;
											} else {
												cfg.totalRecords= d.find('tr').length +cfg.totalRecords;
												totr = b.find('tr').length;
												pv.updateViewInfo(totr, p.getPage());
											}
										}
										var _p = parseInt(p.getPage());
										if (_p) {
											if (totp) {
												if (_p <= totp) p.setPage(_p);
											} else if (_p > 0) {
												p.setPage(_p);
											}
										} else {
											alert(cfg.pageChangeTargetErr);
										}
										return false;
									});
			
			// last page button & info (if we know total records)
			if (cfg.totalRecords >= 0) {
				var tdats = jQuery('<span id="tp" name="tp" />').append(totp);
				pinfo.html('Page ' + pinfo.html() + ' of ');
				pinfo.append(tdats);
				pb4		= jQuery('<a style=\'cursor: pointer;\'>&raquo;</a>').addClass(cfg.pageEndClass).click(function(){
										if (p.isPageValModified()) {
											if (p.isPageDataAdded()) {
												alert(cfg.pageChangeAddedErr);
												return false;
											}
											if (cfg.isShowpageChangeConfirmMsg && !confirm(cfg.pageChangeConfirmMsg)) {
												return false;
											} else {
												cfg.totalRecords= d.find('tr').length +cfg.totalRecords;
												totr = b.find('tr').length;
												pv.updateViewInfo(totr, p.getPage());
											}
										}
										var _p = p.getPage(); _p++;
										if (totp) {
											 if (_p <= totp) p.setPage(totp);
										}
									});
			} else {
				pinfo.html('Page ' + pinfo.html());
			}
			if (!cfg.showPaging) {
				pb1.hide();
				pb2.hide();
				pb3.hide();
				pb4.hide();
			}
		}
		
		// add data indicator
		var paddrow;
		if (cfg.rowAdd) {
			paddrow	= jQuery('<a id='+ab_id+' name='+ab_id+' class=\'grid-page-addrow\'><i style=\'cursor: pointer;\' class=\'' + cfg.pageAddrowClass + '\' aria-hidden="true"></i></a>').click(function(){
				if (cfg.paging) {
					
					if (cfg.totalRecords > 0) {
						totp = Math.ceil(cfg.totalRecords / cfg.recordsPerPage);
					} else {
						totp = 1;
					}
					if (p.getPage() == totp) {
						
						// the last page
						if (cfg.totalRecords < cfg.recordsPerPage*totp) {
							p.addRow();
						} else {
							if (p.isPageValModified()) {
								if (p.isPageDataAdded()) {
									alert(cfg.pageChangeAddedErr);
									return false;
								}
								if (cfg.isShowpageChangeConfirmMsg && !confirm(cfg.pageChangeConfirmMsg)) {
									return false;
								} else {
									cfg.totalRecords= d.find('tr').length +cfg.totalRecords;
									totr = b.find('tr').length;
									pv.updateViewInfo(totr, p.getPage());
								}
							}

							totp++;
							p.find('input.' + cfg.pageInputClass).val(totp);
							b.find('tbody').html("");
							$("#tp",p).html(totp);
							p.addRow();
						}
					} else {
						
						// not the last page
						if (cfg.totalRecords < cfg.recordsPerPage*totp) {
							if (p.isPageValModified()) {
								if (p.isPageDataAdded()) {
									alert(cfg.pageChangeAddedErr);
									return false;
								}
								if (cfg.isShowpageChangeConfirmMsg && !confirm(cfg.pageChangeConfirmMsg)) {
									return false;
								} else {
									cfg.totalRecords= d.find('tr').length +cfg.totalRecords;
									totr = b.find('tr').length;
									pv.updateViewInfo(totr, p.getPage());
								}
							}
							$("#tp",p).html(totp);
							addrowofpaging = true;
							p.setPage(totp);

						} else {
							if (p.isPageValModified()) {
								if (p.isPageDataAdded()) {
									alert(cfg.pageChangeAddedErr);
									return false;
								}
								if (cfg.isShowpageChangeConfirmMsg && !confirm(cfg.pageChangeConfirmMsg)) {
									return false;
								} else {
									cfg.totalRecords= d.find('tr').length +cfg.totalRecords;
									totr = b.find('tr').length;
									pv.updateViewInfo(totr, p.getPage());
								}
							}
							
							totp++;
							p.find('input.' + cfg.pageInputClass).val(totp);
							b.find('tbody').html("");
							$("#tp",p).html(totp);
							p.addRow();
						}
					}
				} else {
					addrowofpaging = false;
					p.addRow();
				}
			})
		}
		// delete data indicator
		var pdelrow;
		if (cfg.rowDelete) {
			pdelrow	= jQuery('<a id='+db_id+' name='+db_id+' class="grid-page-delrow"><i style=\'cursor: pointer;\' class=\'' + cfg.pageDelrowClass + '\' aria-hidden="true"></i>').click(function(){
				p.delRow();
			});
		}
		p.append(pb1).append(pb2).append(pform).append(pb3).append(pb4).append(pload).append(paddrow).append(pdelrow).append(pv);
	}
	//delete grid
	var d = jQuery('<div style="display:none"/>')
				.html( jQuery('<table cellpadding="0" style="display:none" cellspacing="0"></table>').html( this.find('tbody') ).addClass(cfg.gridClass) )
					.css('overflow-y', 'scroll')
					.css('float', 'left')
					.css('border-left', '1px solid #CCCCCC')
					.css('border-right', '1px solid #CCCCCC')
					.height(cfg.height);
	//template-row grid
	var t = jQuery('<div style="display:none" _gridtempdiv=1 />')
				.html( jQuery('<table cellpadding="0" cellspacing="0" style="display:none"></table>').html( this.find('tbody') ).addClass(cfg.gridClass) )
					.css('overflow-y', 'scroll')
					.css('float', 'left')
					.css('border-left', '1px solid #CCCCCC')
					.css('border-right', '1px solid #CCCCCC')
					.height(cfg.height);
	
	// create a container div to for our main grid object
	// append & extend grid {g} with header {h}, body {b}, paging {p}, resize handle {z}
	var g = jQuery('<div />');
	
	g.append(hdiv).append(b).append(d).append(t).extend({
		h : h,
		b : b,
		d : d
	});
	//add paging toolbar
	if (cfg.hasFooter) {
		if (cfg.footerPosition == "0") {
			g.prepend(p);
		} else {
			g.append(p);
		}
		g.extend({ p : p })
			.height(cfg.height)
			.width(cfg.width);
	}
	// create gap filler to fill gap over scrollport		
	var gap;
	gap = jQuery('<div />').width(cfg.scrollbarW).addClass(cfg.headerClass).height(cfg.headHeight).css({
		position: 'absolute',
		//position: 'relative',
		zIndex: '0'
	}).appendTo(g);

	//$("#templateDesc").val(g.html());
	
	// a loading modal mask
	var modalmask = jQuery('<div />').html(cfg.loadingHtml).addClass(cfg.loadingClass).css({
		position: 'absolute',		
		zIndex: '1000'
	}).appendTo(g).hide();

	// create methods on our grid object
	var ss;
	g.extend({
		setRows: function (recordsPerPage) {
			cfg.recordsPerPage = recordsPerPage;
		},
		setShow: function (isShow) {
			cfg.isShowpageChangeConfirmMsg = isShow;
		},
		load : function(params, cb) {
			var data = jQuery.extend(cfg.extraParams, params);
			// show loading canvas
			modalmask.width(b.width()+cfg.gridborderWidth*2).show();
			
			if (data.page == undefined) {
				data.page = 1;
			}
			// save selected rows
			g.saveSelectedRows();

			jQuery.ajax({
				type: cfg.type.toUpperCase(),
				url: cfg.url + "&recordNum=" + cfg.recordsPerPage +"&pagingNum="+data.page+"&actflg="+cfg.actionFlg+"&recognID="+getObj("recognID").value ,//+"actflg 1:insert 2:update",
				data: data,
				success: function(result){
					if(result == "") {
						alert('Error: Empty result.');
						return;
					}
					// for JSON return type
					if (cfg.dataType == 'json') {
						var jrows  = eval( '(' + result + ')' );
						alert('json = ' + jrows);
					}
					// for HTML (Table) return type
					if (cfg.dataType == 'html') {
						var $tbl = jQuery(result);
						var row  = $tbl.find('tr:first');
						if ( jQuery(row).find('td').length == cfg.colWidths.length ) {
							// setting width on first row keeps it from "blinking"
							jQuery(row).find('td').each(function(i){
								jQuery(this).width( g.getHeader(i).css('width') )								
							});
							// now swap the tbody's
							b.find('tbody').html($tbl.find('tbody').html());
							if (!cfg.hasScroll) {
								b.height(cfg.bodyHeight * b.find('tr').length);
							}
							g.initGrid();
							// remember the last loaded state for this grid?
							g.saveState(data);
							
							// if add row then add
							if (addrowofpaging) {
								p.addRow();
								addrowofpaging = false;
							}
							// clear deleted rows buffer
							d.find("table").html("");
							// call function
							cfg.onAfterSort();

						} else if (row.length < 1) {
							//no rows returned
						} else {
							// inconsistent results... too many (or too few) columns returned
							alert('Error: Total columns returned [' + $tbl.find('tbody tr:first td').length + '] do not match Ingrid ['+ cfg.colWidths.length +'].');
						}
					}
					if (cb) cb();
				},
				error: function(){
					alert('Error: Could not load "' + cfg.url + '". Please check the URL and try again. ');
				},
				complete: function(){
					modalmask.hide();
				}
			});
			return this;
		},
		
		// returns JSON
		getState : function() {
			var props = {
				url : 'nothing'				
			}
			return props;
		},
		
		saveState : function(data){

			if (jQuery.cookie) {
				// save page #, column sort & dir
				var g_id  		= this.attr('id');
				var param_str = 'page=' + data.page + ',sort=' + data.sort + ',dir=' + data.dir;
				jQuery.cookie(g_id, param_str, {expires: cfg.cookieExpiresDays, path: cfg.cookiePath});
			}
					
		},
		
		saveSelectedRows : function() {
			if (jQuery.cookie) {
				var row_ids		= g.getSelectedRowIds();
				if (row_ids.length > 0) {
					jQuery.cookie( this.attr('id') + '_rows', row_ids.join(','), {expires: cfg.cookieExpiresDays, path: cfg.cookiePath});
				}				
			}
		},
		
		// returns <th> els
		getHeaders : function(cb) {
			var ths = this.find('th');
			if (cb) {
				ths.each(function(){
					cb(jQuery(this));							 
				});
				return this;
			} else {
				return ths;
			}
		},
		
		// returns single <th> el
		getHeader : function(i, cb) {
			var th = this.find('th').slice(i, i+1);
			if (cb) {
				cb(jQuery(this));
				return this;
			} else {
				return th;
			}
		},
		
		// returns <td> els in column i
		getColumn : function(i, cb) {
			var tds = this.find("tbody td[" + cfg.columnIDAttr + "='" + i + "']");
			if (cb) {
				tds.each(function(){
					cb(jQuery(this));							 
				});
				return this;
			} else {
				return tds;							 
			}
		},
		
		// returns <tr> els
		getRows : function(cb) {
			var trs = $("#"+this.attr("id")+"_b",this).find("tbody tr");
			if (cb) {
				trs.each(function(){
					cb(jQuery(this));							 
				});
				return this;
			} else {
				return trs;							 
			}
		},
				
		// returns <tr> els
		getSelectedRows : function() {
			return this.find("tbody tr[_selected='true']");
		},
		
		// returns an array of IDs (current view)
		getSelectedRowIds : function() {
			var selrows 			= g.getSelectedRows();
			var row_ids		= [];
			for (i=0; i<selrows.length; i++) {
				if ( jQuery(selrows[i]).attr('id') ) row_ids.push( jQuery(selrows[i]).attr('id') );
			}
			return row_ids;
		},
		
		// returns an array of IDs (saved in cookie)		
		getSavedRowIds : function() {
			var row_ids = [];
			if (jQuery.cookie) {
				var str_ids = jQuery.cookie( this.attr('id') + '_rows' );
				if (str_ids) row_ids = str_ids.split(',');
			}			
			return row_ids;
		},
		
		// delete row(jQuery("#"+rowid_s)[0], $("#"+rowid_s).attr("rowIndex"))
		delRowForBody : function(o,i) {
			
			while (o.tagName.toLowerCase() != 'table') {
				o = o.parentNode;
			}
			o.deleteRow(i);
		},
		
		resize : function() {
			// set body table width based on header table 
			// minimize calls to width() and offset()
			var outer_w;
			outer_w = h.outerWidth();// + cfg.gridborderWidth;
			b.width(outer_w);
			if (p) p.width(outer_w-5);
			if (gap) {
				var pos = h.offset();
				gap.css('left', (outer_w - cfg.scrollbarW + pos.left)+"px").css('top', pos.top).hide();
			}
		},
		
		setRowsToObject : function() {
			//ﾘｽﾄのﾃﾞｰﾀ件数をhtmlｵﾌﾞｼﾞｪｸﾄの値に設定する
			if (cfg.rowsObjectId) {
				$("#"+cfg.rowsObjectId).val(rows-cfg.rowBegin);
			}
		},
		
		setKeyDownbind : function(o) {
			var txt;
			$("input:text,input:password,input:button,input:checkbox,textarea,image",o)
				.unbind('keyup')
				.bind(
					"keyup", function() {
						if (oriVal == $(this).val()) {
						} else {
							var s = getObjectParentByTagname($(this),"tr").attr("id");
							s = s.substring(cfg.rowId.length);
							csr(cfg.rowActionFlg,s,rb);
						}
					}
				)
				.unbind('keydown')
				//↑、↓移動
				.bind(
					"keydown",function() {
						oriVal = $(this).val();
					}
				)
				.bind('keyup', 'down', function(evt){
					var keyCode = evt.keyCode;
					/* 「↓」キーではない場合 */
					if (keyCode != 40) {
						return;
					}
					var c = getCommonGridColIndex($(this));
					var r = getCommonGridRowIndex($(this));
					var t = getObjectParentByTagname($(this),"table");
					var rh;
					if (r < t[0].rows.length-1) {
						r++;
						rh = t[0].rows[r].cells[c];
						txt=$("input:text,input:button,input:checkbox,textarea,image",$(rh));
						txt.focus();
						if ((txt.get(0).tagName.toLowerCase()=="input")&&((txt.attr("type").toLowerCase()=="text"))
								||txt.get(0).tagName.toLowerCase()=="textarea") {
							txt.select();
						}
					}
				})
				.bind('keyup', 'up', function(evt){
					var keyCode = evt.keyCode;
					/* 「↑」キーではない場合 */
					if (keyCode != 38) {
						return;
					}
					var c = getCommonGridColIndex($(this));
					var r = getCommonGridRowIndex($(this));
					var t = getObjectParentByTagname($(this),"table");
					var rh;
					if (r>0) {
						r--;
						rh = t[0].rows[r].cells[c];
						txt=$("input:text,input:button,input:checkbox,textarea,image",$(rh));
						txt.focus();
						
						if ((txt.get(0).tagName.toLowerCase()=="input")&&((txt.attr("type").toLowerCase()=="text"))
								||txt.get(0).tagName.toLowerCase()=="textarea") {
							txt.select();
						}
					}
				}
			);
				
		},
		
		initGrid : function() {
			cfg.rowSelection = cfg.rowDelete;
			
			var tt = new Date();
			var colWidths = new Array();
			// make one pass of the grid, 
			// initialize properties on rows & columns
			var str_ids = '|' + g.getSavedRowIds().join('|') + '|';

			var rowseq = 0;
			this.getRows().each(function(r){
				//set height for every row
				jQuery(this).css('height',cfg.bodyHeight+"px");
				//clickﾌｧｸｼｮﾝをUnbind
				jQuery(this).unbind('dblclick');
				//hoverｱｸｼｮﾝをUnbind
				jQuery(this).unbind("mouseenter").unbind("mouseleave");
				$(this).find('td:first').find('input:checkbox').unbind('click');
				
				//行のIDを設定
				if (cfg.autoRowId) {
					jQuery(this).attr("id",cfg.rowId + rowseq);
					rowseq ++;
				}
				// custom row styles (striping, etc) & hover
				if (cfg.rowClasses.length > 0) {
					for (i=0; i<cfg.rowClasses.length; i++) {
						jQuery(this).removeClass(cfg.rowClasses[i]);	
					}
					var cursor = (r == 0 ? 0 : r % cfg.rowClasses.length);
					if (cfg.rowClasses[cursor] != '') {
						// custom row class
						jQuery(this).addClass(cfg.rowClasses[cursor]);
					}
					
					if (cfg.rowHoverClass != '') {
						// hover class
						jQuery(this).hover(
							function() { if (jQuery(this).attr('_selected') != 'true') {jQuery(this).removeClass(cfg.rowClasses[cursor]).addClass(cfg.rowHoverClass);} },
							function() { if (jQuery(this).attr('_selected') != 'true') {jQuery(this).removeClass(cfg.rowHoverClass).addClass(cfg.rowClasses[cursor]);} }
						);
					}
				}
				//version 6.1
				if (cfg.rowSelection == true) {
					$(this).find('td:first[_sf_icheck!=true]')
					.attr("_sf_icheck", true)
					.on('ifChanged', function(event){
						var valueObj = $("input[type=checkbox]",$(this));
						valueObj.trigger("check");
						if (valueObj.is(":checked")) {
							valueObj.val("1");
						} else {
							valueObj.val("0");
						}
						var chktr = jQuery(this).parent();
						if (chktr.attr('_selected')) {
							chktr.attr('_selected') == 'true' ?
								chktr.attr('_selected', 'false').removeClass(cfg.rowSelectedClass) :
								chktr.attr('_selected', 'true').addClass(cfg.rowSelectedClass);
							
						} else {
							chktr.attr('_selected', 'true').addClass(cfg.rowSelectedClass);
						}
					
						if (cfg.onRowSelect) {
							cfg.onRowSelect(this, (chktr.attr('_selected') == 'true' ? true : false) );
						}
					});	
					if (cfg.setSelect2ItemIDs.length > 0) {
						for (var i = 0; i < cfg.setSelect2ItemIDs.length; i++) {
							var $obj = $("td select[id^=" + cfg.setSelect2ItemIDs[i] + "]",  $(b.find("tbody tr[id!="+cfg.rowId+"0]")));
							$obj.select2();
							$obj.each(function () {
								var _this = $(this);
								var select2Div = $("div#s2id_" + _this.attr("id"));
								select2Div.height(select2Div.height() + 2);
								if (select2Div.find("a span").length > 0) {
									$(select2Div.find("a span")[0]).css("text-align", "left");
								}
							});
						}
					}
					// previously selected rows
					if (jQuery(this).attr('id') && str_ids.indexOf( '|' + jQuery(this).attr('id') + '|' ) != -1) {
						jQuery(this).attr('_selected', 'true').addClass(cfg.rowSelectedClass);
					}
				}

				// selection behaviour
				/*if (cfg.rowSelection == true) {
					$(this).find('td:first').find('input:checkbox').click(function(){
						var chktr = jQuery(this).parent().parent();
						if (chktr.attr('_selected')) {
							chktr.attr('_selected') == 'true' ?
								chktr.attr('_selected', 'false').removeClass(cfg.rowSelectedClass) :
								chktr.attr('_selected', 'true').addClass(cfg.rowSelectedClass);
							
						} else {
							chktr.attr('_selected', 'true').addClass(cfg.rowSelectedClass);
						}
					
						if (cfg.onRowSelect) {
							cfg.onRowSelect(this, (chktr.attr('_selected') == 'true' ? true : false) );
						}
					});	

					// previously selected rows
					if (jQuery(this).attr('id') && str_ids.indexOf( '|' + jQuery(this).attr('id') + '|' ) != -1) {
						jQuery(this).attr('_selected', 'true').addClass(cfg.rowSelectedClass);
					}
				}*/
				
	/*			$(this).find('td input').each(function () {
					var _this = $(this);
					if (_this[0].type == "radio"
						|| _this[0].type == "checkbox") {
						var parentObj = _this.parent("div");
						if (parentObj.length > 0) {
							var trObj = parentObj.parents("tr[id^=rowseq]");
							parentObj.css({
								"height" : trObj.height() + "px",
								"line-height" : trObj.height() + "px"
							});
						}
					}
				});
	*/			
				if (cfg.colsetting) {
					// setup column IDs & classes on row's cells
					jQuery(this).find('td').each(function(i){
						// column IDs & width
						// wrap the cell text in a div with overflow hidden, so cells aren't stretched wider by long text
						
						//textbox時に幅とｽﾀｲﾙ調整
						var $c = $("input:button,input:text,select,textarea",$(this));
						if( $c.length ){
							$c.width((parseInt(cfg.colWidths[i])-2));
							if ($c.get(0).tagName.toLowerCase()=="textarea") {
								$c.height(parseInt(cfg.bodyHeight)-2);
							}
							if (cfg.colClasses.length > 0) {
								if (cfg.colClasses[i] != '') {
									$c.addClass(cfg.colClasses[i]);
								}
							}
							$(this).addClass("o");
						} else {
							$(this).addClass("l");
						}
						var txt = jQuery(this).html();
					
						jQuery(this).attr(cfg.columnIDAttr, i)
												.width(cfg.colWidths[i])
												.html( jQuery('<div />').html(txt).css('overflow', 'hidden') );

						// column colors
						if (cfg.colClasses.length > 0) {
							if (cfg.colClasses[i] != '') {
								jQuery(this).addClass(cfg.colClasses[i]);
							}
						}
					});
				}
			});

			//↑、↓移動
			g.setKeyDownbind(b);

			$("#sssss").val(g.html());

			if (cfg.isAutoHeight == "1") {
				var gridObj = $("div[id=" + g.attr("id") + "_b]");
				var minusHeight = cfg.pageTargetTop;
				var browserObj = $.browser;
				if (browserObj.msie) minusHeight += 99;//16;
				else if (browserObj.chrome) minusHeight += 98;//15;
				else if (browserObj.mozilla) minusHeight += 120;//15;
				var autoHeight = getGridAutoHeight(gridObj) - minusHeight;
				gridObj.height(autoHeight);
				g.height(autoHeight);
				g.parent("div").height(autoHeight);
			}

			if ("1" == cfg.effectDisplay) {
				var gridDivObj = $("#" + jQuery(this).attr("id"));
				gridDivObj.parent("div").css({
					"width" : gridDivObj.width() + 19,
					"height" : gridDivObj.height() + 28,
					"overflow" : "hidden"
				});
			}
			
			SF.initPageStyle();
			
		},
		
		initStylesAndWidths : function() {
			

			this.getRows().each(function(r){
				//set height for every row
				jQuery(this).css('height',cfg.bodyHeight+"px");
				//clickﾌｧｸｼｮﾝをUnbind
				jQuery(this).unbind('dblclick');
				//hoverｱｸｼｮﾝをUnbind
				jQuery(this).unbind("mouseenter").unbind("mouseleave");
				//$(this).find('td:first').find('input:checkbox').unbind('click');
				
				// custom row styles (striping, etc) & hover
				if (cfg.rowClasses.length > 0) {
					for (i=0; i<cfg.rowClasses.length; i++) {
						jQuery(this).removeClass(cfg.rowClasses[i]);	
					}
					var cursor = (r == 0 ? 0 : r % cfg.rowClasses.length);
					if (cfg.rowClasses[cursor] != '') {
						// custom row class
						jQuery(this).addClass(cfg.rowClasses[cursor]);
					}
					
					if (cfg.rowHoverClass != '') {
						// hover class
						jQuery(this).hover(
							function() { if (jQuery(this).attr('_selected') != 'true') {jQuery(this).removeClass(cfg.rowClasses[cursor]).addClass(cfg.rowHoverClass);} },
							function() { if (jQuery(this).attr('_selected') != 'true') {jQuery(this).removeClass(cfg.rowHoverClass).addClass(cfg.rowClasses[cursor]);} }
						);
					}
				}
				
				// selection behaviour
				if (cfg.rowSelection == true) {
					$(this).find('td:first[_sf_icheck!=true]')
					.attr("_sf_icheck", true)
					.on('ifChanged', function(event){
						var valueObj = $("input[type=checkbox]",$(this));
						valueObj.trigger("check");
						if (valueObj.is(":checked")) {
							valueObj.val("1");
						} else {
							valueObj.val("0");
						}
												
						var chktr = jQuery(this).parent();
						if (chktr.attr('_selected')) {
							chktr.attr('_selected') == 'true' ?
								chktr.attr('_selected', 'false').removeClass(cfg.rowSelectedClass) :
								chktr.attr('_selected', 'true').addClass(cfg.rowSelectedClass);
							
						} else {
							chktr.attr('_selected', 'true').addClass(cfg.rowSelectedClass);
						}
					
						if (cfg.onRowSelect) {
							cfg.onRowSelect(this, (chktr.attr('_selected') == 'true' ? true : false) );
						}
					});	

					/*$(this).find('td:first').find('input:checkbox').click(function(){
						var chktr = jQuery(this).parent().parent();
						if (chktr.attr('_selected')) {
							chktr.attr('_selected') == 'true' ?
								chktr.attr('_selected', 'false').removeClass(cfg.rowSelectedClass) :
								chktr.attr('_selected', 'true').addClass(cfg.rowSelectedClass);
							
						} else {
							chktr.attr('_selected', 'true').addClass(cfg.rowSelectedClass);
						}
						if (cfg.onRowSelect) {
							cfg.onRowSelect(this, (chktr.attr('_selected') == 'true' ? true : false) );
						}
					});	*/
					
				
				}
				
				i = 1;
				if (cfg.colsetting) {
					// setup column IDs & classes on row's cells
					jQuery(this).find('td').each(function(i){
						// column IDs & width
						// wrap the cell text in a div with overflow hidden, so cells aren't stretched wider by long text
						
						//textboxなど時に幅とｽﾀｲﾙ調整
						var $c = $("input:button,input:text,select,textarea",$(this));
						if( $c.length ){
							$c.width((parseInt(cfg.colWidths[i])-2));
							if ($c.get(0).tagName.toLowerCase()=="textarea") {
								$c.height(parseInt(cfg.bodyHeight)-2);
							}
							if (cfg.colClasses.length > 0) {
								if (cfg.colClasses[i] != '') {
									$c.addClass(cfg.colClasses[i]);
								}
							}
							$(this).addClass("hasobject");
						} else {
							$(this).addClass("label");
						}
						var txt = jQuery(this).html();
					
						jQuery(this).attr(cfg.columnIDAttr, i)
												.width(cfg.colWidths[i])
												.html( jQuery('<div />').html(txt).css('overflow', 'hidden') );
	
						// column colors
						if (cfg.colClasses.length > 0) {
							if (cfg.colClasses[i] != '') {
								jQuery(this).addClass(cfg.colClasses[i]);
							}
						}
					});
				}
			});
			if (!cfg.hasScroll) {
				g.height(h.height()+b.height()+p.height());
			}		
		}

	});

	return this.each(function(tblIter){
		
		var g_id = 	cfg.ingridIDPrefix + '_' + jQuery( this ).attr('id') + '_' + tblIter;
		//var g_id = 	jQuery( this ).attr('id');
		var h_id = 	cfg.ingridIDPrefix + '_' + jQuery( this ).attr('id') + '_' + tblIter+'_h';
		var b_id = 	cfg.ingridIDPrefix + '_' + jQuery( this ).attr('id') + '_' + tblIter+'_b';
		var d_id = 	cfg.ingridIDPrefix + '_' + jQuery( this ).attr('id') + '_' + tblIter+'_d';
		var t_id = 	cfg.ingridIDPrefix + '_' + jQuery( this ).attr('id') + '_' + tblIter+'_t';
		var gap_id = 	jQuery( this ).attr('id') + '_' + cfg.gapId;
		
		g.attr( 'id', g_id );
		hdiv.attr( 'id', h_id );
		b.attr( 'id', b_id );
		d.attr( 'id', d_id );
		t.attr( 'id', t_id );
		gap.attr( 'id', gap_id);
		jQuery( this ).replaceWith( g[0] )

		if (p) {
			var p_id = 	cfg.ingridIDPrefix + '_' + jQuery( this ).attr('id') + '_' + tblIter+'_p';
			p.attr( 'id', p_id );
		}
		// init grid styles, etc
		g.initGrid();
		// sync grid size to headers
		g.resize();
		if (cfg.displayWidth == 0) {
			cfg.displayWidth = cfg.width;
		}
		if (cfg.displayWidth != cfg.width) {
			var w = parseInt(cfg.displayWidth,10);
			b.width(w-1);
			if (p) {
				p.width(w-6);
			}
			b.css('overflow-x', 'scroll');
			hdiv.width(w).css('overflow-x', 'hidden');
			g.width(w);
		}
		// 総件数を格納するｵﾌﾞｼﾞｪｸﾄ
		if (!getObj(cfg.rowsObjectId)) {
			b.append($("<input type=hidden id="+cfg.rowsObjectId+" name="+cfg.rowsObjectId+">"));
		}
		
		// 行全部削除する時に追加できるように初期表示時に最初一行を格納する
		var b_first_tr = b.find("tbody>tr:first");
		var rowid_t = $("table",t).find('tr').length+"_t";
		var r = $("table",t).append($("<tr id="+rowid_t+">")
							.html(b_first_tr.html()));

		if (cfg.useTemplateRow) {
			g.delRowForBody(b_first_tr[0], b_first_tr.get(0).rowIndex);
			if (cfg.totalRecords==1&&b.find('tr').length==0){
				rows = 1;
			} else {
				rows = cfg.totalRecords+1;
			}
		} else {
			rows = cfg.totalRecords;
		}
		if (!cfg.hasScroll) {
			var h = b.find('tr').length * cfg.bodyHeight;
			b.height(h);
		}
		if (cfg.displayWidth != cfg.width) {
			b.height(b.height() + 19);
		}

		// initial row action flag
		var ele;
		ele = document.createElement("script");
		ele.type = "text/javascript";
		ele.text += "function "+jQuery( this ).attr('id') + '_clear'+"() {";
		ele.text += "$(\"#"+d_id+">table\").html(\"\");";
		ele.text += "$(\"input:hidden[id*="+cfg.rowActionFlg+"]\",\"#"+g_id+"\").each(function(){";
		ele.text += "if ($(this).val()=='2') {";
		ele.text += "$('select[disabled!=disabled]:not([id*=_0])[_k=1]','#"+g_id+"').attr('disabled','disabled');";
		ele.text += "$('input[disabled!=disabled]:not([id*=_0])[_k=1]','#"+g_id+"').attr('disabled','disabled');";
		ele.text += "}";
		ele.text += "$(this).val(\"\");";
		ele.text += "});";
		ele.text += "}";
		if (cfg.AjaxDoneScriptId == "ad") {
			ele.id = jQuery( this ).attr('id') + '_' + cfg.AjaxDoneScriptId;
		} else  {
			ele.id = cfg.AjaxDoneScriptId;
		}
		document.body.appendChild(ele);
		//set rows to html object
		g.setRowsToObject();
		
		// place the mask accordingly
		modalmask.width( hdiv.width()).height( b.height()).css({
			top: b.top,
			left: b.left
		});

		// load it up?
		if (cfg.savedStateLoad && jQuery.cookie) {
			var param_str = jQuery.cookie(g_id);
			if (!param_str) {
				g.load();
				cfg.initialLoad = false;
			} else {
				// we have a saved state for this grid_id
				var pairs  	= param_str.split(',');
				var params 	= {};
				var hash  	= [];
				for (i=0; i<pairs.length; i++) {
					var prop = pairs[i].split('=');
					hash[prop[0]] = prop[1];
				}
				if (cfg.hasFooter) {
					if (hash['page'].toLowerCase() != 'undefined' && cfg.paging) {
						params.page = hash['page'];
						p.find('input.' + cfg.pageInputClass).val(params.page);
					}
				}
				if (hash['sort'].toLowerCase() != 'undefined' && 
						hash['dir'].toLowerCase() != 'undefined') {
					
					params.sort = hash['sort'];
					params.dir 	= hash['dir'];
					var colid = params.sort;
					// perhaps the sort param is a key, if so, get the id for that key
					if (cfg.colSortParams.length > 0) {
						for (i=0; i<cfg.colSortParams; i++) {
							if (cfg.colSortParams[i] == params.sort) {
								colid = i;
								break;
							}
						}
					}
					
					// set appropriate style on sorted column
					// perhaps we should bind an event to the column <th>, like setSort()?
					// (re-init sortable cols)
					var i2 = 0;
					g.getHeaders(function(col){
						col.find('div:first').each(function() {
							if(cfg.isSortableCol(i2++))
								g.getHeaders(function(th){
									jQuery(this).addClass(cfg.sortNoneClass).removeClass(cfg.sortAscClass).removeClass(cfg.sortDescClass);
								})
						})
					});
					// all this prevents the column from being style-less (and blinking)
					g.getHeader(parseInt(colid)).find('div:first').addClass(cfg.sortNoneClass).removeClass(cfg.sortAscClass).removeClass(cfg.sortDescClass)
																							  .addClass( params.dir == cfg.sortAscParam ? cfg.sortAscClass : cfg.sortDescClass )
																							  .removeClass(cfg.sortNoneClass);
				}					
				if ( params.page || params.sort || params.dir ) {
					g.load(params);
					cfg.initialLoad = false;
				}
			}
		}

		if (cfg.initialLoad) {
			g.load();
		}		
		
		// select項目のoptionスタイル対応（画面初期化時） remove it by luo 20170611
		//SF.setOptionStyleBySelect(b);

	}).extend({

		getObj : g

	});

};

function getGridAutoHeight($gridObj) {
	$document = $(window.parent.document);
	var headObj = $("#head", $document);
	var controlPanelBodyObj = $("#controlpanel").parent("body");
	var dragDivObj = $gridObj.parents("div[id^=dragB]");
	var dragDivHeight = parseInt(dragDivObj.css("top"), 10);
	var needNotPartHeight = headObj.height() + controlPanelBodyObj.height();
	return $(window).height() - needNotPartHeight - (dragDivHeight - controlPanelBodyObj.height());
}
