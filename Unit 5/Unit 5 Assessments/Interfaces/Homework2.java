
/**
 * Abstract class Homework - write a description of the class here
 * Basic Homework class has setter/getter methods for pages and type of Homework implements Processing interface
 * @author (Jeffrey Chiu)
 * @version (06/03/18)
 */
public abstract class Homework2 implements Processing
{
    // instance variables - replace the example below with your own
    private int pagesRead;
    private String typeHomework;
    
    public Homework2(){
        this.pagesRead = 0;
        this.typeHomework = "None";
    }
    
    public void setHomework(String typeHomework){
        this.typeHomework = typeHomework;
    }
    
    public String getHomework(){
        return this.typeHomework;
    }
    public void setPages(int pagesRead){
        this.pagesRead = pagesRead;
    }
    public int getPages(){
        return this.pagesRead;
    }
    
    
    public abstract void createAssignment(int p);
}
