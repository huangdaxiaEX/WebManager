;

(function(){
	var flag = GetQueryString("flag");
	if(flag == "register"){
		$(".title").removeClass("checked");
		$(".register").addClass("checked");
		$(".loginContainer").css('display','none');
		$(".registerContainer").css('display','block');
	}
	else{
		$(".title").removeClass("checked");
		$(".login").addClass("checked");
		$(".loginContainer").css('display','block');
		$(".registerContainer").css('display','none');
	}
}());

function GetQueryString(name){
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}

$(".login").on('click',function(){
	$(".title").removeClass("checked");
	$(this).addClass("checked");
	$(".loginContainer").css('display','block');
	$(".registerContainer").css('display','none');
});

$(".register").on('click',function(){
	$(".title").removeClass("checked");
	$(this).addClass("checked");
	$(".loginContainer").css('display','none');
	$(".registerContainer").css('display','block');
});