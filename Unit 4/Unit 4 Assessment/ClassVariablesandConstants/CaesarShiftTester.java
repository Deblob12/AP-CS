import java.util.Scanner;
/**
 * Cipher for Encryption, decryption
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/01/2018)
 */
public class CaesarShiftTester
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        boolean wrongType = false;
        do {
            System.out.println("1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Exit");
            
            try {
              choice = Integer.parseInt(scan.nextLine());
            }
            catch (Exception ex){
                 System.out.println("Invalid Input");
                 wrongType = true; 
            }
            
            if((choice == 1 || choice == 2) && !wrongType){
                System.out.print("Shift value: ");
                try {
                  int shiftKey = Integer.parseInt(scan.nextLine());
                  if (shiftKey <=25 && shiftKey >=0) {  // check if the shift-key range is corrent
                    System.out.print("Message: ");
                    String message = scan.nextLine();
                  
                    if(choice == 1){
                        System.out.println("Encrypted Message: "+CaesarShiftEncryption.encrypt(message, shiftKey));}
                    else if(choice == 2){System.out.println("Decrypted Message: "+ CaesarShiftDecryption.decrypt(message, shiftKey));}
                  }
                  else {
                    System.out.println("Wrong input"); 
                  }
                }
                catch (Exception ex) {
                    System.out.println("Invalid input"); 
                }    
            }
        }while(choice != 3) ; 
    }
}
