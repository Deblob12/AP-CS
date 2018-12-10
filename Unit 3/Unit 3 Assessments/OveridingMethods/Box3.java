
/**
 * Box3 class
 * 
 * With overridden toString() and equals methods
 * 
 * @author(Jeffrey Chiu)
 * @version(05/31/18)
 */
public class Box3 extends Rectangle3
{
    private int height;
    public Box3(int l, int w, int h)
    {
        super(l, w);
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "Box -  " + getLength() + " X " + getWidth() + " X " + height;
    }
    
    /**
     * equals method for Box3 class. This method can be sued for both Box3 and Cube3 objects. 
     * 
     * @param box a Box3 object to check for the equality by contents. 
     * @return boolean for equality check. 
     */
    public boolean equals(Box3 box){
       if((this.getLength()==(box.getLength()))&& (this.getWidth()==(box.getWidth())&&(this.getHeight()==(box.getHeight()))))
       {
           return true;
        }
       else{ return false; 
    }
}
}