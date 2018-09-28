package ch.hearc.servlet.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch.hearc.servlet.dao.UtilisateursDao;
import ch.hearc.servlet.model.Utilisateur;



@WebServlet(
		name="loginServlet",
		urlPatterns = "/login"
)
public class LoginServlet extends HttpServlet{


	UtilisateursDao udao = new UtilisateursDao();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Utilisateur loginUtilisateur = new Utilisateur(req.getParameter("username"),req.getParameter("pass"));
		
		Optional<Utilisateur> utilisateur = udao.authentifieUtilisateur(loginUtilisateur);
		
		if(utilisateur.isPresent()) {
			req.getSession().setAttribute("userLogged", utilisateur.get());
			req.getRequestDispatcher("authentified.jsp").forward(req, resp);
			
		}else {
			req.setAttribute("login-failed", "Authentification failed");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
		
		
	}
}
