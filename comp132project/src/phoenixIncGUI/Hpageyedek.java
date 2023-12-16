package phoenixIncGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import models.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Hpageyedek extends JFrame {

	private JPanel contentPane;
	private JTextField finderBar;
	private JTextField txtTypeSomething;
	private JTextField txtTitle;

	public Hpageyedek(User u) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 789);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(102, 0, 0));
		contentPane.add(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(300, 400));
		mainPanel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel displayAreaPanel = new JPanel();
		scrollPane.setViewportView(displayAreaPanel);
		displayAreaPanel.setLayout(new BoxLayout(displayAreaPanel, BoxLayout.Y_AXIS));
		
		JPanel northPanel = new JPanel();
		northPanel.setPreferredSize(new Dimension(50, 50));
		mainPanel.add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		finderBar = new JTextField();
		finderBar.setText("Find...");
		northPanel.add(finderBar);
		finderBar.setColumns(10);
		
		JButton btnNewButton = new JButton("FIND");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(User searchedUser : User.getUserList()) {
					if(finderBar.getText().equals(searchedUser.getNickname())) {
						if(!u.getUsersFollowed().contains(searchedUser)) {
							notFollowingProfile nfp = new notFollowingProfile(u, searchedUser);
							nfp.setVisible(true);
							dispose();
						}else if(u.getUsersFollowed().contains(searchedUser)) {
							followingProfile fp = new followingProfile(u, searchedUser);
							fp.setVisible(true);
							dispose();
						}
					}
				}for(Group searchedGroup : Group.getTotalGroups()) {
					if(finderBar.getText().equals(searchedGroup.getName())){
						if(!u.getMemberOfGroups().contains(searchedGroup)) {
							notMemberGroupPage nmgp = new notMemberGroupPage(u, searchedGroup);
							nmgp.setVisible(true);
							dispose();
						}
						else if(u.getMemberOfGroups().contains(searchedGroup)) {
							if(u == searchedGroup.getCreator()) {
								creatorGroup cgp = new creatorGroup(u, searchedGroup);
								cgp.setVisible(true);
								dispose();
							}
							else if (u != searchedGroup.getCreator()) {
								memberGroup mgp = new memberGroup(u, searchedGroup);
								mgp.setVisible(true);
								dispose();
							}
						}
					}
				}
			}
		});
		northPanel.add(btnNewButton);
		
		txtTypeSomething = new JTextField();
		txtTypeSomething.setText("Type something");
		northPanel.add(txtTypeSomething);
		txtTypeSomething.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("POST");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 
		        String today = "27/05/2022";
				Content hpcreatedc = new Content(txtTitle.getText(), today ,u.getName()+" "+u.getLastname()+" "+u.getNickname(),txtTypeSomething.getText());
				JOptionPane.showMessageDialog(null, "Post published look at your profile");
				u.getCreatedContents().add(hpcreatedc);
			}
		});
		
		txtTitle = new JTextField();
		txtTitle.setText("Type title");
		northPanel.add(txtTitle);
		txtTitle.setColumns(10);
		northPanel.add(btnNewButton_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		northPanel.add(horizontalStrut);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		northPanel.add(horizontalStrut_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		northPanel.add(horizontalStrut_2);
		
		JButton btnNewButton_3 = new JButton("MY PROFILE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Going to your profile...");
				userProfile up = new userProfile(u);
				up.setVisible(true);
				dispose();
			}
		});
		northPanel.add(btnNewButton_3);
		
		
		//just some colored areas
		JPanel westPanel = new JPanel();
		westPanel.setBackground(new Color(0, 0, 102));
		westPanel.setPreferredSize(new Dimension(80,80));
		mainPanel.add(westPanel, BorderLayout.WEST);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(new Color(0, 0, 102));
		eastPanel.setPreferredSize(new Dimension(80,80));
		mainPanel.add(eastPanel, BorderLayout.EAST);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(new Color(0, 0, 102));
		southPanel.setPreferredSize(new Dimension(80,80));
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		
		for (User takipedilen : u.getUsersFollowed()) {
			for (Content icerik : takipedilen.getCreatedContents()) {
				displayAreaPanel.add(icerik.convertToPanel());
			}
		}
	}
}
