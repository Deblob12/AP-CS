
/**
 * Write a description of class MyEnglish here.
 *  
 * English class extending Homework for English homework
 * 
 * @author (Jeffrey CHiu) 
 * @version (06/03/18)
 */
public class MyEnglish extends Homework
{  
        /**
     * Constructor for objects of class MyEnglish
     */
    public MyEnglish()
    {
       super();
    }

    public void createAssignment(int p){
        this.setPages(p);
        this.setHomework("English");
    }
    public String toString(){
        return this.getHomework() + " - must read " + this.getPages() + " pages";
    }
}
