package layout.cardlayout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen2 extends JPanel{
	public Screen2() {
		this.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("È­¸é2");
		this.add(label, BorderLayout.CENTER);
		this.setBackground(Color.green);
	}
}
