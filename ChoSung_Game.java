import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ChoSung_Game extends JFrame {

	private JPanel MainPage;
	private JTextField Game1AnsBlank;

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
		
		JPanel GamePage = new JPanel();
		GamePage.setBounds(0, 0, 684, 461);
		MainPage.add(GamePage);
		GamePage.setLayout(null);
		
		JLabel StartLabel = new JLabel("초성퀴즈");
		StartLabel.setBounds(247, 127, 173, 78);
		StartLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 45));
		StartPage.add(StartLabel);
		
		JButton StartBtn = new JButton("시작하기");
		StartBtn.setBounds(286, 346, 97, 23);
		StartPage.add(StartBtn);
		
		GamePage.setVisible(false);
		
		StartBtn.addActionListener(new ActionListener() { // 게임 시작 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				StartPage.setVisible(false);
				GamePage.setVisible(true);
			}
			
		});
		
		
		JPanel Game1 = new JPanel();
		Game1.setBounds(0, 0, 684, 461);
		GamePage.add(Game1);
		Game1.setLayout(null);
		
		JLabel StepGame1 = new JLabel("문제 1");
		StepGame1.setBounds(38, 33, 90, 39);
		StepGame1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game1.add(StepGame1);
		
		JLabel Game1Quiz = new JLabel("\u3131\u3134");
		Game1Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game1Quiz.setBounds(185, 159, 81, 87);
		Game1.add(Game1Quiz);
		
		Game1AnsBlank = new JTextField();
		Game1AnsBlank.setText("이곳에 정답을 입력하세요");
		Game1AnsBlank.setBounds(153, 352, 147, 39);
		Game1.add(Game1AnsBlank);
		Game1AnsBlank.setColumns(10);
		
		JButton Game1AnsBtn = new JButton("제출하기");
		Game1AnsBtn.setBounds(340, 352, 121, 39);
		Game1.add(Game1AnsBtn);
		
		JPanel Game2 = new JPanel();
		Game2.setBounds(0, 0, 684, 461);
		GamePage.add(Game2);
		Game2.setLayout(null);
		
		JLabel StepGame2 = new JLabel("문제 2");
		StepGame2.setBounds(38, 33, 90, 39);
		StepGame2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game2.add(StepGame2);
		
		Game1AnsBtn.addActionListener(new ActionListener() { // 문제 1 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "가나";
				if(Answer.equals(Game1AnsBlank.getText())) {
					Game1.setVisible(false);
					Game2.setVisible(true);
				}
				
				
			}
			
		});
		
		
	}
}
