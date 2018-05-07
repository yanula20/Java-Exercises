//Roundoff errors occur b/c numbers floats are stored as base 2
public class RoundOffErrorCumulativeSum {
  
  public static void main(String[ ] args) {
    double n = 1.0;
    for (int i = 1; i <= 10; i++) {
      n = n + 0.1;
      System.out.println(n);
    }
  }
}