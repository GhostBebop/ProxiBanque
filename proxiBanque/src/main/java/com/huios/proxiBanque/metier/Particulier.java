/**
 * 
 */
package com.huios.proxiBanque.metier;

public class Particulier extends Client{
	private String nom;
	private String prenom;
	private String adresse;
	private int numTelephone;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNumTelephone() {
		return numTelephone;
	}
	public void setNumTelephone(int numTelephone) {
		this.numTelephone = numTelephone;
	}
	@Override
	public String toString() {
		return "Particulier [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numTelephone="
				+ numTelephone + ", email=" + email + "]";
	}
	
}
