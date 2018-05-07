public class printMultipleCharacters {
  public static void main(String[] args) {
    printCharacters('$', 5);
    printCharacters('#', 12);
    printCharacters('@', 4);
  
  }
  
  public static void printCharacters(char ch, int number) {
    int i;
    for(i = 1; i <= number; i++) {
      System.out.print(ch);
    }
    System.out.println();
  }
}