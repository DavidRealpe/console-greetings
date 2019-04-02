package ui;

import model.Greetings;

 public class Main{

 	public static void main(String[] args){
 		greetings();	

 	}


 	public static void greetings(){
 		Greetings g = new Greetings("David", "Realpe");

 		String hi = g.sayHi();
 		String gm = g.sayGoodMorning();

 		System.out.println(hi);
 		System.out.println(gm);
	}


 	

 } 
