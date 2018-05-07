public class StringTest {
  public static void main(String[] args) {
    
    /* This error occurs if method .charAt(3), for example,
     * is searching 'outside' the range of the string indices: 
     * java.lang.StringIndexOutOfBoundsException: String index out of range: 3
     * You may also see index -1 if the char doesn't exit in the string 
     */
    
    String string1 = "You didn't have to be so nice";
    trySomeStringMethods(string1);
    String string2 = "To be or not to be";
    trySomeStringMethods(string2);
  }
  
  public static void trySomeStringMethods(String line) {
    System.out.println("The line is: " + line);
    char c = line.charAt(3);
    System.out.println("The char at index 3 is " + c);
    int index = line.indexOf("r");
    System.out.println("r is at index " + index);
    boolean start = line.startsWith("Four");
    System.out.println("It is " + start + " that the line starts with Four");
    String upper = line.toUpperCase( );
    System.out.println("The line in upper case is " + upper);
  }
}