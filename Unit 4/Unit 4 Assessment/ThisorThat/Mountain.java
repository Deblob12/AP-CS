
/**
 * Write a description of class Mountain here.
 * 
 * This represents the number of mountains.
 * It inherits the Terrain class.
 * 
 * @author (Jeffrey Chiu) 
 * @version (05/30/18)
 */
public class Mountain extends Terrain
{

    private int numberOfMountains;
    

    public Mountain(int l, int w, int n){
        super(l, w);
        this.numberOfMountains = n;
    }
    

    public int getNumberOfMountains(){
        return numberOfMountains;
    }
}
