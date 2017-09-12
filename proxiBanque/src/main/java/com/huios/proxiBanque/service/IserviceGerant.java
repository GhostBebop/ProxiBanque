package com.huios.proxiBanque.service;

import java.util.List;

import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Gerant;

public interface IserviceGerant extends IserviceConseiller{
	
	public void modifierConseiller(Conseiller conseiller);
	public void	supprimerConseiller(Conseiller conseiller);
	public void ajouterConseiller(Conseiller conseiller);
	public List<Conseiller> FindAllConseiller(Gerant gerant);
}
