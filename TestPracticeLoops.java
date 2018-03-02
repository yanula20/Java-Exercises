

public class TestPracticeLoops {
  public static void main(String[] args) {
    int i;
    int b;
    int c;
    int d;
    int x;
    int s;
    int t;
    int u;
    int v;
    int w;
    
    int y;
    int z;
    int odd = 1;
    int even = 2;
    
    
    //3, 8, 13, 18, 23
    for(i = 3; i<=25; i+=5) {
      System.out.print(i + ", ");
    } System.out.println("\n");
    
    
    //20, 10, 5, 2, 1
    for(b = 20; b>=1; b/=2) {
      System.out.print(b + ", ");
    } System.out.println("\n");
    
    //10,8, 6, 4, 2, 0
    //7, 5, 3, 1
    //4, 2, 0
    //1
    
    for(c = 10; c>=1; c-=3) {
      for(d = c; d >= 0; d-=2) {
        System.out.print(d + ", ");
      } System.out.print("\n");
    }
    
    
    /* 
     1, 3 , 5, 7, 9
     2, 4, 6, 8
     11, 13, 15
     10, 12
     17
     */
    
    for(s = 1; s<=5; s++) {
      
      if(s%2==1) {
        //when finished; t = 0;
        for(t = 5-(s-1); t>=1; t--) {
         
          System.out.print(odd + " ");
          odd+=2;
        } System.out.print("\n");
      }
      if(s%2==0) {
        //after above for loop runs thru 1st row; t =0; s=2
        for(t = 5 - (s-1); t>=1; t--) {
          
          System.out.print(even + " ");
          even+=2;
        } System.out.print("\n");
        
      }
      
    } 
    
    /* 
     1, 2 , 4, 8, 16
     1, 3, 9, 81, 81^2
     1, 4, 16, 16^2, (16^2)^2
     1, 5,...
     */
    
    
    
  } 
}

//