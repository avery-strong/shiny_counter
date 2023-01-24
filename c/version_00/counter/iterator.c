#include <stdio.h>

int main(){
	char userInput;
	int counter = 0;

	printf("Enter + or - to increment or decrement the counter. Press 0 to indicate you have found your shiny.\n");

	do{
		printf("+/-: ");
		
		fflush(stdout);		// I hate this guy
		scanf("%c", &userInput);

		getchar();		// eat the new line

		// input validation
		while((int)userInput < 43 || (int)userInput > 45 || (int)userInput == 44){
			if((int)userInput == 48) break;

			printf("You have entered (%c %d) which is an invalid value please enter + or -: ", userInput, (int)userInput);
			
			fflush(stdout);		// I hate this guy
			scanf("%c", &userInput);

			getchar();		// eat the new line
		}

		if((int)userInput == 43) counter++;
		else if((int) userInput == 45){
			counter--;

			if(counter < 0) counter = 0;
		}

	}while((int)userInput != 48);

	printf("Congrats!! Looks like you found your mon! And with only %d tries.", counter);

	return 0;
}