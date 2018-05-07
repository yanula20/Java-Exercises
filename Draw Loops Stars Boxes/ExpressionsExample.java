public class ExpressionsExample {

  public static void main(String[] args) {
    double x = 20.0;
    int y = 5;
    //4
    System.out.println(2 + 2);
    //8
    System.out.println(2 + 2 * 3);
    //double 5.0
    System.out.println(10.0 / 2);
    
    System.out.println(x / y);
    //divide by an integer, u get an integer in your answer answer is 10!
    System.out.println("120/11 java integer divsion = " + 120/11);
    // 1
    System.out.println("10 % 3 = " + 10 % 3);
    //1
    System.out.println("100 % 9 = " + 100 % 9);
    //4
    System.out.println("25 % 7 = " + 25 % 7);
    System.out.println("modulus obtains 2 last digits in any number 123,456: " + 123456 % 100 );
    System.out.println("modulus obtains 3 last digits in any number 123,456: " + 123456 % 1000 );
    System.out.println("modulus obtains 4 last digits in any number 123,456: " + 123456 % 10000 );
  }
}