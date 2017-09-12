package com.huios.proxiBanque.service;

import java.util.List;

import com.huios.proxiBanque.metier.Auditeur;
import com.huios.proxiBanque.metier.Courant;
import com.huios.proxiBanque.metier.Epargne;

public interface IserviceAuditeur {
	public List<Epargne> auditAllCompteEpargne();
	public List<Courant> auditAllCompteCaurant();
	public boolean seConnecterAuditeur(String login,String mdp,Auditeur auditeur);
}
