$(function(){ 
$("#user_insert_btn").click(function(){
	
	//前端正则表达式验证
	if(!validate_add_form()){
		return false;
	}
	
	var kaptcha = $("#kaptcha").val();
	if (kaptcha.length == 0) {
		alert("您没有输入验证码！");
	} else {
        var username = $("#insert_name").val();
        var password = $("#insert_password").val();
        var phonenum= $("#insert_phonenum").val();
        var sex=$("input[name='sex']:checked").val();
        var role=$("input[name='role']:checked").val();
        //发起ajax进行添加操作
        $.ajax({
            url:"emp/register1",
            data:{"username":username,"password":password,"phonenum":phonenum,"sex":sex,"role":role},
            type:"post",
            success:function(msg){
                if(msg.code==100){
                    //这里再次经过请求才进登录页面
                    //如果放在静态static下静态页面就可以直接这样子跳页面:window.location.href = "signin.html";
                    //但是在templates下必须经过请求否则就会暴露页面不安全

                    //跳转到登录页面
                    window.location.href = "emp/login";
                }else{
                    alert("---注册失败---");
                }

            },
            error:function(){
            }
        });
    }




});
}); 