package layout.cardlayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutTest extends JFrame {
	JPanel mainPanel;
	CardLayout card;

	public CardLayoutTest() {
		super("CardLayout Test");

		init_menubar();
		init_cardlayout();
		
		this.setLocation(200, 100);
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void init_cardlayout() {
		card = new CardLayout();
		mainPanel = new JPanel(card);
		
		mainPanel.add(new Screen1(), "s1");
		mainPanel.add(new Screen2(), "s2");
		mainPanel.add(new Screen3(), "s3");
		
		this.add(mainPanel, BorderLayout.CENTER);
	}

	private void init_menubar() {
		JPanel p = new JPanel(new GridLayout(1, 3));

		JButton jbt1 = new JButton("화면1");
		JButton jbt2 = new JButton("화면2");
		JButton jbt3 = new JButton("화면3");

		p.add(jbt1);
		p.add(jbt2);
		p.add(jbt3);

		this.add(p, BorderLayout.NORTH);

		jbt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(mainPanel, "s1");
			}
		});
		jbt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(mainPanel, "s2");
			}
		});
		jbt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(mainPanel, "s3");
			}
		});
	}

	public static void main(String[] args) {
		new CardLayoutTest();
	}
}
