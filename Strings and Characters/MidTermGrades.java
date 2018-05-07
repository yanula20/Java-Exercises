import java.util.*;

public class MidTermGrades {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.print("Enter course max avg: ");
    double maxCourseAvg = CONSOLE.nextDouble();
    System.out.print("Enter your course avg: ");
    double yourCourseAvg = CONSOLE.nextDouble();
    System.out.println("This semester your grade is: " + yourGPA(maxCourseAvg, yourCourseAvg));
  }
  
  public static String yourGPA(double maxCourseAvg, double yourCourseAvg) {
    double yourGrade = yourCourseAvg / maxCourseAvg * 100;
    if(yourGrade >= 90.0) {
      return "A";
    }else if(yourGrade >= 80 && yourGrade < 90) {
      return "B";
    }else if(yourGrade >= 70 && yourGrade < 80) {
      return "C";
    }else if(yourGrade >= 65 && yourGrade < 70) {
      return "C- ";
    }else if(yourGrade >= 60 && yourGrade < 65) {
       return "D";
    }else {
      return "F";
    }
  }
}