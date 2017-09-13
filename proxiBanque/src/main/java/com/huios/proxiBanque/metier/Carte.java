/**
 * 
 */
package com.huios.proxiBanque.metier;

public class Carte {
	private String typeCarte;
	private Compte compte;
	private int idCompte;
	
	
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public String getTypeCarte() {
		return typeCarte;
	}
	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	@Override
	public String toString() {
		return "Carte [typeCarte=" + typeCarte + ", compte=" + compte + ", idCompte=" + idCompte + "]";
	}
}
	
