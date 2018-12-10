
/**
 * Write a description of class MyScience here.
 * 
 * Science class extending Homework for Science homework
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/03/18)
 */
public class MyScience extends Homework
{
    /**
     * Constructor for objects of class MyScience
     */
    public MyScience()
    {
       super();
    }

    public void createAssignment(int p){
        this.setPages(p);
        this.setHomework("Science");
    }
    public String toString(){
        return this.getHomework() + " - must read " + this.getPages() + " pages";
    }
}
