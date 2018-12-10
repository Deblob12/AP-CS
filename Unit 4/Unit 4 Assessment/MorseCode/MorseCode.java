import java.io.*;
import java.io.IOException;
import java.util.Scanner;
/**
 * Write a description of class MorseCode here.
 * 
 * Creates an array of morse code symbols for "morecode.txt" then processes user input and converts input to morse code
 * 
 * @author (Jeffrey Chiu) 
 * @version (05/31/18)
 */
public class MorseCode{   
    final static int A = 0;
    final static int B = 1;
    final static int C = 2;
    final static int D = 3;
    final static int E = 4;
    final static int F = 5;
    final static int G = 6;
    final static int H = 7;
    final static int I = 8;
    final static int J = 9;
    final static int K = 10;
    final static int L = 11;
    final static int M = 12;
    final static int N = 13;
    final static int O = 14;
    final static int P = 15;
    final static int Q = 16;
    final static int R = 17;
    final static int S = 18;
    final static int T = 19;
    final static int U = 20;
    final static int V = 21;
    final static int W = 22;
    final static int X = 23;
    final static int Y = 24;
    final static int Z = 25;
    final static int ONE    = 26;
    final static int TWO    = 27;
    final static int THREE  = 28;
    final static int FOUR   = 29;
    final static int FIVE   = 30;
    final static int SIX    = 31;
    final static int SEVEN  = 32;
    final static int EIGHT  = 33;
    final static int NINE   = 34;
    final static int ZERO   = 35;
    
    private static String[] c = new String[36]; 
    

    public static void buildMorseCode() throws IOException {
        File file = new File("morsecode.txt");
        Scanner input = new Scanner(file);
        String s= "";
        int count = 0; 
  
        while (input.hasNext()){
           s = input.nextLine(); 
           c[count++] = s; 
        }
    }
   
    public static String getCode(int n){
        return c[n];
    }
  

    public static String translate(String message){
        String morseMessage = ""; 
        int index = 0;
        
        message = message.toUpperCase();
        for(int i = 0; i<message.length();i++){
            char ch = message.charAt(i);
            if(ch >= 'A' && ch<='Z'){
                index = (int)(ch - 'A');
                if (i==0){
                    morseMessage = morseMessage + getCode(index);
                }
                else{
                    morseMessage = morseMessage + " " + getCode(index);
                }
            }
            else if(ch>= '1' && ch<= '9'){
                 index = (int)(ch - '1' + 26); 
                 if (i==0){
                     morseMessage += getCode(index);
                    }
                 else{
                     morseMessage += " " + getCode(index);
                    }
            }
            else if(ch == 0){
                 index = ZERO;
                 if (i==0){
                     morseMessage += getCode(index);
                    }
                 else{
                     morseMessage += " " + getCode(index);
                    }
            }
           
        }
        return morseMessage; 
    }
}