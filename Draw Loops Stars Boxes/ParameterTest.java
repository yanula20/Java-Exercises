public class ParameterTest {
   public static void main(String[] args) {
      int x = 3;
      System.out.println("x is  " + x);//3
      increment(x);
      
      //local scope is unaffected by method increment(x);
      System.out.println("x is now " + x);
   }

   public static void increment(int x) {
      System.out.println("In increment x is " + x);//3
      x = x + 1;
      System.out.println("In increment x is now " + x);//4
   }
}