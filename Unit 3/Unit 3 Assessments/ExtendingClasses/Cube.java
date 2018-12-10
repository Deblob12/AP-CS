
/**
 * Write a description of class Cube here.
 * 
 * Cube Class in which all congruent sides
 * This inherits the Box class.
 * 
 * @author (Jeffrey Chiu) 
 * @version (05/28/18)
 */
public class Cube extends Box
{
   /**
    * Constructor of the Cube class
    * 
    * @param side int side length value of a cube
    */
   Cube(int side){
      super(side, side, side); 
    }
   
   /**
    * get the side length of a cube
    * 
    * @return int length of a side in a cube
    */
   public int getSide(){  
       return this.getLength();
   }
   
}
