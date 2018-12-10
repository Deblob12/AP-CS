
/**
 * Write a description of class MyEnglish here.
 *  
 * English class extending Homework for English homework
 * 
 * @author (Jeffrey CHiu) 
 * @version (06/03/18)
 */
public class MyEnglish2 extends Homework2
{  
        /**
     * Constructor for objects of class MyEnglish
     */
    public MyEnglish2()
    {
       super();
    }
    public void doReading(){
        this.setPages(this.getPages() - 1);
    }

    public void createAssignment(int p){
        this.setPages(p);
        this.setHomework("English");
    }
    public String toString(){
        return this.getHomework() + " - must read " + this.getPages() + " pages";
    }
}
