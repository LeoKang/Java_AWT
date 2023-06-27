package layout.cardlayout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen3 extends JPanel{
	public Screen3() {
		this.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("È­¸é3");
		this.add(label, BorderLayout.CENTER);
		this.setBackground(Color.blue);
	}
}
