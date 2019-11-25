import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ChoSung_Game extends JFrame {

	private JPanel MainPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoSung_Game frame = new ChoSung_Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChoSung_Game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 300, 700, 500);
		MainPage = new JPanel();
		MainPage.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPage);
		MainPage.setLayout(null);
		
		JPanel StartPage = new JPanel();
		StartPage.setBounds(0, 0, 684, 461);
		MainPage.add(StartPage);
		StartPage.setLayout(null);
		
		JLabel StartLabel = new JLabel("초성퀴즈");
		StartLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 45));
		StartLabel.setBounds(247, 127, 173, 78);
		StartPage.add(StartLabel);
		
		JButton StartBtn = new JButton("시작하기");
		StartBtn.setBounds(286, 346, 97, 23);
		StartPage.add(StartBtn);
	}
}
