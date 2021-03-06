/* Activity: Equal int Arrays Method
 Write and test a method for checking equality of two int arrays.*/

import java.util.*;
import java.util.Arrays;

public class EqualIntArraysMethod{
  public static void main(String[] args){
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {1,2,3,4,5};
    
    boolean equalArraysTest = arrayEqualityMethod(array1, array2);
    if(equalArraysTest){
      System.out.println("Your two arrays are EQUAL!");
    }else{
    System.out.println("Your two arrays are NOT EQUAL!");
    }
    
  }//end main
  
  public static boolean arrayEqualityMethod(int[] array1, int[] array2){
    if(array1.length != array2.length){
      return false;
    }
    //at this point, the two arrays are equal in length, now check elements for equality
    for(int i = 0; i < array1.length; i++){
      if(array1[i] != array2[i]){
        return false;
      }
    }//end for loop that compares elements of both arrays for equality
    
    //if we reach this point in the code, length and elements of the two arrays should be equal
    return true;
  }
  
}