/* Activity: Reverse Array Method
 Write and test a method for reversing a double array.
 0     1     2     3     4  
 2    -3     5    -7     11*/

import java.util.*;
import java.util.Arrays;

public class  ReverseArrayMethod{
  public static void main(String[] args){
    int[] array = {2, -3, 5, -7, 11}; //length/2 = index at -3;
    int[] array2 = {1, 2, 3, 4};////length/2 = index at 3;
    reverseArray(array);
    reverseArray(array2);
    
    
  }//end main
  
  public static void reverseArray(int[] array){
    for(int left = 0; left < array.length/2; left++){
      int right = (array.length - 1) - left;  //right index math: 5 - 1 - 0 = 4 ; 5 - 1 - 1 = 3;
      int temp = array[left];
      array[left] = array[right];
      array[right] = temp;
      
    }//end for loop
    System.out.println(Arrays.toString(array));
  }
}
