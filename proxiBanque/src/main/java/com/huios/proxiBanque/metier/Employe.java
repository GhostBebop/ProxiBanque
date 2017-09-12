/**
 * 
 */
package com.huios.proxiBanque.metier;

public abstract class Employe {
	private String nom;
	private String prenom;
	private int numTelephone;
	private String adresse;
	private Agence monAgence;
	private String email;
	private int login;
	private int mdp;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumTelephone() {
		return numTelephone;
	}
	public void setNumTelephone(int numTelephone) {
		this.numTelephone = numTelephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Agence getMonAgence() {
		return monAgence;
	}
	public void setMonAgence(Agence monAgence) {
		this.monAgence = monAgence;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public int getMdp() {
		return mdp;
	}
	public void setMdp(int mdp) {
		this.mdp = mdp;
	}
	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", numTelephone=" + numTelephone + ", adresse=" + adresse
				+ ", monAgence=" + monAgence + ", email=" + email + ", login=" + login + ", mdp=" + mdp + ", id=" + id
				+ "]";
	}
	
	
	
}
