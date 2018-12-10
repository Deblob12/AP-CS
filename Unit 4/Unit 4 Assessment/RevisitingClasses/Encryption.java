
/**
 * Write a description of class Encryption here.
 *  
 * Encryption mechamishm: 
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/02/18)
 */
public class Encryption
{

    private char[] U = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K','L', 'M', 'N', 'O',
                                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private char[] L = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k','l', 'm',
                                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 

    /**
     * random shuffling method for the encryption alphabets. 
     * 
     */
    public void shuffle(){
        for(int i = 0; i< U.length; i++){
            int index = (int)(Math.random() * U.length);
            char temp1 = U[i];
            U[i] = U[index];
            U[index] = temp1;
            
            char temp2 = L[i];
            L[i] = L[index];
            L[index] = temp2;
        }
        
    }
    

    Encryption(){
      shuffle();
    }
    
                       
    public char[] NewU(){
       return U; 
    }
    

    
    public char[] NewL(){
       return L; 
    }
    
public String alphabetToString(char[] a){
      String alphabet = "[";
 
          for (int i = 0; i<a.length; i++){
               if (i== 0){
                   alphabet += a[i];
               }
               else{
                   alphabet += ","+a[i];
               }    
               
           }
      alphabet += " ]"; 
      return alphabet;
    }
    
                      
    public char getCipherAlphabet(char ch){  
            int index = 0;
            char out = '$';
            if(ch>='A'&& ch<='Z'){
                 index=((ch- 'A'));
                 if(index >= 26) index -= 26; 
                 out = U[index];
            }
            else if(ch>='a'&& ch<='z'){
                 index=((ch- 'a'));
                 if(index>=26) index -= 26; 
                 out = L[index];
            }
            return out; 
      } 

    
    public String encrypt(String message){ 
        String resultMessage = "";
        for(int i = 0; i<message.length();i++){
            char ch = message.charAt(i);
            char chout = getCipherAlphabet(ch); 
            if (chout != '$') resultMessage += chout; 
        }
        return resultMessage;
    }               
}
