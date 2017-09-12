/**
 * 
 */
package com.huios.proxiBanque.metier;

import java.util.ArrayList;
import java.util.List;

public class Conseiller extends Employe{
	private List<Client> mesClients = new ArrayList<Client>();
	private Gerant monGerant;

	public List<Client> getMesClients() {
		return mesClients;
	}

	public void setMesClients(List<Client> mesClients) {
		this.mesClients = mesClients;
	}

	public Gerant getMonGerant() {
		return monGerant;
	}

	public void setMonGerant(Gerant monGerant) {
		this.monGerant = monGerant;
	}

	@Override
	public String toString() {
		return "Conseiller [monGerant=" + monGerant + ", toString()=" + super.toString() + "]";
	}
	public void ajouterClient(Client c) {
		mesClients.add(c);
		
	}
}
