/**
 * 
 */

function login(){
		event.preventDefault();
		var username = $("#username").val();
		var password = $("#password").val();
		//console.log(username + " " + password);
		if(username == ""){
			//Whenever form is submitted, the doc is refreshed
            $('#messageDiv').text("Enter username");
        }
        if(password == ""){
            $('#messageDiv').append("Enter password");
        }
        $.ajax({
        	type: "GET",
        	url: "LoginServlet",
        	data: {username: username,password: password},
        	success : function(results){
        		console.log(results);
        	}
        });
	}
	//$ is the syntax for jQuery, think of it as a substitute for the document keyword
	$("#loginForm").submit(login);