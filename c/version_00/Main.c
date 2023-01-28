#include <stdio.h>
#include <string.h>
#include "counter/Counter.h"
#include "counter/Iterator.h"
#include "pokemon/Pokemon.h"

int main(){

	Pokemon pokemon;

	printf("Enter the name of the pokemon you're trying to catch: ");

	setName(&pokemon);		// Set the name of our pokemon

	setSR(&pokemon, run()); // Run from Iterator.h

	FILE *out_file = fopen(strcat(getName(&pokemon), ".txt"), "w"); 
	fprintf(out_file, "%s\n%d", getName(&pokemon), getSR(pokemon));
	fclose(out_file);
}