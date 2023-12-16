package models;

import java.util.ArrayList;

import javax.swing.ImageIcon;
public abstract class User {
	private final String nickname;
	private String password;
	private String name;
	private String lastname;
	private int age;
	private String email;
	private static ArrayList<User> userList = new ArrayList<User>();
	private ArrayList<Content> createdContents = new ArrayList<Content>();
	private ArrayList<String> hobbies;
	private String hobby;
	private ImageIcon defaultprofilePic = new ImageIcon("src/phoenixIncGUI/Phoenix.png"); 
	private String country;
	private ArrayList<Group> memberOfGroups;
	
	private ArrayList<User> usersFollowed = new ArrayList<User>();
	
	//constructor
	public User(String nickname, String password, String name, String lastname, int age, String email, String country) {
		this.nickname = nickname;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
		this.country = country;
		
		userList.add(this);
		this.hobbies = new ArrayList<String>();
		hobbies.add(this.hobby);
		
		this.memberOfGroups = new ArrayList<Group>();
	}

	
	//getters and setters
	
	public  ArrayList<Content> getCreatedContents() {
		return createdContents;
	}
	public ArrayList<Group> getMemberOfGroups() {
		return memberOfGroups;
	}

	public void setMemberOfGroups(ArrayList<Group> memberOfGroups) {
		this.memberOfGroups = memberOfGroups;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public  void setCreatedContents(ArrayList<Content> createdContents) {
		this.createdContents = createdContents;
	}
	public ImageIcon getDefaultprofilePic() {
		return defaultprofilePic;
	}
	public void setDefaultprofilePic(ImageIcon defaultprofilePic) {
		this.defaultprofilePic = defaultprofilePic;
	}
	
	public static void setUserList(ArrayList<User> userList) {
		User.userList = userList;
	}
	public static ArrayList<User> getUserList() {
		return userList;
	}
	public String getNickname() {
		return nickname;
	}

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	

	public  ArrayList<User> getUsersFollowed() {
		return usersFollowed;
	}

	public  void setUsersFollowed(ArrayList<User> usersFollowed) {
		this.usersFollowed = usersFollowed;
	}

	
	public void createContent(User this, String title, String creationTime, String text) {
		
		Content c = new Content(title, creationTime, this.getName() +" "+ this.getLastname() +" "+ this.getNickname(), text);
		createdContents.add(c);
	}
	public void deleteContent(Content c) {
		if(createdContents.contains(c)) {
		createdContents.remove(c);
		}
	}
	
	
	
	public void followUser(User a) {
		usersFollowed.add(a);
	}
	public void unfollowUser(User a) {
		if(usersFollowed.contains(a)) {
		usersFollowed.remove(a);
		}
	}
	
	
	public void joinGroup(Group g) {
		g.getGroupMembers().add(this);
		this.memberOfGroups.add(g);
	}
	public void leaveGroup(Group g) {
		if(g.getGroupMembers().contains(this)) {
			g.getGroupMembers().remove(this);
			this.memberOfGroups.remove(g);
		}
	}
	public String searchContent(Content c) {
		return c.getTitle();
	}
	
	
	public void deleteAccount() {
		userList.remove(this);
	}
	
	public void suggestFriends(User u) {
		u.getNickname();
	}
	public void suggestGroups(Group g) {
		g.getName();
	}


	public abstract String getType();
	
}
