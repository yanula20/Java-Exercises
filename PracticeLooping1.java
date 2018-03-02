
public class PracticeLooping1 {
  public static void main(String[] args) {
    int row;
    int col;
    /* 
     1, 2 , 3, 4, 5 
     3, 5, 7, 9
     5, 8, 11
     7, 11
     9
     */
    for(row = 1; row <= 5; row++) {
      int rowStart = 1 + 2*(row-1);
      System.out.print(rowStart + ",");
      for(col = 1; col<= 5-row; col++){
        System.out.print(rowStart + (col*row) + ","); 
      }
      System.out.print("\n");
    }
  } 
} 

//