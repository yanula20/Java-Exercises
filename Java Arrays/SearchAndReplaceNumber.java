/*Activity: Search and Replace
Modify the int searching program so the user 
is prompted for a replacement value.*/

import java.util.*;
import java.util.Arrays;

public class  SearchAndReplaceNumber{
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
    
    System.out.print("Enter a value that will be replaced in your array");
    int value = console.nextInt();
    
    System.out.print("Enter a the replacement value for your array element just identified.");
    int newValue = console.nextInt();
        
    int lostOrFound = replace(array, value, newValue);
    if(lostOrFound != -1) {
    System.out.println("We replaced " + value + " with " + newValue + " within the array!");
    }else{
       System.out.println("We DID NOT find " + value + ".  We cannot replace it.");
    }
    System.out.println(Arrays.toString(array));
  }//end main
  
// This method replaces one value with another.
// It returns the index that was replaced or -1 if not found.
public static int replace(int[ ] array, int value, int newValue) {  
    for (int i = 0; i < array.length; i++) {
        if (value == array[i]) {
            array[i] = newValue;
            return i;
        }
    }
    // To get to this point, the value must not be in the array.
    return -1;
}
  
  
}