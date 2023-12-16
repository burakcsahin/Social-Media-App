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

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

public class followingProfile extends JFrame {

	private JPanel contentPane;

	public followingProfile(User u, User x) {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 647);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel infosPanel = new JPanel();
		infosPanel.setBounds(10, 0, 717, 170);
		infosPanel.setLayout(null);
		contentPane.add(infosPanel);
		
		JLabel pp_1_1 = new JLabel("pp");
		pp_1_1.setIcon(x.getDefaultprofilePic());
		pp_1_1.setBackground(Color.BLACK);
		pp_1_1.setBounds(3, 11, 92, 82);
		infosPanel.add(pp_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel(" nickname:");
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(10, 110, 85, 23);
		infosPanel.add(lblNewLabel_2_1);
		
		JLabel nickName = new JLabel((String) null);
		nickName.setText(x.getNickname());
		nickName.setBackground(Color.WHITE);
		nickName.setBounds(10, 140, 68, 27);
		infosPanel.add(nickName);
		
		JLabel lblType = new JLabel("type:");
		lblType.setBackground(Color.WHITE);
		lblType.setBounds(208, 98, 85, 23);
		infosPanel.add(lblType);
		
		JLabel lblTypeWritten = new JLabel("");
		lblTypeWritten.setText(x.getType());
		lblTypeWritten.setBackground(Color.WHITE);
		lblTypeWritten.setBounds(313, 96, 68, 27);
		infosPanel.add(lblTypeWritten);
		
		JLabel lblName = new JLabel(" name:");
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(205, 13, 85, 23);
		infosPanel.add(lblName);
		
		JLabel lblLastname = new JLabel("lastname");
		lblLastname.setBackground(Color.WHITE);
		lblLastname.setBounds(208, 53, 85, 23);
		infosPanel.add(lblLastname);
		
		JLabel lblLastnameofX = new JLabel((String) null);
		lblLastnameofX.setText(x.getLastname());
		lblLastnameofX.setBackground(Color.WHITE);
		lblLastnameofX.setBounds(313, 55, 85, 23);
		infosPanel.add(lblLastnameofX);
		
		JLabel lblNameofX = new JLabel((String) null);
		lblNameofX.setText(x.getName());
		lblNameofX.setBackground(Color.WHITE);
		lblNameofX.setBounds(313, 11, 85, 23);
		infosPanel.add(lblNameofX);
		
		JButton unfollowButton = new JButton("UNFOLLOW");
		unfollowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "User unfollowed");
				u.getUsersFollowed().remove(x);
			}
		});
		unfollowButton.setBounds(544, 13, 89, 23);
		infosPanel.add(unfollowButton);
		
		JButton btnNewButton_2 = new JButton("Return to Homepage");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Returning to Homepage...");
				Hpageyedek hp = new Hpageyedek(u);
				hp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(544, 77, 123, 23);
		infosPanel.add(btnNewButton_2);
		
		JPanel friendsGroupsPanel = new JPanel();
		friendsGroupsPanel.setBounds(10, 201, 203, 348);
		contentPane.add(friendsGroupsPanel);
		friendsGroupsPanel.setLayout(null);
		
		JLabel lblFriendsTitle = new JLabel("                     FRIENDS");
		lblFriendsTitle.setBounds(10, 11, 172, 29);
		friendsGroupsPanel.add(lblFriendsTitle);
		
		JLabel lblFriend1 = new JLabel("New label");
		lblFriend1.setText(x.getUsersFollowed().get(0).getNickname());
		lblFriend1.setBounds(10, 61, 89, 29);
		friendsGroupsPanel.add(lblFriend1);
		
		JLabel lblFriend2 = new JLabel("New label");
		lblFriend2.setText(x.getUsersFollowed().get(1).getNickname());
		lblFriend2.setBounds(10, 102, 89, 29);
		friendsGroupsPanel.add(lblFriend2);
		
		JLabel lblFriend3 = new JLabel("New label");
		lblFriend3.setText(x.getUsersFollowed().get(2).getNickname());
		lblFriend3.setBounds(10, 142, 89, 29);
		friendsGroupsPanel.add(lblFriend3);
		
		JLabel lblGroupTitle = new JLabel("             JOINED GROUPS");
		lblGroupTitle.setBounds(10, 182, 172, 29);
		friendsGroupsPanel.add(lblGroupTitle);
		
		JLabel lblJoinedGroupName = new JLabel("New label");		
		lblJoinedGroupName.setText(x.getMemberOfGroups().get(0).getName());
		lblJoinedGroupName.setBounds(10, 222, 89, 29);
		friendsGroupsPanel.add(lblJoinedGroupName);
		
		JPanel outerScrollPanePanel = new JPanel();
		outerScrollPanePanel.setBounds(273, 201, 424, 348);
		contentPane.add(outerScrollPanePanel);
		outerScrollPanePanel.setLayout(new BoxLayout(outerScrollPanePanel, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		outerScrollPanePanel.add(scrollPane);
		
		JPanel displayAreaPanel = new JPanel();
		scrollPane.setViewportView(displayAreaPanel);
		displayAreaPanel.setLayout(new BoxLayout(displayAreaPanel, BoxLayout.Y_AXIS));
		
		for (Content takipedilenIcerigim : x.getCreatedContents()) {
			displayAreaPanel.add(takipedilenIcerigim.convertToPanel());
		}
	}

}
