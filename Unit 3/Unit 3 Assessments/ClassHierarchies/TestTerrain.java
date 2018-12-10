
/**
 * Write a description of class TestTerrain here.
 * 
 * Tester class of the Class Hierarchy project.
 * @author (Jeffrey Chiu) 
 * @version (05/30/18)
 */
public class TestTerrain
{
    public static void main(String[] args){
        Forest f = new Forest(100, 200, 100);
        Mountain m = new Mountain(300, 400, 25);
        WinterMountain w = new WinterMountain(500, 600, 15, 10.0);
        
        // print out to console. 
        System.out.println("Forest " + f.terrainSize() + " and has " + f.getTrees() + " trees.");
        System.out.println("Mountain " + m.terrainSize() + " and has " + m.getNumberOfMountains() + " mountains.");
        System.out.println("Winter Mountain " + w.terrainSize() + " and has temperature " + w.getTemp() + " and " + w.getNumberOfMountains() + " mountains.");
       
    }
}
