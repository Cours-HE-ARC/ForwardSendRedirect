<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="ch.hearc.servlet.model.Utilisateur" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Authentifié</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
    	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" 
    	crossorigin="anonymous">
</head>

<body>

	<div class="jumbotron jumbotron-fluid">
	  	<div class="container">
	    	<h1 class="display-4">Authentification</h1>
	    	<p class="lead">
	    	
	    	<div class="alert alert-success" role="alert">
  				Authentifié avec succès
			</div>
	    	
	    	</p>
	
		</div>
	</div>
	
	<% 
	Utilisateur utilisateur = (Utilisateur)request.getSession().getAttribute("userLogged");
	%> 
	
	<p>
	<%= utilisateur.username() %>
	</p>
	
	 <form action="/ForwardSendRedirect/logout" method="get">
		
			<input type="submit" value="Logout"/>
		
		</form>
	

</body>
</html>