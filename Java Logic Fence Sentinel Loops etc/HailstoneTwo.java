import java.util.*;

public class HailstoneTwo {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Enter the start for the hailstone calculation-->");
    int num = console.nextInt();
    System.out.print("Enter the length for the hailstone calculation-->");
    int length = console.nextInt();
    hailstone2(num,length);
    
  }
  public static void hailstone2(int num, int length) {
    int count = 0;
    System.out.print(num + " ");
    while(count != length-1){
      if(num%2 == 0) {
        num = num/2;
        System.out.print(num + " ");
        count++;
      }else {
        num = 3 * num + 1;
        System.out.print(num + " ");
        count++;
      }
    }
  }
}
