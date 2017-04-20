import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class FilterFrame extends JFrame{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	private static final int FIELD_WIDTH = 5;
	private JLabel ageLabel;
	private JTextField ageField1;
	private JLabel toLabel;
	private JTextField ageField2;
	private JLabel breedLabel;
	private JComboBox <String> breedBox;
	private JLabel sexLabel;
	private JRadioButton sexButton;
	private JLabel shelterLabel;
	private JComboBox <String> shelterBox;
	
	public FilterFrame(){
		
	}
	
	public void createComponents(){
		ageLabel = new JLabel ("Age: ");
		ageField1 = new JTextField(FIELD_WIDTH);
		toLabel = new JLabel(" to ");
		ageField2 = new JTextField(FIELD_WIDTH);
		breedLabel = new JLabel ("Breed: ");
		
	}
}
