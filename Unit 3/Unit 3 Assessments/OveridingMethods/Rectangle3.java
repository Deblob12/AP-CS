/**
 * Rectangle3 class
 * 
 * @author (Jeffrey Chiu)
 * @version (05/31/18)
 */
public class Rectangle3
{
	private int length;
	private int width;

	public Rectangle3(int l, int w)
	{
		length = l;
		width = w;
	}

	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
	    return "This rectangle is " + length + " X " + width;
	}
	
	/** 
	 * equals method for overriding
	 * 
	 * @return boolean check the equality for two Rectangle3 objects. 
	 */
	 public boolean equals(Rectangle3 rect){
       if((this.getLength()==(rect.getLength()))&& (this.getWidth()==(rect.getWidth())))
       {
           return true;
        }
       else return false; 
    }
}
