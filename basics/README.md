# Even or Odd #

Create a method that takes an integer as an argument and returns "Even" or "Odd".

Even number is any integer that can be divided exactly by 2. If it is not an even number, it is called an odd number.


# FizzBuzz Array #

Create a method that returns an array of numbers from 1 to 100.

The value at the index of the array for number should be 'Fizz' if it is divisible by 3, 'Buzz' if divisible by 5, 'FizzBuzz' if it divisible by both 3 and 5, or the number if it is not divisible by 3 or 5.


# Subarrays #

Write a function that returns all of the sublists of a list or Array.

Your method should be pure; it cannot modify its input.

```java
subArray([1,2,3]);  // [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
```


# Checkerboard Generation #

Write a method `generate` which takes an integer size and returns a checkerboard of dimensions size x size.

 - The top left corner should be a white square.
 - Each row should have alternating squares in the row.
 - The starting square on each row should also alternate.


# Frog jumping #

You have an array of integers and have a frog that starts at the first position.

Every integer tells you the length of step that you have to make. The length is measured in number of indices.

Your objective is to find how many steps the frog needs to make to go out of array.

The function should return count of steps or -1 in any other case such as: the frog can't move out of the array.

```java
[1, 2, 1, 5]; // 1 -> 2 -> 5 -> out  steps = 3 
[1, -1] // 1 -> -1 -> 1 -> -1 -> .... steps = -1
```


# Zonk #

Zonk is addictive dice game. In each round player rolls 6 dice. Then (s)he composes combinations from them. Each combination gives certain points.

Then player can take one or more dice combinations to his hand and re-roll remaining dice or save his score. Dice in player's hand won't be took into account in subsequent rolls.

If no combinations can be composed - situation is called "zonk". Player thrown zonk loses all points in this round and next player moves. So it's player decision when to reroll and when to stop and save his score.

Your task is simple - just evaluate current roll and return maximum number of points can be scored from it.

Combination | Example roll | Points
--- | --- | ---
Straight (1,2,3,4,5 and 6) | 6 3 1 2 5 4 | 1000 points
Three pairs of any dice | 2 2 4 4 1 1 | 750 points
Three of 1 | 1 4 1 1 | 1000 points
Three of 2 | 2 3 4 2 2 | 200 points
Three of 3 | 3 4 3 6 3 2 | 300 points
Three of 4 | 4 4 4 | 400 points
Three of 5 | 2 5 5 5 4 | 500 points
Three of 6 | 6 6 2 6 | 600 points
Four of a kind | 1 1 1 1 4 6 | 2 × Three-of-a-kind score (in example, 2000 pts)
Five of a kind | 5 5 5 4 5 5 | 3 × Three-of-a-kind score (in example, 1500 pts)
Six of a kind | 4 4 4 4 4 4 | 4 × Three-of-a-kind score (in example, 1600 pts)
Every 1 | 4 3 1 2 2 | 100 points
Every 5 | 5 2 6 | 50 points

Each die cannot be used in multiple combinations the same time, so three pairs of 2, 3 and 5 will worth you only 750 points (for three pairs), not 850 (for three pairs and two fives). But you can select multiple combinations, 2 2 2 1 6 will worth you 300 points (200 for three-of-kind '2' plus 100 for single '1' die)


# Points On A Line #

Given an array points (cartesian coordinates), return true if all of them can lie on a line.

```java
[[1,2], [7, 4], [22, 9]];                 // true
[[1,2], [-3, -14], [22, 9]];              // false
```


# Sierpinski's Gasket #

Write a function that takes an integer n and returns the nth iteration of the fractal known as Sierpinski's Gasket.

Here are the first few iterations. The fractal is composed entirely of L and white-space characters; each character has one space between it and the next (or a newline).


# [ThePrimeFactorsKata](http://www.butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata "ThePrimeFactorsKata") #