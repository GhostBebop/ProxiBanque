package com.huios.proxiBanque.service;

import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Compte;
import com.huios.proxiBanque.metier.Conseiller;

public interface IserviceConseiller {
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
	
}
