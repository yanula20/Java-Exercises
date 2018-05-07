
public class PracticeLooping {
  public static void main(String[] args) {
    int row;
    int col;
    int c;
    
    
    
    /* 
     1, 2, 4, 8, 16, 256
     1, 3, 9, 81, 81^2
     1, 4, 16, 16^2, (16^2)^2
     1, 5,...
     */
    for(row = 1; row <= 5; row++) {
      System.out.print(1 + ",");
      System.out.print(row + 1 + ",");
      int result = row + 1;
      
      for(col=3; col<=5; col++){
        System.out.print((int)Math.pow(result,col-1) + ",");
      }
      System.out.print("\n");
    }
  } 
} 

//