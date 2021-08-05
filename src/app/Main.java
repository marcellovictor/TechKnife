package app;

import entities.Restaurant;

public class Main {

	public static void main(String[] args) {
		
		Restaurant restaurant = SystemInitialization.go();
		
		
		ManagerMainScreen managerMainScreen = new ManagerMainScreen();
		
		
		/*   Teste de instaciacao restaurante
		for (int i = 0; i < restaurant.getTablesNumber(); i++) {
			System.out.print(restaurant.getTableArray()[i] + "  ");
			System.out.println(i);
		}*/
		
	}

}
