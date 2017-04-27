import javax.swing.*;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;


public class StartFrame extends JFrame{

	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	private static final int FIELD_WIDTH = 10;
	private JTextField Start_Username;
	private JTextField Start_Password;
	private JButton Start_NUCA;
	private JButton Start_Login;
	
	private ActionListener nuca_listener;
	private ActionListener login_listener;
		
	private JPanel panel;
	private JPanel panel_center;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JPanel panel_1;
	private JLabel lblWelcomeToTindog;
	
	
	public StartFrame(){
		class CreateAccount_Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				JFrame frameNewUserFrame = new NewUserFrame();
				close();
				frameNewUserFrame.setVisible(true);
				frameNewUserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		}
		class Login_Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				if (Start_Username.getText().equals(null) || Start_Password.getText().equals(null))
				{
					
				}
				else
				{
					try{
					UniversalDogDB dogDB=new UniversalDogDB();
					String query = "select USER_Email from USER where USER_Email = " + Start_Username.getText() + ";";
					dogDB.retrieveData(query);
					ResultSet result = dogDB.getResultSet();
					
					System.out.println(result.getString(1));
					
					}
					catch(Exception d){
						d.printStackTrace();
					}
					/*query = "select USER_Password from USER where USER_Password = " + Start_Password.getText() + ";";
					dogDB.retrieveData(query);
					result = dogDB.getResultSet();*/
				}
				
				
				JFrame frameDogListFrame = new DogListFrame();
				close();
				frameDogListFrame.setVisible(true);
				frameDogListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		}
		
		
		nuca_listener = new CreateAccount_Listener();
		login_listener = new Login_Listener();
		
		createcosa();
		
		Start_NUCA.addActionListener(nuca_listener);
		Start_Login.addActionListener(login_listener);
		
		createpanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	public void createcosa(){
		Start_Username = new JTextField(FIELD_WIDTH);
		Start_Password = new JTextField(FIELD_WIDTH);
		Start_NUCA = new JButton("New User? Create Account");
		Start_Login = new JButton("Login");
	}
	public void createpanel(){
	
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel_center = new JPanel();
		panel_center.setLayout(new GridLayout(6,1));
		
		lblUserName = new JLabel("Username:");
		panel_center.add(lblUserName);
		panel_center.add(Start_Username);
		
		lblPassword = new JLabel("Password:");
		panel_center.add(lblPassword);
		panel_center.add(Start_Password);
		panel_center.add(Start_NUCA);
		panel_center.add(Start_Login);
		panel.add(panel_center, BorderLayout.CENTER);
		getContentPane().add(panel);
		
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		
		lblWelcomeToTindog = new JLabel("Welcome to TinDog");
		panel_1.add(lblWelcomeToTindog);
	}
	public void close(){
		this.setVisible(false);
	}
}