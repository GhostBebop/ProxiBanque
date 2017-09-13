package com.huios.proxiBanque.testUnitaire;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Ignore;
import org.junit.Test;

import com.huios.proxiBanque.dao.Dao;
import com.huios.proxiBanque.dao.Idao;
import com.huios.proxiBanque.metier.Agence;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Gerant;
import com.mysql.jdbc.PreparedStatement;

public class TestConseiller {
	Idao dao = new Dao();

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testCreationAgence() {
		Agence ag = new Agence();
		ag.setNomAgence("proxiBanque St MAUR");
		ag.setAdresse("53 Rue de la Varenne 94100 ST MAUR DES FOSSES");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/testsq";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "INSERT INTO agences(nom,adresse) VALUES(?,?)";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setString(1, ag.getNomAgence());
			ps.setString(2, ag.getAdresse());
						
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Ignore
	@Test
	public void testCreationGerant() {
		Gerant ger = new Gerant();
		ger.setLogin("gerant1");
		ger.setMdp("ger1");
		ger.setAdresse("53 Rue de la Varenne 94100 ST MAUR DES FOSSES");
		ger.setEmail("gerant1@proxiBanque.fr");
		ger.setNom("GERANT");
		ger.setNumTelephone(4452730);
		ger.setPrenom("Conseiller");
		ger.setTypeEmploye("gerant");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/testsq";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "INSERT INTO employes(nom,prenom,adresse,email,mdp,login,tel,typeEmploye) VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setString(1, ger.getNom());
			ps.setString(2, ger.getPrenom());
			ps.setString(3, ger.getAdresse());
			ps.setString(4, ger.getEmail());
			ps.setString(5, ger.getMdp());
			ps.setString(6, ger.getLogin());
			ps.setInt(7, ger.getNumTelephone());
			ps.setString(8, ger.getTypeEmploye());
						
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testCreationConseil() {
		Conseiller c= new Conseiller();
		c.setLogin("conseil1");
		c.setMdp("cons1");
		c.setAdresse("53 Rue de la Varenne 94100 ST MAUR DES FOSSES");
		c.setEmail("conseiller1@proxiBanque.fr");
		c.setNom("CONSEILLER");
		c.setNumTelephone(4452730);
		c.setPrenom("Conseiller1");
		c.setTypeEmploye("conseiller");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/testsq";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "INSERT INTO employes(nom,prenom,adresse,email,mdp,login,tel,typeEmploye) VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setString(3, c.getAdresse());
			ps.setString(4, c.getEmail());
			ps.setString(5, c.getMdp());
			ps.setString(6, c.getLogin());
			ps.setInt(7, c.getNumTelephone());
			ps.setString(8, c.getTypeEmploye());
						
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
