/* copyOf(array, newSize)returns a copy of the array with the new size
 equals(array1, array2) returns true if every element is equal
 fill(array, value) sets every element in the array to the value
 sort(array) rearranges the values to go from smallest to largest
 toString(array) returns a String representation of the array 
 */

/* Activity: Double Array Elements Methods
 Write a method, doubleDoubleArray that doubles each element in a double array.
 This method should have an array parameter and a void return type.
 Write a program to test the method, printing the array before and after the method call.
 */

import java.util.*;
import java.util.Arrays;

public class DoubleDoubleArray {
  public static void main(String[] args) {
    
    double[] array = {2.0, 6.0};
    testArray(array);
    doubleDoubleArray(array);
    testArray(array);
    
  }//end main
  
  public static void testArray(double[] array){
    int odd = 0;
    for(int j = 0; j < array.length; j++){
      if(array[j] % 2 == 1){
        odd++;
      }
    }
    if(odd >0){
      System.out.println("Your array has an odd element!");
    }else{
      System.out.println("Your array elements are all even");
    }
    System.out.println(Arrays.toString(array));
  }
  
  public static void doubleDoubleArray(double[] inputArray){
    for(int i = 0; i < inputArray.length; i++){
      inputArray[i] = inputArray[i]*2;
    }
  }
}//end program