package allAboutJ.writingAndReading;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;

public class electricityCalculatorMain implements ActionListener {
	
	JFrame frame = new JFrame("APPLIANCE ELECTRIC CALCULATOR");
	JButton b1, b2;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8;
	
electricityCalculatorMain() {
	frame = new JFrame("ELECRTICITY CALCULATOR");
		try {
			
			Image bgcImg = ImageIO.read(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Pictures\\abstract-luxury-blur-dark-grey-black-gradient-used-as-background-studio-wall-display-your-products.jpg"));
			Image scaledBgc = bgcImg.getScaledInstance(900, 500, Image.SCALE_SMOOTH);
			frame.setContentPane(new JLabel(new ImageIcon(scaledBgc)));
			l1 = new JLabel("APPLIANCES:");
			l1.setOpaque(false);
			l1.setForeground(Color.WHITE);
			l1.setBounds(50, 30, 500, 20);
			l1.setFont(new Font("Arial Black", Font.BOLD, 20));
			l2 = new JLabel("WATTS:");
			l2.setOpaque(false);
			l2.setForeground(Color.WHITE);
			l2.setBounds(50, 120, 500, 20);
			l2.setFont(new Font("Arial Black", Font.BOLD, 20));
			l3 = new JLabel("HOURS per DAY:");
			l3.setOpaque(false);
			l3.setForeground(Color.WHITE);
			l3.setBounds(220, 120, 500, 20);
			l3.setFont(new Font("Arial Black", Font.BOLD, 20));
			l4 = new JLabel("CURRENT MONTHLY BILL:");
			l4.setOpaque(false);
			l4.setForeground(Color.WHITE);
			l4.setBounds(50, 303, 500, 20);
			l4.setFont(new Font("Arial Black", Font.BOLD, 20));
			l5 = new JLabel("APPLIANCES:");
			l5.setOpaque(false);
			l5.setForeground(Color.WHITE);
			l5.setBounds(50, 30, 500, 20);
			l5.setFont(new Font("Arial Black", Font.BOLD, 20));
			l6 = new JLabel("HOUSEHOLD");
			l6.setOpaque(false);
			l6.setForeground(Color.WHITE);
			l6.setBounds(500, 30, 500, 20);
			l6.setFont(new Font("Arial Black", Font.BOLD, 20));
			l7 = new JLabel("PREVIOUS READING:");
			l7.setOpaque(false);
			l7.setForeground(Color.WHITE);
			l7.setBounds(500, 70, 500, 20);
			l7.setFont(new Font("Arial Black", Font.BOLD, 20));
			l8 = new JLabel("PRESENT READING:");
			l8.setOpaque(false);
			l8.setForeground(Color.WHITE);
			l8.setBounds(500, 150, 500, 20);
			l8.setFont(new Font("Arial Black", Font.BOLD, 20));
			l9 = new JLabel("CURRENT DAILY BILL:");
			l9.setOpaque(false);
			l9.setForeground(Color.WHITE);
			l9.setBounds(50, 400, 500, 20);
			l9.setFont(new Font("Arial Black", Font.BOLD, 20));
			l10 = new JLabel("CURRENT BILL:");
			l10.setOpaque(false);
			l10.setForeground(Color.WHITE);
			l10.setBounds(500, 300, 500, 20);
			l10.setFont(new Font("Arial Black", Font.BOLD, 20));
			frame.add(l6);
			frame.add(l7);
			frame.add(l8);
			frame.add(l9);
			frame.add(l10);
				tf1 = new JTextField();
				tf1.setBounds(50, 70, 353,30);
				tf2 = new JTextField();
				tf2.setBounds(50, 160, 100, 20);
				tf3 = new JTextField();
				tf3.setBounds(220, 160, 100, 20);
				tf4 = new JTextField();
				tf4.setFont(new Font("Arial Black", Font.BOLD, 15));
				tf4.setHorizontalAlignment(JTextField.CENTER);
				tf4.setBounds(50, 340, 180, 30);
				tf4.setEditable(false);
				tf5 = new JTextField();
				tf5.setBounds(500, 110, 230, 20);
				tf6 = new JTextField();
				tf6.setBounds(500, 190, 230, 20);
				tf7 = new JTextField();
				tf7.setFont(new Font("Arial Black", Font.BOLD, 15));
				tf7.setHorizontalAlignment(JTextField.CENTER);
				tf7.setBounds(500, 340, 180, 30);
				tf7.setEditable(false);
				tf8 = new JTextField();
				tf8.setFont(new Font("Arial Black", Font.BOLD, 15));
				tf8.setHorizontalAlignment(JTextField.CENTER);
				tf8.setBounds(50, 440, 180, 30);
				tf8.setEditable(false);
			frame.add(l1);
			frame.add(l2);
			frame.add(l3);
			frame.add(l4);
			frame.add(tf1);
			frame.add(tf2);
			frame.add(tf3);
			frame.add(tf4);
			frame.add(tf5);
			frame.add(tf6);
			frame.add(tf7);
			frame.add(tf8);
				b1 = new JButton("CALCULATE BILL");
				b1.setOpaque(false);
				b1.setBackground(Color.WHITE);
				b1.setForeground(Color.WHITE);
				b1.setBounds(120, 210, 250, 50);
				b1.setFont(new Font("Arial Black", Font.BOLD, 20));
				b1.addActionListener(this);
				b2 = new JButton("CALCULATE BILL");
				b2.setOpaque(false);
				b2.setBackground(Color.WHITE);
				b2.setForeground(Color.WHITE);
				b2.setFont(new Font("Arial Black", Font.BOLD, 20));
				b2.setBounds(500, 230, 250, 50);
				b2.addActionListener(this);	
			frame.add(b1);
			frame.add(b2);

		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(300, 200);
}

@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==b1) {
		double watt = Double.parseDouble(tf2.getText());
		double hours = Double.parseDouble(tf3.getText());
		double monthlyCost = (((watt * hours) / 1000) * 13.0542 * 30); 
		double dailyCost = (((watt * hours) / 1000) * 13.0542); 
		tf4.setText("PHP " + String.valueOf(monthlyCost));
		tf8.setText("PHP " + String.valueOf(dailyCost));
	} else if (e.getSource()==b2) {
		double prevRead = Double.parseDouble(tf5.getText());
		double presRead = Double.parseDouble(tf6.getText());
		double kWh = presRead - prevRead;
		double annualCost = kWh * 13.0542;
		tf7.setText("PHP " + String.valueOf(annualCost));
		
	}
}

public static void main(String[] args) {
	new electricityCalculatorMain();
	
	}
}
