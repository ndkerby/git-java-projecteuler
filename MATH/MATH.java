/** 
*    This class will be used as a library of math functions.
*    Such functions can include fibonacci, isPrime, factorials, ect.
*
* @author
* Natalie Kerby :: ndkerby@gmail.com
*/
package math;
import java.util.*;

public class MATH  {
    
    public static int fibonacci(int currentFibonacci, int previousFibonacci) {
        int nextFibonacci = currentFibonacci + previousFibonacci;  
        return nextFibonacci;
    } 

    public static Integer[] factors(int number) {
        Long longNumber = new Long(number);

        Long[] factors = factors(longNumber);
        Integer[] factors_list = new Integer[factors.length];
        for( int i=0; i< factors.length; i++){
            factors_list[i] = factors[i].intValue();
        }
        return factors_list;
    }

    public static Long[] factors(Long number) {
        ArrayList<Long> factors = new ArrayList<Long>();
        double square = isPerfectSquare(number);
        
        for(long index = 1; index <= square; index++){
            if (number%index == 0){
                factors.add(index);
                if ( (number/index) != index){ 
                    factors.add(number/index);
                }
            }
        }
        Long[] factors_list = new Long[factors.size()];
        factors_list = factors.toArray(new Long[0]);
        return factors_list;
    } 

    public static double isPerfectSquare(Long number){
        double square = Math.sqrt(number);
        return square;
    }
    
    public static boolean isPrime(Long number){
        boolean isPrime = true;
        for(int index = 2; index < number; index++){
            if (number%index == 0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static double isPerfectSquare(int number){
        double square = Math.sqrt(number);
        return square;
    }
    
    public static boolean isPrime(Integer number){
        boolean isPrime = true;
        for(int index = 2; index < number; index++){
            if (number%index == 0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static boolean isPalindrome(Integer product){
        boolean isPalindrome = true;
        String palidromeString = product.toString();
        char[] characters = palidromeString.toCharArray();
        int length = characters.length-1;
        for(int index = length; index >= characters.length/2; index--){
            if(characters[index] != characters[length-index]){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static int sumOfSquares(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += Math.pow(i,2);
        }
        return sum;
    }

    public static int squareOfSum(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += i;
        }
        int square = (int) Math.pow(sum,2);
        return square;
    }
}