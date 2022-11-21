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
		}
		
		console.log(data);
	}
}

index.init();