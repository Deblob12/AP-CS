package Palindrome;
import java.util.Scanner;
/**
 * Write a description of class RecursivePalindromeTester here.
 * 
 * Tester class of the program of RecursivePalindrome.  
 * Program tells user whether inputted String is a palindrome
 * @author (Jeffrey Chiu) 
 * @version (05/26/18)
 */
public class RecursivePalindromeTester
{
    //main function
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        //while loop
        while(!done){
            RecursivePalindrome p = new RecursivePalindrome();
            System.out.println("Enter String: ");
            String s = scan.nextLine();
            System.out.println(p.isPalindrome(s));
            System.out.println("Continue(Y/N)? ");
            String exit = scan.nextLine();
            if(exit.length()!= 0 && (exit.charAt(0)=='Y' || exit.charAt(0)== 'y')){
                done = false;
            }
            else{
                done = true;
            }
        }
    }
    
}
