public class OldMacDonald {
  public static void main(String[] args){
    //print title
    System.out.println("Old MacDonald Had a Farm.");
    System.out.println();
    
    firstVerse();
    System.out.println();
    
    secondVerse();
    System.out.println();
    
    thirdVerse();
    System.out.println();
  }
  
  //This method prints the Old Macdonald line
  public static void oldMacLine() {
    System.out.println("Old Macdonald had a farm, E-I-E-I-O");
  }
  
  //This method prints the moo lines
  public static void moo(){
    System.out.println("With a moo-moo here and a moo-moo there");
    System.out.println("Here a moo there a moo");
    System.out.println("Everywhere a moo-moo");
  }
  
  //This method prints the oink lines
  public static void oink(){
    System.out.println("With an oink-oink here and an oink-oink there");
    System.out.println("Here an oink there an oink");
    System.out.println("Everywhere an oink-oink");
  }
  
  //This method prints the neigh lines
  public static void neigh(){
    System.out.println("With a neigh-neigh here and a neigh-neigh there");
    System.out.println("Here a neigh there a neigh");
    System.out.println("Everywhere a neigh-neigh");
  }
  
  //This method prints the first verse
  public static void firstVerse() {
    oldMacLine();
    System.out.println("And on his farm he had a cow, E-I-E-I-O ");
    moo();
    oldMacLine();
  }
  
  //This method prints the second verse
  public static void secondVerse() {
    oldMacLine();
    System.out.println("And on his farm he had a pig, E-I-E-I-O ");
    oink();
    moo();
    oldMacLine();
  }
  
  //This method prints the third verse
  public static void thirdVerse() {
    oldMacLine();
    System.out.println("And on his farm he had a horse, E-I-E-I-O ");
    neigh();
    oink();
    moo();
    oldMacLine();
  }
}