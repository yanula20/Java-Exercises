import java.util.*;

public class TobaccoAndAlcohol {
  //class constant
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Enter your age-->" );
    int age = console.nextInt();
    partyTime(age);
    
  }
  public static void partyTime(int age) {
    boolean purchaseAlcoholandCiggies = (age >= 21);
    boolean purchaseCiggies = (age >= 18 && age < 21);
    boolean cantPurchaseCigsOrLiquour = (age < 18);
    if(purchaseAlcoholandCiggies){
      System.out.println("You can buy alcohol and cigarettes.");
    }else if(purchaseCiggies){
      System.out.println("You can buy tobacco, but not alcohol.");
    }else if(cantPurchaseCigsOrLiquour) {
      System.out.println("You can't buy tobacco or alcohol.");
    }
  }
}