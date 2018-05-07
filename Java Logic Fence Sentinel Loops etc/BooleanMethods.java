/* 
 * Return true if one parameter is odd and the other parameter is even.
 Return true if at least two of the three parameters are odd.
 Return true if the char parameter is a vowel. SKIPPED
 Return true if the String parameter contains a vowel.
 Return true if all the characters in the String parameter are vowels.
 Return true if none of the characters in the String parameter is a vowel.
 Return true if the integer contains an odd digit.
 Return true if all the digits in the integer are odd. 
 */

public class BooleanMethods {
  public static void main(String[] args) {
    boolean result1 = evenAndOdd(2,3);
    System.out.println("Is 2 odd and 3 even or vice versa? " + result1);
    boolean result2 = twoOfThreeOdd(9,3,644);
    System.out.println("Are at lease two out of three numbers odd? " + result2);
    boolean result3 = vowelPresent("4 5 7 b r");
    System.out.println("Is a vowel present? " + result3);
    boolean result4 = stringOfVowels("aeiyo");
    System.out.println("Is the string full of vowels? " + result4);
    boolean result5 = noVowelsPresent("brrrra");
    System.out.println("No vowels present in the input string: " + result5);
    boolean result6 = integerHasOddNumber(2486483);
    System.out.println("Does integer contain and odd number: " + result6);
    boolean result7 = integerHasAllOddNumbers(73793);
    System.out.println("Are all the digits odd in the integer: " + result7);
  }
  
  public static boolean evenAndOdd(int a, int b) {
    if ((a % 2 == 1 && b % 2 == 0) || (a % 2 == 0 && b % 2 == 1) ){
      return true;
    }
    return false;
  }
  
  public static boolean twoOfThreeOdd(int a, int b, int c) {
    if((a%2 == 1) && (b%2 == 1)) {
      return true;
    }else if((b % 2 == 1) && (c % 2 == 1)) {
      return true;
    }else if((a % 2 == 1) && (c % 2 == 1)) {
      return true;
    }
    return false;
  }
  
  public static boolean vowelPresent(String input) {
    String vowels = "aeiouy";
    for(int i = 0; i < input.length(); i++) {
      for(int j = 0; j < vowels.length(); j++){
        if(input.charAt(i) == vowels.charAt(j)){
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean stringOfVowels(String string) {
    String vowels = "aeiouy";
    int count = 0;
    //count increases every time a vowel is found and count should equeal string length
    for(int i = 0; i < string.length(); i++){
      for(int j= 0; j < vowels.length(); j++){
        if(string.charAt(i) == vowels.charAt(j)){
          count++;
        }
      }//end for loop
      
    }
    if(count == string.length()){
      return true;
    }
    return false;
  }
  
  
  public static boolean  noVowelsPresent(String string) {
    String vowels = "aeiouy";
    int count = 0;
    /* count increases every time a vowel is found and count should equeal string length. 
     * if no vowels are present, count++ should REMAIN 0, zero*/
    for(int i = 0; i < string.length(); i++){
      for(int j= 0; j < vowels.length(); j++){
        if(string.charAt(i) == vowels.charAt(j)){
          count++;
        }
      }//end for loop
      
    }
    if(count == 0){
      return true;
    }
    return false;
  }
  
  public static boolean integerHasOddNumber(int a) {
    int count = 0;
    int lastDigit = a % 10;//used to check argument, is the last digit is odd
    while( a > 0){
      if(lastDigit % 2 == 1){
        count++;
      }
      a = a/10; //integer updated, last digit removed
      lastDigit = a % 10;//last digit (removed) of updated integer
    }
    if(count == 0){
      return false;
    }else {
      return true;
    }
  }
  
  public static boolean integerHasAllOddNumbers(int a){
    int count1 = 0;
    int count2 = 0;
    int lastDigit = a % 10;//store parameter, int a's last digit in variable: lastDigit
    while(a >0){
      if(lastDigit%2 ==1){//check that last digit is odd BEFORE, the divsion removes it
        count1++;
      }
      a = a /10;//update 1 for while loop
      count2++;//tally division by 10 until a > 0 in while loop test, this tells me number of digits
      lastDigit = a % 10;//update 
    }//end while loop
    if(count1 == count2){
      return true;
    }return false;
  }
}