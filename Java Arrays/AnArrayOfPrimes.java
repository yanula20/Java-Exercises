import java.util.*;
import java.util.Arrays;

public class AnArrayOfPrimes{
  public static void main(String[] args){
    int sumOfPrimes = 0;
    int sumOfEvens = 0;
    int max;
    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    for(int prime : primes){
      sumOfPrimes = sumOfPrimes + prime;
    }
    System.out.println("Sum of primes from 2 - 29 equals: " + sumOfPrimes);
    System.out.println(Arrays.toString(primes));
    
    System.out.println();//spacing
    //change length of the array via variable max
    max = 20;
    int[] evens = new int[20];
    
    //fill array
    for( int j = 0; j < evens.length; j++){
      if(j!=0){
         evens[j] = j*2;
      }else{
       evens[j] = 0;
      }
     
      
    }
    System.out.println(Arrays.toString(evens));
    //manipulate array elements with for each
    for(int even : evens){
     sumOfEvens = sumOfEvens + even;
    }
  
    System.out.println(sumOfEvens);
  }
}