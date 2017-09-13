/**
 * 
 */
package com.huios.proxiBanque.metier;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private List<Compte> mesComptes = new ArrayList<Compte>();
	private Conseiller monConseiller;
	private int id;
	private String typeClient;
	
	
	public String getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Compte> getMesComptes() {
		return mesComptes;
	}
	public void setMesComptes(List<Compte> mesComptes) {
		this.mesComptes = mesComptes;
	}
	public Conseiller getMonConseiller() {
		return monConseiller;
	}
	public void setMonConseiller(Conseiller monConseiller) {
		this.monConseiller = monConseiller;
	}
	
	@Override
	public String toString() {
		return "Client [monConseiller=" + monConseiller + ", id=" + id + ", typeClient=" + typeClient + "]";
	}
	public void ajouterCompte(Compte c) {
		mesComptes.add(c);
	}
	
	
}
