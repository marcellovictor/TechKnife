package app;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ManagerMainScreen extends JFrame{

	public ManagerMainScreen() {
		
		
		//Screen Settings
		setSize(800, 600);
		setLocation(500, 200);
		setTitle("MainMenu");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2, 1));
		
		
		//Initialize System Button
		JButton initSystemButton = new JButton("Colocar ActionListener");
		initSystemButton.setText("Initialize System");
		//mudar cor background
		//mudar fonte
		
		
		add(initSystemButton);
		
		//Change Settings Button
		JButton changeSettingsButton = new JButton("Colocar ActionListener");
		changeSettingsButton.setText("Change Settings");
		//mudar cor background
		//mudar fonte
		
		add(changeSettingsButton);
		
		setVisible(true);
	}
}
