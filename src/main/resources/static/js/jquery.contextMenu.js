// jQuery Context Menu Plugin
//
// Version 1.00
//
// Cory S.N. LaViska
// A Beautiful Site (http://abeautifulsite.net/)
//
// Visit http://abeautifulsite.net/notebook/80 for usage and more information
//
// Terms of Use
//
// This software is licensed under a Creative Commons License and is copyrighted
// (C)2008 by Cory S.N. LaViska.
//
// For details, visit http://creativecommons.org/licenses/by/3.0/us/
//
var th_selector = "";
var isDesign = false;
if(jQuery)( function() {
	$.extend($.fn, {
		
		contextMenu: function(o, callback) {
			// Defaults
			if( o.menu == undefined ) return false;
			if( o.inSpeed == undefined ) o.inSpeed = 150;
			if( o.outSpeed == undefined ) o.outSpeed = 75;
			// 0 needs to be -1 for expected results (no fade)
			if( o.inSpeed == 0 ) o.inSpeed = -1;
			if( o.outSpeed == 0 ) o.outSpeed = -1;
			// Loop each context menu
			$(this).each( function() {
				var el = $(this);
				var offset = $(el).offset();
				// Add contextMenu class
				$('#' + o.menu).addClass('contextMenu');
				// Simulate a true right click
				$(this).mousedown( function(e) {
					var evt = e;
					//start commented by kanaumi
					//evt.stopPropagation();
					//end commented by kanaumi
					if( evt.button == 2 ) {					
						$(this).mouseup( function(e) {
							e.stopPropagation();
							var srcElement = $(this);
							//alert(e.srcElement.cellIndex);
							srcElement.unbind('mouseup');
							//if( evt.button == 2 ) {
							// Hide context menus that may be showing
							$(".contextMenu").hide();
							// Get this context menu
							var menu = $('#' + o.menu);
							
							if (srcElement.attr("_g") == "35") {
								SF.setStaticTableContextMenu($(e.srcElement).parents("div[id!=target]"));
							} else if (srcElement[0].tagName.toLowerCase() == "table") {
								var dragDivObj = srcElement.parent("div");
								var clickedThObj = $(e.srcElement);
								if(!clickedThObj.hasClass("WF_GRID_CLASS_TH")){
									if (clickedThObj[0].tagName.toLowerCase() == "div") {
										clickedThObj = clickedThObj.parents("th.WF_GRID_CLASS_TH");
									} else {
										clickedThObj.parents("tr").siblings("tr.gridThTr").find("th:eq(" + clickedThObj.parents("td").index() + ")");
									}
									
									// 1列目なので、contextMenuはいらない
									if (clickedThObj.index() == 0) {
										return;
									}
								}
								var clickedThObjTagName = clickedThObj[0].tagName.toLowerCase();
								if (clickedThObjTagName != "th") {
									if (clickedThObjTagName != "font") {
										var itemTdObj = clickedThObj.parent();
										var itemThObj = clickedThObj.parents("tr").siblings();
										clickedThObj = itemThObj.find("th:eq(" + itemTdObj.index() + ")");
									} else {
										clickedThObj = clickedThObj.parent("th");
									}
								}
								if (clickedThObj.hasClass("GridHiddenTH")) {
									var trObj = dragDivObj.find("table tbody tr:eq(0)");
									var hideThObj = $("th.GridHiddenTH", trObj);
									if (hideThObj.index() == clickedThObj.index()) {
										$("li.beforeInsert").show();
										$("li.afterInsert").hide();
									} else {
										$("li.beforeInsert").hide();
										$("li.afterInsert").hide();
									}
								} else {
									$("li.beforeInsert").show();
									$("li.afterInsert").show();
								}
							}
							
							if( $(el).hasClass('disabled') ) return false;
							
							// Detect mouse position
							var d = {}, x, y;
							if( self != null && self.innerHeight ) {
								d.pageYOffset = self.pageYOffset;
								d.pageXOffset = self.pageXOffset;
								d.innerHeight = self.innerHeight;
								d.innerWidth = self.innerWidth;
							} else if( document.documentElement &&
								document.documentElement.clientHeight ) {
								d.pageYOffset = document.documentElement.scrollTop;
								d.pageXOffset = document.documentElement.scrollLeft;
								d.innerHeight = document.documentElement.clientHeight;
								d.innerWidth = document.documentElement.clientWidth;
							} else if( document.body ) {
								d.pageYOffset = document.body.scrollTop;
								d.pageXOffset = document.body.scrollLeft;
								d.innerHeight = document.body.clientHeight;
								d.innerWidth = document.body.clientWidth;
							}
							(e.pageX) ? x = e.pageX : x = e.clientX + d.scrollLeft;
							(e.pageY) ? y = e.pageY : y = e.clientY + d.scrollTop;
							
							// Show the menu
							$(document).unbind('click');
							
							$(menu).css({ top: y, left: x }).fadeIn(o.inSpeed);
				
							// Hover events
							$(menu).find('A').mouseover( function() {
								$(menu).find('LI.hover').removeClass('hover');
								$(this).parent().addClass('hover');
							}).mouseout( function() {
								$(menu).find('LI.hover').removeClass('hover');
							});
							
							// Keyboard
							$(document).keypress( function(e) {
								switch( e.keyCode ) {
									case 38: // up
										if( $(menu).find('LI.hover').size() == 0 ) {
											$(menu).find('LI:last').addClass('hover');
										} else {
											$(menu).find('LI.hover').removeClass('hover').prevAll('LI:not(.disabled)').eq(0).addClass('hover');
											if( $(menu).find('LI.hover').size() == 0 ) $(menu).find('LI:last').addClass('hover');
										}
									break;
									case 40: // down
										if( $(menu).find('LI.hover').size() == 0 ) {
											$(menu).find('LI:first').addClass('hover');
										} else {
											$(menu).find('LI.hover').removeClass('hover').nextAll('LI:not(.disabled)').eq(0).addClass('hover');
											if( $(menu).find('LI.hover').size() == 0 ) $(menu).find('LI:first').addClass('hover');
										}
									break;
									case 13: // enter
										$(menu).find('LI.hover A').trigger('click');
									break;
									case 27: // esc
										$(document).trigger('click');
									break
								}
							});
							
							// When items are selected
							$('#' + o.menu).find('A').unbind('click');
							$('#' + o.menu).find('LI:not(.disabled) A').click( function() {
								$(document).unbind('click').unbind('keypress');
								$(".contextMenu").hide();
								// Callback
								if( callback ) {
									var paramObj = {x: x - offset.left, y: y - offset.top, docX: x, docY: y};
									if ($.browser.mozilla) {
										var srcE = e.target;
									} else {
										var srcE = e.srcElement;
									}
									if (srcE.nodeName.toUpperCase() == 'TH'
											|| srcE.nodeName.toUpperCase() == 'TD') {
										paramObj.cellIndex = srcE.cellIndex;
                    paramObj.rowIndex = srcE.parentNode.rowIndex;
									} else {
										//karanaumi add
										var srcP = srcE.parentNode;
										if (srcP.nodeName.toUpperCase() == 'TH'
											|| srcP.nodeName.toUpperCase() == 'TD') {
											paramObj.cellIndex = srcP.cellIndex;
                      paramObj.rowIndex = srcP.parentNode.rowIndex;
										}
									}
									callback( $(this).attr('href').substr(1), $(srcElement),  paramObj, srcE);
								}
								return false;
							});
							
							// Hide bindings
							setTimeout( function() { // Delay for Mozilla
								$(document).click( function() {
									$(document).unbind('click').unbind('keypress');
									$(menu).fadeOut(o.outSpeed);
									return false;
								});
							}, 0);
						});
					}
				});
				
				// Disable text selection
				if( $.browser.mozilla ) {
					$('#' + o.menu).each( function() { $(this).css({ 'MozUserSelect' : 'none' }); });
				} else if( $.browser.msie ) {
					$('#' + o.menu).each( function() { $(this).bind('selectstart.disableTextSelect', function() { return false; }); });
				} else {
					$('#' + o.menu).each(function() { $(this).bind('mousedown.disableTextSelect', function() { return false; }); });
				}
				// Disable browser context menu (requires both selectors to work in IE/Safari + FF/Chrome)
				$(el).add($('UL.contextMenu')).bind('contextmenu', function() { return false; });
				
			});

			return $(this);
		},
		
		// Disable context menu items on the fly
		disableContextMenuItems: function(o) {
			if( o == undefined ) {
				// Disable all
				$(this).find('LI').addClass('disabled');
				return( $(this) );
			}
			$(this).each( function() {
				if( o != undefined ) {
					var d = o.split(',');
					for( var i = 0; i < d.length; i++ ) {
						$(this).find('A[href="' + d[i] + '"]').parent().addClass('disabled');
						
					}
				}
			});
			return( $(this) );
		},
		
		// Enable context menu items on the fly
		enableContextMenuItems: function(o) {
			if( o == undefined ) {
				// Enable all
				$(this).find('LI.disabled').removeClass('disabled');
				return( $(this) );
			}
			$(this).each( function() {
				if( o != undefined ) {
					var d = o.split(',');
					for( var i = 0; i < d.length; i++ ) {
						$(this).find('A[href="' + d[i] + '"]').parent().removeClass('disabled');
						
					}
				}
			});
			return( $(this) );
		},
		
		// Disable context menu(s)
		disableContextMenu: function() {
			$(this).each( function() {
				$(this).addClass('disabled');
			});
			return( $(this) );
		},
		
		// Enable context menu(s)
		enableContextMenu: function() {
			$(this).each( function() {
				$(this).removeClass('disabled');
			});
			return( $(this) );
		},
		
		// Destroy context menu(s)
		destroyContextMenu: function() {
			// Destroy specified context menus
			$(this).each( function() {
				// Disable action
				$(this).unbind('mousedown').unbind('mouseup');
			});
			return( $(this) );
		}
		
	});
})(jQuery);