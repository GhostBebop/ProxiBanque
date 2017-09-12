package com.huios.proxiBanque.dao;

import java.util.List;

import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Compte;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Gerant;

public class Dao implements Idao{

	@Override
	public List<Compte> auditAllCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void seConnecterAuditeur(String login, String mdp) {
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
