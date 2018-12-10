package Palindrome;


/**
 * Write a description of class RecursivePalindrome here.
 * 
 * Functions to assist tester class in seeing if an inputted string is a palindrome
 * @author (Jeffrey Chiu) 
 * @version (05/26/18)
 */
public class RecursivePalindrome
{
    //helper function
    public String helper(String s){
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z]*", "");
        return s;
    }
    
    //isPalindrome function
    public boolean isPalindrome(String s){
        s = helper(s);
        if(s.length()== 0 || s.length()==1){
            return true;
        }
        if(s.length()== 2){
            return s.charAt(0)== s.charAt(1);
        }
        return (s.charAt(0)== s.charAt(s.length()-1))&& isPalindrome(s.substring(1, s.length()-1));
    }
  
}
