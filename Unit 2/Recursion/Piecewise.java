
/**
 * Write a description of class Piecewise here.
 * 
 * This program demonstrates how to solve a piecewise recursive function.  
 * This program includes the questions number 1, 2 , and 4 from the worksheet.
 * It calculates the answers of the piecewise functions returns it
 * @author (Jeffrey Chiu)
 * @version (5/24/18)
 */
public class Piecewise
{
    //Constructor of the program
    Piecewise(){
    
    }
    
    //the function represents piecewise of number 1
    public int f1(int x){
        if(x <= 10){
            System.out.println(x + " <= 10, therefore ... f(" + x + ") = -7");
            return -7;
        }
        else {
            System.out.println(x + " > 10 , therefore f(" + x + ") = f(" + x + " -4)+ 2 = f(" + (x - 4)+ ") + 2");
            return f1(x-4)+ 2;
        }
    }
    
    //the function represents piecewise of number 2
    public int f2(int y){
        if(y<=25){
            System.out.println(y + " <= 25, therefore ... f(" + y + ") = 20");
            return 20;
        }
        else{
            System.out.println(y + " > 25 , therefore f(" + y + ") = f(" + y + " /12+5)-3 = f(" + (y/12+5)+ ") - 3");
            return f2(y/12+5)-3;
        }
    }
    
    //the function represents piecewise of number 4
     public int f4(int z){
         if(z> 20){
            System.out.println(z + " > 20, therefore ... f(" + z + ") = -100");
            return -100;
          }
         else{
            System.out.println(z + " <= 20 , therefore f(" + z + ") = f(" + z + " *2)-4 = f(" + (z*2)+ ") - 4");
            return f4(z*2)-4;
         }
    }
    

}
