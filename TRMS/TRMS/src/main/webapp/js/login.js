/**
 * 
 */

function login(){
		var username = $("#username").val();
		var password = $("#password").val();
		if(username == ""){
			//Whenever form is submitted, the doc is refreshed
			event.preventDefault();
            $('#messageDiv').text("Enter username");
        }
        if(password == ""){
            $('#messageDiv').append("Enter password");
        }
	}

function init(){
	//$ is the syntax for jQuery, think of it as a substitute for the document keyword
	$("#loginForm").submit(login);
}
$(document).ready(init);