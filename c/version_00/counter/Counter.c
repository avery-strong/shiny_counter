#include <stdio.h>
#include "Counter.h"

/**********************
		Getter(s)
**********************/

int getCounter(Counter c){
	return c.counter;
}

/**********************
		Setter(s)
**********************/

void setCounter(Counter *c, int counter){
	c->counter = counter;
}
void incrementCounter(Counter *c){
	c->counter++;
}
void decrementCounter(Counter *c){
	c->counter--;
}