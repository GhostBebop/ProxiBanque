package com.huios.proxiBanque.service;

import java.util.List;

import com.huios.proxiBanque.dao.Dao;
import com.huios.proxiBanque.dao.Idao;
import com.huios.proxiBanque.metier.Auditeur;
import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Compte;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Courant;
import com.huios.proxiBanque.metier.Epargne;
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
	public List<Conseiller> FindAllConseiller(Gerant gerant) {
		// TODO Auto-generated method stub
		return dao.FindAllConseiller(gerant);
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
	public List<Client> FindAllClient(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return dao.FindAllClient(conseiller);
	}

	@Override
	public List<Compte> FindAllCompte(Client client) {
		// TODO Auto-generated method stub
		return dao.FindAllCompte(client);
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
	public boolean seConnecterAuditeur(String login, String mdp,Auditeur auditeur) {
		// TODO Auto-generated method stub
		return dao.seConnecterAuditeur(login, mdp, auditeur);
	}

	@Override
	public List<Epargne> auditAllCompteEpargne() {
		// TODO Auto-generated method stub
		return dao.auditAllCompteEpargne();
	}

	@Override
	public List<Courant> auditAllCompteCourant() {
		// TODO Auto-generated method stub
		return dao.auditAllCompteCourant();
	}

}
