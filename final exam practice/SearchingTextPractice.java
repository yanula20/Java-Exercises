/*File infile = new File("temperature.txt");
 To read from this file, a Scanner object can be constructed by this statement. 
 Scanner input = new Scanner(infile);
 For most purposes, we don't need the File object except for constructing the 
 Scanner object, so the above two statements can be coded into one statement. 
 Scanner input = new Scanner(new File("temperature.txt")); 
 */

import java.util.*;
import java.util.Arrays;
import java.io.*;

public class SearchingTextPractice{
  public static void main(String[] args)throws FileNotFoundException{
    //alternatively: Scanner input = new Scanner(new File("iris.txt"));
    File file = new File("searchtext.txt");
    Scanner input = new Scanner(file);
   // System.out.println(input.nextLine()); pointer stops, must close to get pointer back to beginning of text
    int wordCount = 0;
    int numCount = 0;
    String x = " ";
    while(input.hasNext()){
      wordCount++;
      input.next();
       
      if(input.hasNextInt()){
       numCount++;
      }
    }
    
    System.out.println("There are " + wordCount + " words in the text.");//result is 32 words
    System.out.println("There are " + numCount + " numbers in the text.");//result is 32 words
    input.close();
   
  }//end main
}//end program

