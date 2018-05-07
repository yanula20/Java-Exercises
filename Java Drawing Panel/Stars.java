public class Stars {
  public static void main(String[] args) { 
    write13Stars(); 
    write7Stars(); 
    write35Stars(); 
  } 
  
  public static void write13Stars() {
    for (int i = 1; i <= 13; i++) {
      System.out.print("*");
    } 
    System.out.println();
  } 
  
  public static void write7Stars() {
    for (int i = 1; i <= 7; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
  
  public static void write35Stars() { 
    for (int i = 1; i <= 35; i++) {
      System.out.print("*");
    }
    System.out.println();
  } 
}