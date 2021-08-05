package app;

import entities.Restaurant;

public class SystemInitialization {
	
	//pegar os dados pré gravados em arquivos
	//dados podem ser reescritos
	
	
	/* Dados no arquivo:
	 * número de mesas */
	
	public static Restaurant go() {
		
		Restaurant restaurant = new Restaurant(20);
		
		return restaurant;
	}
}
