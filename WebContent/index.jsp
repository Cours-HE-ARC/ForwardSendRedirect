<!DOCTYPE html>
<%@ page import="java.util.List" %>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Authentificaton application</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
    	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" 
    	crossorigin="anonymous">
</head>
<body>

<div class="jumbotron jumbotron-fluid">
  <div class="container">
    	<h1 class="display-4">Authentification</h1>
    	<p class="lead">Application expliquant le principe des mécanisme forward/sendredirect via des fonctionnalités de login/logout</p>

</div>
</div>
 
<div>

<% 

String loginFailed = (String)request.getAttribute("login-failed");
String logoutOk = (String)session.getAttribute("logout-ok");

if(null != loginFailed){
	%>
	<div class="alert alert-danger" role="alert">
  		Authentification échouée
	</div><% 
	
}

if(null != logoutOk){
	%>
	<div class="alert alert-success" role="alert">
  		Logout succès
	</div><% 
	
}

%>

</div>

<div class="card">

  <h3 class="card-header">Connexion</h3>
  <div class="card-body">
    <center>
    <form action="/ForwardSendRedirect/login" method="post">
			
			<label size="100" for="username">Nom d'utilisateur</label>
			<input id="dusername" name="username" type="text" /><br/>
			
			<label>Mot de passe:</label>
			<input id="pass" name="pass" type="text" /><br/>
			
		
			<input type="submit" value="Login"/>
		
		</form>
		</center>
  </div>

</div>
</div>









</body>
</html>