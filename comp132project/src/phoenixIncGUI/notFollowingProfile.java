package phoenixIncGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.User;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class notFollowingProfile extends JFrame {

	private JPanel contentPane;

	public notFollowingProfile(User u, User v) {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 647);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 717, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel pp_1_1 = new JLabel("pp");
		pp_1_1.setBackground(Color.BLACK);
		pp_1_1.setIcon(v.getDefaultprofilePic());
		pp_1_1.setBounds(3, 11, 92, 82);
		panel.add(pp_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel(" nickname:");
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(10, 110, 85, 23);
		panel.add(lblNewLabel_2_1);
		
		JLabel nickName = new JLabel((String) null);
		nickName.setText(v.getNickname());
		nickName.setBackground(Color.WHITE);
		nickName.setBounds(10, 140, 68, 27);
		panel.add(nickName);
		
		JLabel lblType = new JLabel("type:");
		lblType.setBackground(Color.WHITE);
		lblType.setBounds(208, 98, 85, 23);
		panel.add(lblType);
		
		JLabel lblTypeWritten = new JLabel((String) null);
		lblTypeWritten.setText(v.getType());
		lblTypeWritten.setBackground(Color.WHITE);
		lblTypeWritten.setBounds(313, 96, 68, 27);
		panel.add(lblTypeWritten);
		
		JLabel lblName = new JLabel(" name:");
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(205, 13, 85, 23);
		panel.add(lblName);
		
		JLabel lblLastname = new JLabel("lastname");
		lblLastname.setBackground(Color.WHITE);
		lblLastname.setBounds(208, 53, 85, 23);
		panel.add(lblLastname);
		
		JLabel lblLastnameofV = new JLabel("lastnameofV");
		lblLastnameofV.setText(v.getLastname());
		lblLastnameofV.setBackground(Color.WHITE);
		lblLastnameofV.setBounds(313, 55, 85, 23);
		panel.add(lblLastnameofV);
		
		JLabel lblNameofV = new JLabel("nameofV");
		lblNameofV.setText(v.getName());
		lblNameofV.setBackground(Color.WHITE);
		lblNameofV.setBounds(313, 11, 85, 23);
		panel.add(lblNameofV);
		
		JButton followButton = new JButton("FOLLOW");
		followButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "User followed");
				u.getUsersFollowed().add(v);
			}
		});
		followButton.setBounds(544, 13, 89, 23);
		panel.add(followButton);
		
		JButton btnNewButton_2 = new JButton("Return to Homepage");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Returning to Homepage...");
				Hpageyedek hp = new Hpageyedek(u);
				hp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(544, 85, 123, 23);
		panel.add(btnNewButton_2);
	}
}
