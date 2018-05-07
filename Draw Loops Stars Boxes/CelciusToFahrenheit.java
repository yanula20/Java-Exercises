public class CelciusToFahrenheit {
  public static void main(String[] args) {
    System.out.println("36 deg celcius equals " + celcToFarhenheitConversion(36) + " deg Fahrenheit.");
    System.out.println("78 deg celcius equals " + celcToFarhenheitConversion(78) + " deg Fahrenheit.");
  }
  
  public static double celcToFarhenheitConversion(int celcius) {
    return 9/5*celcius + 32;
  }
}