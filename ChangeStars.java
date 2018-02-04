public class ChangeStars {
  public static void main(String[] args) {
    writeStars(2);
    writeStars(0);
    writeStars(-1);
    writeStars(22);
    writeStars(31);
  }

  public static void writeStars(int number) {
    int i;
    for(i = 1; i <= number; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}