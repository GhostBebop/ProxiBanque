package com.huios.proxiBanque.dao;

import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Compte;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Gerant;

public interface Idao {
	public void auditAllCompte();
	public void seConnecterAuditeur(String login,String mdp);
	
	public void seConnecter(String login,String mdp);
	
	public void ajouterClient(Client client);
	public void ajouterCompte(Compte compte);
	
	public void attribuerCompteClient(Client client,Compte compte);
	
	public void modifierCompte(Compte compte);
	public void supprimerCompte(Compte compte);
	public void supprimerClient(Client client);
	
	public void FindAllClient(Conseiller conseiller);
	public void FindAllCompte(Client client);	
	public void virementCompte(Compte compte1,Compte compte2);
	
	public void simulationCompte(Compte compte);
	public void patrimoineCompte(Client client);
	
	
	public void modifierConseiller(Conseiller conseiller);
	public void	supprimerConseiller(Conseiller conseiller);
	public void ajouterConseiller(Conseiller conseiller);
	public void FindAllConseiller(Gerant gerant);
	
	
	
}
