// ドロップダウンメニュー

$(document).ready(function(){
	$(".DropdownContent > label").click(function(){
		$(".DropdownContent").not($(this).parent()[0]).removeClass('active');

		$(this).parent().toggleClass('active');
		return false;
	});

	$(document).click(function(e){
		that = e.target;
		if ($(that).closest(".DropdownContent").length < 1 && !$(that).hasClass("DropdownContent")) $(".DropdownContent").removeClass('active');
	});


	$(window).on("load resize",function(){
		$(".DropdownContent > .inner").each(function(){
			var src = $(this).parent().children("label");
			// Position
			var left = src.offset().left + src.outerHeight()/2 - $(this).outerWidth()/2;
			if (left + $(this).outerWidth() > $(window).width()) {
				left = $(window).width() - $(this).outerWidth();
			}
			if (left < 0) left = 0;

			$(this).css({
				left: left,
				top: top
			});
		});
	});
	// ドロップダウンメニュー(メニュー)
    $('#mainmenu').dropdown({
        textClass     : 'arrow',
        textOpenClass : 'open'
    });
    //checkbox, radio
    $('input:radio,input:checkbox', $("#target")).not($('tbody>tr:first input:radio,tbody>tr:first input:checkbox', $("#target"))).iCheck({
        checkboxClass: 'icheckbox_flat-green',
        radioClass: 'iradio_flat-green'
      });
    $("input:radio", $("#target")).unbind("ifChecked").bind("ifChecked", function () {
        $(this).trigger("click");
    });
    $("div[class^=icheck] input:checkbox", $("#target")).unbind("ifChanged").bind("ifChanged", function (e) {
        $(this).trigger("click");
        if ($(this).prop("checked")) {
    		$(this).val($(this).attr("_checked"));
    	} else {
    		$(this).val($(this).attr("_uncheck"));
    	}

    }); 
});

// タブ切り替え
$(function() {
  $( "#tabs" ).tabs();
  $( "#tabs-1" ).tabs();
  $( "#tabs-2" ).tabs();
  $( "#tabs-d1" ).tabs();
  $( "#tabs-d2" ).tabs();
  $( "#tabs-d3" ).tabs();
  $( "#tabs-d4" ).tabs();
  $( "#tabs-d5" ).tabs();
});

// サイドメニュー
$("#leftside-navigation .sub-menu > a").click(function(e) {
  $("#leftside-navigation ul ul").slideUp(), $(this).next().is(":visible") || $(this).next().slideDown(),
  e.stopPropagation();
})

$(function() {
	//パネル
	  $("#panel-btn").click(function() {
		    $("#panel").slideToggle(200);
		    $("#panel-btn-icon").toggleClass("close");
		    return false;
		  });
	  
	// サイドポップ
	  $('#sidePopContents').hide();  
	  $('#sidePopTab').click(function() {  
	 		 $('#sidePopContents').toggle('slow');
	 	     $(this).toggleClass('active');  

	  });  
	   $( "#sidPaccordion" ).accordion({
		     heightStyle: "content"
	   });
	// サイドメニュー表示非表示
	$("#sibbarbtn li").click(function () { 
		var haikei = $("#haikei");
		var no = $(this).parent().children().index(this);
		switch (no){
		case 0:
		haikei.attr("href","common/css/ch_op.css"); 
		break;
		case 1:
		haikei.attr("href","common/css/ch_cl.css");	
		break;
		}
	
	});
});



