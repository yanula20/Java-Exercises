public class FinalExamPractice {
  public static void main(String[] args){
    
    for(int row = 1; row<=5; row++){//rows
      System.out.print(row + " ");
      for(int col = 1; col <=4; col++){
        System.out.print(row + (row*col) + " ");
      }
      System.out.println();
    }
    System.out.println();//spacing
    System.out.println();
    
    for(int i = 1; i<=5; i++){//rows
      for(int j = 1; j<=5; j++){
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }
}