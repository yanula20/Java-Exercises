/* Activity: Prompt for Array and Search
 Write a program using the indexOf method to 
 search an int array.  The user should be prompted 
 to enter the values for the array.  Then the user should
 be prompted to enter a value to search for.*/

import java.util.*;
import java.util.Arrays;

public class  PromptForArrayAndSearch{
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
    
    System.out.print("Enter a value for which to search within the array");
    int value = console.nextInt();
        
    int lostOrFound = indexOf(array, value);
    if(lostOrFound != -1) {
    System.out.println("We found your value within the array!:" + array[lostOrFound]);
    }else{
       System.out.println("We DID NOT find your value within the array!");
    }
  }//end main
  
  // This method returns the index of the value or -1 if not found.  
  public static int indexOf(int[ ] array, int value) {
    for (int i = 0; i < array.length; i++) {
      if (value == array[i]) {
        return i;
      }
    }
    // To get to this point, the value must not be in the array.
    return -1;
  }
  
  
}