
/**
 * Write a description of class Equilateral here.
 * Represents an Equilateral Triangle.
 * Inherits the Triangle class.
 * 
 * @author (Jeffrey Chiu) 
 * @version (05/28/18)
 */
public class Equilateral extends Triangle
{
   Equilateral(double side){
      super(side, side, side); 
    }
   
   public double getSide(){
       return this.getSideA();
   }
}
