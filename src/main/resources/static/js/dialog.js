jQuery(function($){
  $("#dialog01").dialog({
    autoOpen: false,
    width: 800,
    modal: true,
    buttons: [
      {
        text: '保存',
		class:'btn-update',
        click: function(){
          alert("保存しました");
        }
      },
      {
        text: '削除',
		class:'btn-delete',
        click: function(){
          alert("削除しました");
        }
      },
      {
        text: '閉じる',
		class:'btn-close',
        click: function(){
          $(this).dialog("close");
        }
      }
    ]
  });
  $("#btn_action2").click(function(){
      $("#dialog01").dialog("open");
  });
})


