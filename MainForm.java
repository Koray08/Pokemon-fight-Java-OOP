import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JTextField p1NameTF;
	private JTextField p1HpTF;
	private JTextField p1PowerTF;
	private JTextField p1AttackSpeedTF;
	private JTextField p1EvadeTF;
	private JTextField p2NameTF;
	private JTextField p2HpTF;
	private JTextField p2PowerTF;
	private JTextField p2AttackSpeedTF;
	private JTextField p2EvadeTF;

	private JTextField bHpTF;
	private JTextField bAttackTF;
	private JTextField bAttackSpeedTF;
	private JTextField bEvaChanceTF;
	private JTextField bmassDamageChanceTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(38, 39, 46, 14);
		contentPane.add(lblNewLabel);
		
		p1NameTF = new JTextField();
		p1NameTF.setBounds(122, 36, 86, 20);
		contentPane.add(p1NameTF);
		p1NameTF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("HP:");
		lblNewLabel_1.setBounds(38, 82, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Power:");
		lblNewLabel_2.setBounds(38, 123, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Attack Speed:");
		lblNewLabel_3.setBounds(38, 169, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Evade:");
		lblNewLabel_4.setBounds(38, 217, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		p1HpTF = new JTextField();
		p1HpTF.setBounds(122, 82, 86, 20);
		contentPane.add(p1HpTF);
		p1HpTF.setColumns(10);
		
		p1PowerTF = new JTextField();
		p1PowerTF.setBounds(122, 120, 86, 20);
		contentPane.add(p1PowerTF);
		p1PowerTF.setColumns(10);
		
		p1AttackSpeedTF = new JTextField();
		p1AttackSpeedTF.setBounds(122, 166, 86, 20);
		contentPane.add(p1AttackSpeedTF);
		p1AttackSpeedTF.setColumns(10);
		
		p1EvadeTF = new JTextField();
		p1EvadeTF.setBounds(122, 214, 86, 20);
		contentPane.add(p1EvadeTF);
		p1EvadeTF.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Name:");
		lblNewLabel_5.setBounds(278, 36, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		p2NameTF = new JTextField();
		p2NameTF.setColumns(10);
		p2NameTF.setBounds(362, 33, 86, 20);
		contentPane.add(p2NameTF);
		
		JLabel lblNewLabel_1_1 = new JLabel("HP:");
		lblNewLabel_1_1.setBounds(278, 79, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Power:");
		lblNewLabel_2_1.setBounds(278, 120, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Attack Speed:");
		lblNewLabel_3_1.setBounds(278, 166, 74, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Evade:");
		lblNewLabel_4_1.setBounds(278, 214, 46, 14);
		contentPane.add(lblNewLabel_4_1);
		
		p2HpTF = new JTextField();
		p2HpTF.setColumns(10);
		p2HpTF.setBounds(362, 79, 86, 20);
		contentPane.add(p2HpTF);
		
		p2PowerTF = new JTextField();
		p2PowerTF.setColumns(10);
		p2PowerTF.setBounds(362, 117, 86, 20);
		contentPane.add(p2PowerTF);
		
		p2AttackSpeedTF = new JTextField();
		p2AttackSpeedTF.setColumns(10);
		p2AttackSpeedTF.setBounds(362, 163, 86, 20);
		contentPane.add(p2AttackSpeedTF);
		
		p2EvadeTF = new JTextField();
		p2EvadeTF.setColumns(10);
		p2EvadeTF.setBounds(362, 211, 86, 20);
		contentPane.add(p2EvadeTF);




		JLabel bossLabel1 = new JLabel("HP:");
		bossLabel1.setBounds(30, 302, 46, 14);
		contentPane.add(bossLabel1);

		bHpTF = new JTextField();
		bHpTF.setColumns(10);
		bHpTF.setBounds(55, 300, 86, 20);
		contentPane.add(bHpTF);

		
		JLabel bossLabel2 = new JLabel("Power:");
		bossLabel2.setBounds(150, 302, 46, 14);
		contentPane.add(bossLabel2);

		bAttackTF = new JTextField();
		bAttackTF.setColumns(10);
		bAttackTF.setBounds(190, 300, 86, 20);
		contentPane.add(bAttackTF);

		JLabel bossEvaLabel = new JLabel("Eva chance: ");
		bossEvaLabel.setBounds(290, 302, 74, 14);
		contentPane.add(bossEvaLabel);

		bEvaChanceTF = new JTextField();
		bEvaChanceTF.setColumns(10);
		bEvaChanceTF.setBounds(360, 300, 86, 20);
		contentPane.add(bEvaChanceTF);

		
		JLabel bossLabel3 = new JLabel("Attack Speed:");
		bossLabel3.setBounds(80, 350, 74, 14);
		contentPane.add(bossLabel3);

		bAttackSpeedTF = new JTextField();
		bAttackSpeedTF.setColumns(10);
		bAttackSpeedTF.setBounds(150, 350, 86, 20);
		contentPane.add(bAttackSpeedTF);

		
		JLabel bossLabel4 = new JLabel("Mass Damage Chance:");
		bossLabel4.setBounds(250, 350, 46, 14);
		contentPane.add(bossLabel4);

		bmassDamageChanceTF = new JTextField();
		bmassDamageChanceTF.setColumns(10);
		bmassDamageChanceTF.setBounds(300, 350, 86, 20);
		contentPane.add(bmassDamageChanceTF);
		



		


		



		
		JButton fightBtn = new JButton("Fight!");
		fightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstPokemonName = p1NameTF.getText();
				int firstPokemonPower = Integer.parseInt(p1PowerTF.getText());
				int firstPokemonHp = Integer.parseInt(p1HpTF.getText());
				int firstPokemonEvadeChance = Integer.parseInt(p1EvadeTF.getText());
				double firstPokemonAttackSpeed = Double.parseDouble(p1AttackSpeedTF.getText());
				
				String secondPokemonName = p2NameTF.getText();
				int secondPokemonPower = Integer.parseInt(p2PowerTF.getText());
				int secondPokemonHp = Integer.parseInt(p2HpTF.getText());
				int secondPokemonEvadeChance = Integer.parseInt(p2EvadeTF.getText());
				double secondPokemonAttackSpeed = Double.parseDouble(p2AttackSpeedTF.getText());

				int bossHp = Integer.parseInt(bHpTF.getText());
				int bossPower = Integer.parseInt(bAttackTF.getText());
				int bossEvadeChance = Integer.parseInt(bEvaChanceTF.getText());
				int bossAttackSpeed = Integer.parseInt(bAttackSpeedTF.getText());
				int bossMassDamage = Integer.parseInt(bAttackSpeedTF.getText());
				
				Pokemon p1 = new Pokemon(firstPokemonName, firstPokemonPower, firstPokemonHp, firstPokemonEvadeChance, firstPokemonAttackSpeed);
				Pokemon p2 = new Pokemon(secondPokemonName, secondPokemonPower, secondPokemonHp, secondPokemonEvadeChance, secondPokemonAttackSpeed);

				Boss boss = new Boss("boss", bossPower, bossHp, bossEvadeChance, bossAttackSpeed, bossMassDamage);
				
				p1.target = boss;
				p2.target = boss;
				boss.AddRival(p1);
				boss.AddRival(p2);
				
				p1.start();
				p2.start();
				boss.start();
			}
		});
		fightBtn.setBounds(185, 260, 89, 23);
		contentPane.add(fightBtn);
	}
}