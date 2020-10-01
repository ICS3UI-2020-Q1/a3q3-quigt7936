import java.util.Scanner;
/**
 * Tells a student what their number grade would be given the letter grade
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // ask what letter grade they got
    System.out.println("Please enter a letter grade");
    String letterGrade = input.nextLine();

    // tell them what grade they got
    switch (letterGrade) {
      case "A":
        System.out.println("This is between 80% and 100%");
        break;
      case "B":
        System.out.println("This is between 70% and 79%");
        break;
      case "C":
        System.out.println("This is between 60% and 69%");
        break;
      case "D":
        System.out.println("This is between 50% and 59%");
        break;
      case "F":
        System.out.println("This is between 0% and 49%");
        break;
      default:
        break;
    }
    
  }
}