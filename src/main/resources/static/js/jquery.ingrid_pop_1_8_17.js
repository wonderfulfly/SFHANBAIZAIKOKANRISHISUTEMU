/**
 * Ingrid : JQuery Datagrid Control
 *
 * Copyright (c) 2007-2009 Matthew Knight (http://www.reconstrukt.com http://slu.sh)
 * 
 * Dual licensed under the MIT (http://www.opensource.org/licenses/mit-license.php) 
 * and GPL (http://www.opensource.org/licenses/gpl-license.php) licenses.
 *
 * @requires jQuery v1.2+
 * @version 0.9.3
 * @todo load JSON data, etc.
 * 
 * Revision: 0.9.3.0 2009/06/26 Patrice Blanchardie
 * - bug fixes: selection behaviour,
 *              hscroll width,
 *              attribute selector,
 *              result error handler,
 *              header auto-resize
 * - feature: new param: unsortable columns
 *
 */
jQuery.fn.pingrid = function(o){

	var cfg = {
		height: 200, 							// height of our datagrid (scrolling body area)
		
		savedStateLoad : false,					// when Ingrid is initialized, should it load data from a previously saved state?
		initialLoad : false,					// when Ingrid is initialized, should it load data immediately?

		colWidths: [225,225,225,225],			// width of each column
		minColWidth: 30,						// minimum column width
		headerHeight: 30,						// height of our header
//		headerClass: 'grid-header-bg',			// header bg
		headerClass: 'ui-widget-header',			// header bg
		resizableCols: true,					// make columns resizable via drag + drop
		
		hasScroll: false,						// create scroll
		gridClass: 'datagrid',					// class of head & body
		rowClasses: [],							// list of row classes (selected by cursor)
		colClasses: [],							// array of classes : i.e. ['','grid-col-2','','']
//		rowHoverClass: 'grid-row-hover',		// hovering over a row? use this class
		rowHoverClass: 'ui-state-hover',		// hovering over a row? use this class
		rowSelection: false,						// allow row selection?
		rowSelectedClass: 'grid-row-sel',		// selecting a row? use this class
		onRowSelect: function(tr, selected){},	// function to call when row is clicked
		gridborderWidth: 1,						// grid left+right border width
		rowHeight: '0',							// row height
		rowVerticalAlign: '',					// row vertical align
		cellPadding: "",						// cell padding
		
		/* sorting */
		sorting: true,
		colSortParams: [],						// value to pass as sort param when header clicked (i.e. '&sort=param') ex: ['col1','col2','col3','col4']
		sortAscParam: 'asc',					// param passed on ascending sort (i.e. '&dir=asc)
		sortDescParam: 'desc',					// param passed on ascending sort (i.e. '&dir=desc)
		sortedCol: '1',						// current data's sorted column (can be a key from 'colSortParams', or an int 0-n (for n columns)
		sortedColDir: 'asc',					// current data's sorted directions
		sortDefaultDir: 'asc',					// on 1st click, sort tihs direction
		sortAscClass: 'grid-sort-asc',			// class for ascending sorted col
		sortDescClass: 'grid-sort-desc',		// class for descending sorted col
		sortNoneClass: 'grid-sort-none',		// ... not sorted? use this class
		sortDisableClass: 'grid-sort-disable',
		unsortableCols: [],						// do not make theses columns sortable
		
		/* paging */
		paging: true,							// create a paging toolbar
		pageNumber: 1,
		recordsPerPage: 0,
		totalRecords: 0,
		pageToolbarHeight: 25,
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

		/* ajax stuff */
		url: 'remote.php',						// url to fetch data
		type: 'GET',							// 'POST' or 'GET'
		dataType: 'html',						// 'html' or 'json' - expected dataType returned
		extraParams: {},						// a map of extra params to send to the server 				
		loadingClass: 'grid-loading',			// loading modalmask div
		loadingHtml: '<div>&nbsp;</div>',			
		
		/* should seldom change */
		resizeHandleHtml: '',					// resize handle html + css
		resizeHandleClass: 'grid-col-resize',
		scrollbarW: 17,							// width allocated for scrollbar
		columnIDAttr: '_colid',					// attribute name used to groups TDs in columns
		ingridIDPrefix: '_ingrid',				// prefix used to create unique IDs for Ingrid
		isUseGap: true,							// if thickbox, set false
		
		/* cookie, for saving state */
		cookieExpiresDays: 360,
		cookiePath: '/',
		
		/* not yet implemented */
		minHeight: 100,
		resizableGrid: true,
		dragDropCols: true,
		sortType: 'server|client|none',
		minWidth: 466,
		
		/* cfg functions */
		isSortableCol : function(colIndex) {
			if (cfg.unsortableCols.length==0 || jQuery.inArray(colIndex, cfg.unsortableCols)==-1) {
				return true;
			}
			return false;
		}
		
	};

	jQuery.extend(cfg, o);

	//get grid width
	var w=0;
	for (var i = 0; i < cfg.colWidths.length; i++) {
		w = w + cfg.colWidths[i];
	}
	
	var dialogWidth;
	if (w < cfg.minWidth) dialogWidth = cfg.minWidth;
	else dialogWidth = w + 85;
	
	$("#PopDiv").dialog("option", "width", dialogWidth);

	// break into 2 tables: header, body.
	// create header table
	var cols = new Array();
	var h = jQuery('<table cellpadding="0" cellspacing="0"></table>')
					.html(this.find('thead'))
					.addClass(cfg.gridClass)
					.addClass(cfg.headerClass)
					.height(cfg.headerHeight)
					.width(w)
					.extend({
						cols : cols
					});
	// initialize columns
	h.find('th').height(cfg.headerHeight);
	h.find('th').each(function(i){
														 
		// init width;
		jQuery(this).width(cfg.colWidths[i]);

		if (cfg.colWidths[i]==0) {
			jQuery(this).css('display','none');
		}
		
		// put column text in a div, make unselectable
		var col_label = jQuery('<div />')
										.html(jQuery(this).html())
										.css({width:cfg.colWidths[i]-5+"px",  padding: '0 0 0 3px', display: 'block'})
										.css('-moz-user-select', 'none')
										.css('-khtml-user-select', 'none')
										.css('user-select', 'none')
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

				var params = { sort : key, dir : dir };
				
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
		
		// replace contents of <th>
		jQuery(this).html(col_label);
		
		
		// bind an event to easily resize columns
		jQuery(this).bind('resizeColumn', {col_num : i}, function(e, w){
			
			jQuery(this).width(w);	
			
			// auto enlarge while header is > headerHeight
			while(jQuery(this).parent().height()>cfg.headerHeight) {
				jQuery(this).width(++w);
			}
			
			// set body cells to this width
			g.resize();	
			g.getColumn(e.data.col_num).each(function(){
				jQuery(this).width(w);
			});
		});
		
	});
	

	var bt = jQuery('<table cellpadding="0" cellspacing="0"></table>').html( this.find('tbody') ) ;
	var b = jQuery('<div />')
					.html( bt)
					.css('overflow', 'auto')
					.width(w);
	if (cfg.hasScroll) {
		b.height(b.find('tr').length * cfg.rowHeight+10);
	}

	var row = bt.find('tr:first')

	// create body table. surround body with container div for scrolling
	// setting width on first row keeps it from "blinking"
	
	jQuery(row).find('td').each(function(i){
		if (cfg.colWidths[i]==0) {
			jQuery(this).css('display','none');
		} else {
			jQuery(this).width( cfg.colWidths[i] );
		}
	});
  
	bt.width(cfg.width).addClass(cfg.gridClass);

	// create a container div to for our main grid object
	// append & extend grid {g} with header {h}, body {b}, paging {p}
	var g = jQuery('<div />').append(h).append(b).extend({
		h : h,
		b : b
	});

	// ...a loading modal mask
	var modalmask = jQuery('<div />').html(cfg.loadingHtml).addClass(cfg.loadingClass).css({
		position: 'absolute',		
		zIndex: '1000'
	}).appendTo(g).hide();

	// create methods on our grid object
	var ss;
	g.extend({
		load : function(params, cb) {
			var data = jQuery.extend(cfg.extraParams, params);
			
			// show loading canvas
			//modalmask.width(b.width()+cfg.gridborderWidth*2).css({
			modalmask.width( h.width()).height( b.height()).css({
					top: b.top-b.height(),
					left: b.left-h.width()
			}).show();
			
			// save selected rows
			g.saveSelectedRows();
			if (data.sort==0){
				ss=1;
			} else {
				ss=data.sort;
			}
			if ($("#sortnum",$('#PopDiv')).val()==ss) {
				
				if ($("#sortdir",$('#PopDiv')).val() == "asc") {
					$("#sortdir",$('#PopDiv')).val("desc");
				} else {
					$("#sortdir",$('#PopDiv')).val("asc");
				}
				
			} else {
				$("#sortdir",$('#PopDiv')).val("asc");
			}
			$('#sortnum',$('#PopDiv')).val(ss);
			uinu001_ajaxQuery(1,0);
			
			return this;
		},
		
		// returns JSON
		getState : function() {
			
			/*
			alert(this + ' ...is jQuery')
			alert(this[0] + ' ...is the div, id="' + this.attr('id') + '"')
			*/
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
			var trs = this.find("tbody tr");
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
			var rows 			= g.getSelectedRows();
			var row_ids		= [];
			for (i=0; i<rows.length; i++) {
				if ( jQuery(rows[i]).attr('id') ) row_ids.push( jQuery(rows[i]).attr('id') );
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
		
		resize : function() {
			// set body table width based on header table 
			// minimize calls to width() and offset()
			var outer_w = h.width() + cfg.scrollbarW+cfg.gridborderWidth*2;
			b.width(outer_w);
		},
		
		initStylesAndWidths : function() {
			
			var colWidths = new Array();
			this.getHeaders().each(function(i){
				// don't use width() - makes column headers
				colWidths[i] = jQuery(this).width();
			});

			// make one pass of the grid, 
			// initialize properties on rows & columns
			var str_ids = '|' + g.getSavedRowIds().join('|') + '|';
			
			this.getRows().each(function(r){
				
				// custom row styles (striping, etc) & hover
				if (cfg.rowClasses.length > 0) {
					var cursor = (r == 0 ? 0 : r % cfg.rowClasses.length);
					if (cfg.rowClasses[cursor] != '') {
						// custom row class
						jQuery(this).addClass(cfg.rowClasses[cursor]);							
					}
					if (cfg.rowHoverClass != '') {
						// hover class
						jQuery(this).hover(
							function() { if (jQuery(this).attr('_selected') != 'true') jQuery(this).removeClass(cfg.rowClasses[cursor]).addClass(cfg.rowHoverClass); },
							function() { if (jQuery(this).attr('_selected') != 'true') jQuery(this).removeClass(cfg.rowHoverClass).addClass(cfg.rowClasses[cursor]); }
						);
					}
				}
				if (cfg.rowHeight!='0') {
					jQuery(this).css("height",cfg.rowHeight);
				}
				if (cfg.rowVerticalAlign!='') {
					jQuery(this).css("vertical-align",cfg.rowVerticalAlign);
				}
				
				// selection behaviour
				if (cfg.rowSelection == true) {
					jQuery(this).dblclick(function(){
						if (jQuery(this).attr('_selected')) {
							jQuery(this).attr('_selected') == 'true' ?
								jQuery(this).attr('_selected', 'false').removeClass(cfg.rowSelectedClass) :
								jQuery(this).attr('_selected', 'true').addClass(cfg.rowSelectedClass);
							
						} else {
							jQuery(this).attr('_selected', 'true').addClass(cfg.rowSelectedClass);
						}
						if (cfg.onRowSelect) {
							cfg.onRowSelect(this, (jQuery(this).attr('_selected') == 'true' ? true : false) );
						}
					});
					
					// previously selected rows
					if (jQuery(this).attr('id') && str_ids.indexOf( '|' + jQuery(this).attr('id') + '|' ) != -1) {
						jQuery(this).attr('_selected', 'true').addClass(cfg.rowSelectedClass);
					}
				}
				// setup column IDs & classes on row's cells
				jQuery(this).find('td').each(function(i){
					// column IDs & width
					// wrap the cell text in a div with overflow hidden, so cells aren't stretched wider by long text
					if (cfg.colWidths[i]==0) {
						jQuery(this).css('display','none');
					} else {
						var txt = jQuery(this).html();
						
						jQuery(this).attr(cfg.columnIDAttr, i)
												.width((parseInt(cfg.colWidths[i])-2)+"px");
												//.html( jQuery('<div />').html(txt).css('overflow', 'hidden') );
						// column colors
						if (cfg.colClasses.length > 0) {
							if (cfg.colClasses[i] != '') {
								jQuery(this).addClass(cfg.colClasses[i]);
								jQuery(this).addClass("label");
								if (cfg.cellPadding!="") {
									jQuery(this).css("padding",cfg.cellPadding)
								}
							}
						}
					}
				});
			});
			if (cfg.hasScroll) {
				g.height(h.height()+b.height());
			}	
		}			
	});
	
	return this.each(function(tblIter){

		var g_id = 	cfg.ingridIDPrefix + '_' + jQuery( this ).attr('id') + '_' + tblIter;
		g.attr( 'id', g_id );
		jQuery( this ).replaceWith( g[0] )

		// init grid styles, etc
		g.initStylesAndWidths();
		
		// sync grid size to headers
		g.resize();
				
		// place the mask accordingly
		modalmask.width( h.width() + cfg.scrollbarW ).height( b.height());

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
				if (hash['page'].toLowerCase() != 'undefined' && cfg.paging) {
					params.page = hash['page'];
					p.find('input.' + cfg.pageInputClass).val(params.page);
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

	}).extend({
		g : g

	});

};

