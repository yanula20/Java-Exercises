/* Activity: Input Words into Array
 Write a program to input words from a user into a String array.  
 Allow the user to enter another word, searching the array for 
 that word.  Recall that you need to use the equals method to 
 test equality of Strings*/

import java.util.*;
import java.util.Arrays;

public class  InputWordsIntoArray{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    //priming the while loop
    int arrayLength = -1;
    
    while(arrayLength <=0){
      System.out.print("Enter an integer for the number of elements of your String array.");
      arrayLength = console.nextInt();
    }
    
    String[] array = new String[arrayLength];
    
    for(int i = 0; i < array.length; i++){
      System.out.print("Enter your elements.");
      array[i] = console.next();
    }
    
    System.out.print("Enter a string for which to search within the array");
    String string = console.next();
    
    int lostOrFound = indexOf(array, string);
    if(lostOrFound != -1) {
      System.out.println("We found your value within the array!: " + array[lostOrFound]);
    }else{
      System.out.println("We DID NOT find your value within the array!");
    }
  }//end main
  
  // This method returns the index of the value or -1 if not found.  
  public static int indexOf(String[ ] array, String string) {
    for (int i = 0; i < array.length; i++) {
      if (string.equals(array[i])) {
        return i;
      }

    }
    // To get to this point, the value must not be in the array.
    return -1;
  }
}