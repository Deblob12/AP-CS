
/**
 * Write a description of class Cube3 here.
 * 
 * Cube3 class overridng the toString() method. 
 * 
 * @author (Jeffrey Chiu) 
 * @version (05/31/18)
 */
public class Cube3 extends Box3
{
   /**
    * Contructor of a cube
    * 
    * @param s int side of a cube
    */
   public Cube3(int s){
       super(s, s, s);
    }
   
   public String toString(){
       return "Cube -  " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
