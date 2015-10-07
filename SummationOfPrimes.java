/** Project Euler.net
* 
* PROBLEM 10:
*     The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
*     
*     Find the sum of all the primes below two million.
*     
* ANSWER: 
*    
*
* @author
* Natalie Kerby :: ndkerby@gmail.com
*/

import math.MATH;
import java.util.*;
import java.math.BigInteger;

public class SummationOfPrimes  {

    public static final int MAX_NUMBER = 2000000;
    
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 2; i < MAX_NUMBER; i++){
            if(MATH.isPrime(i)){
                sum += i;
            }
        }

        System.out.println("The sum: " + sum);  
    } 
}