package game.controller;

import java.util.Scanner;

public class GameController
{
	private String choice, monster;

	int dice1;
	int dice2;
	
	public void adventure()
	{
		System.out.println(" Welcome to your new adventure!!");
		System.out.println(" ");
		System.out.println(" You wake up in a dimmly lit house: there seems to be a path going north");
		System.out.print("> ");
		Scanner inputScanner = new Scanner(System.in);
		String answer = inputScanner.nextLine();
	
	  if (answer.equalsIgnoreCase("go north"))
		{
			System.out.println(" ");
			System.out.println("You walk down the hallway to see kitchen with long coutner top with dirty dishes all over it. ");
			System.out.println("There also seems to be pantry with something in it");
			System.out.print("> ");
			choice = inputScanner.nextLine();
		}
		
/*	  if (choice.equalsIgnoreCase("open refrigerator"))
		{
			System.out.println("You open the frigde");
			System.out.println("There seems to be some fruit, it looks old and modly but is seems to be the only edible thing to eat.");
			System.out.println("do you wish to eat the food?");
			System.out.println(">");
			food = inputScanner.nextLine();
*/		
	  
		if (choice.equalsIgnoreCase("open pantry"))
		{
			System.out.println("");
			System.out.println("As you open the pantry a monster you see a monster inside ready to attack.");
			System.out.println("what do you do?");
			System.out.print("> ");
			monster =  inputScanner.nextLine();
		}
		
		 if (monster.equalsIgnoreCase("run away"))
			{
				System.out.println("As you try and run away the monster chatches up with you and kills you!");
				System.out.println("Try agian");
			}
		
		else if (monster.equalsIgnoreCase("attack monster"))
		{
			double dice1 = (Math.random()*6+1);
			double dice2 = (Math.random()*6+1);
			if(dice1 < dice2)
			{
				System.out.println("You were unsuccessful in attacking in the monster and you are defeated");
				System.out.println("Try again");

			}
			else if(dice1 > dice2)
			{
				System.out.println("You were successful in defeating the monster");
				System.out.println("The front door makes a clicking sound and you are able to leave");
				System.out.println("You win!!!");
			}
	
		}

		inputScanner.close();	
	}
	
	public void start()
	{
		adventure();
	}
	
}
