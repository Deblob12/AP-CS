import java.util.Scanner;
/**
 * Write a description of class FibonacciNumbers here.
 * 
 * Purpose of this program is to be able to calculate the numbers of the Fibonacci sequence.
 * User is allowed to input their own numbers
 * If numbers are too big or small, the program exits and explains to the user why
 * 
 * @author (Jeffrey Chiu) 
 * @version (1/24/16)
 */
public class FibonacciNumbers
{
    //Constructor for the class FibonacciNumbers
    FibonacciNumbers(){
    }
    
    // overloading method for fibo(0) to fibo(43); 
    public int fibo(int n){
        int result=0; 
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        if(n > 1) {
            result = fibo(n-1) + fibo(n-2); 
        }
        return result; 
    }

    //main function of the program
    public static void main(String[] args){

      Scanner scan = new Scanner(System.in);
      boolean exit = false;
      while(!exit){
        System.out.print("Enter the value for the variable n: ");
        int n = Integer.parseInt(scan.nextLine());
        FibonacciNumbers fibonacci = new FibonacciNumbers();
        if (n >= 0 && n<=46) {
                     System.out.println(fibonacci.fibo(n));        
                     System.out.print("Continue(y/n)? ");
                     String answer = scan.nextLine();
                     if(answer.charAt(0)== 'y' || answer.charAt(0)=='Y'){
                        exit = false; 
                    }
                    else if(answer.charAt(0)== 'n' || answer.charAt(0)=='N'){
                        exit = true; 
                    }
             }

        else if (n>= 0){
          System.out.println("Number out of range"); 
          exit = true; 
        }
        else {
          System.out.println("Input needs to be positive"); 
          exit = true;         
        }
      }
    }
}
