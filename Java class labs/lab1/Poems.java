
//This is lab1 for Don Moore, myUTSAID: qxv177
public class Poems {
  public static void main(String[] args) {
    System.out.println("Lab 1 written by Donald A. Moore");
    maryFirstVerse();
    oldManThreeVerses();
  }
  
  //this method prints the refrain for Mary poem
  public static void maryRepeatedLine() {
    System.out.println("Mary had a little lamb,");
  }
  
  //this method prints line two of the Mary poem
  public static void maryLine2() {
    System.out.println("Little lamb, little lamb,");
  }
  
  //this method prints line four of the Mary poem
  public static void maryLine4() {
    System.out.println("Its fleece was white as snow");
  }
  
  /*this method calls the all four lines of the first verse
   * Note: this method calls three seperate methods
   */
  public static void maryFirstVerse() {
    System.out.println("Title: Mary Had a Little Lamb");
    maryRepeatedLine();
    maryLine2();
    maryRepeatedLine();
    maryLine4();
  }
  
  //this is method prints the refrain of the 'This Old Man' poem
  public static void oldManRefrain() {
    System.out.println("With a knick-knack patty-whack, give a dog a bone");
    System.out.println("This old man came rolling home");
    System.out.println();
  }
  
  //This method prints verse one of the 'This Old Man' poem and calls the refrain method
  public static void oldManVerseOne() {
    System.out.println("This old man, he played one");
    System.out.println("He played knick-knack on my thumb [some versions use \"drum\" here]");
    oldManRefrain();
  }
  
  //This method prints verse two of the 'This Old Man' poem and calls the refrain method
  public static void oldManVerseTwo() {
    System.out.println("This old man, he played two");
    System.out.println("He played knick-knack on my shoe");
    oldManRefrain();
  }
  
  //This method prints verse three of the 'This Old Man' poem and calls the refrain method
  public static void oldManVerseThree() {
    System.out.println("This old man, he played three");
    System.out.println("He played knick-knack on my knee");
    oldManRefrain();
  }
  
  /*This method prints the title of the poem 
   * and calls three methods for each 
   * of the first three verses
   */
  public static void oldManThreeVerses() {
    System.out.println();
    System.out.println("Title: This Old Man");
    oldManVerseOne();
    oldManVerseTwo();
    oldManVerseThree();
  }
  
}