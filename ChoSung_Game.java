import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class ChoSung_Game extends JFrame {
	
	public int Score; // 총 점수

	private JPanel MainPage;
	private JTextField Game1AnsBlank;
	private JTextField Game2AnsBlank;

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
		
		JPanel SelectTemaPage = new JPanel();
		SelectTemaPage.setBounds(0, 0, 684, 461);
		MainPage.add(SelectTemaPage);
		SelectTemaPage.setLayout(null);
		
		SelectTemaPage.setVisible(false);
		
		JPanel GameExpPage = new JPanel();
		GameExpPage.setBounds(0, 0, 684, 461);
		MainPage.add(GameExpPage);
		GameExpPage.setLayout(null);
		
		GameExpPage.setVisible(false);
		
		JLabel StartLabel = new JLabel("초성 퀴즈 게임");
		StartLabel.setBounds(192, 127, 276, 78);
		StartLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 45));
		StartPage.add(StartLabel);
		
		JButton StartBtn = new JButton("게임 시작");
		StartBtn.setBounds(225, 346, 97, 23);
		StartPage.add(StartBtn);
		
		JButton GameExpBtn = new JButton("게임 설명");
		GameExpBtn.setBounds(345, 346, 97, 23);
		StartPage.add(GameExpBtn);
		
		StartBtn.addActionListener(new ActionListener() { // 게임 시작 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				StartPage.setVisible(false);
				SelectTemaPage.setVisible(true);
			}
			
		});
		
		GameExpBtn.addActionListener(new ActionListener(){ // 게임 설명 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				StartPage.setVisible(false);
				GameExpPage.setVisible(true);
			}
			
		});
		
		
		JLabel GameExpTitle = new JLabel("<게임 설명>");
		GameExpTitle.setFont(new Font("한컴산뜻돋움", Font.BOLD, 35));
		GameExpTitle.setBounds(35, 42, 173, 46);
		GameExpPage.add(GameExpTitle);
		
		JLabel GameExp1 = new JLabel("-초성 퀴즈란?");
		GameExp1.setVerticalAlignment(SwingConstants.TOP);
		GameExp1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 16));
		GameExp1.setBounds(35, 118, 110, 21);
		GameExpPage.add(GameExp1);
		
		JLabel GameExp1_1 = new JLabel("한글을 이용한 놀이 중 하나로, 어떤 단어의 초성만을 알려주고 그 단어를 알아맞히는 놀이이다.");
		GameExp1_1.setForeground(Color.DARK_GRAY);
		GameExp1_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		GameExp1_1.setBounds(35, 149, 557, 21);
		GameExpPage.add(GameExp1_1);
		
		JLabel GameExp2 = new JLabel("-게임 룰 설명");
		GameExp2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 16));
		GameExp2.setBounds(35, 203, 110, 21);
		GameExpPage.add(GameExp2);
		
		JLabel GameExp2_1 = new JLabel("(미정)");
		GameExp2_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		GameExp2_1.setForeground(Color.DARK_GRAY);
		GameExp2_1.setBounds(35, 234, 57, 15);
		GameExpPage.add(GameExp2_1);
		
		JButton StartBackBtn1 = new JButton("시작 화면으로");
		StartBackBtn1.setBounds(482, 404, 110, 23);
		GameExpPage.add(StartBackBtn1);
		
		StartBackBtn1.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameExpPage.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		
		JLabel TemaLabel = new JLabel("<테마 선택>");
		TemaLabel.setBounds(255, 42, 173, 46);
		TemaLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 35));
		SelectTemaPage.add(TemaLabel);
		
		JButton Tema1_BrandBtn = new JButton("브랜드");
		Tema1_BrandBtn.setBounds(294, 127, 97, 23);
		SelectTemaPage.add(Tema1_BrandBtn);
		
		JButton StartBackBtn2 = new JButton("시작 화면으로");
		StartBackBtn2.setBounds(482, 404, 110, 23);
		SelectTemaPage.add(StartBackBtn2);
		
		
		JPanel GamePage = new JPanel();
		GamePage.setBounds(0, 0, 684, 461);
		MainPage.add(GamePage);
		GamePage.setLayout(null);
		
		GamePage.setVisible(false);
		
		
		JPanel Game1_1 = new JPanel();
		Game1_1.setBounds(0, 0, 684, 461);
		GamePage.add(Game1_1);
		
		JPanel Game1_2 = new JPanel();
		Game1_2.setBounds(0, 0, 684, 461);
		GamePage.add(Game1_2);
		Game1_2.setLayout(null);
		Game1_1.setLayout(null);
		
		JLabel StepGame1_1 = new JLabel("문제 1");
		StepGame1_1.setBounds(38, 33, 90, 39);
		StepGame1_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game1_1.add(StepGame1_1);
		
		JButton StartBackBtn3 = new JButton("시작 화면으로");
		StartBackBtn3.setBounds(501, 44, 116, 31);
		Game1_1.add(StartBackBtn3);
		
		JLabel Game1_1Quiz = new JLabel("ㄱㄴ");
		Game1_1Quiz.setBounds(185, 159, 81, 87);
		Game1_1Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game1_1.add(Game1_1Quiz);
		
		JLabel Game1_1Score = new JLabel("현재 점수 : 0");
		Game1_1Score.setBounds(307, 37, 168, 39);
		Game1_1Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game1_1.add(Game1_1Score);
		
		Game1AnsBlank = new JTextField();
		Game1AnsBlank.setBounds(70, 352, 230, 39);
		Game1AnsBlank.setText("이곳에 정답을 입력하세요");
		Game1_1.add(Game1AnsBlank);
		Game1AnsBlank.setColumns(10);
		
		
		JButton Game1AnsBtn = new JButton("제출하기");
		Game1AnsBtn.setBounds(340, 352, 121, 39);
		Game1_1.add(Game1AnsBtn);
		
		JButton Game1_1Hint1 = new JButton("힌트 1");
		Game1_1Hint1.setBounds(520, 201, 97, 23);
		Game1_1.add(Game1_1Hint1);
		
		Game1_1Hint1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // 게임 1-1. 힌트 1 버튼 활성화
				
				JOptionPane.showMessageDialog(null, "한글", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Score -= 3;
				Game1_1Score.setText("현재 점수 : " + Score);
			}
			
		});
		
		JButton Game1_1Hint2 = new JButton("힌트  2");
		Game1_1Hint2.setBounds(520, 252, 97, 23);
		Game1_1.add(Game1_1Hint2);
		
		Game1_1Hint2.addActionListener(new ActionListener() { // 게임 1-1. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "롯데", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Score -= 5;
				Game1_1Score.setText("현재 점수 : " + Score);
			}
			
		});
		
		JButton Game1_1Hint3 = new JButton("힌트 3");
		Game1_1Hint3.setBounds(520, 308, 97, 23);
		Game1_1.add(Game1_1Hint3);
		
		Game1_1Hint3.addActionListener(new ActionListener() { // 게임 1-1. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "초콜릿", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Score -= 7;
				Game1_1Score.setText("현재 점수 : " + Score);
			}
			
		});
		
		JLabel Game1_1Hint = new JLabel("★  Hint ★");
		Game1_1Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game1_1Hint.setBounds(533, 138, 70, 39);
		Game1_1.add(Game1_1Hint);
		
		Game1_2.setVisible(false);
		
		StartBackBtn3.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GamePage.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JLabel StepGame1_2 = new JLabel("문제 2");
		StepGame1_2.setBounds(38, 33, 90, 39);
		StepGame1_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game1_2.add(StepGame1_2);
		
		JLabel Game1_2Quiz = new JLabel("ㅅㅅ");
		Game1_2Quiz.setBounds(185, 159, 81, 87);
		Game1_2Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game1_2.add(Game1_2Quiz);
		
		JLabel Game1_2Score = new JLabel("현재 점수 : 0");
		Game1_2Score.setBounds(307, 37, 168, 39);
		Game1_2Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game1_2.add(Game1_2Score);
		
		Game2AnsBlank = new JTextField();
		Game2AnsBlank.setText("이곳에 정답을 입력하세요");
		Game2AnsBlank.setBounds(153, 352, 147, 39);
		Game1_2.add(Game2AnsBlank);
		Game2AnsBlank.setColumns(10);
		
		JButton Game1_2AnsBtn = new JButton("제출하기");
		Game1_2AnsBtn.setBounds(340, 352, 121, 39);
		Game1_2.add(Game1_2AnsBtn);
		
		JButton Game1_2Hint1 = new JButton("힌트 1");
		Game1_2Hint1.setBounds(520, 201, 97, 23);
		Game1_2.add(Game1_2Hint1);
		
		Game1_2Hint1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // 게임 1-2. 힌트 1 버튼 활성화
				
				JOptionPane.showMessageDialog(null, "은하수 (**교수님 아닙니다.)", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Score -= 3;
				Game1_2Score.setText("현재 점수 : " + Score);
			}
			
		});
		
		JButton Game1_2Hint2 = new JButton("힌트  2");
		Game1_2Hint2.setBounds(520, 252, 97, 23);
		Game1_2.add(Game1_2Hint2);
		
		Game1_2Hint2.addActionListener(new ActionListener() { // 게임 1-2. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "노트", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Score -= 5;
				Game1_2Score.setText("현재 점수 : " + Score);
			}
			
		});
		
		JButton Game1_2Hint3 = new JButton("힌트 3");
		Game1_2Hint3.setBounds(520, 308, 97, 23);
		Game1_2.add(Game1_2Hint3);
		
		Game1_2Hint3.addActionListener(new ActionListener() { // 게임 1-2. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "핸드폰", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Score -= 7;
				Game1_2Score.setText("현재 점수 : " + Score);
			}
			
		});
		
		JLabel Game1_2Hint = new JLabel("★  Hint ★");
		Game1_2Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game1_2Hint.setBounds(533, 138, 70, 39);
		Game1_2.add(Game1_2Hint);
		
		JButton StartBackBtn4 = new JButton("시작 화면으로");
		StartBackBtn4.setBounds(501, 44, 116, 31);
		Game1_2.add(StartBackBtn4);
		
		StartBackBtn4.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GamePage.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		Game1AnsBtn.addActionListener(new ActionListener() { // 문제 1 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "가나";
				if(Answer.equals(Game1AnsBlank.getText())) {
					Score += 10;
					Game1_1.setVisible(false);
					Game1_2.setVisible(true);
					Game1_2Score.setText("현재 점수 : " + Score);
				}
				else {
					Score -= 5;
					Game1_2Score.setText("현재 점수 : " + Score);
				}
				
				
			}
			
		});
		
		StartBackBtn2.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				SelectTemaPage.setVisible(false);
				GamePage.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		Tema1_BrandBtn.addActionListener(new ActionListener() { // 테마 선택 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				SelectTemaPage.setVisible(false);
				GamePage.setVisible(true);
				
			}
			
		});
		
		
		
	}
}
