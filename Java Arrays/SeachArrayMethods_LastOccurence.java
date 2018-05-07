/* Activity: Search Array Methods
Write and test a method that returns the 
last index of a value in an array, returning -1 if 
the value is not found.*/

import java.util.*;
import java.util.Arrays;

public class  SeachArrayMethods_LastOccurence{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    //priming the while loop
    int arrayLength = -1;
    
    while(arrayLength <=0){
      System.out.print("Enter an integer for the number of elements of your array.");
      arrayLength = console.nextInt();
    }
    
    int[] array = new int[arrayLength];
    
    for(int i = 0; i < array.length; i++){
      System.out.print("Enter your elements.");
      array[i] = console.nextInt();
    }
    
    System.out.print("Enter a value for the search. We will find the LAST occurence of the value in the array.");
  
    int value = console.nextInt();
        
    int lostOrFound = indexOf(array, value);
    if(lostOrFound != -1) {
    System.out.println("We found the last occurence of your value at index: " + lostOrFound);
    }else{
       System.out.println("We DID NOT find your value within the array!");
    }
    
    System.out.println(Arrays.toString(array));
  }//end main
  
  // This method returns the index of the value or -1 if not found.  
  //array.length -1 is equal to the last index of the array
  public static int indexOf(int[ ] array, int value) {
    for (int i = array.length -1; i >= 0; i--) {
      if (value == array[i]) {
        return i;
      }
    }
    // To get to this point, the value must not be in the array.
    return -1;
  }
}