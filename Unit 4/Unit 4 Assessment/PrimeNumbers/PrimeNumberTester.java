import java.util.Scanner;
/**
 * Write a description of class PrimeNumberTester here.
 * 
 * Tester Class for PrimeNumber class
 * @author (Jeffrey Chiu) 
 * @version (06/02/2018)
 */
public class PrimeNumberTester
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Upper Limit: ");
        int limit = input.nextInt();

        Prime p = new Prime(limit); 
        p.printPrime();
        System.out.println("Number of primes up to " + p.getLimit() + " = " + p.getList().size());
    }
}
