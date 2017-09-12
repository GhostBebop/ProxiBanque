package com.huios.proxiBanque.service;
import java.util.List;
import com.huios.proxiBanque.dao.Dao;
import com.huios.proxiBanque.dao.Idao;
import com.huios.proxiBanque.metier.Auditeur;
import com.huios.proxiBanque.metier.Client;
import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Courant;
import com.huios.proxiBanque.metier.Entreprise;
import com.huios.proxiBanque.metier.Epargne;
import com.huios.proxiBanque.metier.Gerant;
import com.huios.proxiBanque.metier.Particulier;
public class ServiceImple implements IserviceAuditeur,IserviceConseiller,IserviceGerant{
	Idao dao = new Dao();

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

	@Override
	public boolean seConnecterConseiller(String login, String mdp, Conseiller conseiller) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ajouterParticulier(Particulier particulier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterEntreprise(Entreprise entreprise) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterCompteEpargne(Epargne epargne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterCompteCourant(Courant courant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerCompteEpargne(Client client, Epargne epargne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerCompteCourant(Client client, Courant courant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCompteEpargne(Epargne epargne, int typeModif) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCompteCourant(Courant courant, int typeModif) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCompteEpargne(Epargne epargne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCompteCourant(Courant courant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Particulier> FindAllParticulier(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entreprise> FindAllEntreprise(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Epargne> FindAllCompteEpargne(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Courant> FindAllCompteCourant(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void virementCompte(int id1, int id2, double res1, double res2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void simulationCompte(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void patrimoineCompte(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Epargne> auditAllCompteEpargne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Courant> auditAllCompteCourant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean seConnecterAuditeur(String login, String mdp, Auditeur auditeur) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
