package models;

import java.util.ArrayList;

public class Group {
	//Each group has a name, country it is based on, and hobbies as specified	by the group creator.
	private String name;
	private String country;
	private String hobbies;
	private ArrayList<User> groupMembers;
	private ArrayList<Content> contentsPosted;
	private static ArrayList<Group> totalGroups; 
	private User creator;
	
	public Group(String name, String country, String hobbies, ArrayList<User> groupMembers) {
		super();
		this.name = name;
		this.country = country;
		this.hobbies = hobbies;
		this.groupMembers = groupMembers;
		groupMembers = new ArrayList<User>();
		
		contentsPosted = new ArrayList<Content>();
		totalGroups = new ArrayList<Group>();
		totalGroups.add(this);
	}
	
	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public static ArrayList<Group> getTotalGroups() {
		return totalGroups;
	}

	public static void setTotalGroups(ArrayList<Group> totalGroups) {
		Group.totalGroups = totalGroups;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public ArrayList<User> getGroupMembers() {
		return groupMembers;
	}
	public void setGroupMembers(ArrayList<User> groupMembers) {
		this.groupMembers = groupMembers;
	}

	public  ArrayList<Content> getContentsPosted() {
		return contentsPosted;
	}

	public  void setContentsPosted(ArrayList<Content> contentsPosted) {
		this.contentsPosted = contentsPosted;
	}
	
	
}
