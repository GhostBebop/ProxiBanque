/**
 * 
 */
package com.huios.proxiBanque.metier;

public class Carte {
	private String typeCarte;
	private Compte compte;
	
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
		return "Carte [typeCarte=" + typeCarte + ", compte=" + compte + "]";
	}
	
}
	
