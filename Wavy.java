public class Wavy {
  public static void main(String[] args) {
    int row;
    int col;
    for(row = 1; row <= 6; row++) {
      if( row % 2 == 0) {
        for(col = 1; col <= 8; col++) {
          System.out.print("\\");
        } System.out.println();
      } else {
        for(col = 1; col <= 8; col++) {
          System.out.print("/");
        } System.out.println();
      }
    }
  }
}