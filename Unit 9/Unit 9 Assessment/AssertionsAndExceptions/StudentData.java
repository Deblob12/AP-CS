
/**
 * Write a description of class StudentData here.
 * Class to work with assertions and exceptions
 * @author (Jeffrey Chiu) 
 * @version (06/06/18)
 */
public class StudentData
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private double[] testScores;
    private char grade;

    public StudentData(String firstName, String lastName, double[] testScores)throws IllegalArgumentException
    {
        if (testScores == null || testScores.length == 0)throw new IllegalArgumentException();
        if (firstName == null || firstName.equals(""))throw new IllegalArgumentException();        
        if (lastName == null || lastName.equals(""))throw new IllegalArgumentException();
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
        this.grade = grade;
    }
    
    public String getFirstName(){
      return firstName;
    }
  
  public String getLastName(){
      return lastName;
    }
  
  public double[] getTestScores(){
      return testScores;
    }

  public char getGrade(){
      return grade;
  }
  
  public void setGrade(char grade){
      this.grade = grade;
    }
    
  public char courseGrade(double[] testScores)throws IllegalArgumentException{
        if (testScores == null)throw new IllegalArgumentException();
        double sum = 0.0;
        double avg = 0.0;
        char grade = 'F';
        for(int i = 0; i< testScores.length; i++){
            sum += testScores[i];
        }
        avg = sum/testScores.length;
        if(avg >= 90)grade = 'A';
        else if(avg>= 80)grade = 'B';
        else if (avg>= 70) grade = 'C';
        else if (avg>= 60)grade = 'D';
        else  grade = 'F';
        setGrade(grade);
        return grade;
    }
  
  public String toString(){
    String results = String.format("%-10s %-10s ",firstName, lastName);
    for(double d : testScores){
        results += String.format("%6.2f ", d);
    }
    results += String.format("%1s", grade+"");
    return results;
    }  
  
}
