/* Activity: Approximately Equal Arrays Method
Write and test a method for checking approximate equality 
of two double arrays.  The method should have an additional 
parameter that indicates how close two doubles need to be to be 
considered approximately equal.*/

import java.util.*;
import java.util.Arrays;

public class  ApproximatelyEqualArraysMethod{
  public static void main(String[] args){
    double[] array1 = {1.5, 2.2, 3.3, 4.7, 5.9};
    double[] array2 = {1.3, 2.4, 3.3, 4.8, 6.1};
    
    boolean equalArraysTest = arrayEqualityMethod(array1, array2);
    if(equalArraysTest){
      System.out.println("Your two arrays are EQUAL!");
    }else{
    System.out.println("Your two arrays are NOT EQUAL!");
    }
    
  }//end main
    
  public static boolean arrayEqualityMethod(double[] array1, double[] array2){
    if(array1.length != array2.length){
      return false;
    }
    //at this point, the two arrays are equal in length, now check elements for equality
    for(int i = 0; i < array1.length; i++){
      if(Math.abs(array1[i] - array2[i]) > 0.5  ){
        return false;
      }
    }//end for loop that compares elements of both arrays for equality
    
    //if we reach this point in the code, length and elements of the two arrays should be equal
    return true;
  }
  
}