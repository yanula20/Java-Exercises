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
Write a similar method, doubleIntArray, that doubles each element in a int array.
Can you write a single method that can take either a double array or an int 
array as a parameter and double the elements of the array?
 */

import java.util.*;
import java.util.Arrays;

public class DoubleIntegerArray {
  public static void main(String[] args) {
    
    int[] array = {1, 2, 3, 4, 5, 6};
    doubleIntArray(array);
    
  }//end main
  
  public static void doubleIntArray(int[] inputArray){
    System.out.println(Arrays.toString(inputArray));
    for(int i = 0; i < inputArray.length; i++){
      inputArray[i] = 2*inputArray[i];
    }
    System.out.println(Arrays.toString(inputArray));
  }
  
}//end program