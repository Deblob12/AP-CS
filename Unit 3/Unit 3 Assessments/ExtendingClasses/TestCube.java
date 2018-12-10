
/**
 * Write a description of class TestCube here.
 * Prints out dimensions of Cube with length 4
 * Prints out dimensions of rectangle with length 2 and width 4
 * @author (Jeffrey Chiu) 
 * @version (05/28/18)
 */
public class TestCube
{
    public static void main(String[] args){
        int side = 4;
        Rectangle r = new Rectangle(2, 4);
        Cube cb = new Cube(side);
        
        System.out.println("One's dimensions are " + r.getLength() + " X " + r.getWidth());
        System.out.println("Cube's dimensions are " + cb.getSide() + " X " + cb.getSide() + " X " + cb.getSide());
    
    }
}
