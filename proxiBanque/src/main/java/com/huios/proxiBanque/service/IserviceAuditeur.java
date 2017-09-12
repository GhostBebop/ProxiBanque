package com.huios.proxiBanque.service;

import java.util.List;

import com.huios.proxiBanque.metier.Compte;

public interface IserviceAuditeur {
	public List<Compte> auditAllCompte();
	public void seConnecterAuditeur(String login,String mdp);
}
