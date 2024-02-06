/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
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
					 COLOR5="Yellow";
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
		
		/* opening loop
			prompting and getting input
			decision making
			*/
		for(int repeat=0; repeat<11; repeat++){
			
		System.out.println("Round "+(repeat+1));
		
	    Random randomNumber = new Random();
	    int number=randomNumber.nextInt(6);
	    System.out.println(number);
	    
		System.out.println("I am thinkig of a color.\nIs it Red, Green, Blue, Orange,"
				+ " or Yellow?\nEnter your guess:\n");
		
		color=input.nextLine();
		
		switch (number){
			
			case 1:
				guesedcolor=COLOR1;
				break;
			case 2:
				guesedcolor=COLOR2;
				break;
			case 3:
				guesedcolor=COLOR3;
				break;
			case 4:
				guesedcolor=COLOR4;
				break;
			case 5:
				guesedcolor=COLOR5;
				break;
				
				default:
					guesedcolor="wrong color";
					
			
		}
		
		flag=(COLOR1.equals(color)|| COLOR2.equals(color)||COLOR3.equals(color)||
                COLOR4.equals(color)||COLOR5.equals(color));
		
		System.out.println(flag);
		
		if (flag) {
			
			System.out.println("\nI was thinking of "+ guesedcolor +".\n");
			
			total+=1;
			
		}else {
			
			while(flag!=true) {
				
			System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?\r\n"
					+ "Enter your guess again: \r\n");
			color=input.nextLine();
			
			flag=(COLOR1.equals(color)|| COLOR2.equals(color)||COLOR3.equals(color)||
	                COLOR4.equals(color)||COLOR5.equals(color));
			}
			
			System.out.println("\nI was thinking of "+ guesedcolor +".\n");
			
		}
		
		}
		
		// display result and user info
			System.out.println("Game Over\r\n");
			
			System.out.println("You guessed "+ total +" out of 11 colors correctly.");
			
			System.out.println(" Student Name: "+fullName+
					"User Description: "+discription+"\n"+"Due Date: " +dueDate);

	
	}

}
