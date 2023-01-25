#ifndef _COUNTER_H
#define _COUNTER_H

typedef struct{
	int counter;

}Counter;

int getCounter(Counter c);
void setCounter(Counter c, int counter);
void incrementCounter(Counter c);
void decrementCounter(Counter c);

#endif
