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
        //System.out.println(nextFibonacci); 
        return nextFibonacci;
    } 
    
    public static Integer[] factors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        double square = isPerfectSquare(number);
        
        for(int index = 1; index <= square; index++){
            if (number%index == 0){
                factors.add(index);
                if ( (number/index) != index){ 
                    factors.add(number/index);
                }
            }
        }
        Integer[] factors_list = new Integer[factors.size()];
        factors_list = factors.toArray(new Integer[0]);
        //System.out.println(Arrays.toString(factors_list)); 
        //System.out.println(factors); 
        return factors_list;
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
}