
/**
 * Write a description of class Forest here.
 * 
 * This represents the number of trees.
 * It inherits the Terrain class.
 * 
 * @author (Jeffrey Chiu) 
 * @version (05/30/18)
 */
public class Forest extends Terrain
{

   private int trees;
   

   public Forest(int l, int w, int trees){
       super(l, w);
       this.trees = trees;
    }
   
   public int getTrees(){
       return trees;
    }
}
