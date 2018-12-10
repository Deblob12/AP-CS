
/**
 * Write a description of class Triangle here.
 * 
 * This class represents an Triangle.
 * 
 * @author (Jeffrey Chiu) 
 * @version (05/28/18)
 */
public class Triangle
{
    private double sideA;
    private double sideB;
    private double sideC;
    

    Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA(){
        return sideA;
    }
    

    public double getSideB(){
        return sideB;
    }
    
 
    public double getSideC(){
        return sideC;
    }
}
