
/**
 * Write a description of class MyJava here.
 * 
 * MyJava extension of Homework class for Java homework
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/03/2018)
 */
public class MyJava extends Homework
{
    /**
     * Constructor for objects of class MyJava
     */
    public MyJava()
    {
       super();
    }

    public void createAssignment(int p){
        this.setPages(p);
        this.setHomework("Java");
    }
    public String toString(){
        return this.getHomework() + " - must read " + this.getPages() + " pages";
    }
}
