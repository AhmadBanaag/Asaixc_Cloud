package allAboutJ.writingAndReading;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.net.URI;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener {

	JTextField tf1, tf2; // TEXT FIELD VARIABLES
	JButton b1, b2; // BUTTON VARIABLES
	JLabel l1, l2, l3, l4, l5, l6; // LABEL VARIABLES
	JCheckBox c1; // CHECKBOX VARIABLES
	JComboBox<String> cb1; // COMBO BOX VARIABLE
	JFrame frame = new JFrame(); 
	
	LoginForm() {
		frame = new JFrame("Garena+ (Beta)");
		frame.setResizable(false);
		
		Image fileIcon = new ImageIcon("C:\\Users\\Ahmad Banaag\\Downloads\\assignmentLoginFormAssets\\garenaLogo.png").getImage();
		frame.setIconImage(fileIcon); // CHANGES THE JAVA FILE ICON INTO GARENA'S LOGO ICON
		
		try {
			Image bgcImg = ImageIO.read(new File("C:\\Users\\Ahmad Banaag\\Downloads\\assignmentLoginFormAssets\\loginFormBgcImg.png"));
			Image scaledBgc = bgcImg.getScaledInstance(468, 531, Image.SCALE_SMOOTH); // FITS THE IMAGE SO THAT IT WOULD NOT SPREAD OUTSIDE THE WINDOW
			frame.setContentPane(new JLabel(new ImageIcon(scaledBgc))); //CHANGED THE BACKGROUND FOR THE WINDOW
			
			tf1 = new RoundJTextField(0); // USERNAME TEXTFIELD
			tf1.setText("Enter your Username");
			tf1.setForeground(Color.GRAY);
			tf1.setBounds(37, 150, 210, 30);
			tf1.addFocusListener(new FocusListener() {
			@Override // ACTIVATES WHENEVER THE END-USER CLICK'S ON THE TEXT FIELD
			public void focusGained(FocusEvent e) {
		        if (tf1.getText().equals("Enter your Username")) {
		            tf1.setText("");
		            tf1.setForeground(Color.BLACK);
		        }
		    }
		    @Override // ACTIVATES WHENEVER THE END-USER DOESN'T CLICK ON THE TEXT FIELD 
		    public void focusLost(FocusEvent e) {
		        if (tf1.getText().isEmpty()) {
		            tf1.setForeground(Color.GRAY);
		            tf1.setText("Enter your Username");
		        }
		    }
		    });
		    
			tf2 = new RoundJTextField(0);
			tf2.setText("Enter your Password");
			tf2.setForeground(Color.GRAY);
			tf2.setBounds(37, 190, 210, 30);
			tf2.addFocusListener(new FocusListener() {
				@Override
				public void focusGained(FocusEvent e) {
			        if (tf2.getText().equals("Enter your Password")) {
			            tf2.setText("");
			            tf2.setForeground(Color.BLACK);
			        }
			    }
			    @Override
			    public void focusLost(FocusEvent e) {
			        if (tf2.getText().isEmpty()) {
			            tf2.setForeground(Color.GRAY);
			            tf2.setText("Enter your Password");
			        }
			    }
			    });
			
			// ADDS THE TEXTFIELD TO THE FRAME
			frame.add(tf1);
			frame.add(tf2);
			
			l1 = new JLabel("Forgot Password?");
			l1.setOpaque(false);
			l1.setForeground(Color.WHITE);
			l1.setBounds(60, 230, 500, 20);
			l1.setFont(new Font("Arial Black", Font.BOLD, 11));
			l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			l1.addMouseListener(new MouseAdapter() {
				@Override // ACTIVATES WHENEVER WE CLICK ON THIS LABEL AND DIRECTS US TO GARENA'S FORGOT PASSWORD SITE
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI("https://account.garena.com/recovery#/"));
						} catch (Exception f) {
							f.printStackTrace();
						}
				}
				
				@Override // ACTIVATES SO THAT WHEN THE END-USER ISN'T HOVERING OVER THE LABEL THEN IT WON'T TURN BLUE
				public void mouseExited(MouseEvent e) {
					l1.setText("Forgot Password?");
				}
				
				@Override // TURNS BLUE WHENEVER WE HOVER OVER THE LABEL
				public void mouseEntered(MouseEvent e) {
					l1.setText("<html><a href=''>" + "Forgot Password?" + "</a><html>");
				}
			});
			
			l2 = new JLabel("Remember Password?");
			l2.setOpaque(false);
			l2.setForeground(Color.WHITE);
			l2.setBounds(60, 260, 500, 20);
			l2.setFont(new Font("Arial Black", Font.BOLD, 11));
			
			l3 = new JLabel("Sign in as");
			l3.setOpaque(false);
			l3.setForeground(Color.WHITE);
			l3.setBounds(42, 290, 500, 20);
			l3.setFont(new Font("Arial Black", Font.BOLD, 11));
			
			l4 = new JLabel("Create an Account");
			l4.setOpaque(false);
			l4.setForeground(Color.WHITE);
			l4.setBounds(40, 410, 500, 20);
			l4.setFont(new Font("Arial Black", Font.BOLD, 13));
			l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
			l4.addMouseListener(new MouseAdapter() {
				@Override // DIRECTS THE END-USER TO THE ACCOUNT CREATION SITE
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI("https://sso.garena.com/universal/register?redirect_uri=https://sso.garena.com/universal/login?app_id=10100%26redirect_uri=https%253A%252F%252Faccount.garena.com%252F%253Flocale_name%253DPH%26locale=en-PH&locale=en-PH"));
						} catch (Exception f) {
							f.printStackTrace();
						}
				}
				
				@Override // ACTIVATES SO THAT EVERYTIME END-USER ISN'T HOVERING OVER THE LABEL THEN IT WON'T TURN BLUE
				public void mouseExited(MouseEvent e) {
					l4.setText("Create an Account");
				}
				
				@Override // TURNS BLUE WHENEVER THE END-USER HOVER OVER THE LABEL
				public void mouseEntered(MouseEvent e) {
					l4.setText("<html><a href=''>" + "Create an Account" + "</a><html>");
				}
			});
			
			l5 = new JLabel("Check for Updates");
			l5.setOpaque(false);
			l5.setForeground(Color.WHITE);
			l5.setBounds(205, 410, 500, 20);
			l5.setFont(new Font("Arial Black", Font.BOLD, 13));
			l5.setCursor(new Cursor(Cursor.HAND_CURSOR));
			l5.addMouseListener(new MouseAdapter() {
				@Override // DIRECTS THE END-USER TO GARENA'S UPDATES' SITE
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI("https://careers.garena.com/global/about"));
						} catch (Exception f) {
							f.printStackTrace();
						}
				}
				
				@Override // ACTIVATES SO THAT EVERYTIME END-USER ISN'T HOVERING OVER THE LABEL THEN IT WON'T TURN BLUE
				public void mouseExited(MouseEvent e) {
					l5.setText("Check for Updates");
				}
				
				@Override // TURNS BLUE WHENEVER THE END-USER HOVER OVER THE LABEL
				public void mouseEntered(MouseEvent e) {
					l5.setText("<html><a href=''>" + "Check for Updates" + "</a><html>");
				}
			});
			
			l6 = new JLabel("|");
			l6.setOpaque(false);
			l6.setForeground(Color.WHITE);
			l6.setBounds(190, 410, 500, 20);
			l6.setFont(new Font("Arial Black", Font.BOLD, 13));
			
			// ADD THE LABELS TO THE FRAME
			frame.add(l1);
			frame.add(l2);
			frame.add(l3);
			frame.add(l5);
			frame.add(l4);
			frame.add(l6);
			
			// ADDS A CHECKBOX FOR THE "REMEMBER PASSWORD" 
			c1 = new JCheckBox();
			c1.setOpaque(false);
			c1.setBounds(37, 260, 20, 20);
			
			// ADD CHECKBOX TO THE FRAME
			frame.add(c1);
			
			String[] active = {"Online", "Offline"}; // LETS USER CHOOSE TO SHOW THEIR ACTIVE STATUS AFTER LOGGING IN		
			cb1 = new JComboBox<>(active);
			cb1.setOpaque(false);
			cb1.setBounds(110, 290, 100, 20);
			cb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			cb1.addActionListener(this);
			
			// ADD DROPDOWN LIST OR COMBO BOX TO THE FRAME
			frame.add(cb1);
			
			// BUTTON IMAGE FOR LOGGING IN
			Image tempButton = ImageIO.read(new File(("C:\\Users\\Ahmad Banaag\\Downloads\\assignmentLoginFormAssets\\loginButton.png")));
			Image scaledBtn = tempButton.getScaledInstance(200, 50, Image.SCALE_SMOOTH);
			ImageIcon newBtn = new ImageIcon(scaledBtn);
			
			// BUTTON FOR LOGGING IN
			b1 = new JButton();
			b1.setBackground(Color.WHITE);
			b1.setBounds(42, 329, 200, 50);
			b1.setFocusable(true);
			b1.setIcon(newBtn);
			b1.addActionListener(this);
			b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			
			// QUESTION MARK PICTURE
			Image tempForgot = ImageIO.read(new File(("C:\\Users\\Ahmad Banaag\\Downloads\\assignmentLoginFormAssets\\loginForget.png")));
			Image scaledForgot = tempForgot.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
			ImageIcon newForgot = new ImageIcon(scaledForgot);
			
			// MADE THIS A BUTTON TO CUSTOMIZE ALONG BACKGROUND PICTURE AND MAKE IT AN ICON
			b2 = new JButton();
			b2.setBackground(Color.RED);
			b2.setBounds(40, 234, 15, 15);	
			b2.setIcon(newForgot);
			
			// ADD BUTTONS TO THE FRAME
			frame.add(b1);
			frame.add(b2);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		frame.pack(); // PREPARED THE FRAME TO VISIBLE TO THE END-USER
		frame.setVisible(true);
		frame.setLocation(510, 150);
	}
	
