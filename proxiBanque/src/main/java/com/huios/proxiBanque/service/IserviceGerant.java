package com.huios.proxiBanque.service;

import com.huios.proxiBanque.metier.Conseiller;
import com.huios.proxiBanque.metier.Gerant;

public interface IserviceGerant extends IserviceConseiller{
	
	public void modifierConseiller(Conseiller conseiller);
	public void	supprimerConseiller(Conseiller conseiller);
	public void ajouterConseiller(Conseiller conseiller);
	public void FindAllConseiller(Gerant gerant);
}
