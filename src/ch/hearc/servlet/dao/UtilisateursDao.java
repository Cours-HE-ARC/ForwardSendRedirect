package ch.hearc.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import ch.hearc.servlet.model.Utilisateur;

public class UtilisateursDao {

	
	private static List<Utilisateur> utilisateurs = new ArrayList<>();
	
	static {
		
		utilisateurs.add(new Utilisateur("sce","toto"));
		utilisateurs.add(new Utilisateur("admin","root"));
	}

	public Optional<Utilisateur> authentifieUtilisateur(Utilisateur loginUtilisateur){
		
		Optional<Utilisateur> utilisateur = utilisateurs.stream()
			.filter(user -> {
				return user.equals(loginUtilisateur);
			}).findFirst();
		
		return utilisateur;
		
	}
	
	
}
