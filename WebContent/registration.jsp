<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

		<script>
			function validateForm() {
			    var user = document.forms["userForm"]["userName"].value;
			    var password = document.forms["userForm"]["password"].value;
			    var confirm = document.forms["userForm"]["password2"].value;
			    if (user == "") {
			        alert("Username must be filled out");
			        return false;
			    }
			    
			    if (password == "" || confirm == "") {
			        alert("Password must be filled out");
			        return false;
			    }
			    if (password != confirm){
			    	alert("Passwords must match");
			    	return false;
			    }
			}
	   </script>
<body>

<form name="userForm" action=registration onsubmit="return validateForm()" method="post">
			${param.message}<br>	
			User Name: <input type=text name=userName><br>
			Password: <input type=password name=password><br>
			Confirm Password: <input type=password name=password2><br>
			<input type=submit value=Register> <br>  		
</form>


</body>
</html>