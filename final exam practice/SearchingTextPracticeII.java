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

public class SearchingTextPracticeII{
  public static void main(String[] args)throws FileNotFoundException{
    //alternatively: Scanner input = new Scanner(new File("iris.txt"));
    File file = new File("searchtext.txt");
    Scanner input = new Scanner(file);
    // System.out.println(input.nextLine()); pointer stops, must close to get pointer back to beginning of text
    int count = 0;
    int u = 0, l = 0, d = 0;
    String text = " ";
    while(input.hasNext()){
      text = text + input.next();
    }
    
    for(int i = 0; i < text.length(); i++){
      count++;//counts each character
    }
   
    for(int i = 0; i < text.length(); i++){

      char ch = text.charAt(i);
      if(Character.isLowerCase(ch)){
      l++;
      }else if(Character.isUpperCase(ch)){
      u++;
      }else if (Character.isDigit(ch)){
      d++;
      }
    
    }
    
    searchText(text, "special");
    searchText(text, "LETTers");
    searchText(text, "33");
    characterFindandCount(text, 't');
    characterFindandCount(text, '!');

    System.out.println("The text's character count is " + count + ".");
    System.out.println("The text's uppercase character count is " + u + ".");
    System.out.println("The text's lowercase character count is " + l + ".");
    System.out.println("The text's digit character count is " + d + ".");
    System.out.println(text);
    input.close();
    
  }//end main
  
  public static void searchText(String text, String word) {
      for(int i = 0; i < text.length()- word.length(); i++){
      String s = text.substring(i, i + word.length());
      if(s.equals(word)){
        System.out.println("We found your word " + word + ".");
      }
    }
  }
  
  public static void characterFindandCount(String text, char letter){
    int count = 0;
    for(int a = 0; a < text.length(); a++){
      char c = text.charAt(a);
      if(c == letter){
        count++;
      }
    }//end for loop
    System.out.println("We found your character " + letter + " " + count + " times!");
  }
}//end program

