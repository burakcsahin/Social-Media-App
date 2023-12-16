package test;


import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import models.Content;
import models.Group;
import models.PremiumUser;
import models.StandartUser;
import models.User;
import phoenixIncGUI.LoginScreenGUI;


/* Pledge of Honor *************************************************************************************
I hereby certify that I have completed this programming project on my own without any help from
anyone else. The effort in the project thus belongs completely to me. I did not search for a
solution, or I did not consult to any program written by others or did not copy any program from
other sources. I read and followed the guidelines provided in the project description.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Burak Can Sahin, 76824>
************************************************************************************************************/

public class testing {

public static void main(String[] args) {
	
	//Premium user creations and their contents
	
	PremiumUser bcs = new PremiumUser("(bcs)", "123", "burak can", "sahin", 19, "bcsahin02@outlook.com", "Turkey");
	PremiumUser ack = new PremiumUser("(ack)", "321", "alican", "kandemir", 19, "telifyedi@gmail.com", "Turkey");
	PremiumUser cj = new PremiumUser("(cj)", "1313", "cansin", "bulut", 21, "budatelifli@gmail.com", "Turkey");
	PremiumUser god = new PremiumUser("(god)", "2022", "gok", "tengri", 99, "godlistens@gmail.com", "Turkey");
	
	Content bcsC1 = new Content("My first post", "5/05/2022", bcs.getName()+ " "+ bcs.getLastname()+ " "+ bcs.getNickname(), " This is my first post and I do not know what to write I am tired.");
	bcsC1.setImage(new ImageIcon("src/Images/baklava.jpg"));
	Content bcsC2 = new Content("My feelings about today", "5/05/2022", bcs.getName()+ " "+ bcs.getLastname()+ " "+ bcs.getNickname(), " It is raining and mood killing.");
	Content bcsC3 = new Content("Azicik da turkce", "4/05/2022", bcs.getName()+ " "+ bcs.getLastname()+ " "+ bcs.getNickname(), " Ben turkce bilmeyen");
	Content bcsC4 = new Content("Supremich Deutsch", "4/05/2022", bcs.getName()+ " "+ bcs.getLastname()+ " "+ bcs.getNickname(), " NEIN!!.");
	bcs.getCreatedContents().add(bcsC1);
	bcs.getCreatedContents().add(bcsC2);
	bcs.getCreatedContents().add(bcsC3);
	bcs.getCreatedContents().add(bcsC4);

	
	Content ackC1 = new Content("VINN VINNN", "4/05/2022",  ack.getName()+ " "+ ack.getLastname()+ " "+ ack.getNickname(), " Onun arabasi var.");
	ackC1.setImage(new ImageIcon("src/Images/rx7.jpg"));
	Content ackC2 = new Content("Excellento Title", "4/05/2022",  ack.getName()+ " "+ ack.getLastname()+ " "+ ack.getNickname(), " I feel good.");
	Content ackC3 = new Content("Hayatin anlami", "3/05/2022",  ack.getName()+ " "+ ack.getLastname()+ " "+ ack.getNickname(), " bilmem nedir sizce?");
	Content ackC4 = new Content("Gurbetci RP", "3/05/2022",  ack.getName()+ " "+ ack.getLastname()+ " "+ ack.getNickname(), " Ich mochte baklava papa !!.");
	ack.getCreatedContents().add(ackC1);
	ack.getCreatedContents().add(ackC2);
	ack.getCreatedContents().add(ackC3);
	ack.getCreatedContents().add(ackC4);

	
	Content cjC1 = new Content("GTA ", "3/05/2022",   cj.getName()+ " "+ cj.getLastname()+ " "+ cj.getNickname(), " My favorite GTA game is San Andreas.");
	cjC1.setImage(new ImageIcon("src/Images/gtasa.jpg"));
	Content cjC2 = new Content("Title is cool", "3/05/2022",   cj.getName()+ " "+ cj.getLastname()+ " "+ cj.getNickname(), " I feel happy");
	Content cjC3 = new Content(" Star Wars Quote", "2/05/2022",   cj.getName()+ " "+ cj.getLastname()+ " "+ cj.getNickname(), " Do or do not, there is no try");
	Content cjC4 = new Content("Nasilsiniz?", "2/05/2022",   cj.getName()+ " "+ cj.getLastname()+ " "+ cj.getNickname(), " CSGO gelecekler bu postu begensin");
	cj.getCreatedContents().add(cjC1);
	cj.getCreatedContents().add(cjC2);
	cj.getCreatedContents().add(cjC3);
	cj.getCreatedContents().add(cjC4);


	Content godC1 = new Content("Turkish coffee", "2/05/2022",   god.getName()+ " "+ god.getLastname()+ " "+ god.getNickname(), " En iyi kahve");
	godC1.setImage(new ImageIcon("src/Images/kahve.jpg"));
	Content godC2 = new Content("Whether report", "2/05/2022",   god.getName()+ " "+ god.getLastname()+ " "+ god.getNickname(), " Ask michael");
	Content godC3 = new Content("Heaven?", "1/05/2022",   god.getName()+ " "+ god.getLastname()+ " "+ god.getNickname(), " To be or not to be");
	Content godC4 = new Content("Armageddon", "1/05/2022",   god.getName()+ " "+ god.getLastname()+ " "+ god.getNickname(), " Most beautiful music you will ever hear will start");
	god.getCreatedContents().add(godC1);
	god.getCreatedContents().add(godC2);
	god.getCreatedContents().add(godC3);
	god.getCreatedContents().add(godC4);

	
	//Standart user creations and their contents

	StandartUser fakir1 = new StandartUser("fakir1", "fakir1", "fakir", "1", 20, "fakir1@mail.com","Turkey");
	StandartUser fakir2 = new StandartUser("fakir2", "fakir2", "fakir", "2", 20, "fakir2@mail.com","Turkey");
	StandartUser fakir3 = new StandartUser("fakir3", "fakir3", "fakir", "3", 20, "fakir3@mail.com","Turkey");
	StandartUser fakir4 = new StandartUser("fakir4", "fakir4", "fakir", "4", 20, "fakir4@mail.com","Turkey");
	StandartUser fakir5 = new StandartUser("fakir5", "fakir5", "fakir", "5", 20, "fakir5@mail.com","Turkey");
	StandartUser fakir6 = new StandartUser("fakir6", "fakir6", "fakir", "6", 20, "fakir6@mail.com","Turkey");
	StandartUser fakir7 = new StandartUser("fakir7", "fakir7", "fakir", "7", 20, "fakir7@mail.com","Turkey");
	StandartUser fakir8 = new StandartUser("fakir8", "fakir8", "fakir", "8", 20, "fakir8@mail.com","Turkey");
	
	
	Content fakir1C1 = new Content("Fakir1 Post1", "4/05/2022",   fakir1.getName()+ " " + fakir1.getLastname()+ " " + fakir1.getNickname(), "Post no 1 Photo Post");
	fakir1C1.setImage(new ImageIcon("src/Images/bruh.png"));
	Content fakir1C2 = new Content("Fakir1 Post2", "4/05/2022",   fakir1.getName()+" "  + fakir1.getLastname()+" "  + fakir1.getNickname(), "Post no 2 ");
	Content fakir1C3 = new Content("Fakir1 Post3", "3/05/2022",   fakir1.getName()+" "  + fakir1.getLastname()+" "  + fakir1.getNickname(), "Post no 3 ");
	Content fakir1C4 = new Content("Fakir1 Post4", "3/05/2022",   fakir1.getName()+" "  + fakir1.getLastname()+" "  + fakir1.getNickname(), "Post no 4");
	fakir1.getCreatedContents().add(fakir1C1);
	fakir1.getCreatedContents().add(fakir1C2);
	fakir1.getCreatedContents().add(fakir1C3);
	fakir1.getCreatedContents().add(fakir1C4);
	
	Content fakir2C1 = new Content("Fakir2 Post1", "3/05/2022",   fakir2.getName()+" "  + fakir2.getLastname()+" "  + fakir2.getNickname(), "Post no 1 Photo Post");
	fakir2C1.setImage(new ImageIcon("src/Images/gtasa.jpg"));
	Content fakir2C2 = new Content("Fakir2 Post2", "3/05/2022",   fakir2.getName()+" "  + fakir2.getLastname()+" "  + fakir2.getNickname(), "Post no 2 ");
	Content fakir2C3 = new Content("Fakir3 Post3", "2/05/2022",   fakir2.getName()+" "  + fakir2.getLastname()+" "  + fakir2.getNickname(), "Post no 3 ");
	Content fakir2C4 = new Content("Fakir4 Post4", "2/05/2022",   fakir2.getName()+" "  + fakir2.getLastname()+" "  + fakir2.getNickname(), "Post no 4");
	fakir2.getCreatedContents().add(fakir2C1);
	fakir2.getCreatedContents().add(fakir2C2);
	fakir2.getCreatedContents().add(fakir2C3);
	fakir2.getCreatedContents().add(fakir2C4);
	
	Content fakir3C1 = new Content("Fakir3 Post1", "2/05/2022",   fakir3.getName()+" "  + fakir3.getLastname()+" "  + fakir3.getNickname(), "Post no 1 Photo Post");
	fakir3C1.setImage(new ImageIcon("src/Images/tedx.jpg"));
	Content fakir3C2 = new Content("Fakir3 Post2", "2/05/2022",   fakir3.getName()+" "  + fakir3.getLastname()+" "  + fakir3.getNickname(), "Post no 2 ");
	Content fakir3C3 = new Content("Fakir3 Post3", "1/05/2022",   fakir3.getName()+" "  + fakir3.getLastname()+" "  + fakir3.getNickname(), "Post no 3 ");
	Content fakir3C4 = new Content("Fakir3 Post4", "1/05/2022",   fakir3.getName()+" "  + fakir3.getLastname()+" "  + fakir3.getNickname(), "Post no 4");
	fakir3.getCreatedContents().add(fakir3C1);
	fakir3.getCreatedContents().add(fakir3C2);
	fakir3.getCreatedContents().add(fakir3C3);
	fakir3.getCreatedContents().add(fakir3C4);
	
	
	Content fakir4C1 = new Content("Fakir4 Post1", "1/05/2022",   fakir4.getName()+" "  + fakir4.getLastname()+" "  + fakir4.getNickname(), "Post no 1 Photo Post");
	fakir4C1.setImage(new ImageIcon("src/Images/rx7.jpg"));
	Content fakir4C2 = new Content("Fakir4 Post2", "1/05/2022",   fakir4.getName()+" "  + fakir4.getLastname()+" "  + fakir4.getNickname(), "Post no 2 ");
	Content fakir4C3 = new Content("Fakir4 Post3", "1/05/2022",   fakir4.getName()+" "  + fakir4.getLastname()+" "  + fakir4.getNickname(), "Post no 3 ");
	Content fakir4C4 = new Content("Fakir4 Post4", "1/05/2022",   fakir4.getName()+" "  + fakir4.getLastname()+" "  + fakir4.getNickname(), "Post no 4");
	fakir4.getCreatedContents().add(fakir4C1);
	fakir4.getCreatedContents().add(fakir4C2);
	fakir4.getCreatedContents().add(fakir4C3);
	fakir4.getCreatedContents().add(fakir4C4);
	
	Content fakir5C1 = new Content("Fakir5 Post1", "1/05/2022",   fakir5.getName()+" "  + fakir5.getLastname()+" "  + fakir5.getNickname(), "Post no 1 Photo Post");
	fakir5C1.setImage(new ImageIcon("src/Images/gs.jpg"));
	Content fakir5C2 = new Content("Fakir5 Post2", "1/05/2022",   fakir5.getName()+" "  + fakir5.getLastname()+" "  + fakir5.getNickname(), "Post no 2 ");
	Content fakir5C3 = new Content("Fakir5 Post3", "1/05/2022",   fakir5.getName()+" "  + fakir5.getLastname()+" "  + fakir5.getNickname(), "Post no 3 ");
	Content fakir5C4 = new Content("Fakir5 Post4", "1/05/2022",   fakir5.getName()+" "  + fakir5.getLastname()+" "  + fakir5.getNickname(), "Post no 4");
	fakir5.getCreatedContents().add(fakir5C1);
	fakir5.getCreatedContents().add(fakir5C2);
	fakir5.getCreatedContents().add(fakir5C3);
	fakir5.getCreatedContents().add(fakir5C4);
	
	
	Content fakir6C1 = new Content("Fakir6 Post1", "1/05/2022",   fakir6.getName()+" "  + fakir6.getLastname()+" "  + fakir6.getNickname(), "Post no 1 Photo Post");
	fakir6C1.setImage(new ImageIcon("src/Images/cadillac.jpg"));
	Content fakir6C2 = new Content("Fakir6 Post2", "1/05/2022",   fakir6.getName()+" "  + fakir6.getLastname()+" "  + fakir6.getNickname(), "Post no 2 ");
	Content fakir6C3 = new Content("Fakir6 Post3", "1/05/2022",   fakir6.getName()+" "  + fakir6.getLastname()+" "  + fakir6.getNickname(), "Post no 3 ");
	Content fakir6C4 = new Content("Fakir6 Post4", "1/05/2022",   fakir6.getName()+" "  + fakir6.getLastname()+" "  + fakir6.getNickname(), "Post no 4");
	fakir6.getCreatedContents().add(fakir6C1);
	fakir6.getCreatedContents().add(fakir6C2);
	fakir6.getCreatedContents().add(fakir6C3);
	fakir6.getCreatedContents().add(fakir6C4);
	
	
	Content fakir7C1 = new Content("Fakir7 Post1", "1/05/2022",   fakir7.getName()+" "  + fakir7.getLastname()+" "  + fakir7.getNickname(), "Post no 1 Photo Post");
	fakir7C1.setImage(new ImageIcon("src/Images/nwing.jpg"));
	Content fakir7C2 = new Content("Fakir7 Post2", "1/05/2022",   fakir7.getName()+" "  + fakir7.getLastname()+" "  + fakir7.getNickname(), "Post no 2 ");
	Content fakir7C3 = new Content("Fakir7 Post3", "1/05/2022",   fakir7.getName()+" "  + fakir7.getLastname()+" "  + fakir7.getNickname(), "Post no 3 ");
	Content fakir7C4 = new Content("Fakir7 Post4", "1/05/2022",   fakir7.getName()+" "  + fakir7.getLastname()+" "  + fakir7.getNickname(), "Post no 4");
	fakir7.getCreatedContents().add(fakir7C1);
	fakir7.getCreatedContents().add(fakir7C2);
	fakir7.getCreatedContents().add(fakir7C3);
	fakir7.getCreatedContents().add(fakir7C4);
	
	
	Content fakir8C1 = new Content("Fakir8 Post1", "1/05/2022",   fakir8.getName()+" "  + fakir8.getLastname()+" "  + fakir8.getNickname(), "Post no 1 Photo Post");
	fakir8C1.setImage(new ImageIcon("src/Images/Gtr.jpg"));
	Content fakir8C2 = new Content("Fakir8 Post2", "1/05/2022",   fakir8.getName()+" "  + fakir8.getLastname()+" "  + fakir8.getNickname(), "Post no 2 ");
	Content fakir8C3 = new Content("Fakir8 Post3", "1/05/2022",   fakir8.getName()+" "  + fakir8.getLastname()+" "  + fakir8.getNickname(), "Post no 3 ");
	Content fakir8C4 = new Content("Fakir8 Post4", "1/05/2022",   fakir8.getName()+" "  + fakir8.getLastname()+" "  + fakir8.getNickname(), "Post no 4");
	fakir8.getCreatedContents().add(fakir8C1);
	fakir8.getCreatedContents().add(fakir8C2);
	fakir8.getCreatedContents().add(fakir8C3);
	fakir8.getCreatedContents().add(fakir8C4);
	
	
	//Following each other
	
	bcs.followUser(ack);
	bcs.followUser(cj);
	bcs.followUser(god);
	
	
	ack.followUser(bcs);
	ack.followUser(cj);
	ack.followUser(god);
	
	cj.followUser(bcs);
	cj.followUser(ack);
	cj.followUser(god);
	
	god.followUser(bcs);
	god.followUser(ack);
	god.followUser(cj);
	
	fakir1.followUser(fakir2);
	fakir1.followUser(fakir3);
	fakir1.followUser(fakir4);
	
	fakir2.followUser(fakir1);
	fakir2.followUser(fakir3);
	fakir2.followUser(fakir4);
	
	fakir3.followUser(fakir1);
	fakir3.followUser(fakir2);
	fakir3.followUser(fakir4);
	
	fakir4.followUser(fakir1);
	fakir4.followUser(fakir2);
	fakir4.followUser(fakir3);
	
	fakir5.followUser(fakir6);
	fakir5.followUser(fakir7);
	fakir5.followUser(fakir8);
	
	fakir6.followUser(fakir5);
	fakir6.followUser(fakir7);
	fakir6.followUser(fakir8);
	
	fakir7.followUser(fakir5);
	fakir7.followUser(fakir6);
	fakir7.followUser(fakir8);
	
	fakir8.followUser(fakir5);
	fakir8.followUser(fakir6);
	fakir8.followUser(fakir7);

	//Creating groups
	
	ArrayList<User> bcsmemberList = new ArrayList<User>();
	ArrayList<User> ackmemberList = new ArrayList<User>();
	ArrayList<User> cjmemberList = new ArrayList<User>();
	ArrayList<User> godmemberList = new ArrayList<User>();

	
	Group bcsgrp = new Group("BCS GRUP","Turkey", "Gaming", bcsmemberList);
	bcsgrp.setCreator(bcs);
	bcs.joinGroup(bcsgrp);
	fakir1.joinGroup(bcsgrp);
	fakir2.joinGroup(bcsgrp);
	
	Group ackgrp = new Group("ACK GRUP","Turkey", "Cars, Football", ackmemberList);
	ackgrp.setCreator(ack);
	ack.joinGroup(ackgrp);
	fakir3.joinGroup(ackgrp);
	fakir4.joinGroup(ackgrp);
	
	Group cjgrp = new Group("CJ GRUP","Turkey", "English", cjmemberList);
	cjgrp.setCreator(cj);
	cj.joinGroup(cjgrp);
	fakir5.joinGroup(cjgrp);
	fakir6.joinGroup(cjgrp);
	
	Group godgrp = new Group("GOD GRUP","Universe", "Philosophy", godmemberList);
	godgrp.setCreator(god);
	god.joinGroup(godgrp);
	fakir7.joinGroup(godgrp);
	fakir8.joinGroup(godgrp);
	
	
Group.getTotalGroups().add(bcsgrp);
Group.getTotalGroups().add(ackgrp);
Group.getTotalGroups().add(cjgrp);
Group.getTotalGroups().add(godgrp);

	
	
	
	LoginScreenGUI l = new LoginScreenGUI(bcs);
	l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	l.setVisible(true);
	
}
}
