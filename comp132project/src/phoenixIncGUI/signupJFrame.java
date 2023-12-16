package phoenixIncGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Group;
import models.StandartUser;
import models.User;

import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signupJFrame extends JFrame {

	private JPanel signupcontentPane;
	private JLabel signuplblNewLabel;
	protected JTextField namesup_textField;
	protected JTextField lastnamesup_textField;
	protected JTextField emailsup_textField;
	protected JTextField agesup_textField;
	protected JTextField nicknamesup_textField;
	protected JPasswordField passwordsup_passwordField;
	JTextField countryTxtField;
	
	public signupJFrame() {
		setResizable(false);
		setTitle("Phoenix Network Sign Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 480);
		signupcontentPane = new JPanel();
		signupcontentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(signupcontentPane);
		signupcontentPane.setLayout(null);
		
		JLabel signuplblNewLabel_logo = new JLabel(new ImageIcon(getClass().getResource("phoenix2.png")));
		signuplblNewLabel_logo.setBackground(Color.WHITE);
		signuplblNewLabel_logo.setBounds(224, 0, 300, 500);
		signupcontentPane.add(signuplblNewLabel_logo);
		
		JTabbedPane signuptabbedPane = new JTabbedPane(JTabbedPane.TOP);
		signuptabbedPane.setBounds(0, 0, 224, 441);
		signupcontentPane.add(signuptabbedPane);
		
		JPanel signuptabbedpanel = new JPanel();
		signuptabbedpanel.setBackground(Color.WHITE);
		signuptabbedPane.addTab("New tab", null, signuptabbedpanel, null);
		signuptabbedpanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 130, 25);
		signuptabbedpanel.add(lblNewLabel);
		
		JLabel lblLastname = new JLabel("  lastname:");
		lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLastname.setBounds(10, 65, 130, 25);
		signuptabbedpanel.add(lblLastname);
		
		JLabel lblEmail = new JLabel("  email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 115, 130, 25);
		signuptabbedpanel.add(lblEmail);
		
		JLabel lblAge = new JLabel("  age:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAge.setBounds(10, 170, 130, 25);
		signuptabbedpanel.add(lblAge);
		
		JLabel lblNickname = new JLabel("  nickname:");
		lblNickname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNickname.setBounds(10, 222, 130, 25);
		signuptabbedpanel.add(lblNickname);
		
		JLabel lblPassword = new JLabel("  password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(10, 275, 130, 25);
		signuptabbedpanel.add(lblPassword);
		
		namesup_textField = new JTextField();
		namesup_textField.setBounds(20, 40, 130, 25);
		signuptabbedpanel.add(namesup_textField);
		namesup_textField.setColumns(10);
		
		lastnamesup_textField = new JTextField();
		lastnamesup_textField.setColumns(10);
		lastnamesup_textField.setBounds(20, 89, 130, 25);
		signuptabbedpanel.add(lastnamesup_textField);
		
		emailsup_textField = new JTextField();
		emailsup_textField.setColumns(10);
		emailsup_textField.setBounds(20, 139, 130, 25);
		signuptabbedpanel.add(emailsup_textField);
		
		agesup_textField = new JTextField();
		agesup_textField.setColumns(10);
		agesup_textField.setBounds(20, 194, 130, 25);
		signuptabbedpanel.add(agesup_textField);
		
		nicknamesup_textField = new JTextField();
		nicknamesup_textField.setColumns(10);
		nicknamesup_textField.setBounds(20, 244, 130, 25);
		signuptabbedpanel.add(nicknamesup_textField);
		
		passwordsup_passwordField = new JPasswordField();
		passwordsup_passwordField.setBounds(20, 297, 130, 25);
		signuptabbedpanel.add(passwordsup_passwordField);
		
		JButton btnsup_NewButton = new JButton("Sign up");
		btnsup_NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signupJFrame supframe = new signupJFrame();
				supframe.setVisible(true);
				String SUPUsernickname = supframe.nicknamesup_textField.getText();
				String SUPUserpassword = supframe.passwordsup_passwordField.getText(); 
				String SUPUsername = supframe.namesup_textField.getText(); 
				String SUPUserlastname = supframe.lastnamesup_textField.getText();
				String SUPUseragestr = supframe.agesup_textField.getText();
				int SUPUserage = 0;
				if(!SUPUseragestr.isBlank()) { 
					SUPUserage = Integer.parseInt(SUPUseragestr);
				}
				String SUPUseremail = supframe.emailsup_textField.getText();
				String SUPCountry = supframe.countryTxtField.getText();
				
				StandartUser signedupu = new StandartUser(SUPUsernickname, SUPUserpassword, SUPUsername, SUPUserlastname, SUPUserage, SUPUseremail, SUPCountry);
				if( (SUPUsernickname.length()==0) || (SUPUserpassword.length()==0) || (SUPUsername.length()==0) || (SUPUserlastname.length()==0) || 
						(SUPUseragestr.length()==0) || (SUPUseremail.length()==0)||(SUPCountry.length()==0)) {
				JOptionPane.showMessageDialog(null, "Signing in...");
				Hpageyedek home = new Hpageyedek(signedupu);
				home.setVisible(true);
				dispose();

				}
				supframe.dispose();


			}
		});
		btnsup_NewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnsup_NewButton.setBounds(56, 390, 89, 23);
		signuptabbedpanel.add(btnsup_NewButton);
		
		JLabel lblCountry = new JLabel("  country:");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCountry.setBounds(10, 333, 130, 25);
		signuptabbedpanel.add(lblCountry);
		
		countryTxtField = new JTextField();
		countryTxtField.setColumns(10);
		countryTxtField.setBounds(20, 352, 130, 25);
		signuptabbedpanel.add(countryTxtField);
	}
}
