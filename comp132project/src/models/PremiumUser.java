package models;

import java.util.ArrayList;

public class PremiumUser extends User{
	private final String type = "Premium";
	private ArrayList<Group> grouplist; 

	public PremiumUser(String nickname, String password, String name, String lastname, int age, String email, String country) {
		super(nickname, password, name, lastname, age, email, country);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType() {
		return type;
	}
	
	public ArrayList<Group> getGrouplist() {
		return grouplist;
	}

	public void setGrouplist(ArrayList<Group> grouplist) {
		this.grouplist = grouplist;
	}

	public void createGroup(String name, String country, String hobbies, ArrayList<User> gmembers) {
		Group g = new Group(name, country, hobbies, gmembers);
		grouplist.add(g);
	}
	public void deleteGroup(Group g) {
		if(this.grouplist.contains(g)) {
			this.grouplist.remove(g);
		}
	}
	
	public void rmvUserfromGroup(Group g, User u) {
		if(g.getGroupMembers().contains(u.getNickname())) {
			g.getGroupMembers().remove(u.getNickname());
		}
	}
	
	
}
