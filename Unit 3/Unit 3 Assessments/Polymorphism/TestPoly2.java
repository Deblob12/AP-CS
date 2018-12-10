import java.util.ArrayList; 
/**
 * Write a description of class TestPoly2 here.
 * 
 * Tester class for the circle, oval, oval cylinder, and cylinder.  This program is to show 
 * the nature of polymorphic methods. 
 * 
 * A showCenter polymorphic method is added. 
 * 
 * @author (Jeffrey Chiu) 
 * @version (05/30/18)
 */
public class TestPoly2
{	
	
    public static String showCenter(Circle2 c)
	{
	     return "For " + c.toString() +" center is at " + c.getCenter() ;
	}
	

    public static void main(String[] args){
        Circle2 cir = new Circle2(2, 4, 5);
        Oval2 oval = new Oval2(25, 10, 5, 5);
        Cylinder2 cylinder = new Cylinder2(10, 15, 6 ,8);
        OvalCylinder2 ovalcyl = new OvalCylinder2(40, 10, 5, 5, 8);
        ArrayList<Circle2> alist = new ArrayList<Circle2>();
        alist.add(cir);
        alist.add(cylinder); 
        alist.add(oval); 
        alist.add(ovalcyl); 
        for(Circle2 c : alist){
            System.out.println(showCenter(c));
        }
    }
}
