package com.huios.proxiBanque.service;

import com.huios.proxiBanque.dao.Dao;
import com.huios.proxiBanque.dao.Idao;
import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Compte;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Gerant;

public class ServiceImple implements IserviceAuditeur,IserviceConseiller,IserviceGerant{
	Idao dao = new Dao();
	@Override
	public void modifierConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		dao.modifierConseiller(conseiller);;
	}

	@Override
	public void supprimerConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		dao.supprimerConseiller(conseiller);
	}

	@Override
	public void ajouterConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		dao.ajouterConseiller(conseiller);
	}

	@Override
	public void FindAllConseiller(Gerant gerant) {
		// TODO Auto-generated method stub
		dao.FindAllConseiller(gerant);
	}

	@Override
	public void seConnecter(String login, String mdp) {
		// TODO Auto-generated method stub
		dao.seConnecter(login, mdp);
	}

	@Override
	public void ajouterClient(Client client) {
		// TODO Auto-generated method stub
		dao.ajouterClient(client);
	}

	@Override
	public void ajouterCompte(Compte compte) {
		// TODO Auto-generated method stub
		dao.ajouterCompte(compte);
	}

	@Override
	public void attribuerCompteClient(Client client, Compte compte) {
		// TODO Auto-generated method stub
		dao.attribuerCompteClient(client, compte);
	}

	@Override
	public void modifierCompte(Compte compte) {
		// TODO Auto-generated method stub
		dao.modifierCompte(compte);
	}

	@Override
	public void supprimerCompte(Compte compte) {
		// TODO Auto-generated method stub
		dao.supprimerCompte(compte);
	}

	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		dao.supprimerClient(client);
	}

	@Override
	public void FindAllClient(Conseiller conseiller) {
		// TODO Auto-generated method stub
		dao.FindAllClient(conseiller);
	}

	@Override
	public void FindAllCompte(Client client) {
		// TODO Auto-generated method stub
		dao.FindAllCompte(client);
	}

	@Override
	public void virementCompte(Compte compte1, Compte compte2) {
		// TODO Auto-generated method stub
		dao.virementCompte(compte1, compte2);
	}

	@Override
	public void simulationCompte(Compte compte) {
		// TODO Auto-generated method stub
		dao.simulationCompte(compte);
	}

	@Override
	public void patrimoineCompte(Client client) {
		// TODO Auto-generated method stub
		dao.patrimoineCompte(client);
	}

	@Override
	public void auditAllCompte() {
		// TODO Auto-generated method stub
		dao.auditAllCompte();
	}

	@Override
	public void seConnecterAuditeur(String login, String mdp) {
		// TODO Auto-generated method stub
		dao.seConnecterAuditeur(login, mdp);
	}

}
