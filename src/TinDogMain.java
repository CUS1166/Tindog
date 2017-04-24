

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TinDogMain
{
	private static ActionListener nuca_listener;
	private ActionListener login_listener;
	public static void main(String[] args)
	{
		//Does this work?
		JFrame frameStartFrame = new StartFrame();
		frameStartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameStartFrame.setVisible(true);
		/*JFrame frame2 = new loginFrame();
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);*/
	}
}
