package app;

import entities.Restaurant;

public class SystemInitialization {
	
	//pegar os dados pr� gravados em arquivos
	//dados podem ser reescritos
	
	
	/* Dados no arquivo:
	 * n�mero de mesas */
	
	public static Restaurant go() {
		
		Restaurant restaurant = new Restaurant(20);
		
		return restaurant;
	}
}
