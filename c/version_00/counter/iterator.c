#include <stdio.h>
#include "Counter.h"

int main(){
	char userInput;
	Counter countStruct;		// Create a struct with the name couter from Counter.h\

	printf("Enter + or - to increment or decrement the counter. Press 0 to indicate you have found your shiny.\n");

	do{
		printf("+/-: ");
		
		fflush(stdout);		// I hate this guy
		scanf("%c", &userInput);
		getchar();			// eat the new line

		// input validation
		while((int)userInput < 43 || (int)userInput > 45 || (int)userInput == 44){
			if((int)userInput == 48) break;

			printf("You have entered (%c %d) which is an invalid value please enter + or -: ", userInput, (int)userInput);
			
			fflush(stdout);		// I hate this guy
			scanf("%c", &userInput);
			getchar();			// eat the new line
		}

		if((int)userInput == 43) incrementCounter(countStruct);
		else if((int)userInput == 45){
			printf("test");
			decrementCounter(countStruct);

			if(getCounter(countStruct) < 0) setCounter(countStruct, 0);
		}

		printf("%d %d\n", getCounter(countStruct), (int)userInput);

	}while((int)userInput != 48);

	printf("Congrats!! Looks like you found your mon! And with only %d tries.", getCounter(countStruct));

	return 0;
}