package ui;

import model.Greetings;

import java.util.Scanner;

 public class Main{

 	public static void main(String[] args){
 		greetings();
		//printArgs(String[] args);


 		Scanner reader = new Scanner(System.in);

 		int option;

 		Greetings g = null;

  		do{

	 		System.out.println("\n============================");
	 		System.out.println("\n	BIENVENIDO");
	 		System.out.println("\n============================");	
	 		System.out.println("1. Please type your name and lastname:");
	 		System.out.println("2. Say Hi.");
	 		System.out.println("3. Say Good Morning.");
	 		System.out.println("4. Say Bye.");
	 		System.out.println("5. Exit");
	 		System.out.print("Enter the option you want:");

	        option = Integer.parseInt(reader.nextLine());

	        	switch(option){
	        		case 1: 
	        		System.out.println("Type your name:");
	        		String name = reader.nextLine();
	        		System.out.println("Type your last name:");
	        		String lastName = reader.nextLine();
	        		g = new Greetings(name,lastName);        		
	        		break;
	        		case 2: 
	        			if(g!=null){

	        				System.out.println("\n"+g.sayHi()+"\n");
	        			}else{
	        				System.out.println("Please choose the first option before this.");
	        			}   		 		
	        		break;
	        		case 3:

		        		if(g!=null){

		        				System.out.println("\n"+g.sayGoodMorning()+"\n");
		        			}else{
		        				System.out.println("Please choose the first option before this.");
		        			}
	        		break;
	        		case 4:
		        		if(g!=null){

			        			System.out.println("\n"+g.sayGoodBye()+"\n");
			        		}else{
			        			System.out.println("Please choose the first option before this.");
			        		}
	        		break;
	        		case 5:
	        		System.out.println("Thanks for using the software! Bye Bye motherfucker!!");
	        		break;
	        	}

 		}while(option!=5);

 	}

 	public static void greetings(){
 		Greetings g = new Greetings("David", "Realpe");

 		String hi = g.sayHi();
 		String gm = g.sayGoodMorning();

 		System.out.println(hi);
 		System.out.println(gm);
	}	

	/*public static void printArgs(String[] args){

		System.out.println("The args length is:"+args);


	}*/

 } 
