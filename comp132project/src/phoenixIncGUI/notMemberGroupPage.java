package phoenixIncGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Group;
import models.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class notMemberGroupPage extends JFrame {

	private JPanel contentPane;

	public notMemberGroupPage(User u, Group g) {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 630, 145);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblgrpName = new JLabel("Group Name:");
		lblgrpName.setBounds(10, 11, 115, 33);
		panel.add(lblgrpName);
		
		JLabel lblgrpCountry = new JLabel("Country:");
		lblgrpCountry.setBounds(10, 55, 115, 33);
		panel.add(lblgrpCountry);
		
		JLabel lblgrpHobbies = new JLabel("Hobbies:");
		lblgrpHobbies.setBounds(10, 99, 115, 33);
		panel.add(lblgrpHobbies);
		
		JLabel lblnameOfGrp = new JLabel("New label");
		lblnameOfGrp.setText(g.getName());
		lblnameOfGrp.setBounds(171, 11, 115, 33);
		panel.add(lblnameOfGrp);
		
		JLabel lblcountryOfGrp = new JLabel("New label");
		lblcountryOfGrp.setText(g.getCountry());
		lblcountryOfGrp.setBounds(171, 55, 115, 33);
		panel.add(lblcountryOfGrp);
		
		JLabel lblhobbiesOfGrp = new JLabel("New label");
		lblhobbiesOfGrp.setText(g.getHobbies());
		lblhobbiesOfGrp.setBounds(171, 99, 115, 33);
		panel.add(lblhobbiesOfGrp);
		
		JButton btnjoinGrp = new JButton("JOIN GROUP");
		btnjoinGrp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Joining group... Go to homepage and try to visit group page again.");
				u.joinGroup(g);
			}
		});
		btnjoinGrp.setBounds(479, 16, 121, 23);
		panel.add(btnjoinGrp);
		
		JButton btnreturnHome = new JButton("Return to Homepage");
		btnreturnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Returning to Homepage...");
				Hpageyedek hp = new Hpageyedek(u);
				hp.setVisible(true);
				dispose();
			}
		});
		btnreturnHome.setBounds(479, 60, 123, 23);
		panel.add(btnreturnHome);
	}

}
