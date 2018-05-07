import java.util.*;

public class ThreeTokens {
    public static void main(String[] args) {
      /* entering "the tank" prints "the", next() handles tokens which are either 
       * one character, num, int, double or word */
        Scanner console = new Scanner(System.in);
        System.out.print("Enter three tokens: ");
        String token1 = console.next( );
        String token2 = console.next( );
        String token3 = console.next( );
        System.out.println("The three tokens are:");
        System.out.println(token1);
        System.out.println(token2);
        System.out.println(token3);
    }
}