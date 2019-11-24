import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ChoSung_Game extends JFrame {

	private JPanel StartPage;

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
		StartPage = new JPanel();
		StartPage.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(StartPage);
		StartPage.setLayout(null);
	}

}
