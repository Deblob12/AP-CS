/**
 * Write a description of class StudentData here.
 * Tester Class to work with assertions and exceptions
 * @author (Jeffrey Chiu) 
 * @version (06/06/18)
 */
public class TestProgStudentData
{
  public static void main(String[] args){
      
      double[] testScores = {89.00, 78.00, 95.00, 63.00, 94.00};
      double[] testScores1 = {88.00, 90.00, 100.00, 88.00, 90.00, 100.00};
      double[] testScores2 = {};  
      /**StudentData s1 = new StudentData("", "Doe", testScores);         
      System.out.println(s1.toString());
      StudentData s2 = new StudentData("Lindsay", "", testScores1);         
      System.out.println(s2.toString());
      StudentData s3 = new StudentData("Lindsay", "Green", testScores2);         
      System.out.println(s3.toString());
      **/
      StudentData s4 = new StudentData("John", "Doe", testScores);         
      System.out.println(s4.toString());
      StudentData s5 = new StudentData("Lindsay", "Green", testScores1); 
      System.out.println(s5.toString());
    }
}
