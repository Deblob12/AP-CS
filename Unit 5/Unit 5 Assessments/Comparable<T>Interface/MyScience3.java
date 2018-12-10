
/**
 * Write a description of class MyScience here.
 * 
 * Science class extending Homework for Science homework
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/03/18)
 */
public class MyScience3 extends Homework3
{
    /**
     * Constructor for objects of class MyScience
     */
    public MyScience3()
    {
       super();
    }
    public void doReading(){
        this.setPages(this.getPages() - 3);
    }
    public void createAssignment(int p){
        this.setPages(p);
        this.setHomework("Science");
    }
    public String toString(){
        return this.getHomework() + " - must read " + this.getPages() + " pages";
    }
}
