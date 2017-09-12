package com.huios.proxiBanque.dao;
import java.util.List;
import com.huios.proxiBanque.metier.Auditeur;
import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Courant;
import com.huios.proxiBanque.metier.Entreprise;
import com.huios.proxiBanque.metier.Epargne;
import com.huios.proxiBanque.metier.Gerant;
import com.huios.proxiBanque.metier.Particulier;
public interface Idao {	
	// method auditor
	public List<Epargne> auditAllCompteEpargne();
	public List<Courant> auditAllCompteCourant();
	public boolean seConnecterAuditeur(String login,String mdp,Auditeur auditeur);
	// method advisor
	public boolean seConnecterConseiller(String login,String mdp,Conseiller conseiller);
	public void ajouterParticulier(Particulier particulier);
	public void ajouterEntreprise(Entreprise entreprise);
	public void ajouterCompteEpargne(Epargne epargne);
	public void ajouterCompteCourant(Courant courant);
	public void attribuerCompteEpargne(Client client,Epargne epargne);
	public void attribuerCompteCourant(Client client,Courant courant);
	public void modifierCompteEpargne(Epargne epargne,int typeModif);
	public void modifierCompteCourant(Courant courant,int typeModif);	
	public void supprimerCompteEpargne(Epargne epargne);
	public void supprimerCompteCourant(Courant courant);
	public void supprimerClient(Client client);	
	public List<Particulier> FindAllParticulier(Conseiller conseiller);
	public List<Entreprise> FindAllEntreprise(Conseiller conseiller);
	public List<Epargne> FindAllCompteEpargne(Client client);
	public List<Courant> FindAllCompteCourant(Client client);	
	public void virementCompte(int id1, int id2, double res1,double res2);	
	public void simulationCompte(Client client);
	public void patrimoineCompte(Client client);	
	// method manager
	public void modifierConseiller(Conseiller conseiller);
	public void	supprimerConseiller(Conseiller conseiller);
	public void ajouterConseiller(Conseiller conseiller);
	public List<Conseiller> FindAllConseiller(Gerant gerant);
}
