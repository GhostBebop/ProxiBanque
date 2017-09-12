/**
 * 
 */
package com.huios.proxiBanque.metier;

public class Epargne extends Compte{
	private double taux;

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "Epargne [taux=" + taux + ", toString()=" + super.toString() + "]";
	}	
}
