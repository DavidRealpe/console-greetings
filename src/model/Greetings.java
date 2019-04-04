package model;

public class Greetings{

	private String name;
	private String lastName;

	public Greetings(String name, String lastName){
		this.name = name;
		this.lastName = lastName;
	}

	public String sayHi(){
		return "Hello "+name+" :3";
	}

	public String sayGoodMorning(){
		return "Good Morning "+name+" "+lastName;
	}

	public String sayGoodBye(){
		return "Good Bye "+lastName;
	}

}