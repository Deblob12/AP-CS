
/**
 * Write a description of class WinterMountain here.
 * This represtents the temperature.
 * It inherits the Mountain Class.
 * @author (Jeffrey Chiu) 
 * @version (5/30/18)
 */
public class WinterMountain extends Mountain
{
   /** 
    * data field for temperature in a WinterMountain object
    */
   private double temp;
   
  
   public WinterMountain(int l, int w, int n, double t){
       super(l, w, n);
       temp = t;
    }
   
   public double getTemp(){
       return temp;
    }
}
