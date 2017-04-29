	
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class ViewDoginMainFrame extends JFrame {

	private JPanel contentPane;
	private ActionListener backbtnListener;
	/**
	 * Create the frame.
	 */
	public ViewDoginMainFrame() {
		class backListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				JFrame frameDogListFrame;
				try {
					frameDogListFrame = new DogListFrame();
					frameDogListFrame.setVisible(true);
					frameDogListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				close();
				
			}
		}
		backbtnListener = new backListener();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_north = new JPanel();
		contentPane.add(panel_north, BorderLayout.NORTH);
		panel_north.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_north_buttonBack = new JPanel();
		panel_north.add(panel_north_buttonBack);
		FlowLayout flowLayout_2 = (FlowLayout) panel_north_buttonBack.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		
		JButton button = new JButton("<--");
		panel_north_buttonBack.add(button);
		button.addActionListener(backbtnListener);
		
		JPanel panel_center = new JPanel();
		contentPane.add(panel_center, BorderLayout.CENTER);
		panel_center.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_center_north = new JPanel();
		panel_center.add(panel_center_north, BorderLayout.NORTH);
		panel_center_north.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		panel_center_north.add(lblNewLabel);
		
		JLabel lblNewLabel_name = new JLabel("Name" + "");
		panel_center_north.add(lblNewLabel_name);
		
		JLabel lblNewLabel_breed = new JLabel("Breed" + "");
		panel_center_north.add(lblNewLabel_breed);
		
		JLabel lblNewLabel_location = new JLabel("Location" + "");
		panel_center_north.add(lblNewLabel_location);
		
		JPanel panel_center_TextArea = new JPanel();
		panel_center.add(panel_center_TextArea);
		
		JTextArea textArea = new JTextArea();
		panel_center_TextArea.add(textArea);
		
		JPanel panel_south = new JPanel();
		contentPane.add(panel_south, BorderLayout.SOUTH);
		panel_south.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_south_south = new JPanel();
		panel_south.add(panel_south_south, BorderLayout.SOUTH);
		panel_south_south.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_south_south_buttonViewAdoptInfo = new JPanel();
		panel_south_south.add(panel_south_south_buttonViewAdoptInfo);
		
		Component glue_1 = Box.createGlue();
		panel_south_south_buttonViewAdoptInfo.add(glue_1);
		
		JButton btnViewAdoptionInformation = new JButton("View Adoption Information");
		panel_south_south_buttonViewAdoptInfo.add(btnViewAdoptionInformation);
		
		JPanel panel_south_south_tbd = new JPanel();
		panel_south_south.add(panel_south_south_tbd);
		panel_south_south_tbd.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_south_south_tbd_buttonXmark = new JPanel();
		panel_south_south_tbd.add(panel_south_south_tbd_buttonXmark);
		FlowLayout flowLayout = (FlowLayout) panel_south_south_tbd_buttonXmark.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		Component glue = Box.createGlue();
		panel_south_south_tbd_buttonXmark.add(glue);
		
		JButton button_Xmark = new JButton("✖");
		panel_south_south_tbd_buttonXmark.add(button_Xmark);
		
		JPanel panel_south_south_tbd_buttoncheckmark = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_south_south_tbd_buttoncheckmark.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panel_south_south_tbd.add(panel_south_south_tbd_buttoncheckmark);
		
		Component glue_2 = Box.createGlue();
		panel_south_south_tbd_buttoncheckmark.add(glue_2);
		
		JButton button_checkmark = new JButton("✔");
		panel_south_south_tbd_buttoncheckmark.add(button_checkmark);
	}
	public void close(){
		this.setVisible(false);
	}

}
