/** Project Euler.net
* 
* PROBLEM 6:
*    The sum of the squares of the first ten natural numbers is,
*       1^2 + 2^2 + ... + 10^2 = 385
*    
*    The square of the sum of the first ten natural numbers is
*        (1 + 2 + ... + 10)^2 = 55^2 = 3025
*    
*    Hence the difference between the sum of the squares of the first 
*    ten natural numbers and the square of the sum is 3025 − 385 = 2640.
*    
*    Find the difference between the sum of the squares of the first 
*    one hundred natural numbers and the square of the sum.
*
* ANSWER: 
*    
*
* @author
* Natalie Kerby :: ndkerby@gmail.com
*/

import math.MATH;
import java.util.*;

public class SumSquareDifference  {

    public static final int START_NUMBER = 1;
    public static final int END_NUMBER = 100;
    
    public static void main(String[] args) {
        int sumOfSquares = MATH.sumOfSquares(START_NUMBER, END_NUMBER);
        int squareOfSums = MATH.squareOfSum(START_NUMBER, END_NUMBER);

        int difference = squareOfSums - sumOfSquares;

        System.out.println("Difference of sum of squares: " + difference);  
    } 
}