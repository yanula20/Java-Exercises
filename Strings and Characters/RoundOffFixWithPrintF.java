public class RoundOffFixWithPrintF {
  
  public static void main(String[ ] args) {
    double n = 1.0;
    for (int i = 1; i <= 10; i++) {
      n = n + 0.1;
      System.out.printf("%4.2f\n", n);
    }
  }
}