
/**
 * Write a description of class MyMath here.
 * Extension of Homework class for math homework
 * @author (Jeffrey Chiu) 
 * @version (06/03/18)
 */
public class MyMath extends Homework
{

    /**
     * Constructor for objects of class MyMath
     */
    public MyMath()
    {
       super();
    }

    public void createAssignment(int p){
        this.setPages(p);
        this.setHomework("Math");
    }
    public String toString(){
        return this.getHomework() + " - must read " + this.getPages() + " pages";
    }
}
