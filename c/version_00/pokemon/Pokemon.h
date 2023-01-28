#ifndef _POKEMON_H
#define _POKEMON_H

typedef struct{
	int softResets;
	char name[];

}Pokemon;

int getSR(Pokemon p);
char * getName(Pokemon *p);

void setSR(Pokemon *p, int sr);
void setName(Pokemon *p);

#endif
