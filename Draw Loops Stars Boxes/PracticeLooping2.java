
public class PracticeLooping2 {
  public static void main(String[] args) {
    int row;
    int col;
    /* 
     1\ 3\ 5\ 7\ 
     4\ 6\ 7\ 9\
     7\ 9\ 11\ 13\
     */
    for(row = 1; row <= 7; row+=3) {

      for(col = 1; col <= 4; col++){
        System.out.print(row + 2*(col-1) + "\\"); 
      }
      System.out.print("\n");
    }
  } 
} 

//