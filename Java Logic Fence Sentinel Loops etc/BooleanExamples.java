public class BooleanExamples {
  public static void main(String[] args) {
    boolean result1 = bothOdd1(2,3);
    System.out.println("Are 2 and 3 both odd? " + result1);
    boolean result2 =bothOdd2(9,3);
    System.out.println("Are 9 and 3 both odd? " + result2);
    boolean result3 =bothOdd3(789,433);
    System.out.println("Are 789 and 433 both odd? " + result3);
    boolean result4 =bothOdd4(215,39);
    System.out.println("Are 215 and 39 both odd? " + result4);
  }
  
  public static boolean bothOdd1(int a, int b) {
    if (a % 2 == 1) {
      if (b % 2 == 1) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean bothOdd2(int a, int b) {
    if (a % 2 != 1) {
      return false;
    }
    if (b % 2 != 1) {
      return false;
    }
    return true;
  }
  
  public static boolean bothOdd3(int a, int b) {
    if (a % 2 == 1 && b % 2 == 1) {
      return true;
    } else {
      return false;
    }
  }
  
  public static boolean bothOdd4(int a, int b) {
    return (a % 2 == 1 && b % 2 == 1);
  }
}