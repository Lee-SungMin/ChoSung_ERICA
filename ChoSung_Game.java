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
	private JTextField Game1_1AnsBlank;
	private JTextField Game1_2AnsBlank;
	private JTextField Game2_1AnsBlank;

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
		
		JLabel GameExp2 = new JLabel("-게임 방법 및 룰 설명");
		GameExp2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 16));
		GameExp2.setBounds(35, 203, 163, 21);
		GameExpPage.add(GameExp2);
		
		JLabel GameExp2_1 = new JLabel("<html>게임 방법 : 문제에 주어진 초성을 보고 개발자가 지정해 놓은 정답을 맞추면 됩니다.<br>" + "(힌트를 사용하면 문제를 쉽게 맞출 수 있습니다.)<br>" + " <br>" + " 게임 룰 : 문제를 맞춘 경우 +10점, 틀린 경우 -5점, 힌트 1 사용시 -3점, 힌트 2 사용시 -5점, 힌트 3 사용시 -7점<html>");
		GameExp2_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		GameExp2_1.setForeground(Color.DARK_GRAY);
		GameExp2_1.setBounds(35, 212, 615, 143);
		GameExpPage.add(GameExp2_1);
		
		JButton StartBackExpBtn = new JButton("시작 화면으로");
		StartBackExpBtn.setBounds(482, 404, 110, 23);
		GameExpPage.add(StartBackExpBtn);
		
		StartBackExpBtn.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

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
		
		JButton Tema2_FoodBtn = new JButton("음식");
		Tema2_FoodBtn.setBounds(294, 180, 97, 23);
		SelectTemaPage.add(Tema2_FoodBtn);
		
		JButton StartBackTemaBtn = new JButton("시작 화면으로");
		StartBackTemaBtn.setBounds(482, 404, 110, 23);
		SelectTemaPage.add(StartBackTemaBtn);
		
		
		JPanel GameTema1_Brand = new JPanel();
		GameTema1_Brand.setBounds(0, 0, 684, 461);
		MainPage.add(GameTema1_Brand);
		GameTema1_Brand.setLayout(null);
		
		GameTema1_Brand.setVisible(false);
		
		JPanel GameTema2_Food = new JPanel();
		GameTema2_Food.setBounds(0, 0, 684, 461);
		MainPage.add(GameTema2_Food);
		GameTema2_Food.setLayout(null);
		
		GameTema2_Food.setVisible(false);
	
		
		JPanel Game1_1 = new JPanel();
		Game1_1.setBounds(0, 0, 684, 461);
		GameTema1_Brand.add(Game1_1);
		
		JPanel Game1_2 = new JPanel();
		Game1_2.setBounds(0, 0, 684, 461);
		GameTema1_Brand.add(Game1_2);
		Game1_2.setLayout(null);
		Game1_1.setLayout(null);
		
		JLabel StepGame1_1 = new JLabel("문제 1");
		StepGame1_1.setBounds(38, 33, 90, 39);
		StepGame1_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game1_1.add(StepGame1_1);
		
		JButton StartBackBtn1_1 = new JButton("시작 화면으로");
		StartBackBtn1_1.setBounds(501, 44, 116, 31);
		Game1_1.add(StartBackBtn1_1);
		
		JLabel Game1_1Quiz = new JLabel("ㄱㄴ");
		Game1_1Quiz.setBounds(185, 159, 81, 87);
		Game1_1Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game1_1.add(Game1_1Quiz);
		
		JLabel Game1_1Score = new JLabel("현재 점수 : 0");
		Game1_1Score.setBounds(307, 37, 168, 39);
		Game1_1Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game1_1.add(Game1_1Score);
		
		Game1_1AnsBlank = new JTextField();
		Game1_1AnsBlank.setBounds(70, 352, 230, 39);
		Game1_1AnsBlank.setText("이곳에 정답을 입력하세요");
		Game1_1.add(Game1_1AnsBlank);
		Game1_1AnsBlank.setColumns(10);
		
		
		JButton Game1_1AnsBtn = new JButton("제출하기");
		Game1_1AnsBtn.setBounds(340, 352, 121, 39);
		Game1_1.add(Game1_1AnsBtn);
		
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
		
		StartBackBtn1_1.addActionListener(new ActionListener() { // 문제 1-1 에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema1_Brand.setVisible(false);
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
		
		Game1_2AnsBlank = new JTextField();
		Game1_2AnsBlank.setText("이곳에 정답을 입력하세요");
		Game1_2AnsBlank.setBounds(153, 352, 147, 39);
		Game1_2.add(Game1_2AnsBlank);
		Game1_2AnsBlank.setColumns(10);
		
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
		
		JButton StartBackBtn1_2 = new JButton("시작 화면으로");
		StartBackBtn1_2.setBounds(501, 44, 116, 31);
		Game1_2.add(StartBackBtn1_2);
		
		StartBackBtn1_2.addActionListener(new ActionListener() { // 문제 1-2 에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema1_Brand.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		
		// 테마 - 음식
		
		JPanel Game2_1 = new JPanel();
		Game2_1.setBounds(0, 0, 684, 461);
		GameTema2_Food.add(Game2_1);
		Game2_1.setLayout(null);
		
		JPanel Game2_2 = new JPanel();
		Game2_2.setBounds(0, 0, 684, 461);
		GameTema2_Food.add(Game2_1);
		Game2_2.setLayout(null);
		
		JLabel StepGame2_1 = new JLabel("문제 1");
		StepGame2_1.setBounds(38, 33, 90, 39);
		StepGame2_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game2_1.add(StepGame2_1);
		
		JLabel Game2_1Quiz = new JLabel("ㅌㅅㅇ");
		Game2_1Quiz.setBounds(185, 159, 150, 87);
		Game2_1Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game2_1.add(Game2_1Quiz);
		
		JLabel Game2_1Score = new JLabel("현재 점수 : " + Score);
		Game2_1Score.setBounds(307, 37, 168, 39);
		Game2_1Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game2_1.add(Game2_1Score);
		
		JLabel Game2_1Hint = new JLabel("★ 힌트 ★");
		Game2_1Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game2_1Hint.setBounds(533, 138, 70, 39);
		Game2_1.add(Game2_1Hint);
		
		JButton Game2_1Hint1 = new JButton("힌트 1");
		Game2_1Hint1.setBounds(520, 201, 97, 23);
		Game2_1.add(Game2_1Hint1);
		
		Game2_1Hint1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // 게임 2-1. 힌트 1 버튼 활성화
				
				JOptionPane.showMessageDialog(null, "야채범벅", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Score -= 3;
				Game2_1Score.setText("현재 점수 : " + Score);
			}
			
		});
		
		JButton Game2_1Hint2 = new JButton("힌트 2");
		Game2_1Hint2.setBounds(520, 252, 97, 23);
		Game2_1.add(Game2_1Hint2);
		
		Game2_1Hint2.addActionListener(new ActionListener() { // 게임 2-1. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "고기", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Score -= 5;
				Game2_1Score.setText("현재 점수 : " + Score);
			}
			
		});
		
		JButton Game2_1Hint3 = new JButton("힌트 3");
		Game2_1Hint3.setBounds(520, 308, 97, 23);
		Game2_1.add(Game2_1Hint3);
		
		Game2_1Hint3.addActionListener(new ActionListener() { // 게임 2-1. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "중국집", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Score -= 7;
				Game2_1Score.setText("현재 점수 : " + Score);
			}
			
		});
		
		JButton StartBackBtn2_1 = new JButton("시작 화면으로");
		StartBackBtn2_1.setBounds(501, 44, 116, 31);
		Game2_1.add(StartBackBtn2_1);
		
		StartBackBtn2_1.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema2_Food.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game2_1AnsBtn = new JButton("제출하기");
		Game2_1AnsBtn.setBounds(340, 352, 121, 39);
		Game2_1.add(Game2_1AnsBtn);
		
		Game2_1AnsBlank = new JTextField("이곳에 정답을 입력하세요");
		Game2_1AnsBlank.setBounds(153, 352, 147, 39);
		Game2_1.add(Game2_1AnsBlank);
		Game2_1AnsBlank.setColumns(10);
		
		
		Game1_1AnsBtn.addActionListener(new ActionListener() { // 브랜드 테마 - 문제 1_1 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "가나";
				if(Answer.equals(Game1_1AnsBlank.getText())) {
					Score += 10;
					Game1_1.setVisible(false);
					Game1_2.setVisible(true);
					Game1_2Score.setText("현재 점수 : " + Score);
				}
				else {
					Score -= 5;
					Game1_1Score.setText("현재 점수 : " + Score);
				}
				
				
			}
			
		});
		
		Game2_1AnsBtn.addActionListener(new ActionListener() { // 음식 테마 - 문제 2_1 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "탕수육";
				if(Answer.equals(Game2_1AnsBlank.getText())) {
					Score += 10;
					Game2_1.setVisible(false);
					Game2_2.setVisible(true);
					//Game2_2Score.setText("현재 점수 : " + Score);
				}
				else {
					Score -= 5;
					Game2_1Score.setText("현재 점수 : " + Score);
				}
				
				
			}
			
		});
		
		StartBackTemaBtn.addActionListener(new ActionListener() { // 테마 페이지에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				SelectTemaPage.setVisible(false);
				GameTema1_Brand.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		Tema1_BrandBtn.addActionListener(new ActionListener() { // 테마 - 브랜드 선택 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				SelectTemaPage.setVisible(false);
				GameTema1_Brand.setVisible(true);
				
			}
			
		});
		
		Tema2_FoodBtn.addActionListener(new ActionListener() { // 테마 - 음식 선택 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				SelectTemaPage.setVisible(false);
				GameTema2_Food.setVisible(true);
				
			}
			
		});
		
		
		
	}
}
