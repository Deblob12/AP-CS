import java.util.Scanner;
import java.io.*;
import java.util.Arrays; 
/**
 * Write a description of class Tester here.
 * 
 * Tester class for description/encryption
 * @author (Jeffrey Chiu) 
 * @version (06/02/18)
 */
public class Tester
{
    public static void main(String[] args)throws IOException{
        
        Encryption ec = new Encryption();
        char[] aU = ec.NewU(); 
        char[] aL = ec.NewL(); 
        System.out.println("UpperCase for encryption: " + ec.alphabetToString(aU));
        System.out.println("LowerCase for encryption: "  + ec.alphabetToString(aL));
        Decryption dc = new Decryption(aU, aL);
        char[] bU = dc.NewU(); 
        char[] bL = dc.NewL(); 
        System.out.println("UpperCase for decryption: " + dc.alphabetToString(bU));
        System.out.println("LowerCase for decryption: "  + dc.alphabetToString(bL));        
        Scanner scan = new Scanner(System.in);
        System.out.println("Message: ");
        String message = scan.nextLine();
        
        File ofile = new File("Message.txt");
        PrintWriter out = new PrintWriter(ofile);

        System.out.println("Original Message:  "+message);
        String encryptedMessage = ec.encrypt(message);
        System.out.println("Encrypted Message: "+encryptedMessage);
        out.println(encryptedMessage);
        out.close();
        
        File ifile = new File("Message.txt");
        Scanner in = new Scanner(ifile);
        String readMessage = in.nextLine();
        
        String decryptedMessage = dc.decrypt(readMessage);
        System.out.println("Decrypted Message: "+decryptedMessage);
        in.close();
    }
}
