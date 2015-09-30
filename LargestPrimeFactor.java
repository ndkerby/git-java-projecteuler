/** Project Euler.net
* 
* PROBLEM 3:
*    The prime factors of 13195 are 5, 7, 13 and 29.
*
*    What is the largest prime factor of the number 600851475143 ?
*
* ANSWER: 
*    The largest prime factor is: 
*
* @author
* Natalie Kerby :: ndkerby@gmail.com
*/

//package math;
import math.MATH;
import java.util.*;
import java.math.BigInteger;
//import MATH;

public class LargestPrimeFactor  {

    public static final Long NUMBER = 600851475143L;
    public static void main(String[] args) {
        Long[] factors = math.MATH.factors(NUMBER);
        long largest_prime = 1;
        for(int index = 0; index < factors.length; index++){
            boolean isPrime = math.MATH.isPrime(factors[index]);
            if(isPrime){
                if (factors[index] > largest_prime) {
                    largest_prime = factors[index];
                }
            }
        }
        System.out.println("The largest prime factor is: " + largest_prime);   
    } 
}