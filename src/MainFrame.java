import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.awt.Component;

public class MainFrame extends JFrame{


	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	//Tindog Logo

	private ActionListener seedoggiebag_listener;
	private ActionListener settings_listener;
	private ActionListener help_listener;
	private ActionListener back_listener;

	public MainFrame(){

		class SeeDoggieBag_Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){

			}
		}
		class Settings_Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				JFrame frameSettingsFrame = new settingsFrame();
				close();
				frameSettingsFrame.setVisible(true);
				frameSettingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
		class Help_Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){

			}
		}
		class Back_Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				JFrame frameDogListFrame;
				try {
					frameDogListFrame = new DogListFrame();
					frameDogListFrame .setVisible(true);
					frameDogListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (MalformedURLException e1) {
					e1.printStackTrace();
				}
				close();

			}
		}

		seedoggiebag_listener = new SeeDoggieBag_Listener();
		settings_listener = new Settings_Listener();
		help_listener = new Help_Listener();
		back_listener = new Back_Listener();

		createcosa();
		



		createpanel();

		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnBackButton = new JButton("<--");
		panel.add(btnBackButton, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		
		Component glue = Box.createGlue();
		panel_1.add(glue);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		panel_1.add(lblMainMenu);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnDoggieBag = new JButton("View Doggie Bag");
		panel_2.add(btnDoggieBag);
		
		JButton btnSettingsButton = new JButton("New button");
		panel_2.add(btnSettingsButton);
		
		JButton btnHelp = new JButton("New button");
		panel_2.add(btnHelp);
	}
	public void createpanel(){
	}
	public void close(){
		this.setVisible(false);
	}
}
