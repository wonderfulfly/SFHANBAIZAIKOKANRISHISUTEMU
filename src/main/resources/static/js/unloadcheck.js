var isChanged = false;

$(function() {
	$(window).unload(function() {
		if (isChanged) {
			var check = document.getElementById("unloadCheck");
			if(check != null && check.value == "1") {
				//if(confirm("該当データが修正されました。保存しますか")) {
				//	ajaxDoAdd();
				//}
			}
		}
	});

});

/**
 * 変数やオブジェクトプロパティの値を監視する。
 * 変更があった際に callback を起動する。
 *
 * obj : global 変数なら window, あるオブジェクトのプロパティを監視するならそのオブジェクト
 * nam : global 変数なら 変数名, あるオブジェクトのプロパティを監視するならプロパティ名
 * _tm : 監視の間隔（ミリ秒）オプション
 *
 * 注意
 * obj[nam] が配列などのオブジェクトを返す場合は監視できない。
 * オブジェクトまで監視する場合は string へパースするように改変のこと。
 * json や check sum など。
 */
function onChangeValue(obj, nam, cbf, _tm){
	if(!_tm) _tm = 100;
	var f = function (o, n){
		var v = o[n];
		var t = setTimeout(
			function (){
				clearTimeout(t);
				if(v != o[n]){
					if(cbf(o, n)){
						f(o, n);
					}
				}else{
					f(o, n);
				}
			},
			_tm
		);
	}
	f(obj, nam);
}

// test 用 call back
function callBack(o, n){
	//document.getElementById("v1").value="aaa";//test用
	isChanged = true;
	return true;
}