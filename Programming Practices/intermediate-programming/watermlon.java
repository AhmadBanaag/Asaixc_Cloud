package puzzles;

import java.awt.*;

public class watermlon extends Panel {
	watermlon() {
		setBackground(new Color(207, 236, 243));
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillArc(20, 50, 350, 250, 180, 180);
		g.setColor(new Color(131, 183, 95));
		g.fillArc(25, 55, 340, 240, 180, 180);
		g.setColor(new Color(255, 255, 255));
		g.fillArc(68, 80, 255, 190, 180, 180);
		g.setColor(new Color(255, 0, 78));
		g.fillArc(80, 92, 230, 165, 180, 180);
		g.setColor(Color.BLACK);
		g.fillOval(130, 180, 45, 45);
		g.setColor(Color.BLACK);
		g.fillOval(230, 180, 45, 45);
		g.setColor(Color.WHITE);
		g.fillOval(132, 186, 20, 20);
		g.setColor(Color.WHITE);
		g.fillOval(232, 187, 20, 20);
		g.setColor(Color.WHITE);
		g.fillOval(152, 200, 13, 13);
		g.setColor(Color.WHITE);
		g.fillOval(252, 201, 13, 13);
		g.setColor(Color.BLACK);
		g.drawArc(193, 200, 20, 20, 180, 180);
	}
	
	
	public static void main(String[] args) {
		Frame frame = new Frame("");
		watermlon melon = new watermlon();
		frame.add(melon);
		frame.setLocation(300, 500);
		frame.setVisible(true);
		frame.setSize(300, 500);
		
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent we) {
				System.exit(0);
			}
		});
		
		
	}
	
	

	
}
