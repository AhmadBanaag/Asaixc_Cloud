package allAboutJ.writingAndReading;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class loginFormMain implements ActionListener {

	JTextField tf1, tf2;
	JButton b1, b2, b3;
	JLabel l1, l2;
	
	loginFormMain() {
		JFrame frame = new JFrame("Garena+ (Beta)");
		
		try {
			Image bgcImg = ImageIO.read(new File("C:\\Users\\Ahmad Banaag\\Downloads\\assignmentLoginFormAssets\\loginFormBgcImg.png"));
			Image scaledBgc = bgcImg.getScaledInstance(468, 531, Image.SCALE_SMOOTH);
			frame.setContentPane(new JLabel(new ImageIcon(scaledBgc)));
			
			tf1 = new JTextField();
			tf1.setBounds(50, 160, 210, 30);
			tf2 = new JTextField();
			tf2.setBounds(50, 200, 210, 30);
			frame.add(tf1);
			frame.add(tf2);
			
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(510, 150);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new loginFormMain();
	}
	
}
