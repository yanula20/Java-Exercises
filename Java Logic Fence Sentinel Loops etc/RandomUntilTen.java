import java.util.*;

public class RandomUntilTen{
  public static void main(String[] args){
    printRandomsUntilTen();
  }
  public static void printRandomsUntilTen(){
    int count = 0;
    Random r = new Random();
    int num = r.nextInt(10) + 1;
    if(num == 10) {
      System.out.print(num + " ");
    }else {
      while(num != 10){
        System.out.print(num + " ");
        num = r.nextInt(10) + 1;
        count++;
      }System.out.println(num);
    }
    System.out.println(count + " random numbers were printed before a 10 was picked.");
  }
}