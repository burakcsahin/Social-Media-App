package models;

public class StandartUser extends User{
	private final String type= "Standart";

	public StandartUser(String nickname, String password, String name, String lastname, int age, String email, String country) {
		super(nickname, password, name, lastname, age, email, country);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType() {
		return type;
	}
	
}
