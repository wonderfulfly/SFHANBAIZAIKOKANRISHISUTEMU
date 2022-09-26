var appCache = window.applicationCache;
 
function cacheStatus(status){
    switch (status) {
      case 0:
        return 'UNCACHED';
        break;
      case 1:
        return 'IDLE';
        break;
      case 2:
        return 'CHECKING';
        break;
      case 3:
        return 'DOWNLOADING';
        break;
      case 4:
        return 'UPDATEREADY';
        break;
      case 5:
        return 'OBSOLETE';
        break;
      default:
        return 'UKNOWN CACHE STATUS';
        break;
    };
}
function handleCacheEvent(e) {
  //console.log(cacheStatus(appCache.status), e.type);
}
function handleCacheError(e) {
  alert('Error: Cache failed to update!');
};

if (appCache) {
	//appCache.addEventListener('cached', handleCacheEvent, false);
	//appCache.addEventListener('checking', handleCacheEvent, false);
	//appCache.addEventListener('downloading', handleCacheEvent, false);
	//appCache.addEventListener('error', handleCacheError, false);
	//appCache.addEventListener('noupdate', handleCacheEvent, false);
	//appCache.addEventListener('obsolete', handleCacheEvent, false);
	//appCache.addEventListener('progress', handleCacheEvent, false);
	appCache.addEventListener("updateready",function(){
		if (confirm('アプリケーションの新しいバージョンが利用可能です。更新しますか？')) {
	     appCache.swapCache();
	     location.reload();
	  }
	}, false);
	
	window.addEventListener('online', function(event) {
		$('#onlinestatus').text('change to INLINE');
	}, false);
	
	window.addEventListener('offline', function(event) {
		$('#onlinestatus').text('change to OFFLINE');
	}, false);	
}

function initial() {
	if (appCache) {
		var d1 = new Date().getTime();     
		var d2 = localStorage.getItem('last_cached') * 1;     
		if (d2 == null){ d2 = d1; }     
		if (d2 > d1){ return; }     
		d1 += 1000 * 1; // 更新の間隔     
		localStorage.setItem('last_cached',d1);     
		if (navigator.onLine) {
		 $('#onlinestatus').text('INLINE');
		 try {
		 	appCache.update();
		 } catch(e) {
		 	//alert(e);
		 }     
		} else {
		 $('#onlinestatus').text('OFFLINE');
		}
	}
} 

//storage
function saveStorage(id){     
  var data = document.getElementById(id).value;     
  var time = new Date().getTime();     
  localStorage.setItem(time,data);     
  alert("保存しました。");     
  loadStorage('msg');
}   
function loadStorage(id){     
  var result = '<table border="1">';     
  for(var i = 0;i < localStorage.length;i++){
     var key = localStorage.key(i);
     var value = localStorage.getItem(key);
     var date = new Date();
     date.setTime(key);
     var datestr = date.toGMTString();
     result += '<tr><td>' + value + '</td><td>' + datestr + '</td></tr>';
  }
   result += '</table>';
   var target = document.getElementById(id);
   target.innerHTML = result; 
}
function clearStorage(){
  localStorage.clear();
  alert("すべてのデータを消去しました。");
  loadStorage('msg');
}    	
function saveStorage1(){
     var data = new Object;
     data.name = document.getElementById('name').value;     
     data.mail = document.getElementById('mail').value;     
     data.tel = document.getElementById('tel').value;     
     data.memo = document.getElementById('memo').value;     
     var str = JSON.stringify(data);     
     localStorage.setItem(data.name,str);     
     alert("保存しました。"); 
}   
function findStorage(id){
     var find = document.getElementById('find').value;     
     var str = localStorage.getItem(find);     
     var data =  JSON.parse(str);     
     var result = "NAME: " + data.name + '<br>';     
     result += "MAIL: " + data.mail + '<br>';     
     result += "TEL : " + data.tel  + '<br>';     
     result += "MEMO: " + data.memo + '<br>';     
     var target = document.getElementById(id);     
     target.innerHTML = result; 
}