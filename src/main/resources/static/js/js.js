$(function(){
	$(".tabs li").click(function(){
		var index = $(this).index();
		$(".tabs li").eq(index).addClass("selected").siblings().removeClass("selected");
		$(".tabs_con .section").eq(index).show().siblings().hide();
	})
	
	$(".btn_menu").click(function(){
		$(".boxblack").show();
		$(".warp").toggleClass("cur");
		$("body").toggleClass("cur");
		$(".left_menu").toggleClass("cur");
		$(".wap_head").toggleClass("lt250");
		})
		
	$(".boxblack").click(function(){
		
		$(".boxblack").hide();
		$("body").removeClass("cur");
		$(".left_menu").removeClass("cur");
		$(".wap_head").removeClass("lt250");
		$(".warp").removeClass("cur");
		})
		
	$(".fenli_tabs li").click(function(){
		var index = $(this).index();
		$(".fenli_tabs li").eq(index).addClass("selected").siblings().removeClass("selected");
		$(".fenli_nr_list").eq(index).show().siblings(".fenli_nr_list").hide();
	})
	var dyRH = $(".dy_right").height();
	$(".lt_list").height(dyRH-10);
	
	
	$(".tk_ty").click(function(){
		$(this).toggleClass("cur");
	})
	$(".radio_btn").click(function(){
		$(this).addClass("cur").parent(".radio").siblings().children(".radio_btn").removeClass("cur");
		$(this).prev("input:radio").attr("checked","true");
	})
	
	//$(".index1").height($(window).height());
	
	$(".closed").click(function(){
		$(".yyc").hide();
		$(".buy_tc").hide();
		$("body").css("overflow","auto");
	})
	$(".buy_an").click(function(){
		$(".yyc").show();
		$(".buy_tc").show();
		$("body").css("overflow","hidden");
	})
})


$(function(){
		
  var windowHeight = $(window).height();
  var windowWidth = $(window).width();
  
  contBox();
  
  
  $(window).resize(function(){contBox()})
  
  function contBox(){
	  var windowHeight = $(window).height();
	  var windowWidth = $(window).width();
	  $(".denglu_box").height(windowHeight);
  }
})
