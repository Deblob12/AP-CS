
/**
 * Write a description of class Decryption here.
 * 
 * Decryption mechamishm: 
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/02/2018)
 */
public class Decryption
{

    private char[] U = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K','L', 'M', 'N', 'O',
                                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private char[] L = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k','l', 'm',
                                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 
    

    Decryption(char[] aU, char[] aL){
        for (int i = 0; i<26; i++){
             U[(int)(aU[i] - 'A')] = (char) (i+'A'); 
             L[(int)(aL[i] - 'a')] = (char) (i+'a');  
        }
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

    
       
    public char getDecipherAlphabet(char ch){
            int index = 0;
            char out = '$';        
            if(ch>='A'&& ch<='Z'){
                 index=((ch- 'A')); 
                 if(index<0) index = index+26; 
                 out = U[index]; 
            }
            else if(ch>='a'&& ch<='z'){
                 index=((ch- 'a'));
                 if(index<0) index = index+26;
                 out = L[index];
            }
         return out; 
    }
    
    

    public String decrypt(String message){
        String resultMessage = "";
        for(int i = 0; i<message.length();i++){
            char ch = message.charAt(i);
            char chout = getDecipherAlphabet(ch); 
            if (chout != '$') resultMessage +=  chout; 
        }
        return resultMessage;
    }    
   
}
