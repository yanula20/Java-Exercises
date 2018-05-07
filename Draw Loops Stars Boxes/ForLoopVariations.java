public class ForLoopVariations {
  
  public static void main(String[] args) {
    char symbol = '#';
    int i;
    int g;
    int k;
    
    for (i = 1; i <= 10; i++) {
      System.out.print(i + " ");
    }
    
    //spacing between loops
    System.out.println();
    System.out.println();
    
    for (g = 1; g <= 10; g++) {
      System.out.print(symbol);
    }
    
    //spacing between loops
    System.out.println();
    System.out.println();
    
    for (k = 10; k >= 0; k--) {
      System.out.println("Counting donwn... " + k + "!");
    }
    System.out.println("BLAST OFF!");
  }
}