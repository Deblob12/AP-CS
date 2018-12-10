
/**
 * Write a description of class MyMath here.
 * Extension of Homework class for math homework
 * @author (Jeffrey Chiu) 
 * @version (06/03/18)
 */
public class MyMath2 extends Homework2
{

    /**
     * Constructor for objects of class MyMath
     */
    public MyMath2()
    {
       super();
    }

    public void doReading(){
        this.setPages(this.getPages() - 2);
    }
    public void createAssignment(int p){
        this.setPages(p);
        this.setHomework("Math");
    }
    public String toString(){
        return this.getHomework() + " - must read " + this.getPages() + " pages";
    }
}
