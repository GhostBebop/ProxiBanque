/**
 * 
 */
package com.huios.proxiBanque.metier;
import java.util.ArrayList;
import java.util.List;

public class Agence {
	private String adresse;
	private String nomAgence;
	private int id;
	private List<Employe> mesEmployes = new ArrayList<Employe>();
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Employe> getMesEmployes() {
		return mesEmployes;
	}

	public void setMesEmployes(List<Employe> mesEmployes) {
		this.mesEmployes = mesEmployes;
	}

	public void ajouterEmploye(Employe employe) {
		mesEmployes.add(employe);	
	}

	@Override
	public String toString() {
		return "Agence [adresse=" + adresse + ", nomAgence=" + nomAgence + ", id=" + id + "]";
	}
	
}
