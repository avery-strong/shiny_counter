#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "counter/Counter.h"
#include "counter/Iterator.h"
#include "pokemon/Pokemon.h"

int main(){

	Pokemon pokemon;

	printf("Enter the name of the pokemon you're trying to catch: ");

	setName(&pokemon);		// Set the name of our pokemon

	char n[sizeof(getName(&pokemon))];
	strcpy(n, getName(&pokemon));

	setSR(&pokemon, run()); // Run from Iterator.h

	// File output
	FILE *fout = fopen("file.txt", "w+");

	if(fout == NULL){}
	fprintf(fout, "%s\n%d", n, getSR(pokemon));
	fclose(fout);

}