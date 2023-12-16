package phoenixIncGUI;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Group;
import models.StandartUser;
import models.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginScreenGUI extends JFrame implements ActionListener{

	private JPanel w_contentPane;
	private JTextField nicknameTextField;
	private JPasswordField passwordPasswordField;

	public LoginScreenGUI(User u) {
		setResizable(false);
		setTitle("Phoenix Network Login Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		w_contentPane = new JPanel();
		w_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_contentPane);
		w_contentPane.setLayout(null);
		
		JLabel label_Logo = new JLabel(new ImageIcon(getClass().getResource("Phoenix.png")));
		label_Logo.setBackground(Color.WHITE);
		label_Logo.setBounds(260, 33, 540, 480);
		w_contentPane.add(label_Logo);
		
		JPanel w_loginPanel = new JPanel();
		w_loginPanel.setBackground(Color.WHITE);
		w_loginPanel.setBounds(10, 124, 229, 202);
		w_contentPane.add(w_loginPanel);
		w_loginPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  nickname:");
		lblNewLabel.setBackground(new Color(204, 153, 51));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 30, 79, 25);
		w_loginPanel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("  password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(10, 91, 79, 25);
		w_loginPanel.add(lblPassword);
		
		nicknameTextField = new JTextField();
		nicknameTextField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nicknameTextField.setBounds(20, 60, 164, 20);
		w_loginPanel.add(nicknameTextField);
		nicknameTextField.setColumns(10);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get text from user
				//get password from user
				String userNickname = nicknameTextField.getText();			
				String userPassword = String.valueOf(passwordPasswordField.getPassword());
			
			
					  if(userNickname.equals(u.getNickname())&& userPassword.equals(u.getPassword())) {
						JOptionPane.showMessageDialog(null, "Logging in...");
						Hpageyedek home = new Hpageyedek(u);
						home.setVisible(true);
						dispose();
					}
					
				
					  else if(userNickname.length()== 0 || userPassword.length()==0) {
						  JOptionPane.showMessageDialog(null, "Please fill all the areas");
					
				}
					  else {
						  JOptionPane.showMessageDialog(null, "Nickname or Password is wrong");

					  }
				
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setBounds(10, 168, 89, 23);
		w_loginPanel.add(btnLogin);
		
		JButton btnSignUp = new JButton("sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close the prev frame
				
				signupJFrame supframe = new signupJFrame();
				supframe.setVisible(true);
				String supUsernickname = supframe.nicknamesup_textField.getText();
				String supUserpassword = supframe.passwordsup_passwordField.getText(); 
				String supUsername = supframe.namesup_textField.getText(); 
				String supUserlastname = supframe.lastnamesup_textField.getText();
				String supUseragestr = supframe.agesup_textField.getText();
				
				int supUserage = 0;
				if(!supUseragestr.isBlank()) { 
					supUserage = Integer.parseInt(supUseragestr);
				}
				String supUserCountry = supframe.countryTxtField.getText();
				
				String supUseremail = supframe.emailsup_textField.getText();
				User supUser = new StandartUser(supUsernickname, supUserpassword, supUsername, supUserlastname, supUserage, supUseremail, "Turkey");
				dispose();
			}
			
		});
		
		
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSignUp.setBounds(119, 168, 89, 23);
		w_loginPanel.add(btnSignUp);
		
		passwordPasswordField = new JPasswordField();
		passwordPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordPasswordField.setBounds(20, 126, 164, 20);
		w_loginPanel.add(passwordPasswordField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
