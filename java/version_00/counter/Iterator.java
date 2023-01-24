package counter;

import java.util.Scanner;

public class Iterator{
	public int run(){
		Scanner in = new Scanner(System.in);
		char userInput;
		Counter counter = new Counter();

		System.out.println("\nEnter + or - to increment or decrement the counter. Press 0 to indicate you have found your shiny.\n");
		
		do{
			System.out.print("+/-: ");
			
			userInput = in.next().charAt(0);

			// input validation
			while((int)userInput < 43 || (int)userInput > 45 || (int)userInput == 44){
				if((int)userInput == 48) break;

				System.out.print("You have entered (" 
								+ userInput + " " + (int)userInput 
								+ ") which is an invalid value please enter + or -: ");

				userInput = in.next().charAt(0);
			}

			if((int)userInput == 43) counter.incrementCounter();
			else if((int)userInput == 45){
				counter.decrementCounter();

				if(counter.getCounter() < 0) counter.setCounter(0);
			} 
		}while((int)userInput != 48);

		System.out.println("Congrats!! Looks like you found your mon! And with only " + counter.getCounter() + " tries.");

		return counter.getCounter();
	}
}