import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class ViewDoginMainFrame extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public ViewDoginMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel(""); /*Image file here*/
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name" + "");/*Name of Dog here*/
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Breed" + "");/*Breed of Dog here*/
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Location" + "");/*Location of Dog here*/
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();/*Info of Dog here*/
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		
		Component glue_1 = Box.createGlue();
		panel_4.add(glue_1);
		
		JButton btnViewAdoptionInformation = new JButton("View Adoption Information");
		panel_4.add(btnViewAdoptionInformation);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_6.add(panel_3);
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		Component glue = Box.createGlue();
		panel_3.add(glue);
		
		JButton btnNewButton = new JButton("✖");
		panel_3.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panel_6.add(panel_5);
		
		Component glue_2 = Box.createGlue();
		panel_5.add(glue_2);
		
		JButton btnNewButton_1 = new JButton("✔");
		panel_5.add(btnNewButton_1);
	}

}
