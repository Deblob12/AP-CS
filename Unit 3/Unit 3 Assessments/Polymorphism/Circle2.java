/**
 * Circle2 demo
 * 
 * A getCenter Method is added to provide a String for the coordination of the center 
 * of a Circle2 object. 
 * 
 * ©FLVS 2007
 * @author R. Enger (Modified by Eric S. Chou) 
 * @version 5/5/2007 (Modified on 02/16/2016)
 */
public class Circle2
{
	// instance variables 
	private int x;
	private int y;
	private int radius;

	/**
	 * Constructor for objects of class circle
	 */
	public Circle2(int p_x, int p_y, int r)
	{
		// initialise instance variables
		x = p_x;
		y = p_y;
		radius = r;
	}

	/**
	 * getter method for radius of a Circle2 object in int type. 
	 * 
	 * @return int the radius of an Circle2 object. 
	 */
	public int getRadius()
	{
		return radius;
	}
	
	/**
	 * getter method for center of a Circle2 object in String format
	 * 
	 * @return String center coordination in a String. 
	 */
	public String getCenter()
	{
	     return "(" + x + "," + y + ")";
	}
}