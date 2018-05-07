import java.util.*;
public class LoopPractice4 {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
    for(int i = 1; i<=6; i++) {
      System.out.println(0 + 18*i-22);
    }
    
    for(int g = 1; g<=3; g++) System.out.println("hi");
    
    
    System.out.println("don");
    
    //double!
    System.out.println(Math.pow(6,2));
    //double!
    System.out.println(100 + Math.log10(100));
    
    //returns the primitive type that was entered in
    System.out.println(Math.abs(-1.6));
    
    //returns the primitive type that was entered in
    System.out.println(Math.abs(-16));
    
    //returns the primitive type that was entered in
    System.out.println(Math.ceil(-1.6));
    
    //returns the primitive type that was entered in
    System.out.println(Math.ceil(7.));
    int answer1 = returnMin(3,-2,7);
    System.out.println("The min of 3,-2,7 is " + answer1);
    int answer2 = returnMin(19,27,6);
    System.out.println("The min of 19,27,6 is " + answer2);
    
    String str1 = "Q.E.D.";
    String str2 = "Arcturand Megadonkey";
    String str3 = "Sirius Cybernetics Corporation";
    System.out.println("The string length of Q.E.D. is " + str1.length() );
    System.out.println("The string length of Arcturand Megadonkey is " + str2.length() );
    System.out.println("The uppercase of str2 is  " + str2.toUpperCase() );
    System.out.println("The index of donkey in str2 " + str2.indexOf("donkey") );
    System.out.println("The index of D in str1 " + str1.indexOf("D") );
    System.out.println("The substring 9 to str3.indexOf(\"e\") is " + str3.substring(9,str3.indexOf("e")) );
    System.out.println("The str3.substring(7,12) is " + str3.substring(7,12) );
    
    
    System.out.println("Enter an integer: ");
    int integerUser = console.nextInt();
    System.out.println("Your number doubled is " + doubleNumber(integerUser));
    
    System.out.print("Enter a phrase please: ");
    console.nextLine();
    String phrase = console.nextLine();
    
    System.out.print("\n");
    System.out.println("How many times do we repeat your phrase?");
    int repeat = console.nextInt();
    repeatPhrase(phrase, repeat);
    
  }
  public static int returnMin(int one, int two, int three) {
    int result = Math.min(one,two);
    result = Math.min(result, three);
    return result;
  }
  
  public static int doubleNumber(int integerUser) {
    return integerUser * 2;
  }
  
  public static void repeatPhrase(String phrase, int repeat) {
    for(int i=1; i<=repeat; i++) {
      System.out.println(phrase);
    }
    
    
  }
}