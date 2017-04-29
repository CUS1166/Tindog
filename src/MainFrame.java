import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.awt.Component;

public class MainFrame extends JFrame{


	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;

	//Doggie Bag Icon
	private JButton Main_Back;
	private JButton Main_SeeDoggieBag;
	private JButton Main_Settings;
	private JButton Main_Help;
	//Tindog Logo

	private ActionListener seedoggiebag_listener;
	private ActionListener settings_listener;
	private ActionListener help_listener;
	private ActionListener back_listener;

	private JPanel panel;
	private JPanel panel_north;
	private JPanel panel_center;
	private JPanel panel_south;
	private JPanel panel_north_center;
	private Component glue;
	private JLabel lblMainMenu;

	public MainFrame(){

		class SeeDoggieBag_Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
			/*	JFrame frameDoggieBag = new DoggieBag();
				close();
				frameDoggieBag.setVisible(true);
				//frameDoggieBag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			*/
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
				JFrame frameHelpFrame = new HelpFrame();
				close();
				frameHelpFrame.setVisible(true);
				//frameHelpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		Main_SeeDoggieBag.addActionListener(seedoggiebag_listener);
		Main_Settings.addActionListener(settings_listener);
		Main_Help.addActionListener(help_listener);
		Main_Back.addActionListener(back_listener);

		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	public void createcosa(){
		Main_SeeDoggieBag = new JButton("See Doggie Bag");
		Main_Settings = new JButton("Settings");
		Main_Help = new JButton("Help");
		//Tindog Logo
	}
	public void createpanel(){

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel_north = new JPanel();
		panel_north.setLayout(new BorderLayout(0, 0));
		panel_center = new JPanel();
		//Doggie Bag Icon
		panel_center.add(Main_SeeDoggieBag);
		panel_center.add(Main_Settings);
		panel_center.add(Main_Help);
		panel_center.setLayout(new GridLayout(3,1));
		panel_south = new JPanel();
		//panel_south.add(Tindog Logo);
		panel.add(panel_north, BorderLayout.NORTH);

		//Doggie Bag Icon
		Main_Back = new JButton("<--");
		panel_north.add(Main_Back, BorderLayout.WEST);

		panel_north_center = new JPanel();
		panel_north.add(panel_north_center, BorderLayout.CENTER);

		glue = Box.createGlue();
		panel_north_center.add(glue);

		lblMainMenu = new JLabel("Main Menu");
		panel_north_center.add(lblMainMenu);
		panel.add(panel_center, BorderLayout.CENTER);
		panel.add(panel_south, BorderLayout.SOUTH);
		getContentPane().add(panel);
	}
	public void close(){
		this.setVisible(false);
	}
}
