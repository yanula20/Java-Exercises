public class LoopUpdate {
  public static void main(String[] args) {
    // prints 1 2 3 4 5 6
    for (int i = 1; i <= 6; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
    
    //updated with i+=2
    for (int i = 1; i <= 6; i += 2) {
      System.out.print(i + " ");
    }
    System.out.println();

    
    // prints $$$$$$$$$$
    for (int j = 0; j < 10; j++) {
      System.out.print("$");
    }
    System.out.println();
    
    //updated with j+=2
    for (int j = 0; j < 10; j += 2) {
      System.out.print("$");
    }
    System.out.println();
  
    // prints 10 9 8 7 6 5 4 3 2 1 Lift off!
    for (int k = 10; k > 0; k--) {
      System.out.print(k + " ");
    }
    System.out.println("Lift off!");
    
    //updated with k-=2
    for (int k = 10; k > 0; k -= 2) {
      System.out.print(k + " ");
    }
    System.out.println("Lift off!");
  }
}