public class Reverse {
  public static void main(String[] args) {
    int i;
   
    String testString = "The quick brown fox jumped over the lazy dog!";
    System.out.println("The string length is " + testString.length());
 
    System.out.println("The characters in reverse are as follows: ");
    for(i = testString.length()-1; i >= 0 ; i--) {
      System.out.println(testString.charAt(i) + " at index " + i);
    }
  }
}