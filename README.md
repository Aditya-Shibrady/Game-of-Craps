# Game-of-Craps
A fun game which illustrates the need for machine learning, built in Java.

I am using a random number generator to simulate a game of craps and implement some simple machine learning strategies to automate your wager.

Rules:
1. If on the first roll of dice, the sum is 7 or 11, you win. If the sum is 2, 3 or 12, you lose.
2. After the first roll of dice, if the value of the first roll repeats before the number 7, you win. If the number 7 appears before the repetition of the first roll, you lose.

If you win, the winning amount is equal to the wager amount. For example, if you wager $100, you win $100.

You start off with a balance of $1000 and play 10 games or until you run out of money. The wagering strategies will be as follows:

1. Even wager: On every roll, you wager $100, irrespective of previous win or loss.
2. Martingale System: Basic idea is that if you win, in the next bet you wager $100. If you lose, you double previous wager.
3. Reverse Martingale System: In this case, you double your wager in case of win and keep constant in case of loss.

Note: If you don’t have enough balance to double previous wager, then you should play with whatever is remaining. That is, if you have to wager $800, but you only have $600 available, then bet $600.

A classic example to demonstrate the need for machine learning indeed!
