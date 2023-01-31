import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import counter.Iterator;

import pokemon.Pokemon;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		FileWriter fw = null;

		String choice = null;

		System.out.print("\nEnter the name of the pokemon you're trying to catch: ");
	
		Pokemon  pokemon  = new Pokemon(in.nextLine());
		Iterator iterator = new Iterator();

		// call to run() in Iterator class to begin incrementing
		pokemon.setSR(iterator.run());

		try{
			File file = new File("resources/" + pokemon.getName() + ".txt");

			// Check if the file already exits, ask the user if they would like to overwrite or append
			if(file.exists()){
				System.out.print("\nA file for this pokemon already exits "
					      		 + "would you like to overwrite or add to the collection?"
					      		 + "\n\nInput \"a\" to add or \"o\" overwrite."
					      		 + "\n\na/o: ");

				choice = in.nextLine();

				// Input validation for the users choice
				while(!choice.equals("a") && !choice.equals("o")){
					System.out.print("\nOk so that's not \"a\" or \"o\" so let's try that again."
									 + "\n\na/o: ");

					choice = in.nextLine();
				}
				
				// switch/case to determine the users input
				writeToFile(file, fw, pokemon, choice);
			
			}		  
      		else if(file.createNewFile()) writeToFile(file, fw, pokemon, choice);
		}catch(IOException e){
      		System.out.println("An error occurred.\n");
      		e.printStackTrace();
    	}

    	System.out.println("\nCongrats!! Looks like you found your " + pokemon.getName() 
    					   + " And with only " + pokemon.getSR() + " tries.");
	}

	// lots of try catches so I thought I would consolidate but a lot I don't like
	public static void writeToFile(File file, FileWriter fw, Pokemon pokemon, String choice){
		try{
			// FileWriter(string, false) allows for file append
			if(choice.equals("a")) 		fw = new FileWriter("resources/" + pokemon.getName() + ".txt", true);
			// FileWriter(string, false) allows for file overwrite
			else if(choice.equals("o")) fw = new FileWriter("resources/" + pokemon.getName() + ".txt", false);
			else 						fw = new FileWriter("resources/" + pokemon.getName() + ".txt");

			fw.write("Name: " + pokemon.getName() 
					 + "\nResets: " + pokemon.getSR() + "\n");
		}catch(IOException e){
			e.printStackTrace();
		}  
		finally{
			try{
				fw.close();
			}catch(IOException e){
				System.out.println("An error occurred.\n");
				e.printStackTrace();
			} 
		}
	}
}