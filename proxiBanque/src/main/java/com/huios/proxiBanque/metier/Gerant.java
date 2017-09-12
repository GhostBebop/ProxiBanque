/**
 * 
 */
package com.huios.proxiBanque.metier;

import java.util.ArrayList;
import java.util.List;

public class Gerant extends Employe{
	private List<Conseiller> mesConseillers = new ArrayList<Conseiller>();
	
	public List<Conseiller> getMesConseillers() {
		return mesConseillers;
	}
	public void setMesConseillers(List<Conseiller> mesConseillers) {
		this.mesConseillers = mesConseillers;
	}
	@Override
	public String toString() {
		return "Gerant [toString()=" + super.toString() + "]";
	}
	public void ajouterConseiller(Conseiller c) {
		mesConseillers.add(c);
	}
	
	
}
