/*
 * Repeatedly prompt the user to enter a grade.
 * 
 * The grade must be between 0 and 100; or it can be equal to -1.
 * Entering a -1 means the user has finished entering grades.
 * 
 * Output to the user
 * - How many grades the user entered
 * - The average of the grades
 * - Error messages when appropriate
 * 
 * Sample interaction:
 * 
 * Enter a grade: 70
 * Enter a grade: 75
 * Enter a grade: 101
 * Error. Grade must be between 0 and 100; or -1 to finish
 * Enter a grade: -1
 * 
 * You entered 2 grades. The average is 72.5
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
  public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                ArrayList<Integer> grade = new ArrayList<Integer>();
              while (true) {
                  System.out.print("Enter a grade: ");
                  grade.add(s.nextInt());
              }
              
             
             
  }

}
