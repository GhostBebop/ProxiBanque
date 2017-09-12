package com.huios.proxiBanque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huios.proxiBanque.metier.Auditeur;
import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Compte;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Courant;
import com.huios.proxiBanque.metier.Epargne;
import com.huios.proxiBanque.metier.Gerant;
import com.mysql.cj.jdbc.PreparedStatement;



public class Dao implements Idao{

	@Override
	public List<Epargne> auditAllCompteEpargne() {
		// TODO Auto-generated method stub
		List<Epargne> epargnes = new ArrayList<Epargne>();
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "SELECT * FROM Compte where typeCompte = epargne";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);
			ResultSet rs = (ResultSet) ps.executeQuery();	
			while (rs.next()) {
				Epargne e = new Epargne();		
				e.setId(rs.getInt("id"));
				e.setIdClient(rs.getInt("idClient"));
				e.setIdCarte(rs.getInt("idCarte"));		
				e.setDateCreation(rs.getDate("dateCreation"));
				e.setCode(rs.getInt("code"));
				e.setSolde(rs.getFloat("solde"));
				e.setTaux(rs.getFloat("Taux"));
				e.setTypeCompte(rs.getString("typeCompte"));
				epargnes.add(e);
				}								
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return epargnes;
	}
	
	
	@Override
	public List<Courant> auditAllCompteCaurant() {
		// TODO Auto-generated method stub
		List<Courant> courants = new ArrayList<Courant>();
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "SELECT * FROM Compte where typeCompte = courant";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);
			ResultSet rs = (ResultSet) ps.executeQuery();	
			while (rs.next()) {
				Courant c = new Courant();		
				c.setId(rs.getInt("id"));
				c.setIdClient(rs.getInt("idClient"));
				c.setIdCarte(rs.getInt("idCarte"));		
				c.setDateCreation(rs.getDate("dateCreation"));
				c.setCode(rs.getInt("code"));
				c.setSolde(rs.getFloat("solde"));
				c.setDecouvert(rs.getFloat("decouvert"));
				c.setTypeCompte(rs.getString("typeCompte"));
				courants.add(c);
				}								
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return courants;
	}
	
	@Override
	public boolean seConnecterAuditeur(String login, String mdp, Auditeur auditeur) {
		boolean connect = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String loginMysql = "root";
			String mdpMysql ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, loginMysql, mdpMysql);
			String requete = "SELECT * FROM Employe where typeEmploye = auditeur and login = ? and mdp = ?"; 
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setString(1, login);
			ps.setString(2, mdp);
			ps.executeUpdate();
			ResultSet rs = (ResultSet) ps.executeQuery();
			if (rs.next()) {
				connect = true;
				auditeur.setAdresse(rs.getString("adresse"));
				auditeur.setEmail(rs.getString("email"));
				auditeur.setNumTelephone(rs.getInt("numTel"));
				auditeur.setLogin(rs.getString("login"));
				auditeur.setMdp(rs.getInt("mdp"));			
				auditeur.setIdAgence(rs.getInt("idAgence"));		
				auditeur.setPrenom(rs.getString("Prenom"));
				auditeur.setNom(rs.getString("nom"));
				auditeur.setId(rs.getInt("id"));
				auditeur.setIdAgence(rs.getInt("idAgence"));
				auditeur.setTypeEmploye(rs.getString("typeEmploye"));
			}
			else {
				connect = false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return connect;
		// TODO Auto-generated method stub		
	}

	@Override
	public void seConnecter(String login, String mdp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterCompte(Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerCompteClient(Client client, Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCompte(Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCompte(Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> FindAllClient(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> FindAllCompte(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void virementCompte(Compte compte1, Compte compte2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void simulationCompte(Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void patrimoineCompte(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Conseiller> FindAllConseiller(Gerant gerant) {
		// TODO Auto-generated method stub
		return null;
	}



	

	

}
