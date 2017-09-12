package com.huios.proxiBanque.dao;

import java.util.List;

import com.huios.proxiBanque.metier.Auditeur;
import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Compte;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Courant;
import com.huios.proxiBanque.metier.Epargne;
import com.huios.proxiBanque.metier.Gerant;

public interface Idao {
	
	
	public List<Epargne> auditAllCompteEpargne();
	public List<Courant> auditAllCompteCaurant();
	public boolean seConnecterAuditeur(String login,String mdp,Auditeur auditeur);
	
	
	
	
	
	public void seConnecter(String login,String mdp);
	
	public void ajouterClient(Client client);
	public void ajouterCompte(Compte compte);
	
	public void attribuerCompteClient(Client client,Compte compte);
	
	public void modifierCompte(Compte compte);
	public void supprimerCompte(Compte compte);
	public void supprimerClient(Client client);
	
	public List<Client> FindAllClient(Conseiller conseiller);
	public List<Compte> FindAllCompte(Client client);	
	public void virementCompte(Compte compte1,Compte compte2);
	
	public void simulationCompte(Compte compte);
	public void patrimoineCompte(Client client);
	public void modifierConseiller(Conseiller conseiller);
	public void	supprimerConseiller(Conseiller conseiller);
	public void ajouterConseiller(Conseiller conseiller);
	public List<Conseiller> FindAllConseiller(Gerant gerant);
}
