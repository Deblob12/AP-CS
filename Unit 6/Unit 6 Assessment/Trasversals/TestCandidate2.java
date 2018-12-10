import java.util.*;
/**
 * Write a description of class TestCandidate here.
 * Candidate tester class using ArrayLists
 * @author (Jeffrey Chiu) 
 * @version (06/04/18)
 */
public class TestCandidate2
{
    public static void printVotes(List<Candidate> c){
        System.out.println("Results per candidate: ");
        System.out.println("-----------------------");
        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i));
        }
    }
    
    public static int getTotal(List<Candidate> c){
        int sum = 0;
        for(int i = 0; i < c.size(); i++){
            sum = sum + c.get(i).getVotes();
        }
        return sum;
    }
    public static void printResults(List<Candidate> c){
        String can = "Candidate";
        String vr = "Votes Received";
        String tv = "% of Total Votes";
        int sum = getTotal(c);
        System.out.format("%-15s", can);
        System.out.format("%-15s", vr);
        System.out.format("%-15s", tv);
        System.out.println();
        for(int i = 0; i < c.size(); i++){
            System.out.format("%-15s", c.get(i).getName());
            System.out.format("%-15d", c.get(i).getVotes());
            System.out.format("%-15d", Math.round((c.get(i).getVotes()*100)/(double)sum));
            System.out.println();
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + sum);
    }
    public static void main(String[] args){
      List<Candidate> election = new ArrayList<Candidate>();
      election.add(new Candidate("John Smith",5000 ));
      election.add(new Candidate("Mary Miller",4000 ));
      election.add(new Candidate("Micheal Duffy", 6000 ));
      election.add(new Candidate("Tom Robinson", 2500 ));
      election.add(new Candidate("Joe Ashtony", 1800 ));
      printVotes(election);
      printResults(election); 
    }    
}
