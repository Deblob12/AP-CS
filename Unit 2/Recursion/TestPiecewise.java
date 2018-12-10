
/**
 * Write a description of class TestPiecewise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPiecewise
{    //main function of the program
    public static void main(String[] args){
        //variables
        int x;
        int y;
        int z;        
        Piecewise function = new Piecewise(); // driver object for equations        
        //Q1
        x= 25;
        System.out.println("Q1: x = "+ x);
        System.out.println("f(" + x + ") = " + function.f1(x)); 
        //Q2
        y = 30;
        System.out.println("Q2: x = "+ y);
        System.out.println("f(" + y + ") = " + function.f2(y));
        //Q4
        z = 500;
        System.out.println("Q4: x = "+ z);
        System.out.println("f(" + z + ") = " + function.f4(z));
    
    } 
}
