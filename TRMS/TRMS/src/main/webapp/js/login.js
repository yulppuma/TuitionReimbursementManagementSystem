/**
 * 
 */

var user = {
userID: "",
username:"",
password:"",
firstname:"",
lastname:"",
title:"",
slevel:"",
department:""
};

function login(){
		event.preventDefault();
		var username = $("#username").val();
		var password = $("#password").val();
		var type = $('input[name=inlineRadioOptions]:checked', '#loginForm').val();
		//console.log(username + " " + password);
		if(username == ""){
			//Whenever form is submitted, the doc is refreshed
            $('#messageDiv').text("Enter username");
        }
        if(password == ""){
            $('#messageDiv').append("Enter password");
        }
        $.ajax({
        	type: "POST",
        	url: "LoginServlet",
        	data: {username: username,password: password, type: type},
        	success : function(results){
        		var obj = results.toString();
        		var js = JSON.parse(obj);
        		
        		user.
        		console.log(js.userid + " " + js.username + " " + js.password + " " + js.firstname + " " + js.lastname
        				+ " " + js.title + " " + js.department + " " + js.slevel);
        	}
        });
	}
	//$ is the syntax for jQuery, think of it as a substitute for the document keyword
	$("#loginForm").submit(login);