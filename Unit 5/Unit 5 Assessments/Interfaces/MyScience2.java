
/**
 * Write a description of class MyScience here.
 * 
 * Science class extending Homework for Science homework
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/03/18)
 */
public class MyScience2 extends Homework2
{
    /**
     * Constructor for objects of class MyScience
     */
    public MyScience2()
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
