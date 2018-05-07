

public class MultiplicationTable {
  public static void main(String[] args) {
    timesTable();
  }
  
  public static void timesTable() {
    int col;
    int row;
    
    for(row = 1; row <= 12; row++) {
      for(col = 1; col <= 12; col++) {
         System.out.printf("%5d",row * col);
      }System.out.print("\n");
    }
  }
}