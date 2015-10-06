/** Project Euler.net
* 
* PROBLEM 8:
*     A Pythagorean triplet is a set of three natural numbers, 
*     a < b < c, for which,
*     
*     a2 + b2 = c2
*     For example, 32 + 42 = 9 + 16 = 25 = 52.
*     
*     There exists exactly one Pythagorean triplet for which a + b + c = 1000.
*     Find the product abc.
*     
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

public class SpecialPythagoreanTriplet  {

    public static final int PYTHAGOREAN_SUM = 1000;
    
    public static void main(String[] args) {
        int product = 1;
        for(int a = 1; a < PYTHAGOREAN_SUM; a++){
            for(int b = 1; b < PYTHAGOREAN_SUM; b++){
                for(int c = 1; c < PYTHAGOREAN_SUM; c++){
                    if(MATH.isPythagorean(a, b, c)){
                        if(a + b + c == PYTHAGOREAN_SUM){
                            product = a * b * c;
                        }
                    }
                }
            }
        }

        

        System.out.println("The product: " + product);  
    } 
}