/** Project Euler.net
* 
* PROBLEM 7:
*    By listing the first six prime numbers: 
*		2, 3, 5, 7, 11, and 13  
*	 we can see that the 6th prime is 13.
*    
*    What is the 10 001st prime number?
*
* ANSWER: 
*    
*
* @author
* Natalie Kerby :: ndkerby@gmail.com
*/

import math.MATH;
import java.util.*;

public class Prime10001  {

	public static final int primeNumber = 10001;
    
    public static void main(String[] args) {
    	int count = 0;
    	int number = 1;

        do{
        	number++;
        	if(MATH.isPrime(number)){
        		count++;
        	}
    	} while (count != primeNumber);

        System.out.println("The 10001st prime number is: " + number);  
    } 
}