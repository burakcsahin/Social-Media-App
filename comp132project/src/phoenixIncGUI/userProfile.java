package phoenixIncGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Content;
import models.Group;
import models.PremiumUser;
import models.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

public class userProfile extends JFrame {

	private JPanel contentPane;

	public userProfile(User u) {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 647);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JOptionPane.showMessageDialog(null, "If you are a newly signed up user, please fill in all the information one more time to confirm you are not a bot. If you are an "
				+ "existing user do not notify this message");
		
		JPanel infosPanel = new JPanel();
		infosPanel.setBounds(21, 11, 680, 188);
		contentPane.add(infosPanel);
		infosPanel.setLayout(null);
		
		JLabel pp_1_1 = new JLabel("pp");
		pp_1_1.setBounds(10, 8, 92, 82);
		pp_1_1.setBackground(Color.BLACK);
		pp_1_1.setIcon(u.getDefaultprofilePic());
		infosPanel.add(pp_1_1);
		
		JEditorPane editableLastname = new JEditorPane();
		editableLastname.setBounds(221, 42, 107, 20);
		editableLastname.setText(u.getLastname());
		infosPanel.add(editableLastname);
		
		JLabel lblNewLabel_2_1 = new JLabel(" nickname:");
		lblNewLabel_2_1.setBounds(10, 109, 85, 23);
		lblNewLabel_2_1.setBackground(Color.WHITE);
		infosPanel.add(lblNewLabel_2_1);
		
		JLabel lblName_1_1 = new JLabel(" name:");
		lblName_1_1.setBounds(154, 8, 85, 23);
		lblName_1_1.setBackground(Color.WHITE);
		infosPanel.add(lblName_1_1);
		
