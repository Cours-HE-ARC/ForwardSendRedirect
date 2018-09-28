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
		name="logoutServlet",
		urlPatterns = "/logout"
)
public class LogoutServlet extends HttpServlet{


	UtilisateursDao udao = new UtilisateursDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getSession().removeAttribute("userLogged");
		req.getSession().setAttribute("logout-ok", "Logout effectué avec succès");
		resp.sendRedirect("");
		
	}
}
