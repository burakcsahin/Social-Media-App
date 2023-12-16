package phoenixIncGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Content;
import models.Group;
import models.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class memberGroup extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtTextField;
	private JTextField titleTextField;

	public memberGroup(User u, Group g) {
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 653, 147);
		panel.setLayout(null);
		contentPane.add(panel);
		
		JLabel lblgrpName = new JLabel("Group Name:");
		lblgrpName.setBounds(10, 11, 115, 33);
		panel.add(lblgrpName);
		
		JLabel lblgrpCountry = new JLabel("Country:");
		lblgrpCountry.setBounds(10, 55, 115, 33);
		panel.add(lblgrpCountry);
		
		JLabel lblgrpHobbies = new JLabel("Hobbies:");
		lblgrpHobbies.setBounds(10, 99, 115, 33);
		panel.add(lblgrpHobbies);
		
		JLabel lblnameOfGrp = new JLabel((String) null);
		lblnameOfGrp.setText(g.getName());
		lblnameOfGrp.setBounds(171, 11, 115, 33);
		panel.add(lblnameOfGrp);
		
		JLabel lblcountryOfGrp = new JLabel((String) null);
		lblcountryOfGrp.setText(g.getCountry());
		lblcountryOfGrp.setBounds(171, 55, 115, 33);
		panel.add(lblcountryOfGrp);
		
		JLabel lblhobbiesOfGrp = new JLabel((String) null);
		lblhobbiesOfGrp.setText(g.getHobbies());
		lblhobbiesOfGrp.setBounds(171, 99, 115, 33);
		panel.add(lblhobbiesOfGrp);
		
		JButton btnleaveGrp = new JButton("LEAVE GROUP");
		btnleaveGrp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Leaving group... Go to homepage and try to visit group page again.");
				u.leaveGroup(g);
			}
		});
		btnleaveGrp.setBounds(479, 16, 121, 23);
		panel.add(btnleaveGrp);
		
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
		
		JButton postContent = new JButton("POST NEW CONTENT");
		postContent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String today = "27/05/2022";
				 Content cgpcreatedc = new Content(titleTextField.getText(), today ,u.getName()+" "+u.getLastname()+" "+u.getNickname(), txtTextField.getText());
				 u.getCreatedContents().add(cgpcreatedc);
				 JOptionPane.showMessageDialog(null, "You have created a new post. It may take a while to display. Please leave and revisit this group page to see your content.");
				 
			}
		});
		postContent.setBounds(296, 104, 156, 23);
		panel.add(postContent);
		
		JButton rmvEditContent = new JButton("REMOVE/EDIT CONTENT");
		rmvEditContent.setBounds(470, 104, 173, 23);
		panel.add(rmvEditContent);
		
		txtTextField = new JTextField();
		txtTextField.setText("Type something..");
		txtTextField.setBounds(296, 47, 156, 20);
		panel.add(txtTextField);
		txtTextField.setColumns(10);
		
		titleTextField = new JTextField();
		titleTextField.setText("Type title..");
		titleTextField.setBounds(332, 73, 86, 20);
		panel.add(titleTextField);
		titleTextField.setColumns(10);
		
		JPanel membersPanel = new JPanel();
		membersPanel.setBounds(10, 178, 216, 257);
		contentPane.add(membersPanel);
		membersPanel.setLayout(null);
		
		JLabel membersTitle = new JLabel("           GROUP MEMBERS");
		membersTitle.setBounds(23, 11, 158, 28);
		membersPanel.add(membersTitle);
		
		JLabel member1 = new JLabel("New label");
		member1.setText(g.getGroupMembers().get(0).getNickname());
		member1.setBounds(23, 62, 132, 35);
		membersPanel.add(member1);
		
		JLabel member2 = new JLabel("New label");
		member2.setText(g.getGroupMembers().get(1).getNickname());

		member2.setBounds(23, 106, 132, 35);
		membersPanel.add(member2);
		
		JLabel member3 = new JLabel("New label");
		member3.setText(g.getGroupMembers().get(2).getNickname());

		member3.setBounds(23, 155, 132, 35);
		membersPanel.add(member3);
		
		JPanel outerScrollPanepanel = new JPanel();
		outerScrollPanepanel.setBounds(277, 178, 381, 257);
		contentPane.add(outerScrollPanepanel);
		outerScrollPanepanel.setLayout(new BoxLayout(outerScrollPanepanel, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		outerScrollPanepanel.add(scrollPane);
		
		JPanel displayAreaPanel = new JPanel();
		scrollPane.setViewportView(displayAreaPanel);
		displayAreaPanel.setLayout(new BoxLayout(displayAreaPanel, BoxLayout.Y_AXIS));
		
		if(u.getCreatedContents().size()> 4) {// we hardcoded 4 contents. the last content will be the content we have created with gui and we will display it
			displayAreaPanel.add(u.getCreatedContents().get(u.getCreatedContents().size()-1).convertToPanel());  
		}
		
		for (User grupUyesi : g.getGroupMembers()) {
			for(Content uyeIcerigi : grupUyesi.getCreatedContents()) {
				displayAreaPanel.add(uyeIcerigi.convertToPanel());
				
			}
		}
	}
}
