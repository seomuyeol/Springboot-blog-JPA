let index = {
	init:function() {
		$("#btn-save").on("click", ()=>{
			this.save();
		}); //on : 一番目パラメータはイベント、二番目は何をするか
	},
	
	save: function(){
		//alert("user saveFunction 呼び出す");
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val()
		};
		
		//console.log(data);
		
		// ajax호출시 default가 비동기 호출
		//회원가입 수행 요청
		$.ajax({
			type: "POST",
			url: "/blog/api/user",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8", 
			dataType: "json" //응답이 json 이면 javascript 오브젝트로 변경해준다. 
		}).done(function(resp){
			//성공시
			alert("회원가입이 완료되었습니다.")
			console.log(resp)
			location.href = "/blog";
		}).fail(function(error){
			//실패시
			alert(JSON.stringify(error));
		}); //ajax dataをJsonに変更してInsert
	},
	
	login: function(){
		//alert("user saveFunction 呼び出す");
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
		};
		
		//console.log(data);
		
		// ajax호출시 default가 비동기 호출
		//회원가입 수행 요청
		$.ajax({
			type: "POST",
			url: "/blog/api/user/login",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8", 
			dataType: "json" //응답이 json 이면 javascript 오브젝트로 변경해준다. 
		}).done(function(resp){
			//성공시
			alert("로그인이 완료되었습니다.")
			console.log(resp)
			location.href = "/blog";
		}).fail(function(error){
			//실패시
			alert(JSON.stringify(error));
		}); //ajax dataをJsonに変更してInsert
	}
}

index.init();