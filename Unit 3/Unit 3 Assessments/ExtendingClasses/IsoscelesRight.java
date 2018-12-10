
/**
 * Write a description of class IsoscelesRight here.
 * This class represents an Isosceles Right Triangle.
 * This inherits the Triangle class.
 * 
 * @author (Jeffrey Chiu) 
 * @version (-5/28/18) 
 */
public class IsoscelesRight extends Triangle
{
    IsoscelesRight(double side){
        super(side, side, Math.sqrt(Math.pow(side,2) + Math.pow(side, 2)));
    
    }
    
    public double getLeg(){
        return this.getSideA();
    }
    
    public double getHypo(){
        return this.getSideC();
    }
}
