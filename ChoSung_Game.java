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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class ChoSung_Game extends JFrame {
	
	public int Tema1_Score = 0; // 테마 1 점수
	public int Tema2_Score = 0; // 테마 2 점수
	public int Tema3_Score = 0; // 테마 3 점수
	
	public int TemaScore = 0; // 테마 1, 2, 3 점수 합계
	
	public int EndPageScore = 0; // 테마 끝낼 때 마지막 페이지가 뜨기 위한 변수

	private JPanel MainPage;
	private JTextField Game1_1AnsBlank;
	private JTextField Game1_2AnsBlank;
	private JTextField Game2_1AnsBlank;
	private JTextField Game1_3AnsBlank;
	private JTextField Game1_4AnsBlank;
	private JTextField Game1_5AnsBlank;
	private JTextField Game2_2AnsBlank;
	private JTextField Game2_3AnsBlank;
	private JTextField Game2_4AnsBlank;
	private JTextField Game2_5AnsBlank;
	private JTextField Game3_1AnsBlank;
	private JTextField Game3_2AnsBlank;
	private JTextField Game3_3AnsBlank;
	private JTextField Game3_4AnsBlank;
	private JTextField Game3_5AnsBlank;

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
		setBounds(650, 300, 656, 409);
		MainPage = new JPanel();
		MainPage.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPage);
		MainPage.setLayout(null);
		
		JPanel StartPage = new JPanel();
		StartPage.setBounds(0, 0, 640, 370);
		MainPage.add(StartPage);
		
		JPanel SelectTemaPage = new JPanel();
		SelectTemaPage.setBounds(0, 0, 640, 370);
		MainPage.add(SelectTemaPage);
		SelectTemaPage.setLayout(null);
		
		SelectTemaPage.setVisible(false);
		
		JPanel GameExpPage = new JPanel();
		GameExpPage.setBounds(0, 0, 640, 370);
		MainPage.add(GameExpPage);
		GameExpPage.setLayout(null);
		
		GameExpPage.setVisible(false);
		StartPage.setLayout(null);
		
		JLabel StartLabel = new JLabel("");
		StartLabel.setBounds(28, 108, 590, 81);
		StartLabel.setHorizontalAlignment(SwingConstants.CENTER);
		StartLabel.setIcon(new ImageIcon("./image/StartPageTitle.png"));
		StartPage.add(StartLabel);
		
		JButton StartBtn = new JButton("게임 시작");
		StartBtn.setBounds(213, 298, 97, 23);
		StartPage.add(StartBtn);
		
		JButton GameExpBtn = new JButton("게임 설명");
		GameExpBtn.setBounds(343, 298, 97, 23);
		StartPage.add(GameExpBtn);
		
		ImageIcon image = new ImageIcon("ChoSung_BackGreound.jpg"); // 게임 시작 이미지
		JLabel StartBackGround = new JLabel(new ImageIcon("./image/ChoSungGif3.gif"));
		StartBackGround.setBounds(0, 0, 640, 370);
		StartBackGround.setVerticalAlignment(SwingConstants.TOP);
		StartBackGround.setHorizontalAlignment(SwingConstants.LEFT);
		StartPage.add(StartBackGround);
		
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
		GameExpTitle.setBounds(35, 35, 173, 46);
		GameExpPage.add(GameExpTitle);
		
		JLabel GameExp1 = new JLabel("-초성 퀴즈란?");
		GameExp1.setVerticalAlignment(SwingConstants.TOP);
		GameExp1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 16));
		GameExp1.setBounds(35, 100, 110, 21);
		GameExpPage.add(GameExp1);
		
		JLabel GameExp1_1 = new JLabel("한글을 이용한 놀이 중 하나로, 어떤 단어의 초성만을 알려주고 그 단어를 알아맞히는 놀이이다.");
		GameExp1_1.setForeground(Color.DARK_GRAY);
		GameExp1_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		GameExp1_1.setBounds(35, 130, 557, 21);
		GameExpPage.add(GameExp1_1);
		
		JLabel GameExp2 = new JLabel("-게임 방법 및 룰 설명");
		GameExp2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 16));
		GameExp2.setBounds(35, 180, 163, 21);
		GameExpPage.add(GameExp2);
		
		JLabel GameExp2_1 = new JLabel("<html>게임 방법 : 문제에 주어진 초성을 보고 개발자가 지정해 놓은 정답을 맞추면 됩니다.<br>" + "(힌트를 사용하면 문제를 쉽게 맞출 수 있습니다.)<br>" + " <br>" + " 게임 룰 : 문제를 맞춘 경우 +10점, 틀린 경우 -5점, 힌트 1 사용시 -3점, 힌트 2 사용시 -5점, 힌트 3 사용시 -7점<html>");
		GameExp2_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 14));
		GameExp2_1.setForeground(Color.DARK_GRAY);
		GameExp2_1.setBounds(35, 200, 574, 143);
		GameExpPage.add(GameExp2_1);
		
		JButton StartBackExpBtn = new JButton("시작 화면으로");
		StartBackExpBtn.setBounds(482, 335, 110, 23);
		GameExpPage.add(StartBackExpBtn);
		
		JLabel ExpBackGround = new JLabel("");
		ExpBackGround.setIcon(new ImageIcon("./image/ChoSungExp.jpg"));
		ExpBackGround.setBounds(0, 0, 640, 370);
		GameExpPage.add(ExpBackGround);
		
		StartBackExpBtn.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameExpPage.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		// 테마 선택 페이지
		
		JLabel TemaLabel = new JLabel("<테마 선택>");
		TemaLabel.setBounds(235, 42, 173, 46);
		TemaLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 35));
		SelectTemaPage.add(TemaLabel);
		
		JButton Tema1_BrandBtn = new JButton("브랜드");
		Tema1_BrandBtn.setBounds(270, 127, 97, 23);
		SelectTemaPage.add(Tema1_BrandBtn);
		
		JButton Tema2_FoodBtn = new JButton("음식");
		Tema2_FoodBtn.setBounds(270, 187, 97, 23);
		SelectTemaPage.add(Tema2_FoodBtn);
		 
		JButton Tema3_AnimalBtn = new JButton("동물");
		Tema3_AnimalBtn.setBounds(270, 247, 97, 23);
		SelectTemaPage.add(Tema3_AnimalBtn);
		
		JButton StartBackTemaBtn = new JButton("시작 화면으로");
		StartBackTemaBtn.setBounds(482, 335, 110, 23);
		SelectTemaPage.add(StartBackTemaBtn);
		
		JLabel SelectBackGround = new JLabel("");
		SelectBackGround.setIcon(new ImageIcon("./image/ChoSungSelect.jpg"));
		SelectBackGround.setBounds(0, 0, 640, 370);
		SelectTemaPage.add(SelectBackGround);
		
		// 테마 - 브랜드 3개
		
		
		JPanel GameTema1_Brand = new JPanel();
		GameTema1_Brand.setBounds(0, 0, 640, 370);
		MainPage.add(GameTema1_Brand);
		GameTema1_Brand.setLayout(null);
		
		GameTema1_Brand.setVisible(false);
		
		JPanel GameTema2_Food = new JPanel();
		GameTema2_Food.setBounds(0, 0, 640, 370);
		MainPage.add(GameTema2_Food);
		GameTema2_Food.setLayout(null);
		
		GameTema2_Food.setVisible(false);

		JPanel GameTema3_Animal = new JPanel();
		GameTema3_Animal.setBounds(0, 0, 640, 370);
		MainPage.add(GameTema3_Animal);
		GameTema3_Animal.setLayout(null);
		
		GameTema3_Animal.setVisible(false);
		
		// 게임 끝 페이지
		
		JPanel GameTheEndPage = new JPanel();
		GameTheEndPage.setBounds(0, 0, 640, 370);
		MainPage.add(GameTheEndPage);
		GameTheEndPage.setLayout(null);
		GameTheEndPage.setVisible(false);
		
		JButton GameTheEndBtn = new JButton("게임 종료");
		GameTheEndBtn.setBounds(254, 300, 136, 23);
		GameTheEndPage.add(GameTheEndBtn);
		
		JLabel GameTheEndLabel_1 = new JLabel("모두 클리어 하셨습니다!");
		GameTheEndLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GameTheEndLabel_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 45));
		GameTheEndLabel_1.setBounds(40, 190, 563, 71);
		GameTheEndPage.add(GameTheEndLabel_1);
		
		JLabel GameTheEndLabel_2 = new JLabel("총 점수 : " + TemaScore + "점으로");
		GameTheEndLabel_2.setFont(new Font("한컴산뜻돋움", Font.BOLD, 25));
		GameTheEndLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GameTheEndLabel_2.setBounds(80, 150, 483, 47);
		GameTheEndPage.add(GameTheEndLabel_2);
		
		JLabel GameTheEndLabel_3 = new JLabel("테마 1 점수 :" + Tema1_Score + "점         테마 2 점수 : " + Tema2_Score + "점         테마 3 점수 : " + Tema3_Score + "점");
		GameTheEndLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		GameTheEndLabel_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 18));
		GameTheEndLabel_3.setBounds(0, 70, 640, 47);
		GameTheEndPage.add(GameTheEndLabel_3);
		
		JLabel GameTheEndBackGround = new JLabel("");
		GameTheEndBackGround.setIcon(new ImageIcon("./image/ChoSungTemaEnd.png"));
		GameTheEndBackGround.setBounds(0, 0, 640, 370);
		GameTheEndPage.add(GameTheEndBackGround);
		
		GameTheEndBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				System.exit(0);
			}
			
		});
		
		// 문제 1_1
	
		JPanel Game1_1 = new JPanel();
		Game1_1.setBounds(0, 0, 640, 370);
		GameTema1_Brand.add(Game1_1);
		
		JPanel Game1_2 = new JPanel();
		Game1_2.setBounds(0, 0, 640, 370);
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
		
		JLabel Game1_1Score = new JLabel("현재 점수 : " + Tema1_Score);
		Game1_1Score.setBounds(307, 37, 168, 39);
		Game1_1Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game1_1.add(Game1_1Score);
		
		Game1_1AnsBlank = new JTextField();
		Game1_1AnsBlank.setBounds(70, 310, 230, 39);
		Game1_1AnsBlank.setText("이곳에 정답을 입력하세요");
		Game1_1.add(Game1_1AnsBlank);
		Game1_1AnsBlank.setColumns(10);
		
		
		JButton Game1_1AnsBtn = new JButton("제출하기");
		Game1_1AnsBtn.setBounds(340, 310, 121, 39);
		Game1_1.add(Game1_1AnsBtn);
		
		JButton Game1_1Hint1 = new JButton("힌트 1");
		Game1_1Hint1.setBounds(520, 201, 97, 23);
		Game1_1.add(Game1_1Hint1);
		
		Game1_1Hint1.addActionListener(new ActionListener() { // 게임 1-1. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) { 
				
				JOptionPane.showMessageDialog(null, "한글", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 3;
				Game1_1Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JButton Game1_1Hint2 = new JButton("힌트  2");
		Game1_1Hint2.setBounds(520, 252, 97, 23);
		Game1_1.add(Game1_1Hint2);
		
		Game1_1Hint2.addActionListener(new ActionListener() { // 게임 1-1. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "롯데", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 5;
				Game1_1Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JButton Game1_1Hint3 = new JButton("힌트 3");
		Game1_1Hint3.setBounds(520, 308, 97, 23);
		Game1_1.add(Game1_1Hint3);
		
		Game1_1Hint3.addActionListener(new ActionListener() { // 게임 1-1. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "초콜릿", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 7;
				Game1_1Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JLabel Game1_1Hint = new JLabel("★  Hint ★");
		Game1_1Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game1_1Hint.setBounds(533, 138, 70, 39);
		Game1_1.add(Game1_1Hint);
		
		JLabel Game1_1BackGround = new JLabel("");
		Game1_1BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game1_1BackGround.setBounds(0, 0, 640, 370);
		Game1_1.add(Game1_1BackGround);
		
		Game1_2.setVisible(false);
		
		StartBackBtn1_1.addActionListener(new ActionListener() { // 문제 1-1 에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema1_Brand.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		// 문제 1_2
		
		JLabel StepGame1_2 = new JLabel("문제 2");
		StepGame1_2.setBounds(38, 33, 90, 39);
		StepGame1_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game1_2.add(StepGame1_2);
		
		JLabel Game1_2Quiz = new JLabel("ㅅㅅ");
		Game1_2Quiz.setBounds(185, 159, 81, 87);
		Game1_2Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game1_2.add(Game1_2Quiz);
		
		JLabel Game1_2Score = new JLabel("현재 점수 : " + Tema1_Score);
		Game1_2Score.setBounds(307, 37, 168, 39);
		Game1_2Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game1_2.add(Game1_2Score);
		
		Game1_2AnsBlank = new JTextField();
		Game1_2AnsBlank.setText("");
		Game1_2AnsBlank.setBounds(70, 310, 230, 39);
		Game1_2.add(Game1_2AnsBlank);
		Game1_2AnsBlank.setColumns(10);
		
		JButton Game1_2AnsBtn = new JButton("제출하기");
		Game1_2AnsBtn.setBounds(340, 310, 121, 39);
		Game1_2.add(Game1_2AnsBtn);
		
		JButton Game1_2Hint1 = new JButton("힌트 1");
		Game1_2Hint1.setBounds(520, 201, 97, 23);
		Game1_2.add(Game1_2Hint1);
		
		Game1_2Hint1.addActionListener(new ActionListener() { // 게임 1-2. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "은하수 (**교수님 아닙니다.)", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 3;
				Game1_2Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JButton Game1_2Hint2 = new JButton("힌트  2");
		Game1_2Hint2.setBounds(520, 252, 97, 23);
		Game1_2.add(Game1_2Hint2);
		
		Game1_2Hint2.addActionListener(new ActionListener() { // 게임 1-2. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "노트", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 5;
				Game1_2Score.setText("현재 점수 : " + Tema1_Score); 
			}
			
		});
		
		JButton Game1_2Hint3 = new JButton("힌트 3");
		Game1_2Hint3.setBounds(520, 308, 97, 23);
		Game1_2.add(Game1_2Hint3);
		
		Game1_2Hint3.addActionListener(new ActionListener() { // 게임 1-2. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "핸드폰", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 7;
				Game1_2Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JLabel Game1_2Hint = new JLabel("★  Hint ★");
		Game1_2Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game1_2Hint.setBounds(533, 138, 70, 39);
		Game1_2.add(Game1_2Hint);
		
		JLabel Game1_2BackGround = new JLabel("");
		Game1_2BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game1_2BackGround.setBounds(0, 0, 640, 370);
		Game1_2.add(Game1_2BackGround);
		
		JButton StartBackBtn1_2 = new JButton("시작 화면으로");
		StartBackBtn1_2.setBounds(501, 44, 116, 31);
		Game1_2.add(StartBackBtn1_2);
		
		//문제 1_3
		
		JPanel Game1_3 = new JPanel();
		Game1_3.setBounds(0, 0, 640, 370);
		GameTema1_Brand.add(Game1_3);
		
		Game1_3.setVisible(false);
		Game1_3.setLayout(null);
		
		JLabel StepGame1_3 = new JLabel("문제 3");
		StepGame1_3.setBounds(38, 33, 90, 39);
		StepGame1_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game1_3.add(StepGame1_3);
		
		JLabel Game1_3Quiz = new JLabel("ㄴㅅ");
		Game1_3Quiz.setBounds(185, 159, 81, 87);
		Game1_3Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game1_3.add(Game1_3Quiz);
		
		JLabel Game1_3Score = new JLabel("현재 점수 : " + Tema1_Score);
		Game1_3Score.setBounds(307, 37, 168, 39);
		Game1_3Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game1_3.add(Game1_3Score);
		
		Game1_3AnsBlank = new JTextField("");
		Game1_3AnsBlank.setBounds(70, 310, 230, 39);
		Game1_3.add(Game1_3AnsBlank);
		Game1_3AnsBlank.setColumns(10);
		
		JButton Game1_3AnsBtn = new JButton("제출하기");
		Game1_3AnsBtn.setBounds(340, 310, 121, 39);
		Game1_3.add(Game1_3AnsBtn);
		
		JButton Game1_3Hint1 = new JButton("힌트 1");
		Game1_3Hint1.setBounds(520, 201, 97, 23);
		Game1_3.add(Game1_3Hint1);
		
		Game1_3Hint1.addActionListener(new ActionListener() { // 게임 1-3. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "돈", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 3;
				Game1_3Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JButton Game1_3Hint2 = new JButton("힌트 2");
		Game1_3Hint2.setBounds(520, 252, 97, 23);
		Game1_3.add(Game1_3Hint2);
		
		Game1_3Hint2.addActionListener(new ActionListener() { // 게임 1-3. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "게임", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 5;
				Game1_3Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JButton Game1_3Hint3 = new JButton("힌트 3");
		Game1_3Hint3.setBounds(520, 308, 97, 23);
		Game1_3.add(Game1_3Hint3);
		
		Game1_3Hint3.addActionListener(new ActionListener() { // 게임 1-3. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "메이플스토리는 뭐다? (돈슨이다..) ", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 7;
				Game1_3Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JLabel Game1_3Hint = new JLabel("★ Hint ★");
		Game1_3Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game1_3Hint.setBounds(533, 138, 70, 39);
		Game1_3.add(Game1_3Hint);
		
		JLabel Game1_3BackGround = new JLabel("");
		Game1_3BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game1_3BackGround.setBounds(0, 0, 640, 370);
		Game1_3.add(Game1_3BackGround);
		
		JButton StartBackBtn1_3 = new JButton("시작 화면으로");
		StartBackBtn1_3.setBounds(501, 44, 116, 31);
		Game1_3.add(StartBackBtn1_3);
		
		// 문제 1_4
		
		JPanel Game1_4 = new JPanel();
		Game1_4.setBounds(0, 0, 640, 370);
		GameTema1_Brand.add(Game1_4);
		Game1_4.setVisible(false);
		Game1_4.setLayout(null);
		
		JLabel StepGame1_4 = new JLabel("문제 4");
		StepGame1_4.setBounds(38, 33, 90, 39);
		StepGame1_4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game1_4.add(StepGame1_4);
		
		
		JLabel Game1_4Quiz = new JLabel("ㅅㄴ");
		Game1_4Quiz.setBounds(185, 159, 81, 87);
		Game1_4Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game1_4.add(Game1_4Quiz);
		
		JLabel Game1_4Score = new JLabel("현재 점수 : " + Tema1_Score);
		Game1_4Score.setBounds(307, 37, 168, 39);
		Game1_4Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game1_4.add(Game1_4Score);
		
		Game1_4AnsBlank = new JTextField();
		Game1_4AnsBlank.setBounds(70, 310, 230, 39);
		Game1_4.add(Game1_4AnsBlank);
		Game1_4AnsBlank.setColumns(10);
		
		JButton Game1_4AnsBtn = new JButton("제출하기");
		Game1_4AnsBtn.setBounds(340, 310, 121, 39);
		Game1_4.add(Game1_4AnsBtn);
		
		JButton Game1_4Hint1 = new JButton("힌트 1");
		Game1_4Hint1.setBounds(520, 201, 97, 23);
		Game1_4.add(Game1_4Hint1);
		
		Game1_4Hint1.addActionListener(new ActionListener() { // 게임 1-4. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) { 
				
				JOptionPane.showMessageDialog(null, "가브리엘", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 3;
				Game1_4Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JButton Game1_4Hint2 = new JButton("힌트 2");
		Game1_4Hint2.setBounds(520, 252, 97, 23);
		Game1_4.add(Game1_4Hint2);
		
		Game1_4Hint2.addActionListener(new ActionListener() { // 게임 1-4. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "가방", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 5;
				Game1_4Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JButton Game1_4Hint3 = new JButton("힌트 3");
		Game1_4Hint3.setBounds(520, 308, 97, 23);
		Game1_4.add(Game1_4Hint3);
		
		Game1_4Hint3.addActionListener(new ActionListener() { // 게임 1-4. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "명품", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 7;
				Game1_4Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JLabel Game1_4Hint = new JLabel(" ★ Hint ★");
		Game1_4Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game1_4Hint.setBounds(533, 138, 70, 39);
		Game1_4.add(Game1_4Hint);
		
		JLabel Game1_4BackGround = new JLabel("");
		Game1_4BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game1_4BackGround.setBounds(0, 0, 640, 370);
		Game1_4.add(Game1_4BackGround);
		
		JButton StartBackBtn1_4 = new JButton("시작 화면으로");
		StartBackBtn1_4.setBounds(501, 44, 116, 31);
		Game1_4.add(StartBackBtn1_4);
		
		// 문제 1_5
		
		JPanel Game1_5 = new JPanel();
		Game1_5.setBounds(0, 0, 640, 370);
		GameTema1_Brand.add(Game1_5);
		Game1_5.setVisible(false);
		Game1_5.setLayout(null);
		
		JLabel StepGame1_5 = new JLabel("문제 5");
		StepGame1_5.setBounds(38, 33, 90, 39);
		StepGame1_5.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game1_5.add(StepGame1_5);
		
		JLabel Game1_5Quiz = new JLabel("ㄱㅇ");
		Game1_5Quiz.setBounds(185, 159, 81, 87);
		Game1_5Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game1_5.add(Game1_5Quiz);
		
		JLabel Game1_5Score = new JLabel("현재 점수 : " + Tema1_Score);
		Game1_5Score.setBounds(307, 37, 168, 39);
		Game1_5Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game1_5.add(Game1_5Score);
		
		Game1_5AnsBlank = new JTextField();
		Game1_5AnsBlank.setBounds(70, 310, 230, 39);
		Game1_5.add(Game1_5AnsBlank);
		Game1_5AnsBlank.setColumns(10);
		
		JButton Game1_5AnsBtn = new JButton("제출하기");
		Game1_5AnsBtn.setBounds(340, 310, 121, 39);
		Game1_5.add(Game1_5AnsBtn);
		
		JButton Game1_5Hint1 = new JButton("힌트 1");
		Game1_5Hint1.setBounds(520, 201, 97, 23);
		Game1_5.add(Game1_5Hint1);
		
		Game1_5Hint1.addActionListener(new ActionListener() { // 게임 1-5. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) { 
				
				JOptionPane.showMessageDialog(null, "영어 스펠링 3개", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 3;
				Game1_5Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JButton Game1_5Hint2 = new JButton("힌트 2");
		Game1_5Hint2.setBounds(520, 252, 97, 23);
		Game1_5.add(Game1_5Hint2);
		
		Game1_5Hint2.addActionListener(new ActionListener() { // 게임 1-5. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "국산", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 5;
				Game1_5Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JButton Game1_5Hint3 = new JButton("힌트 3");
		Game1_5Hint3.setBounds(520, 308, 97, 23);
		Game1_5.add(Game1_5Hint3);
		
		Game1_5Hint3.addActionListener(new ActionListener() { // 게임 1-5. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "자동차", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema1_Score -= 7;
				Game1_5Score.setText("현재 점수 : " + Tema1_Score);
			}
			
		});
		
		JLabel Game1_5Hint = new JLabel("★ Hint ★");
		Game1_5Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game1_5Hint.setBounds(533, 138, 70, 39);
		Game1_5.add(Game1_5Hint);
		
		JLabel Game1_5BackGround = new JLabel("");
		Game1_5BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game1_5BackGround.setBounds(0, 0, 640, 370);
		Game1_5.add(Game1_5BackGround);
		
		JButton StartBackBtn1_5 = new JButton("시작 화면으로");
		StartBackBtn1_5.setBounds(501, 44, 116, 31);
		Game1_5.add(StartBackBtn1_5);
		
		// 테마 1_브랜드 끝
		
		JPanel Game1_End = new JPanel();
		Game1_End.setBounds(0, 0, 640, 370);
		GameTema1_Brand.add(Game1_End);
		Game1_End.setLayout(null);
		
		JLabel Game1_EndLabel = new JLabel("브랜드 테마 클리어 !");
		Game1_EndLabel.setBounds(112, 127, 430, 78);
		Game1_EndLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 45));
		Game1_End.add(Game1_EndLabel);
		
		JButton StartBackBtn1_End = new JButton("시작 화면으로");
		StartBackBtn1_End.setBounds(501, 44, 116, 31);
		Game1_End.add(StartBackBtn1_End);
		
		JLabel Game1_EndScore = new JLabel("현재 테마 1 점수: " + Tema1_Score);
		Game1_EndScore.setHorizontalAlignment(SwingConstants.CENTER);
		Game1_EndScore.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game1_EndScore.setBounds(112, 240, 436, 46);
		Game1_End.add(Game1_EndScore);
		
		JLabel Game1EndBackGround = new JLabel("");
		Game1EndBackGround.setIcon(new ImageIcon("./image/ChoSungTheEnd.jpg"));
		Game1EndBackGround.setBounds(0, 0, 640, 370);
		Game1_End.add(Game1EndBackGround);
		
		StartBackBtn1_2.addActionListener(new ActionListener() { // 문제 1-2 에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema1_Brand.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		StartBackBtn1_3.addActionListener(new ActionListener() { // 문제 1-3 에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema1_Brand.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		StartBackBtn1_4.addActionListener(new ActionListener() { // 문제 1-4 에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema1_Brand.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		StartBackBtn1_5.addActionListener(new ActionListener() { // 문제 1-5 에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema1_Brand.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		StartBackBtn1_End.addActionListener(new ActionListener() { // 문제 1-End 에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(EndPageScore == 3) {
					int temp = Tema1_Score + Tema2_Score + Tema3_Score;
					GameTheEndLabel_2.setText("총 점수 : " + temp + "점으로");
					GameTheEndLabel_3.setText("테마 1 점수 :" + Tema1_Score + "점         테마 2 점수 : " + Tema2_Score + "점         테마 3 점수 : " + Tema3_Score + "점");
					GameTema1_Brand.setVisible(false);
					GameTheEndPage.setVisible(true);
				}
				
				else {
					GameTema1_Brand.setVisible(false);
					StartPage.setVisible(true);
				}
			}
			
		});
		
		
		
		
		// 문제 2_1
		
		JPanel Game2_1 = new JPanel();
		Game2_1.setBounds(0, 0, 640, 370);
		GameTema2_Food.add(Game2_1);
		Game2_1.setLayout(null);

		JLabel StepGame2_1 = new JLabel("문제 1");
		StepGame2_1.setBounds(38, 33, 90, 39);
		StepGame2_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game2_1.add(StepGame2_1);
		
		JLabel Game2_1Quiz = new JLabel("ㅌㅅㅇ");
		Game2_1Quiz.setBounds(185, 159, 150, 87);
		Game2_1Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game2_1.add(Game2_1Quiz);
		
		JLabel Game2_1Score = new JLabel("현재 점수 : " + Tema2_Score);
		Game2_1Score.setBounds(307, 37, 168, 39);
		Game2_1Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game2_1.add(Game2_1Score);
		
		JLabel Game2_1Hint = new JLabel("★ 힌트 ★");
		Game2_1Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game2_1Hint.setBounds(533, 138, 70, 39);
		Game2_1.add(Game2_1Hint);
		
		JLabel Game2_1BackGround = new JLabel("");
		Game2_1BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game2_1BackGround.setBounds(0, 0, 640, 370);
		Game2_1.add(Game2_1BackGround);
		
		JButton Game2_1Hint1 = new JButton("힌트 1");
		Game2_1Hint1.setBounds(520, 201, 97, 23);
		Game2_1.add(Game2_1Hint1);
		
		Game2_1Hint1.addActionListener(new ActionListener() { // 게임 2-1. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) { 
				
				JOptionPane.showMessageDialog(null, "야채범벅", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 3;
				Game2_1Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_1Hint2 = new JButton("힌트 2");
		Game2_1Hint2.setBounds(520, 252, 97, 23);
		Game2_1.add(Game2_1Hint2);
		
		Game2_1Hint2.addActionListener(new ActionListener() { // 게임 2-1. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "고기", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 5;
				Game2_1Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_1Hint3 = new JButton("힌트 3");
		Game2_1Hint3.setBounds(520, 308, 97, 23);
		Game2_1.add(Game2_1Hint3);
		
		Game2_1Hint3.addActionListener(new ActionListener() { // 게임 2-1. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "중국집", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 7;
				Game2_1Score.setText("현재 점수 : " + Tema2_Score);
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
		Game2_1AnsBtn.setBounds(340, 310, 121, 39);
		Game2_1.add(Game2_1AnsBtn);
		
		Game2_1AnsBlank = new JTextField("");
		Game2_1AnsBlank.setBounds(70, 310, 230, 39);
		Game2_1.add(Game2_1AnsBlank);
		Game2_1AnsBlank.setColumns(10);
		
		// 문제 2_2
		
		JPanel Game2_2 = new JPanel();
		Game2_2.setBounds(0, 0, 640, 370);
		GameTema2_Food.add(Game2_2);
		Game2_2.setLayout(null);
		
		JLabel StepGame2_2 = new JLabel("문제 2");
		StepGame2_2.setBounds(38, 33, 90, 39);
		StepGame2_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		Game2_2.add(StepGame2_2);
		
		JLabel Game2_2Quiz = new JLabel("ㅁㅅ");
		Game2_2Quiz.setBounds(185, 159, 81, 87);
		Game2_2Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game2_2.add(Game2_2Quiz);
		
		JLabel Game2_2Score = new JLabel("현재 점수 : " + Tema2_Score);
		Game2_2Score.setBounds(307, 37, 168, 39);
		Game2_2Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game2_2.add(Game2_2Score);
		
		JLabel Game2_2Hint = new JLabel("★ Hint ★");
		Game2_2Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game2_2Hint.setBounds(533, 138, 70, 39);
		Game2_2.add(Game2_2Hint);
		
		JLabel Game2_2BackGround = new JLabel("");
		Game2_2BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game2_2BackGround.setBounds(0, 0, 640, 370);
		Game2_2.add(Game2_2BackGround);
		
		JButton Game2_2Hint1 = new JButton("힌트 1");
		Game2_2Hint1.setBounds(520, 201, 97, 23);
		Game2_2.add(Game2_2Hint1);
		
		Game2_2Hint1.addActionListener(new ActionListener() { // 게임 2-2. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "나무", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 3;
				Game2_2Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_2Hint2 = new JButton("힌트 2");
		Game2_2Hint2.setBounds(520, 252, 97, 23);
		Game2_2.add(Game2_2Hint2);
		
		Game2_2Hint2.addActionListener(new ActionListener() { // 게임 2-2. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "초록색", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 5;
				Game2_2Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_2Hint3 = new JButton("힌트 3");
		Game2_2Hint3.setBounds(520, 308, 97, 23);
		Game2_2.add(Game2_2Hint3);
		
		Game2_2Hint3.addActionListener(new ActionListener() { // 게임 2-2. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "널 깨물어 주고 싶엉 >_<♥", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 7;
				Game2_2Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton StartBackBtn2_2 = new JButton("시작 화면으로");
		StartBackBtn2_2.setBounds(501, 44, 116, 31);
		Game2_2.add(StartBackBtn2_2);
		
		StartBackBtn2_2.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema2_Food.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game2_2AnsBtn = new JButton("제출 하기");
		Game2_2AnsBtn.setBounds(340, 310, 121, 39);
		Game2_2.add(Game2_2AnsBtn);
		
		Game2_2AnsBlank = new JTextField();
		Game2_2AnsBlank.setBounds(70, 310, 230, 39);
		Game2_2.add(Game2_2AnsBlank);
		Game2_2AnsBlank.setColumns(10);
		
		// 문제 2_3
		
		JPanel Game2_3 = new JPanel();
		Game2_3.setLayout(null);
		Game2_3.setBounds(0, 0, 640, 370);
		GameTema2_Food.add(Game2_3);
		
		JLabel StepGame2_3 = new JLabel("문제 3");
		StepGame2_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		StepGame2_3.setBounds(38, 33, 90, 39);
		Game2_3.add(StepGame2_3);
		
		JLabel Game2_3Quiz = new JLabel("ㅂㅅ");
		Game2_3Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game2_3Quiz.setBounds(185, 159, 81, 87);
		Game2_3.add(Game2_3Quiz);
		
		JLabel Game2_3Score = new JLabel("현재 점수 : " + Tema2_Score);
		Game2_3Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game2_3Score.setBounds(307, 37, 168, 39);
		Game2_3.add(Game2_3Score);
		
		JLabel Game2_3Hint = new JLabel("★ Hint ★");
		Game2_3Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game2_3Hint.setBounds(533, 138, 70, 39);
		Game2_3.add(Game2_3Hint);
		
		JLabel Game2_3BackGround = new JLabel("");
		Game2_3BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game2_3BackGround.setBounds(0, 0, 640, 370);
		Game2_3.add(Game2_3BackGround);
		
		JButton Game2_3Hint1 = new JButton("힌트 1");
		Game2_3Hint1.setBounds(520, 201, 97, 23);
		Game2_3.add(Game2_3Hint1);
		
		Game2_3Hint1.addActionListener(new ActionListener() { // 게임 2-3. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "숲", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 3;
				Game2_3Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_3Hint2 = new JButton("힌트 2");
		Game2_3Hint2.setBounds(520, 252, 97, 23);
		Game2_3.add(Game2_3Hint2);
		
		Game2_3Hint2.addActionListener(new ActionListener() { // 게임 2-3. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "초코송이", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 5;
				Game2_3Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_3Hint3 = new JButton("힌트 3");
		Game2_3Hint3.setBounds(520, 308, 97, 23);
		Game2_3.add(Game2_3Hint3);
		
		Game2_3Hint3.addActionListener(new ActionListener() { // 게임 2-3. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "벗엇", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 7;
				Game2_3Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton StartBackBtn2_3 = new JButton("시작 화면으로");
		StartBackBtn2_3.setBounds(501, 44, 116, 31);
		Game2_3.add(StartBackBtn2_3);
		
		StartBackBtn2_3.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema2_Food.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game2_3AnsBtn = new JButton("제출 하기");
		Game2_3AnsBtn.setBounds(340, 310, 121, 39);
		Game2_3.add(Game2_3AnsBtn);
		
		Game2_3AnsBlank = new JTextField();
		Game2_3AnsBlank.setColumns(10);
		Game2_3AnsBlank.setBounds(70, 310, 230, 39);
		Game2_3.add(Game2_3AnsBlank);
		
		// 문제 2_4
		
		JPanel Game2_4 = new JPanel();
		Game2_4.setLayout(null);
		Game2_4.setBounds(0, 0, 640, 370);
		GameTema2_Food.add(Game2_4);
		
		JLabel StepGame2_4 = new JLabel("문제 4");
		StepGame2_4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		StepGame2_4.setBounds(38, 33, 90, 39);
		Game2_4.add(StepGame2_4);
		
		JLabel Game2_4Quiz = new JLabel("ㄱㅅ");
		Game2_4Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game2_4Quiz.setBounds(185, 159, 81, 87);
		Game2_4.add(Game2_4Quiz);
		
		JLabel Game2_4Score = new JLabel("현재 점수 : " + Tema2_Score);
		Game2_4Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game2_4Score.setBounds(307, 37, 168, 39);
		Game2_4.add(Game2_4Score);
		
		JLabel Game2_4Hint = new JLabel("★ Hint ★");
		Game2_4Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game2_4Hint.setBounds(533, 138, 70, 39);
		Game2_4.add(Game2_4Hint);
		
		JLabel Game2_4BackGround = new JLabel("");
		Game2_4BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game2_4BackGround.setBounds(0, 0, 640, 370);
		Game2_4.add(Game2_4BackGround);
		
		JButton Game2_4Hint1 = new JButton("힌트 1");
		Game2_4Hint1.setBounds(520, 201, 97, 23);
		Game2_4.add(Game2_4Hint1);
		
		Game2_4Hint1.addActionListener(new ActionListener() { // 게임 2-4. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) { 
				
				JOptionPane.showMessageDialog(null, "밀가루", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 3;
				Game2_4Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_4Hint2 = new JButton("힌트 2");
		Game2_4Hint2.setBounds(520, 252, 97, 23);
		Game2_4.add(Game2_4Hint2);
		
		Game2_4Hint2.addActionListener(new ActionListener() { // 게임 2-4. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "후루룹-", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 5;
				Game2_4Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_4Hint3 = new JButton("힌트 3");
		Game2_4Hint3.setBounds(520, 308, 97, 23);
		Game2_4.add(Game2_4Hint3);
		
		Game2_4Hint3.addActionListener(new ActionListener() { // 게임 2-4. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "면", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 7;
				Game2_4Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton StartBackBtn2_4 = new JButton("시작 화면으로");
		StartBackBtn2_4.setBounds(501, 44, 116, 31);
		Game2_4.add(StartBackBtn2_4);
		
		StartBackBtn2_4.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema2_Food.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game2_4AnsBtn = new JButton("제출 하기");
		Game2_4AnsBtn.setBounds(340, 310, 121, 39);
		Game2_4.add(Game2_4AnsBtn);
		
		Game2_4AnsBlank = new JTextField();
		Game2_4AnsBlank.setColumns(10);
		Game2_4AnsBlank.setBounds(70, 310, 230, 39);
		Game2_4.add(Game2_4AnsBlank);
		
		// 문제 2_5
		
		JPanel Game2_5 = new JPanel();
		Game2_5.setLayout(null);
		Game2_5.setBounds(0, 0, 640, 370);
		GameTema2_Food.add(Game2_5);
		
		JLabel StepGame2_5 = new JLabel("문제 5");
		StepGame2_5.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		StepGame2_5.setBounds(38, 33, 90, 39);
		Game2_5.add(StepGame2_5);
		
		JLabel Game2_5Quiz = new JLabel("ㄱㅊ");
		Game2_5Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game2_5Quiz.setBounds(185, 159, 81, 87);
		Game2_5.add(Game2_5Quiz);
		
		JLabel Game2_5Score = new JLabel("현재 점수 : " + Tema2_Score);
		Game2_5Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game2_5Score.setBounds(307, 37, 168, 39);
		Game2_5.add(Game2_5Score);
		
		JLabel Game2_5Hint = new JLabel("★ Hint ★");
		Game2_5Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game2_5Hint.setBounds(533, 138, 70, 39);
		Game2_5.add(Game2_5Hint);
		
		JLabel Game2_5BackGround = new JLabel("");
		Game2_5BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game2_5BackGround.setBounds(0, 0, 640, 370);
		Game2_5.add(Game2_5BackGround);
		
		JButton Game2_5Hint1 = new JButton("힌트 1");
		Game2_5Hint1.setBounds(520, 201, 97, 23);
		Game2_5.add(Game2_5Hint1);
		
		Game2_5Hint1.addActionListener(new ActionListener() { // 게임 2-5. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) { 
				
				JOptionPane.showMessageDialog(null, "보통 매움", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 3;
				Game2_5Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_5Hint2 = new JButton("힌트 2");
		Game2_5Hint2.setBounds(520, 252, 97, 23);
		Game2_5.add(Game2_5Hint2);
		
		Game2_5Hint2.addActionListener(new ActionListener() { // 게임 2-5. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "발효", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 5;
				Game2_5Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton Game2_5Hint3 = new JButton("힌트 3");
		Game2_5Hint3.setBounds(520, 308, 97, 23);
		Game2_5.add(Game2_5Hint3);
		
		Game2_5Hint3.addActionListener(new ActionListener() { // 게임 2-5. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "한국 전통", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema2_Score -= 7;
				Game2_5Score.setText("현재 점수 : " + Tema2_Score);
			}
			
		});
		
		JButton StartBackBtn2_5 = new JButton("시작 화면으로");
		StartBackBtn2_5.setBounds(501, 44, 116, 31);
		Game2_5.add(StartBackBtn2_5);
		
		StartBackBtn2_5.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema2_Food.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game2_5AnsBtn = new JButton("제출 하기");
		Game2_5AnsBtn.setBounds(340, 310, 121, 39);
		Game2_5.add(Game2_5AnsBtn);
		
		Game2_5AnsBlank = new JTextField();
		Game2_5AnsBlank.setColumns(10);
		Game2_5AnsBlank.setBounds(70, 310, 230, 39);
		Game2_5.add(Game2_5AnsBlank);
		
		// 테마2_음식 끝
		
		JPanel Game2_End = new JPanel();
		Game2_End.setLayout(null);
		Game2_End.setBounds(0, 0, 640, 370);
		GameTema2_Food.add(Game2_End);
		
		JLabel Game2_EndLabel = new JLabel("음식 테마 클리어 !");
		Game2_EndLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 45));
		Game2_EndLabel.setBounds(150, 127, 392, 78);
		Game2_End.add(Game2_EndLabel);
		
		JLabel Game2_EndScore = new JLabel("현재 테마 2 점수: " + Tema1_Score);
		Game2_EndScore.setHorizontalAlignment(SwingConstants.CENTER);
		Game2_EndScore.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game2_EndScore.setBounds(112, 240, 436, 46);
		Game2_End.add(Game2_EndScore);
		
		JButton StartBackBtn2_End = new JButton("시작 화면으로");
		StartBackBtn2_End.setBounds(501, 44, 116, 31);
		Game2_End.add(StartBackBtn2_End);
		
		JLabel Game2EndBackGround = new JLabel("");
		Game2EndBackGround.setIcon(new ImageIcon("./image/ChoSungTheEnd.jpg"));
		Game2EndBackGround.setBounds(0, 0, 640, 370);
		Game2_End.add(Game2EndBackGround);
		
		StartBackBtn2_End.addActionListener(new ActionListener() { // 문제 2-End 에서 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(EndPageScore == 3) {
					int temp = Tema1_Score + Tema2_Score + Tema3_Score;
					GameTheEndLabel_2.setText("총 점수 : " + temp + "점으로");
					GameTheEndLabel_3.setText("테마 1 점수 :" + Tema1_Score + "점         테마 2 점수 : " + Tema2_Score + "점         테마 3 점수 : " + Tema3_Score + "점");
					GameTema2_Food.setVisible(false);
					GameTheEndPage.setVisible(true);
				}
				
				else {
					GameTema2_Food.setVisible(false);
					StartPage.setVisible(true);
					
				}
				
			}
			
		});
		
		// 문제 3_1
		
		JPanel Game3_1 = new JPanel();
		Game3_1.setLayout(null);
		Game3_1.setBounds(0, 0, 640, 370);
		GameTema3_Animal.add(Game3_1);
		
		JLabel StepGame3_1 = new JLabel("문제 1");
		StepGame3_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		StepGame3_1.setBounds(38, 33, 90, 39);
		Game3_1.add(StepGame3_1);
		
		JLabel Game3_1Quiz = new JLabel("ㄱㅇㅇ");
		Game3_1Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game3_1Quiz.setBounds(185, 159, 150, 87);
		Game3_1.add(Game3_1Quiz);
		
		JLabel Game3_1Score = new JLabel("현재 점수 :  " + Tema3_Score);
		Game3_1Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game3_1Score.setBounds(307, 37, 168, 39);
		Game3_1.add(Game3_1Score);
		
		JLabel Game3_1Hint = new JLabel("★ Hint ★");
		Game3_1Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game3_1Hint.setBounds(533, 138, 70, 39);
		Game3_1.add(Game3_1Hint);
		
		JLabel Game3_1BackGround = new JLabel("");
		Game3_1BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game3_1BackGround.setBounds(0, 0, 640, 370);
		Game3_1.add(Game3_1BackGround);
		
		JButton Game3_1Hint1 = new JButton("힌트 1");
		Game3_1Hint1.setBounds(520, 201, 97, 23);
		Game3_1.add(Game3_1Hint1);
		
		Game3_1Hint1.addActionListener(new ActionListener() { // 게임 3-1. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "점프 달인", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 3;
				Game3_1Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton Game3_1Hint2 = new JButton("힌트 2");
		Game3_1Hint2.setBounds(520, 252, 97, 23);
		Game3_1.add(Game3_1Hint2);
		
		Game3_1Hint2.addActionListener(new ActionListener() { // 게임 3-1. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "참치", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 5;
				Game3_1Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton Game3_1Hint3 = new JButton("힌트 3");
		Game3_1Hint3.setBounds(520, 308, 97, 23);
		Game3_1.add(Game3_1Hint3);
		
		Game3_1Hint3.addActionListener(new ActionListener() { // 게임 3-1. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "냐옹-", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 7;
				Game3_1Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton StartBackBtn3_1 = new JButton("시작 화면으로");
		StartBackBtn3_1.setBounds(501, 44, 116, 31);
		Game3_1.add(StartBackBtn3_1);
		
		StartBackBtn3_1.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema3_Animal.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game3_1AnsBtn = new JButton("제출 하기");
		Game3_1AnsBtn.setBounds(340, 310, 121, 39);
		Game3_1.add(Game3_1AnsBtn);
		
		Game3_1AnsBlank = new JTextField("");
		Game3_1AnsBlank.setColumns(10);
		Game3_1AnsBlank.setBounds(70, 310, 230, 39);
		Game3_1.add(Game3_1AnsBlank);
		
		// 문제 3_2
		
		JPanel Game3_2 = new JPanel();
		Game3_2.setLayout(null);
		Game3_2.setBounds(0, 0, 640, 370);
		GameTema3_Animal.add(Game3_2);
		
		JLabel StepGame3_2 = new JLabel("문제 2");
		StepGame3_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		StepGame3_2.setBounds(38, 33, 90, 39);
		Game3_2.add(StepGame3_2);
		
		JLabel Game3_2Quiz = new JLabel("ㄱㅅㄷㅊ");
		Game3_2Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game3_2Quiz.setBounds(185, 159, 150, 87);
		Game3_2.add(Game3_2Quiz);
		
		JLabel Game3_2Score = new JLabel("현재 점수 : " + Tema3_Score);
		Game3_2Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game3_2Score.setBounds(307, 37, 168, 39);
		Game3_2.add(Game3_2Score);
		
		JLabel Game3_2Hint = new JLabel("★ Hint ★");
		Game3_2Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game3_2Hint.setBounds(533, 138, 70, 39);
		Game3_2.add(Game3_2Hint);
		
		JLabel Game3_2BackGround = new JLabel("");
		Game3_2BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game3_2BackGround.setBounds(0, 0, 640, 370);
		Game3_2.add(Game3_2BackGround);
		
		JButton Game3_2Hint1 = new JButton("힌트 1");
		Game3_2Hint1.setBounds(520, 201, 97, 23);
		Game3_2.add(Game3_2Hint1);
		
		Game3_2Hint1.addActionListener(new ActionListener() { // 게임 3-2. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "곤충도 잘먹어욤- 옴뇸뇸", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 3;
				Game3_2Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});

		
		JButton Game3_2Hint2 = new JButton("힌트 2");
		Game3_2Hint2.setBounds(520, 252, 97, 23);
		Game3_2.add(Game3_2Hint2);
		
		Game3_2Hint2.addActionListener(new ActionListener() { // 게임 3-2. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "뾰족뾰족", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 5;
				Game3_2Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton Game3_2Hint3 = new JButton("힌트 3");
		Game3_2Hint3.setBounds(520, 308, 97, 23);
		Game3_2.add(Game3_2Hint3);
		
		Game3_2Hint3.addActionListener(new ActionListener() { // 게임 3-2. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "도치", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 7;
				Game3_2Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton StartBackBtn3_2 = new JButton("시작 화면으로");
		StartBackBtn3_2.setBounds(501, 44, 116, 31);
		Game3_2.add(StartBackBtn3_2);
		
		StartBackBtn3_2.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema3_Animal.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game3_2AnsBtn = new JButton("제출 하기");
		Game3_2AnsBtn.setBounds(340, 310, 121, 39);
		Game3_2.add(Game3_2AnsBtn);
		
		Game3_2AnsBlank = new JTextField("");
		Game3_2AnsBlank.setColumns(10);
		Game3_2AnsBlank.setBounds(153, 310, 147, 39);
		Game3_2.add(Game3_2AnsBlank);
		
		// 문제 3_3
		
		JPanel Game3_3 = new JPanel();
		Game3_3.setLayout(null);
		Game3_3.setBounds(0, 0, 640, 370);
		GameTema3_Animal.add(Game3_3);
		
		JLabel StepGame3_3 = new JLabel("문제 3");
		StepGame3_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		StepGame3_3.setBounds(38, 33, 90, 39);
		Game3_3.add(StepGame3_3);
		
		JLabel Game3_3Quiz = new JLabel("ㅍㄱ");
		Game3_3Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game3_3Quiz.setBounds(185, 159, 81, 87);
		Game3_3.add(Game3_3Quiz);
		
		JLabel Game3_3Score = new JLabel("현재 점수 : " + Tema3_Score);
		Game3_3Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game3_3Score.setBounds(307, 37, 168, 39);
		Game3_3.add(Game3_3Score);
		
		JLabel Game3_3Hint = new JLabel("★ Hint ★");
		Game3_3Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game3_3Hint.setBounds(533, 138, 70, 39);
		Game3_3.add(Game3_3Hint);
		
		JLabel Game3_3BackGround = new JLabel("");
		Game3_3BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game3_3BackGround.setBounds(0, 0, 640, 370);
		Game3_3.add(Game3_3BackGround);
		
		JButton Game3_3Hint1 = new JButton("힌트 1");
		Game3_3Hint1.setBounds(520, 201, 97, 23);
		Game3_3.add(Game3_3Hint1);
		
		Game3_3Hint1.addActionListener(new ActionListener() { // 게임 3-3. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) { 
				
				JOptionPane.showMessageDialog(null, "빙하", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 3;
				Game3_3Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton Game3_3Hint2 = new JButton("힌트 2");
		Game3_3Hint2.setBounds(520, 252, 97, 23);
		Game3_3.add(Game3_3Hint2);
		
		Game3_3Hint2.addActionListener(new ActionListener() { // 게임 3-3. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "EBS", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 5;
				Game3_3Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton Game3_3Hint3 = new JButton("힌트 3");
		Game3_3Hint3.setBounds(520, 308, 97, 23);
		Game3_3.add(Game3_3Hint3);
		
		Game3_3Hint3.addActionListener(new ActionListener() { // 게임 3-3. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "펭수", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 7;
				Game3_3Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton StartBackBtn3_3 = new JButton("시작 화면으로");
		StartBackBtn3_3.setBounds(501, 44, 116, 31);
		Game3_3.add(StartBackBtn3_3);
		
		StartBackBtn3_3.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema3_Animal.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game3_3AnsBtn = new JButton("제출 하기");
		Game3_3AnsBtn.setBounds(340, 310, 121, 39);
		Game3_3.add(Game3_3AnsBtn);
		
		Game3_3AnsBlank = new JTextField();
		Game3_3AnsBlank.setColumns(10);
		Game3_3AnsBlank.setBounds(70, 310, 230, 39);
		Game3_3.add(Game3_3AnsBlank);
		
		// 문제 3_4
		
		JPanel Game3_4 = new JPanel();
		Game3_4.setLayout(null);
		Game3_4.setBounds(0, 0, 640, 370);
		GameTema3_Animal.add(Game3_4);
		
		JLabel StepGame3_4 = new JLabel("문제 4");
		StepGame3_4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		StepGame3_4.setBounds(38, 33, 90, 39);
		Game3_4.add(StepGame3_4);
		
		JLabel Game3_4Quiz = new JLabel("ㄴㄱㄹ");
		Game3_4Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game3_4Quiz.setBounds(185, 159, 159, 87);
		Game3_4.add(Game3_4Quiz);
		
		JLabel Game3_4Score = new JLabel("현재 점수 : " + Tema3_Score);
		Game3_4Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game3_4Score.setBounds(307, 37, 168, 39);
		Game3_4.add(Game3_4Score);
		
		JLabel Game3_4Hint = new JLabel("★ Hint ★");
		Game3_4Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game3_4Hint.setBounds(533, 138, 70, 39);
		Game3_4.add(Game3_4Hint);
		
		JLabel Game3_4BackGround = new JLabel("");
		Game3_4BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game3_4BackGround.setBounds(0, 0, 640, 370);
		Game3_4.add(Game3_4BackGround);
		
		JButton Game3_4Hint1 = new JButton("힌트 1");
		Game3_4Hint1.setBounds(520, 201, 97, 23);
		Game3_4.add(Game3_4Hint1);
		
		Game3_4Hint1.addActionListener(new ActionListener() { // 게임 3-4. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "페북 유명 페이지 이름", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 3;
				Game3_4Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton Game3_4Hint2 = new JButton("힌트 2");
		Game3_4Hint2.setBounds(520, 252, 97, 23);
		Game3_4.add(Game3_4Hint2);
		
		Game3_4Hint2.addActionListener(new ActionListener() { // 게임 3-4. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "야행성", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 5;
				Game3_4Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton Game3_4Hint3 = new JButton("힌트 3");
		Game3_4Hint3.setBounds(520, 308, 97, 23);
		Game3_4.add(Game3_4Hint3);
		
		Game3_4Hint3.addActionListener(new ActionListener() { // 게임 3-4. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "농심 OOO~, OOO 한 마리 몰고가세요~", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 7;
				Game3_4Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});

		
		JButton StartBackBtn3_4 = new JButton("시작 화면으로");
		StartBackBtn3_4.setBounds(501, 44, 116, 31);
		Game3_4.add(StartBackBtn3_4);
		
		StartBackBtn3_4.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema3_Animal.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game3_4AnsBtn = new JButton("제출 하기");
		Game3_4AnsBtn.setBounds(340, 310, 121, 39);
		Game3_4.add(Game3_4AnsBtn);
		
		Game3_4AnsBlank = new JTextField();
		Game3_4AnsBlank.setColumns(10);
		Game3_4AnsBlank.setBounds(70, 310, 230, 39);
		Game3_4.add(Game3_4AnsBlank);
		
		// 문제 3_5
		
		JPanel Game3_5 = new JPanel();
		Game3_5.setLayout(null);
		Game3_5.setBounds(0, 0, 640, 370);
		GameTema3_Animal.add(Game3_5);
		
		JLabel StepGame3_5 = new JLabel("문제 5");
		StepGame3_5.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 30));
		StepGame3_5.setBounds(38, 33, 90, 39);
		Game3_5.add(StepGame3_5);
		
		JLabel Game3_5Quiz = new JLabel("ㅇㅇ");
		Game3_5Quiz.setFont(new Font("한컴산뜻돋움", Font.BOLD, 40));
		Game3_5Quiz.setBounds(185, 159, 81, 87);
		Game3_5.add(Game3_5Quiz);
		
		JLabel Game3_5Score = new JLabel("현재 점수 : " + Tema3_Score);
		Game3_5Score.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game3_5Score.setBounds(307, 37, 168, 39);
		Game3_5.add(Game3_5Score);
		
		JLabel Game3_5Hint = new JLabel("★ Hint ★");
		Game3_5Hint.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 15));
		Game3_5Hint.setBounds(533, 138, 70, 39);
		Game3_5.add(Game3_5Hint);
		
		JLabel Game3_5BackGround = new JLabel("");
		Game3_5BackGround.setIcon(new ImageIcon("./image/ChoSungPlay.jpg"));
		Game3_5BackGround.setBounds(0, 0, 640, 370);
		Game3_5.add(Game3_5BackGround);
		
		JButton Game3_5Hint1 = new JButton("힌트 1");
		Game3_5Hint1.setBounds(520, 201, 97, 23);
		Game3_5.add(Game3_5Hint1);
		
		Game3_5Hint1.addActionListener(new ActionListener() { // 게임 3-5. 힌트 1 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) { 
				
				JOptionPane.showMessageDialog(null, "북극", "힌트 1", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 3;
				Game3_5Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton Game3_5Hint2 = new JButton("힌트 2");
		Game3_5Hint2.setBounds(520, 252, 97, 23);
		Game3_5.add(Game3_5Hint2);
		
		Game3_5Hint2.addActionListener(new ActionListener() { // 게임 3-5. 힌트 2 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "사막", "힌트 2", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 5;
				Game3_5Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});
		
		JButton Game3_5Hint3 = new JButton("힌트 3");
		Game3_5Hint3.setBounds(520, 308, 97, 23);
		Game3_5.add(Game3_5Hint3);
		
		Game3_5Hint3.addActionListener(new ActionListener() { // 게임 3-5. 힌트 3 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "어장관리 심한 여자를 일컫는 말 → OO년 ", "힌트 3", JOptionPane.PLAIN_MESSAGE);
				Tema3_Score -= 7;
				Game3_5Score.setText("현재 점수 : " + Tema3_Score);
			}
			
		});

		
		JButton StartBackBtn3_5 = new JButton("시작 화면으로");
		StartBackBtn3_5.setBounds(501, 44, 116, 31);
		Game3_5.add(StartBackBtn3_5);
		
		StartBackBtn3_5.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				GameTema3_Animal.setVisible(false);
				StartPage.setVisible(true);
			}
			
		});
		
		JButton Game3_5AnsBtn = new JButton("제출 하기");
		Game3_5AnsBtn.setBounds(340, 310, 121, 39);
		Game3_5.add(Game3_5AnsBtn);
		
		Game3_5AnsBlank = new JTextField();
		Game3_5AnsBlank.setColumns(10);
		Game3_5AnsBlank.setBounds(70, 310, 230, 39);
		Game3_5.add(Game3_5AnsBlank);
		
		// 테마3_동물 끝
		
		JPanel Game3_End = new JPanel();
		Game3_End.setLayout(null);
		Game3_End.setBounds(0, 0, 640, 370);
		GameTema3_Animal.add(Game3_End);
		
		JLabel Game3_EndLabel = new JLabel("동물 테마 클리어 !");
		Game3_EndLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 45));
		Game3_EndLabel.setBounds(150, 127, 392, 78);
		Game3_End.add(Game3_EndLabel);
		
		JLabel Game3_EndScore = new JLabel("현재 테마 3 점수: " + Tema3_Score);
		Game3_EndScore.setHorizontalAlignment(SwingConstants.CENTER);
		Game3_EndScore.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 20));
		Game3_EndScore.setBounds(112, 240, 436, 46);
		Game3_End.add(Game3_EndScore);
		
		JButton StartBackBtn3_End = new JButton("시작 화면으로");
		StartBackBtn3_End.setBounds(501, 44, 116, 31);
		Game3_End.add(StartBackBtn3_End);
		
		JLabel Game3EndBackGround = new JLabel("");
		Game3EndBackGround.setIcon(new ImageIcon("./image/ChoSungTheEnd.jpg"));
		Game3EndBackGround.setBounds(0, 0, 640, 370);
		Game3_End.add(Game3EndBackGround);
		
		StartBackBtn3_End.addActionListener(new ActionListener() { // 시작 화면으로 돌아가는 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(EndPageScore == 3) {
					int temp = Tema1_Score + Tema2_Score + Tema3_Score;
					GameTheEndLabel_2.setText("총 점수 : " + temp + "점으로");
					GameTheEndLabel_3.setText("테마 1 점수 :" + Tema1_Score + "점         테마 2 점수 : " + Tema2_Score + "점         테마 3 점수 : " + Tema3_Score + "점");
					GameTema3_Animal.setVisible(false);
					GameTheEndPage.setVisible(true);
				}
				
				else {
					GameTema3_Animal.setVisible(false);
					StartPage.setVisible(true);
				}
				
			}
			
		});
	
		
		Game1_1AnsBtn.addActionListener(new ActionListener() { // 브랜드 테마 - 문제 1_1 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "가나";
				if(Answer.equals(Game1_1AnsBlank.getText())) {
					Tema1_Score += 10;
					Game1_1.setVisible(false);
					Game1_2.setVisible(true);
					Game1_2Score.setText("현재 점수 : " + Tema1_Score);
				}
				else {
					Tema1_Score -= 5;
					Game1_1Score.setText("현재 점수 : " + Tema1_Score);
				}
				
				
			}
			
		});
		
		Game1_2AnsBtn.addActionListener(new ActionListener() { // 브랜드 테마 - 문제 1_2 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "삼성";
				if(Answer.equals(Game1_2AnsBlank.getText())) {
					Tema1_Score += 10;
					Game1_2.setVisible(false);
					Game1_3.setVisible(true);
					Game1_3Score.setText("현재 점수 : " + Tema1_Score);
				}
				else {
					Tema1_Score -= 5;
					Game1_2Score.setText("현재 점수 : " + Tema1_Score);
				}
			}
			
		});
		
		Game1_3AnsBtn.addActionListener(new ActionListener() { // 브랜드 테마 - 문제 1_3 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "넥슨";
				if(Answer.equals(Game1_3AnsBlank.getText())) {
					Tema1_Score += 10;
					Game1_3.setVisible(false);
					Game1_4.setVisible(true);
					Game1_4Score.setText("현재 점수 : " + Tema1_Score);
				}
				else {
					Tema1_Score -= 5;
					Game1_3Score.setText("현재 점수 : " + Tema1_Score);
				}
			}
			
		});
		
		Game1_4AnsBtn.addActionListener(new ActionListener() { // 브랜드 테마 - 문제 1_4 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "샤넬";
				if(Answer.equals(Game1_4AnsBlank.getText())) {
					Tema1_Score += 10;
					Game1_4.setVisible(false);
					Game1_5.setVisible(true);
					Game1_5Score.setText("현재 점수 : " + Tema1_Score);
				}
				else {
					Tema1_Score -= 5;
					Game1_4Score.setText("현재 점수 : " + Tema1_Score);
				}
			}
			
		});
		
		Game1_5AnsBtn.addActionListener(new ActionListener() { // 브랜드 테마 - 문제 1_5 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "기아";
				if(Answer.equals(Game1_5AnsBlank.getText())) {
					Tema1_Score += 10;
					Game1_5.setVisible(false);
					Game1_End.setVisible(true);
					Game1_EndScore.setText("테마1 현재 점수 : " + Tema1_Score);
					EndPageScore += 1;
					
				}
				else {
					Tema1_Score -= 5;
					Game1_5Score.setText("현재 점수 : " + Tema1_Score);
				}
			}
			
		});
		
		
		
		Game2_1AnsBtn.addActionListener(new ActionListener() { // 음식 테마 - 문제 2_1 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "탕수육";
				if(Answer.equals(Game2_1AnsBlank.getText())) {
					Tema2_Score += 10;
					Game2_1.setVisible(false);
					Game2_2.setVisible(true);
					Game2_2Score.setText("현재 점수 : " + Tema2_Score);
				}
				else {
					Tema2_Score -= 5;
					Game2_1Score.setText("현재 점수 : " + Tema2_Score);
				}
				
				
			}
			
		});
		
		Game2_2AnsBtn.addActionListener(new ActionListener() { // 음식 테마 - 문제 2_2 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "매실";
				if(Answer.equals(Game2_2AnsBlank.getText())) {
					Tema2_Score += 10;
					Game2_2.setVisible(false);
					Game2_3.setVisible(true);
					Game2_3Score.setText("현재 점수 : " + Tema2_Score);
				}
				else {
					Tema2_Score -= 5;
					Game2_2Score.setText("현재 점수 : " + Tema2_Score);
				}
				
				
			}
			
		});
		
		Game2_3AnsBtn.addActionListener(new ActionListener() { // 음식 테마 - 문제 2_3 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "버섯";
				if(Answer.equals(Game2_3AnsBlank.getText())) {
					Tema2_Score += 10;
					Game2_3.setVisible(false);
					Game2_4.setVisible(true);
					Game2_4Score.setText("현재 점수 : " + Tema2_Score);
				}
				else {
					Tema2_Score -= 5;
					Game2_3Score.setText("현재 점수 : " + Tema2_Score);
				}
				
				
			}
			
		});
		
		Game2_4AnsBtn.addActionListener(new ActionListener() { // 음식 테마 - 문제 2_4 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "국수";
				if(Answer.equals(Game2_4AnsBlank.getText())) {
					Tema2_Score += 10;
					Game2_4.setVisible(false);
					Game2_5.setVisible(true);
					Game2_5Score.setText("현재 점수 : " + Tema2_Score);
				}
				else {
					Tema2_Score -= 5;
					Game2_4Score.setText("현재 점수 : " + Tema2_Score);
				}
				
				
			}
			
		});
		
		Game2_5AnsBtn.addActionListener(new ActionListener() { // 음식 테마 - 문제 2_5 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "김치";
				if(Answer.equals(Game2_5AnsBlank.getText())) {
					Tema2_Score += 10;
					Game2_5.setVisible(false);
					Game2_End.setVisible(true);
					Game2_EndScore.setText("테마2 현재 점수 : " + Tema2_Score);
					EndPageScore += 1;
				}
				else {
					Tema2_Score -= 5;
					Game2_5Score.setText("현재 점수 : " + Tema2_Score);
				}
				
				
			}
			
		});
		
		Game3_1AnsBtn.addActionListener(new ActionListener() { // 동물 테마 - 문제 3_1 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "고양이";
				if(Answer.equals(Game3_1AnsBlank.getText())) {
					Tema3_Score += 10;
					Game3_1.setVisible(false);
					Game3_2.setVisible(true);
					Game3_2Score.setText("현재 점수 : " + Tema3_Score);
				}
				else {
					Tema3_Score -= 5;
					Game3_1Score.setText("현재 점수 : " + Tema3_Score);
				}
				
				
			}
			
		});
		
		Game3_2AnsBtn.addActionListener(new ActionListener() { // 동물 테마 - 문제 3_2 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "고슴도치";
				if(Answer.equals(Game3_2AnsBlank.getText())) {
					Tema3_Score += 10;
					Game3_2.setVisible(false);
					Game3_3.setVisible(true);
					Game3_3Score.setText("현재 점수 : " + Tema3_Score);
				}
				else {
					Tema3_Score -= 5;
					Game3_2Score.setText("현재 점수 : " + Tema3_Score);
				}
				
				
			}
			
		});
		
		Game3_3AnsBtn.addActionListener(new ActionListener() { // 동물 테마 - 문제 3_3 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "펭귄";
				if(Answer.equals(Game3_3AnsBlank.getText())) {
					Tema3_Score += 10;
					Game3_3.setVisible(false);
					Game3_4.setVisible(true);
					Game3_4Score.setText("현재 점수 : " + Tema3_Score);
				}
				else {
					Tema3_Score -= 5;
					Game3_3Score.setText("현재 점수 : " + Tema3_Score);
				}
				
				
			}
			
		});
		
		Game3_4AnsBtn.addActionListener(new ActionListener() { // 동물 테마 - 문제 3_4 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "너구리";
				if(Answer.equals(Game3_4AnsBlank.getText())) {
					Tema3_Score += 10;
					Game3_4.setVisible(false);
					Game3_5.setVisible(true);
					Game3_5Score.setText("현재 점수 : " + Tema3_Score);
				}
				else {
					Tema3_Score -= 5;
					Game3_4Score.setText("현재 점수 : " + Tema3_Score);
				}
				
				
			}
			
		});
		
		Game3_5AnsBtn.addActionListener(new ActionListener() { // 동물 테마 - 문제 3_5 정답 확인

			@Override
			public void actionPerformed(ActionEvent e) {
				String Answer = "여우";
				if(Answer.equals(Game3_5AnsBlank.getText())) {
					Tema3_Score += 10;
					Game3_5.setVisible(false);
					Game3_End.setVisible(true);
					Game3_EndScore.setText("테마3 현재 점수 : " + Tema3_Score);
					EndPageScore += 1;
				}
				else {
					Tema3_Score -= 5;
					Game3_5Score.setText("현재 점수 : " + Tema3_Score);
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
		
		Tema3_AnimalBtn.addActionListener(new ActionListener() { // 테마 - 동물 선택 버튼 활성화

			@Override
			public void actionPerformed(ActionEvent e) {
				SelectTemaPage.setVisible(false);
				GameTema3_Animal.setVisible(true);
				
			}
			
		});
		
		
		
		
	}
}
