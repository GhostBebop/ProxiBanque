/**
 * 
 */
package com.huios.proxiBanque.metier;
public class Compte {
	private Client client;
	private Carte carte;
	private int code;
	private int id;
	protected float solde;
	private String dateCreation;
	private int idClient;
	private String typeCompte;
	
	
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Carte getCarte() {
		return carte;
	}
	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	@Override
	public String toString() {
		return "Compte [client=" + client + ", carte=" + carte + ", code=" + code + ", id=" + id + ", solde=" + solde
				+ ", dateCreation=" + dateCreation + ", idClient=" + idClient + ", typeCompte=" + typeCompte + "]";
	}
	
}
