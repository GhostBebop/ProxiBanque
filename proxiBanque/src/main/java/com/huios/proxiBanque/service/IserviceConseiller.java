package com.huios.proxiBanque.service;

import java.util.List;

import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Compte;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Courant;
import com.huios.proxiBanque.metier.Entreprise;
import com.huios.proxiBanque.metier.Epargne;
import com.huios.proxiBanque.metier.Particulier;

public interface IserviceConseiller {
	public boolean seConnecterConseiller(String login,String mdp,Conseiller conseiller);
	
	public void ajouterParticulier(Particulier particulier);
	public void ajouterEntreprise(Entreprise entreprise);
	public void ajouterEpargne(Epargne epargne);
	public void ajouterCourant(Courant courant);
	
	public void attribuerCompteClient(Client client,Compte compte);
	
	public void modifierCompte(Compte compte);
	public void supprimerCompte(Compte compte);
	public void supprimerClient(Client client);
	
	public List<Client> FindAllClient(Conseiller conseiller);
	public List<Compte> FindAllCompte(Client client);	
	public void virementCompte(Compte compte1,Compte compte2);
	
	public void simulationCompte(Compte compte);
	public void patrimoineCompte(Client client);
	
}
