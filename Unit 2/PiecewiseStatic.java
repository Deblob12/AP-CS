
/**
 * Write a description of class Piecewise here. (Static Method Version)
 * 
 * 1. This program demonstrates how to solve a piecewise recursive function.  
 * 2. This program includes the questions number 1, 2 , and 4 from the worksheet.
 * 3. It calculates the answers of the piecewise functions and print it out on the screen.
 * 4. Using class methods to solve these problems.  A driver object for the equations is not needed. 
 * 
 * @author (Eric Chou Jr.) 
 * @version (V1 or 1/12/16)
 */
public class PiecewiseStatic
{
    //Constructor of the program
    PiecewiseStatic(){
    
    }
    
    //the function used to calculate the piecewise function of number 1
    public static int fs1(int x){
        if(x <= 10){
            System.out.println(x + " <= 10, therefore ... fs(" + x + ") = -7");
            return -7;
        }
        else {
            System.out.println(x + " > 10 , therefore fs(" + x + ") = fs(" + x + " -4)+ 2 = fs(" + (x - 4)+ ") + 2");
            return fs1(x-4)+ 2;
        }
    }
    
    //the function used to calculate the piecewise function of number 2
    public static int fs2(int y){
        if(y<=25){
            System.out.println(y + " <= 25, therefore ... fs(" + y + ") = 20");
            return 20;
        }
        else{
            System.out.println(y + " > 25 , therefore fs(" + y + ") = fs(" + y + " /12+5)-3 = fs(" + (y/12+5)+ ") - 3");
            return fs2(y/12+5)-3;
        }
    }
    
    //the function used to calculate the piecewise function of number 4
     public static int fs4(int z){
         if(z> 20){
            System.out.println(z + " > 20, therefore ... fs(" + z + ") = -100");
            return -100;
          }
         else{
            System.out.println(z + " <= 20 , therefore fs(" + z + ") = f(s" + z + " *2)-4 = fs(" + (z*2)+ ") - 4");
            return fs4(z*2)-4;
         }
    }
    
    //main function of the program
    public static void main(String[] args){
        //variables
        int x;
        int y;
        int z;
        
        // Piecewise equation = new Piecewise(); // No driver needed
        
        //Number 1
        x= 25;
        System.out.println("Question 1: x = "+ x);
        System.out.println("fs(" + x + ") = " + fs1(x));
        System.out.println();
        
        //Number 2
        y = 30;
        System.out.println("Question 2: x = "+ y);
        System.out.println("fs(" + y + ") = " + fs2(y));
        System.out.println();
        
        //Number 4
        z = 500;
        System.out.println("Question 4: x = "+ z);
        System.out.println("fs(" + z + ") = " + fs4(z));
        System.out.println();
    
    } 
}
