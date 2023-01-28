#include <stdio.h>
#include "Pokemon.h"

/**********************
		Getters
**********************/

int getSR(Pokemon p){
	return p.softResets;
}
char * getName(Pokemon *p){
	return p->name;
}

/**********************
		Setters
**********************/

void setSR(Pokemon *p, int sr){
	p->softResets = sr;
}

void setName(Pokemon *p){
	fflush(stdout);
	scanf("%s", p->name);
	getchar();
}