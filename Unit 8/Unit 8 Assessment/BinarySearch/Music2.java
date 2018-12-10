
/**
 * Write a description of class Music here.
 * Music class with title, year, and singer
 * @author (Jeffrey Chiu) 
 * @version (06/07/18)
 */
public class Music2
{   
    private String title;
    private int year;
    private String singer;   
    Music2(String title, int year, String singer){
        this.title= title;
        this.year = year;
        this.singer = singer;
    }
       
    public String getTitle(){
        return title;
    }
    
    public int getYear(){
         return year;
    }
     
    public String getSinger(){
        return singer;
    }
    
    public String toString(){
        return title + ", " + year + ", " + singer;
    }
}
