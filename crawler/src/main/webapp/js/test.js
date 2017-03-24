/**
 * 
 */
function videoInfo(views,commentCount,likes, dislikes, url) {
	this.views = views;
	this.likes = likes;
	this.dislikes = dislikes;
	this.commentCount = commentCount;
	this.url = url;
	
}

var display = document.getElementById("display");

var sendObj = function(obj){
	var request = new XMLHttpRequest ();
	
	request.onreadystatechange = function (){
		if (request.readyState== 4 && request.status == 200){
			console.log( request.responseText);
			display.innerHTML = request.responseText;
		}
	}
	
	request.open("POST","greeting",true);
	request.setRequestHeader ('Content-type', 'application/json; charset=utf-8'); 
	request.send (obj);
}
initialFetch();
setTimeout(secondRequest, 1000);

