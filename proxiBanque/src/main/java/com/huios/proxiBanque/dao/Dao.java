package com.huios.proxiBanque.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.huios.proxiBanque.metier.Auditeur;
import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Courant;
import com.huios.proxiBanque.metier.Entreprise;
import com.huios.proxiBanque.metier.Epargne;
import com.huios.proxiBanque.metier.Gerant;
import com.huios.proxiBanque.metier.Particulier;
import com.mysql.cj.jdbc.PreparedStatement;
public class Dao implements Idao{
	// method auditor
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
			String requete = "SELECT * FROM comptes where typeCompte = epargne";
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
	public List<Courant> auditAllCompteCourant() {
		// TODO Auto-generated method stub
		List<Courant> courants = new ArrayList<Courant>();
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "SELECT * FROM comptes where typeCompte = courant";
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
				auditeur.setMdp(rs.getString("mdp"));			
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
	}
	//method advisor
	@Override
	public boolean seConnecterConseiller(String login, String mdp,Conseiller conseiller) {
		// TODO Auto-generated method stub
		boolean connect = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String loginMysql = "root";
			String mdpMysql ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, loginMysql, mdpMysql);
			String requete = "SELECT * FROM employes where typeEmploye = conseiller and login = ? and mdp = ?"; 
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setString(1, login);
			ps.setString(2, mdp);
			ps.executeUpdate();
			ResultSet rs = (ResultSet) ps.executeQuery();
			if (rs.next()) {
				connect = true;
				conseiller.setAdresse(rs.getString("adresse"));
				conseiller.setEmail(rs.getString("email"));
				conseiller.setNumTelephone(rs.getInt("tel"));
				conseiller.setLogin(rs.getString("login"));
				conseiller.setMdp(rs.getString("mdp"));			
				conseiller.setIdAgence(rs.getInt("idAgence"));		
				conseiller.setPrenom(rs.getString("Prenom"));
				conseiller.setNom(rs.getString("nom"));
				conseiller.setId(rs.getInt("id"));
				conseiller.setTypeEmploye(rs.getString("typeEmploye"));
			}
			else {
				connect = false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return connect;			
	}
	@Override
	public void ajouterParticulier(Particulier particulier) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "INSERT INTO clients(nom,prenom,adresse,telephone,typeClient,email) VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setString(1, particulier.getNom());
			ps.setString(2, particulier.getPrenom());
			ps.setString(3, particulier.getAdresse());
			ps.setInt(4, particulier.getNumTelephone());
			ps.setString(5, particulier.getTypeClient());
			ps.setString(6, particulier.getEmail());			
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	@Override
	public void ajouterEntreprise(Entreprise entreprise) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "INSERT INTO clients(nom,adresse,telephone,typeClient,email) VALUES(?,?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setString(1, entreprise.getNomEntreprise());
			ps.setString(2, entreprise.getAdresse());
			ps.setInt(3, entreprise.getNumTelephone());
			ps.setString(4, entreprise.getTypeClient());	
			ps.setString(5, entreprise.getEmail());	
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void ajouterCompteEpargne(Epargne epargne) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "INSERT INTO comptes(code,solde,dateCreation,typeCompte,taux) VALUES(?,?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setInt(1, epargne.getCode());
			ps.setFloat(2, epargne.getSolde());
			ps.setDate(3, (Date) epargne.getDateCreation());
			ps.setString(4, epargne.getTypeCompte());	
			ps.setDouble(5, epargne.getTaux());	
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void ajouterCompteCourant(Courant courant) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "INSERT INTO comptes(code,solde,dateCreation,typeCompte,decouvert) VALUES(?,?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setInt(1, courant.getCode());
			ps.setFloat(2, courant.getSolde());
			ps.setDate(3, (Date) courant.getDateCreation());
			ps.setString(4, courant.getTypeCompte());	
			ps.setDouble(5, courant.getDecouvert());	
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void attribuerCompteEpargne(Client client, Epargne epargne) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "UPDATE comptes set clientId = ? Where id = ?";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setInt(1, client.getId());
			ps.setInt(2, epargne.getId());
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void attribuerCompteCourant(Client client, Courant courant) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "UPDATE comptes set clientId = ? Where id = ?";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setInt(1, client.getId());
			ps.setInt(2, courant.getId());
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void modifierCompteEpargne(Epargne epargne, int typeModif) {
		// TODO Auto-generated method stub
		try {
			String requete = null;
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			switch(typeModif) {
				case(1) : requete = "UPDATE comptes set code = ? Where id = ?";break;
				case(2) : requete = "UPDATE comptes set solde = ? Where id = ?";break;
				case(3) : requete = "UPDATE comptes set dateCreation = ? Where id = ?";break;
				case(4) : requete = "UPDATE comptes set taux = ? Where id = ?";break;
				default : break;
			}
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			switch(typeModif) {
				case(1) : ps.setInt(1, epargne.getId());ps.setInt(2, epargne.getId());break;
				case(2) : ps.setFloat(1, epargne.getSolde());ps.setInt(2, epargne.getId());break;
				case(3) : ps.setDate(1, (Date) epargne.getDateCreation());ps.setInt(2, epargne.getId());break;
				case(4) : ps.setDouble(1, epargne.getTaux());ps.setInt(2, epargne.getId());break;
			default : break;
			}
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Override
	public void modifierCompteCourant(Courant courant, int typeModif) {
		// TODO Auto-generated method stub
		try {
			String requete = null;
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			switch(typeModif) {
				case(1) : requete = "UPDATE comptes set code = ? Where id = ?";break;
				case(2) : requete = "UPDATE comptes set solde = ? Where id = ?";break;
				case(3) : requete = "UPDATE comptes set dateCreation = ? Where id = ?";break;
				case(4) : requete = "UPDATE comptes set decouvert = ? Where id = ?";break;
				default : break;
			}
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			switch(typeModif) {
				case(1) : ps.setInt(1, courant.getId());ps.setInt(2, courant.getId());break;
				case(2) : ps.setFloat(1, courant.getSolde());ps.setInt(2, courant.getId());break;
				case(3) : ps.setDate(1, (Date) courant.getDateCreation());ps.setInt(2, courant.getId());break;
				case(4) : ps.setDouble(1, courant.getDecouvert());ps.setInt(2, courant.getId());break;
			default : break;
			}
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Override
	public void supprimerCompteEpargne(Epargne epargne) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "DELETE FROM  comptes where id=?";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setInt(1, epargne.getId());
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void supprimerCompteCourant(Courant courant) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "DELETE FROM  comptes where id=?";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setInt(1, courant.getId());
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "DELETE FROM clients where id=?";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);	
			ps.setInt(1, client.getId());
			ps.executeUpdate();
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Particulier> FindAllParticulier(Conseiller conseiller) {
		// TODO Auto-generated method stub
		List<Particulier> particuliers = new ArrayList<Particulier>();
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "SELECT * FROM clients where  ConseillerId = ? and typeClient = particulier ?";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);
			ps.setInt(1, conseiller.getId());
			ps.executeUpdate();
			ResultSet rs = (ResultSet) ps.executeQuery();	
			while (rs.next()) {
				Particulier p = new Particulier();		
				p.setId(rs.getInt("id"));
				p.setAdresse(rs.getString("adresse"));
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
				p.setTypeClient(rs.getString("typeClient"));
				p.setNumTelephone(rs.getInt("telephone"));		
				particuliers.add(p);
				}	
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return particuliers;
	}
	@Override
	public List<Entreprise> FindAllEntreprise(Conseiller conseiller) {
		// TODO Auto-generated method stub
		List<Entreprise> entreprises = new ArrayList<Entreprise>();
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "SELECT * FROM clients where  ConseillerId = ? and typeClient = entreprise ?";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);
			ps.setInt(1, conseiller.getId());
			ps.executeUpdate();
			ResultSet rs = (ResultSet) ps.executeQuery();	
			while (rs.next()) {
				Entreprise e = new Entreprise();		
				e.setId(rs.getInt("id"));
				e.setAdresse(rs.getString("adresse"));
				e.setNomEntreprise(rs.getString("nom"));
				e.setTypeClient(rs.getString("typeClient"));
				e.setNumTelephone(rs.getInt("telephone"));		
				entreprises.add(e);
				}	
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		return entreprises;
	}
	@Override	
	public List<Epargne> FindAllCompteEpargne(Client client) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				List<Epargne> epargnes = new ArrayList<Epargne>();
				try {			
					Class.forName("com.mysql.jdbc.Driver");
					String adresse = "jdbc:mysql://localhost:3306/personnebdd";
					String login = "root";
					String mdp ="";
					Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
					String requete = "SELECT * FROM comptes where typeCompte = epargne and clientId = ?";
					PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);
					ps.setInt(1, client.getId());
					ps.executeUpdate();
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
	public List<Courant> FindAllCompteCourant(Client client) {
		// TODO Auto-generated method stub
		List<Courant> courants = new ArrayList<Courant>();
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "SELECT * FROM comptes where typeCompte = courant and clientId = ?";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);
			ResultSet rs = (ResultSet) ps.executeQuery();
			ps.setInt(1, client.getId());
			ps.executeUpdate();
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
	public void virementCompte(int id1, int id2,double res1,double res2) {
		// TODO Auto-generated method stub
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			String adresse = "jdbc:mysql://localhost:3306/personnebdd";
			String login = "root";
			String mdp ="";
			Connection com = (Connection) DriverManager.getConnection(adresse, login, mdp);
			String requete = "UPDATE comptes set solde = ? Where id = ?;comptes set solde = ? where id = ?;";
			PreparedStatement ps = (PreparedStatement) com.prepareStatement(requete);
			ps.setDouble(1,res1);	
			ps.setInt(2,id1);
			ps.setDouble(3,res2);	
			ps.setInt(4,id2);
			ps.executeUpdate();				
			ps.close();
			com.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Override
	public void simulationCompte(Client client) {
		// TODO Auto-generated method stub
		
	}
	// method manager
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
