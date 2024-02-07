/*
 * Class: CMSC203 CRN: 30340
 * Instructor: Professor Khandan 
 * 
 * Description: The ESP (Extrasensory Perception) game is a simple guessing game where the player 
 * tries to guess the color that the computer is thinking of. The game proceeds as follows:
	The player is prompted to enter their name, a description of themselves, and the due date.
	The computer randomly selects a color from a predefined list of colors.
	The player is asked to guess the color that the computer is thinking of.
	If the player's guess matches the computer's chosen color, the player earns a point.
	This process is repeated for a total of 11 rounds.
	After 11 rounds, the game displays the total number of correct guesses made by the player.
	The game also displays the player's name, description, and due date.
	The objective of the game is for the player to correctly guess as many colors as possible out of the 11 rounds.

 * Due: 2/6/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
*  independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Dave| Dawit Hailu
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args) {
		
	// declaration and initialization
	String fullName, 
			discription,
			dueDate, color,
			guesedcolor;
			
	final String COLOR1="Red", COLOR2="Green",
				 COLOR3="Blue", COLOR4="Orage",
				 COLOR5="Yellow",COLOR6="Black",
				 COLOR7="Pink";
	int total=0;
	
	boolean flag;
	
	// opening a scanner
	Scanner input= new Scanner(System.in);
	
	// prompting and getting input from the user
	System.out.println("Enter your name: ");
	fullName=input.nextLine();
	
	System.out.println("Dscribe yourself: ");
	discription=input.nextLine();
	
	System.out.println("Due Date: ");
	dueDate=input.nextLine();
	
	System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		/*opening loop
			prompting and getting input
			decision making
			*/
	for(int repeat=0; repeat<11; repeat++){
			
		System.out.println("Round "+(repeat+1));
		
		// makes random number from 0-7
	    Random randomNumber = new Random();
	
	    int number=randomNumber.nextInt(7);
	    
	    
		System.out.println("\nI am thinkig of a color.\nIs it Red, Green, Blue, Orange,"
				+ " or Yellow?\nEnter your guess: ");
		
		color=input.nextLine();
		color = Character.toUpperCase(color.charAt(0)) + color.substring(1);
	
		switch (number){
			
			case 0:
				guesedcolor=COLOR1;
				break;
			case 1:
				guesedcolor=COLOR2;
				break;
			case 2:
				guesedcolor=COLOR3;
				break;
			case 3:
				guesedcolor=COLOR4;
				break;
			case 4:
				guesedcolor=COLOR5;
				break;
			case 5:
				guesedcolor=COLOR6;
				break;
			case 6:
				guesedcolor=COLOR7;
				break;
			default:
				guesedcolor="wrong thought";
				
					
			
			
		}
		
		flag=(COLOR1.equals(color)|| COLOR2.equals(color)||COLOR3.equals(color)||
                COLOR4.equals(color)||COLOR5.equals(color)||COLOR6.equals(color)||
                COLOR7.equals(color));
		
		
		if (flag) {
			
			System.out.println("\nI was thinking of "+ guesedcolor +".\n");
			
			if(guesedcolor.equals(color)) {
			total+=1;
			
			}
			
		}
		
		else {
			
			while(flag!=true) {
				
			System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?\r\n"
					+ "Enter your guess again: \r\n");
			color=input.nextLine();
			
			flag=(COLOR1.equals(color)|| COLOR2.equals(color)||COLOR3.equals(color)||
	                COLOR4.equals(color)||COLOR5.equals(color));
			}
			
			System.out.println("\nI was thinking of "+ guesedcolor +".");
			
		}
		
		}
		
	// display result and user info
	System.out.println("Game Over!\r\n");
	
	System.out.println("You guessed "+ total +" out of 11 colors correctly.");
	
	System.out.println(" Student Name: "+fullName+
			"\nUser Description: "+discription+"\n"+"Due Date: " +dueDate);

	System.out.println("\nProgramer: Dave| Dawit Hailu");
	}

}
