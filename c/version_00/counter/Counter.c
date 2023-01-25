#include <stdio.h>
#include "Counter.h"

int getCounter(Counter c){
	return c.counter;
}
void setCounter(Counter c, int counter){
	c.counter = counter;
}
void incrementCounter(Counter c){
	c.counter++;
}
void decrementCounter(Counter c){
	c.counter--;
}