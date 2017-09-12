/**
 * 
 */
package com.huios.proxiBanque.metier;

public class Courant extends Compte{
	private float decouvert;
	
	public float getDecouvert() {
		return decouvert;
	}
	
	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "Courant [decouvert=" + decouvert + ", toString()=" + super.toString() + "]";
	}		
}
