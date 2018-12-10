
/**
 * Write a description of class MyJava here.
 * 
 * MyJava extension of Homework class for Java homework
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/03/2018)
 */
public class MyJava2 extends Homework2
{
    /**
     * Constructor for objects of class MyJava
     */
    public MyJava2()
    {
       super();
    }
    public void doReading(){
        this.setPages(this.getPages() - 4);
    }

    public void createAssignment(int p){
        this.setPages(p);
        this.setHomework("Java");
    }
    public String toString(){
        return this.getHomework() + " - must read " + this.getPages() + " pages";
    }
}
