/** Project Euler.net
* 
* PROBLEM 2:
*    Each new term in the Fibonacci sequence is generated by adding 
*    the previous two terms. By starting with 1 and 2, the first 10 
*    terms will be:
*
*        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
*
*    By considering the terms in the Fibonacci sequence whose values 
*    do not exceed four million, find the sum of the even-valued 
*    terms.
*
* ANSWER: 
*    The sum is: 4613732
*
* @author
* Natalie Kerby :: ndkerby@gmail.com
*/

//package math;
import math.MATH;
//import MATH;

public class EvenFibonacciNumbers  {

    public static final int MAX = 4000000;
    public static void main(String[] args) {
        int currentNumber = 1;
        int previousNumber = 1;
        int sum = 0;
        
        while( currentNumber < MAX) {
            int newNumber = MATH.fibonacci(currentNumber, previousNumber);
            previousNumber = currentNumber;
            currentNumber = newNumber;
            
            if (currentNumber%2 == 0){
                sum += currentNumber;
            }
        } 
        System.out.println("The sum is: " + sum );   
    } 
}