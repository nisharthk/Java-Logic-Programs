Todo 
Create an interface called StringReverser.  Then create two classes, one called StringReverserWithRecursion and a class called StringReverserWithoutRecursion.  Both classes implement the StringReverser interface, which has one public method:

public String reverse(String stringToBeReversed);


In both StringReverserWithRecursion and StringReverserWithoutRecursion, write code to reverse a string.  In one class, use recursion. In the other, do not use recursion.

Each method should take a string as input and return a reversed String.  The reversed string can then be output in the main class.  If you take input from the user, do so in the main class, not the StringReverser class.

Also, think about how you will test this without needing input.  Create some example cases to verify the code is working both recursively and non recursively.

Lastly, write code to time/benchmark the two different implementations in order to see which one is faster.  
