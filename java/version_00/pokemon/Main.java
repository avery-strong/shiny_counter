package pokemon;

import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import counter.Iterator;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the name of the pokemon you're trying to catch: ");
	
		String str = in.nextLine();

		Pokemon pokemon = new Pokemon(str);
		Iterator iterator = new Iterator();

		pokemon.setSR(iterator.run());

		try{
			File file = new File(str + ".txt");

			if(file.createNewFile()) System.out.println("File created: " + file.getName());
      		else 					 System.out.println("File already exists.");

			FileWriter fw = new FileWriter(str + ".txt");

			fw.write("Name: " + pokemon.getName() 
					 + "\nResets: " + pokemon.getSR());

			fw.close();
		}catch(IOException e){
      		System.out.println("An error occurred.");
      		e.printStackTrace();
    	}
	}
}