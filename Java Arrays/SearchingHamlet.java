/* Activity: Searching Hamlet
 Write a program that reads the 32230 tokens in hamlet.txt
 into a String array.  Prompt the user for a word to search. 
 Count and print out the number of times that word appears. 
 Two words you might try are "haue" (over 100 times) and 
 "againe" (over 10 times). */

/* 
 Method Name Description
 copyOf(array, newSize)     returns a copy of the array with the new size
 equals(array1, array2) returns true if every element is equal
 fill(array, value) sets every element in the array to the value
 sort(array) rearranges the values to go from smallest to largest
 toString(array) returns a String representation of the array
 */

import java.util.*;
import java.util.Arrays;
import java.io.*;
public class SearchingHamlet{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(new File("hamlet.txt"));
    System.out.print("Search for this word in the hamlet text: ");
    String word = console.next();
    int arrayLength =  getStringCountForArrayBuild(input);
   
    String[] stringArrayHamlet = new String[arrayLength];//build the array initialized with all null values
   
    String[] builtHamletArray = buildHamletArray(stringArrayHamlet, input, arrayLength);
    System.out.print(Arrays.toString(builtHamletArray));
   // wordFoundCount(builtHamletArray, word);
    
  }//main
  
  public static int getStringCountForArrayBuild(Scanner input){
    int count = 0;
    while(input.hasNext()){
      input.next();//String s = input.next();
      count++;
    }
    System.out.println(count);
    /* must close input for the buildHamletArray; this ensures pointer 
     * goes back to the beginning of the hamlet.text file*/
   
    input.close();  
    return count;
  } 
  
  // System.out.println(Arrays.toString(array)); 
  public static String[] buildHamletArray(String[] stringArrayHamlet, Scanner input, int arrayLength){
   
    for(int i =0; i < stringArrayHamlet.length; i++){
      System.out.println(input.next());
    }
    System.out.println(Arrays.toString(stringArrayHamlet));
    return stringArrayHamlet;
  }
  
  public static void wordFoundCount(String[] array, String word){
    int count = 0;
    for(int i = 0; i < array.length; i++){
      
      if(array[i] == word){
        count++;
      }
    }//end for loop
    if(count != 0){
      System.out.println("We found your word " + count + " times");
    }else{
      System.out.println("We did not find your word even once.");
    }
  }
}