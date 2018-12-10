
/**
 * Write a description of class Movie2 here.
 * Basic class for Movie2, includes title, year, and studio
 * @author (Jeffrey Chiu) 
 * @version (06/06/18)
 */
public class Movie4
{
    // instance variables - replace the example below with your own
    private int year;
    private String title;
    private String studio;

    Movie4(String title, int year, String studio){
        this.title = title;
        this.year = year;
        this.studio = studio;
    }
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }
    public String getStudio(){
        return studio;
    }
    public String toString(){
        return title+ ", "+ year+ ", " + studio;
    }
}
