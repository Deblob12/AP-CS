
/**
 * Write a description of class Candidate here.
 * Basic Candidate class with toString method printing out number of votes
 * @author (Jeffrey Chiu) 
 * @version (06/03/18)
 */
public class Candidate
{
    // instance variables - replace the example below with your own
    private int numVotes;
    private String name;

    /**
     * Constructor for objects of class Candidate
     */
    public Candidate(String name, int numVotes)
    {
        // initialise instance variables
        this.numVotes = numVotes;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    public int getVotes(){
        return this.numVotes;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setVotes(int newVotes){
        this.numVotes = newVotes;
    }
    public String toString(){
        return name + " received " + numVotes + " votes.";
    }
}
