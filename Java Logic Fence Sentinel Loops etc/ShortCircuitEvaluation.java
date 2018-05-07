/*
 * Character.isLetter(str.charAt(3))
 * str.substring(0,5).equals("Hello")
 * str.substring(7,12).equals("world"
 */
import java.util.*;
public class ShortCircuitEvaluation {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    shortCircuit1(console, "Enter a string for short circuit test 1. Seeking letter at index 3.");
    shortCircuit2(console, "Enter a string for short circuit test 2. Seeking str.substring(0,5).equals(\"Hello\").");
    shortCircuit3(console, "Enter a string for short circuit test 3. Seeking str.substring(7,12).equals(\"world\").");
  }
  
  
  public static void shortCircuit1(Scanner console, String str) {
    System.out.print(str);
    String test = console.nextLine();
    while(test.length() <3){
      System.out.print(str);
      test = console.nextLine();
    }
    if(Character.isLetter(test.charAt(3))){
      System.out.println("Character 3 is a letter.");
    }else{
      System.out.println("Character 3 is NOT letter.");
    }
  }
  
  public static void shortCircuit2(Scanner console, String str) {
    System.out.print(str);
    String test2 = console.nextLine();
    while(test2.length() < 4){
      System.out.print(str);
      test2 = console.nextLine();
    }
    if(test2.substring(0,5).equals("Hello")){
      System.out.println("True: Hello is substring(0,5) of your input.");
    }else{
      System.out.println("False: Hello is NOT a substring(0,5 of your input.");
    }
  }
  
  public static void shortCircuit3(Scanner console, String str) {
    System.out.print(str);
    String test3 = console.nextLine();
    while(test3.length() < 12 ){//gaurantees index of at least 11
      System.out.print(str);
      test3 = console.nextLine();
    }
    
    if(test3.substring(7,12).toLowerCase().equals("world")) {//substring requires index of at least 11
      System.out.println("True: world is a substring (7,12) of your input.");
    }else{
      System.out.println("False: world is NOT a substring (7,12) of your input.");
    }
  }
}