/** Project Euler.net
* 
* PROBLEM 4:
*    A palindromic number reads the same both ways.
*    The largest palindrome made from the product of two 2-digit numbers is 
*       9009 = 91 × 99.
*
*    Find the largest palindrome made from the product of two 3-digit numbers.
*
* ANSWER: 
*     
*
* @author
* Natalie Kerby :: ndkerby@gmail.com
*/

//package math;
import math.MATH;
import java.util.*;
//import MATH;

public class LargestPalindromeProduct  {

    public static final int NUMBER_1 = 999;
    public static final int NUMBER_2 = 999;
    public static final int MIN_NUMBER = 100;
    
    public static void main(String[] args) {
        int largetProduct = 0;
        for(int i = NUMBER_1; i >= MIN_NUMBER; i--){
            for(int j = NUMBER_2; j >= MIN_NUMBER; j--){
                int product = i*j;
                if(MATH.isPalindrome(product)){
                    if (product > largetProduct){
                        largetProduct = product;
                    }
                }
            }
        } 
        System.out.println("Largest Palindrome:" + largetProduct);  
    } 
}