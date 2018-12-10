import java.util.Scanner;
import java.io.IOException;
/**
 * Write a description of class MorseCodeTester here.
 * 
 * Tester class for the Morse Code
 * 
 * @author (Jeffrey Chiu) 
 * @version (05/31/18)
 */
public class MorseCodeTester
{   
    public static void main(String[] args) throws IOException {
      String morseMessage = ""; 
     
      MorseCode.buildMorseCode(); 

      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Message: ");
      String message = scan.nextLine();
       
      morseMessage = MorseCode.translate(message);  
     
      System.out.println(morseMessage); 
    }
}
