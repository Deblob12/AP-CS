
/**
 * Write a description of class CaesarShiftDecryption here.
 * 
 * Class for Caesar Shift decryption
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/01/2018)
 */
public class CaesarShiftDecryption
{

    public static int shiftKey = 0; 
    private final static char[] alphabetU = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K','L', 'M', 'N', 'O',
                                             'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private final static char[] alphabetL = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k','l', 'm',
                                             'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};                                                    
    public static char getDecipherAlphabet(char ch, int value){
            int index = 0;
            char out = '_';        
            if(ch>='A'&& ch<='Z'){
                 index=((ch- 'A'- value)); 
                if(index<0){
                   index += 26;  
                   out = alphabetU[index]; 
                }
            }
            else if(ch>='a'&& ch<='z'){
                 index=((ch- 'a'- value));
                 if(index<0){
                   index += 26; 
                   out = alphabetL[index];
                }
            }
         return out; 
    }
    
    public static String decrypt(String message, int value){
        shiftKey = value; 
        String resultMessage = "";
        for(int i = 0; i<message.length();i++){
            char ch = message.charAt(i);
            char out = getDecipherAlphabet(ch, shiftKey); 
            if (out != '$') resultMessage += out; 
        }
        return resultMessage;
    }    
   
}
