public class Purchases {
  
  public static void main(String[] args) {
    int itemAmount;
    double pricePerItem;
    double answer = getTotalCost(7,30.0 );
    System.out.println("Your price is: " + answer);
    double answer1 = getTotalCost(4,30.0 );
    System.out.println("Your second price is: " + answer1);
  }
  
  
  public static double getTotalCost(int itemAmount, double pricePerItem) {
    if(itemAmount < 5) {
      return itemAmount*pricePerItem;
    }
    
    if(itemAmount >= 5 && itemAmount < 25) {
      return itemAmount*(pricePerItem*.90);
    }
    
    if(itemAmount >= 25 && itemAmount < 50) {
      return itemAmount*(pricePerItem*.85);
    }
    
    return itemAmount*(pricePerItem*.80);
    
  }
}