public void actionPerformed(ActionEvent e) {
		String name = tf1.getText();
		String pass = tf2.getText();
		
		String nameAcc = "Asaixc"; // ACCOUNT'S PASSWORD EXAMPLE FOR PRESENTATION
		String passAcc = "gwapokaayo918"; // ACCOUNT'S PASSWORD EXAMPLE FOR PRESENTATION
		
		String tempPass = "";
			
			if (e.getSource() == b1) {
				
				try {
					// ACTIVATES WHENEVER THE END-USER SELECTS TO REMEMBER THE PASSWORD
					if (c1.isSelected()) {
					
					FileWriter print = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\loginSavedPass.txt");
					
					print.write(tf2.getText());
					print.close();
					} 
					
					Scanner scan = new Scanner(new File("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\loginSavedPass.txt")); // TAKES THE VALUE OF THE RECENT SAVED PASSWORD
					
					tempPass = scan.next();
					scan.close();
					
				} catch (Exception f) {
						f.printStackTrace();
				  }		
				
				if (name.equals(nameAcc) && pass.equals(passAcc) || name.equals(nameAcc) && tempPass.equals(passAcc)) {
					try {
					frame.dispose(); // CLOSES THE WINDOW
					Desktop.getDesktop().browse(new URI("https://www.garena.ph/")); // DIRECTS THE END-USER TO THE GARENA PAGE
					} catch (Exception f) {
						f.printStackTrace();
					}
				}
			
			else {
				System.out.println("HELLO");
					JOptionPane.showMessageDialog(null, "Invalid Password or Username", "Garena+ (Beta)", 0);
			}
		}		
	
		//Close Button
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent we) {
		        System.exit(0);
		    }
		}); } }