		JLabel lblLastname_1_1 = new JLabel("  lastname");
		lblLastname_1_1.setBounds(154, 42, 85, 23);
		lblLastname_1_1.setBackground(Color.WHITE);
		infosPanel.add(lblLastname_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("  age:");
		lblNewLabel_2_1_1_1.setBounds(154, 76, 85, 23);
		lblNewLabel_2_1_1_1.setBackground(Color.WHITE);
		infosPanel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("  mail:");
		lblNewLabel_2_2_1_1.setBounds(159, 109, 85, 23);
		lblNewLabel_2_2_1_1.setBackground(Color.WHITE);
		infosPanel.add(lblNewLabel_2_2_1_1);
		
		JEditorPane editableName = new JEditorPane();
		editableName.setBounds(221, 8, 107, 20);
		editableName.setText(u.getName());
		infosPanel.add(editableName);
		
		JEditorPane editableAge = new JEditorPane();
		editableAge.setBounds(221, 73, 107, 20);
		editableAge.setText(Integer.toString(u.getAge()));
		infosPanel.add(editableAge);
		
		JEditorPane editableMail = new JEditorPane();
		editableMail.setBounds(221, 109, 107, 20);
		editableMail.setText(u.getEmail());
		infosPanel.add(editableMail);
		
		JLabel nickName = new JLabel(u.getNickname());
		nickName.setBounds(10, 134, 68, 27);
		nickName.setBackground(Color.WHITE);
		infosPanel.add(nickName);
		
		JButton btnNewButton = new JButton("Log out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Logging out...");
				dispose();
			}
		});
		btnNewButton.setBounds(581, 8, 89, 23);
		infosPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Account");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.getUserList().remove(u);
				JOptionPane.showMessageDialog(null, "Your Account Has Been Sucessfully Deleted");
				dispose();
			}
		});
		btnNewButton_1.setBounds(547, 154, 123, 23);
		infosPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Return to Homepage");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Returning to Homepage...");
				Hpageyedek hp = new Hpageyedek(u);
				hp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(547, 109, 123, 23);
		infosPanel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Create Group");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(u instanceof PremiumUser) {
					System.out.println(Group.getTotalGroups());

					JOptionPane.showMessageDialog(null, "Creating Group... Group name is: created group. Search it from homepage");
					ArrayList<User> createdGroupUsers= new ArrayList<User>();
					Group gr = new Group("created group", "turkey", "buttonsmashing", createdGroupUsers);
					u.joinGroup(gr);
					gr.setCreator(u);
					System.out.println(Group.getTotalGroups());

					
				}
				else {
					JOptionPane.showMessageDialog(null, "You are not a premium user...");

				}
			}
		});
		btnNewButton_4.setBounds(547, 67, 123, 23);
		infosPanel.add(btnNewButton_4);
		
		JLabel lblType = new JLabel(" type:");
		lblType.setBackground(Color.WHITE);
		lblType.setBounds(154, 158, 85, 23);
		infosPanel.add(lblType);
		
		JLabel lblTypeWritten = new JLabel("standard");
		lblTypeWritten.setBackground(Color.WHITE);
		lblTypeWritten.setText(u.getType());
		lblTypeWritten.setBounds(249, 156, 68, 27);
		infosPanel.add(lblTypeWritten);
		
		JLabel lblFollowers = new JLabel("  followers:");
		lblFollowers.setBackground(Color.WHITE);
		lblFollowers.setBounds(415, 8, 85, 23);
		infosPanel.add(lblFollowers);
		
		JLabel lblFollowerNumber = new JLabel();
		lblFollowerNumber.setText(Integer.toString(u.getUsersFollowed().size()));
		lblFollowerNumber.setBackground(Color.WHITE);
		lblFollowerNumber.setBounds(504, 8, 48, 23);
		infosPanel.add(lblFollowerNumber);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(426, 52, 111, 129);
		infosPanel.add(panel);
		panel.setLayout(null);
		
		JLabel changePP = new JLabel("CHANGE PP");
		changePP.setForeground(Color.RED);
		changePP.setBounds(10, 11, 79, 14);
		panel.add(changePP);
		
		JButton pp1btn = new JButton("PP1");
		pp1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Profile picture changed to picture 1");
				u.setDefaultprofilePic(new ImageIcon("src/Images/Captain Rex.jpg"));
				pp_1_1.setIcon(u.getDefaultprofilePic());

			}
		});
		pp1btn.setBounds(0, 36, 89, 23);
		panel.add(pp1btn);
		
		JButton pp2btn = new JButton("PP2");
		pp2btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Profile picture changed to picture 2");
				u.setDefaultprofilePic(new ImageIcon("src/Images/gs.jpg"));
				pp_1_1.setIcon(u.getDefaultprofilePic());
			}
		});
		pp2btn.setBounds(0, 63, 89, 23);
		panel.add(pp2btn);
		
		JButton pp3btn = new JButton("PP3");
		pp3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Profile picture changed to picture 3");
				u.setDefaultprofilePic(new ImageIcon("src/Images/bman.jpg"));
				pp_1_1.setIcon(u.getDefaultprofilePic());
			}
		});
		pp3btn.setBounds(0, 97, 89, 23);
		panel.add(pp3btn);
		
		JButton savenamebtn = new JButton("SAVE");
		savenamebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u.setName(editableName.getText());
			}
		});
		savenamebtn.setBounds(338, 8, 67, 23);
		infosPanel.add(savenamebtn);
		
		JButton savelastnamebtn = new JButton("SAVE");
		savelastnamebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u.setLastname(editableLastname.getText());
			}
		});
		savelastnamebtn.setBounds(338, 38, 67, 23);
		infosPanel.add(savelastnamebtn);
		
		JButton saveagebtn = new JButton("SAVE");
		saveagebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u.setAge(Integer.parseInt(editableAge.getText()));
			}
		});
		saveagebtn.setBounds(338, 67, 67, 23);
		infosPanel.add(saveagebtn);
		
		JButton savemailbtn = new JButton("SAVE");
		savemailbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u.setEmail(editableMail.getText());
			}
		});
		savemailbtn.setBounds(338, 106, 67, 23);
		infosPanel.add(savemailbtn);
		
		JPanel suggestPanel = new JPanel();
		suggestPanel.setBounds(21, 210, 179, 342);
		contentPane.add(suggestPanel);
		suggestPanel.setLayout(null);
		
		ArrayList<String> suggestableUsers = new ArrayList<String>();
		
			for(User user : User.getUserList()) {
				if(!u.getUsersFollowed().contains(user)) {
					suggestableUsers.add(user.getNickname());
					suggestableUsers.remove(u.getNickname());
				}
			
			}
		JLabel suggestedUser1 = new JLabel("New label");
		suggestedUser1.setText(suggestableUsers.get(0));
		suggestedUser1.setBounds(25, 55, 131, 23);
		suggestPanel.add(suggestedUser1);
		suggestedUser1.setVisible(false);

			
		JLabel suggestedUser2 = new JLabel("New label");
		suggestedUser2.setText(suggestableUsers.get(1));
		suggestedUser2.setBounds(25, 89, 131, 23);
		suggestPanel.add(suggestedUser2);
		suggestedUser2.setVisible(false);

			
		JLabel suggestedUser3 = new JLabel("New label");
		suggestedUser3.setText(suggestableUsers.get(2));
		suggestedUser3.setBounds(25, 126, 131, 23);
		suggestPanel.add(suggestedUser3);
		suggestedUser3.setVisible(false);

		
		JLabel suggestedUser4 = new JLabel("New label");
		suggestedUser4.setText(suggestableUsers.get(3));
		suggestedUser4.setBounds(25, 161, 131, 23);
		suggestPanel.add(suggestedUser4);
		suggestedUser4.setVisible(false);
			
		JLabel suggestedUser5 = new JLabel("New label");
		suggestedUser5.setText(suggestableUsers.get(4));
		suggestedUser5.setBounds(25, 198, 131, 23);
		suggestPanel.add(suggestedUser5);	
		suggestedUser5.setVisible(false);

		
		JButton btnNewButton_3 = new JButton("SUGGEST USERS");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Suggesting 5 users");
				suggestedUser1.setVisible(true);
				suggestedUser2.setVisible(true);
				suggestedUser3.setVisible(true);
				suggestedUser4.setVisible(true);
				suggestedUser5.setVisible(true);

				
				
			}
		});
		ArrayList<String> suggestableGroups = new ArrayList<String>();
		
		for(Group group : Group.getTotalGroups()) {
			if(!group.getGroupMembers().contains(u)) {
				suggestableGroups.add(group.getName());
				
			}
		
		}
		JLabel suggestedGroup1 = new JLabel("New label");
		suggestedGroup1.setBounds(25, 256, 131, 23);
		suggestPanel.add(suggestedGroup1);
		suggestedGroup1.setText(suggestableGroups.get(0));
		suggestedGroup1.setVisible(false);
		
		JLabel suggestedGroup2 = new JLabel("New label");
		suggestedGroup2.setBounds(25, 293, 131, 23);
		suggestPanel.add(suggestedGroup2);
		suggestedGroup2.setText(suggestableGroups.get(1));
		suggestedGroup2.setVisible(false);
		
		
		JButton btnNewButton_3_1 = new JButton("SUGGEST GROUP");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Suggesting 2 groups");
				suggestedGroup1.setVisible(true);
				suggestedGroup2.setVisible(true);
			}
		});
		btnNewButton_3_1.setBounds(10, 222, 159, 23);
		suggestPanel.add(btnNewButton_3_1);
		
	

		
		btnNewButton_3.setBounds(10, 21, 159, 23);
		suggestPanel.add(btnNewButton_3);
		
		JPanel scrollPaneOuterPanel = new JPanel();
		scrollPaneOuterPanel.setBounds(268, 210, 423, 342);
		contentPane.add(scrollPaneOuterPanel);
		scrollPaneOuterPanel.setLayout(new BoxLayout(scrollPaneOuterPanel, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPaneOuterPanel.add(scrollPane);
		
		JPanel displayAreaPanel = new JPanel();
		scrollPane.setViewportView(displayAreaPanel);
		displayAreaPanel.setLayout(new BoxLayout(displayAreaPanel, BoxLayout.Y_AXIS));
				
		if(u.getCreatedContents().size() > 4) { //I know that my user by default created 4 contents. If he also creates 1 more in the hpage I am also adding it to the display area.
			displayAreaPanel.add(u.getCreatedContents().get(u.getCreatedContents().size()-1).convertToPanel());
		}
		
		for (Content ozIcerigim : u.getCreatedContents()) {
			displayAreaPanel.add(ozIcerigim.convertToPanel());
		}
	}
}
