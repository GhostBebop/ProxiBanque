/**
 * 
 */
package com.huios.proxiBanque.metier;

public class Entreprise extends Client{
	private String nomEntreprise;
	private String adresse;
	private int numTelephone;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
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
		return "Entreprise [nomEntreprise=" + nomEntreprise + ", adresse=" + adresse + ", numTelephone=" + numTelephone
				+ ", email=" + email + "]";
	}
	
}
