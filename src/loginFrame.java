import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class loginFrame extends JFrame{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	
	private static final int AREA_ROWS = 20;
	private static final int AREA_COLUMNS = 40;
	private static final int FIELD_WIDTH = 10;
	private JLabel nameLabel;
	private JTextField nameField;
	private JLabel emailLabel;
	private JTextField emailField;
	private JLabel passwordLabel;
	private JTextField passwordField;
	private JLabel passwordConfirmLabel;
	private JTextField passwordConfirmField;
	private JLabel phoneLabel;
	private JTextField phoneField;
	private JButton cancelButton;
	private JButton submitButton;
	
	private ActionListener cancelButtonListener;
	private ActionListener submitButtonListener;
	
	private JPanel panel;
	private JPanel westPanel;
	private JPanel southPanel;
	
	public loginFrame(){
		class cancelListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
			}
		}
		class submitListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
			}
		}
		createComponents();
		cancelButtonListener = new cancelListener();
		cancelButton.addActionListener(cancelButtonListener);
		submitButtonListener = new submitListener();
		submitButton.addActionListener(submitButtonListener);
		createPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	public void createComponents(){
		nameLabel = new JLabel("Name:");
		nameField = new JTextField(FIELD_WIDTH);
		emailLabel = new JLabel("Email:");
		emailField = new JTextField(FIELD_WIDTH);
		passwordLabel = new JLabel("Password:");
		passwordField = new JTextField(FIELD_WIDTH);
		passwordConfirmLabel = new JLabel("Password Confirmation:");
		passwordConfirmField = new JTextField(FIELD_WIDTH);
		phoneLabel = new JLabel("Phone Number:");
		phoneField = new JTextField(FIELD_WIDTH);
		cancelButton = new JButton("Cancel");
		submitButton = new JButton("Submit");
	}
	public void createPanel(){
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(10,1));
		southPanel = new JPanel();
		westPanel.add(nameLabel);
		westPanel.add(nameField);
		westPanel.add(emailLabel);
		westPanel.add(emailField);
		westPanel.add(passwordLabel);
		westPanel.add(passwordField);
		westPanel.add(passwordConfirmLabel);
		westPanel.add(passwordConfirmField);
		westPanel.add(phoneLabel);
		westPanel.add(phoneField);
		panel.add(westPanel, BorderLayout.CENTER);
		southPanel.add(cancelButton);
		southPanel.add(submitButton);
		panel.add(southPanel, BorderLayout.SOUTH);
		add(panel);
	}
}