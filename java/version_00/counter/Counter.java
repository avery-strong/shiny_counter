package counter;

import java.util.Scanner;

public class Counter{
	
	public Counter(){ counter = 0; }

	/**********************
			Getters
	**********************/

	public int getCounter(){ return this.counter; }

	/**********************
			Setters
	**********************/

	public void setCounter(int c){ this.counter = c; }

	public void incrementCounter(){ this.counter++; }
	public void decrementCounter(){ this.counter--; }

	private int counter;
}