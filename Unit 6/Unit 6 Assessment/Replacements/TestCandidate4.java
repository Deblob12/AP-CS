import java.util.*;
/**
 * Write a description of class TestCandidate here.
 * Candidate tester class using ArrayLists and replacing elements
 * @author (Jeffrey Chiu) 
 * @version (06/04/18)
 */
public class TestCandidate4
{
    public static void printVotes(List<Candidate> c){
        System.out.println("Results per candidate: ");
        System.out.println("-----------------------");
        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i));
        }
    }
    
    public static void replaceName(List<Candidate> c, String find, String replace){
        for(int i = 0; i < c.size(); i++){
            if(c.get(i).getName().equals(find)){
                c.get(i).setName(replace);
            }
        }
    }
    public static void replaceVotes(List<Candidate> c, String find, int replace){
        for(int i = 0; i < c.size(); i++){
            if(c.get(i).getName().equals(find)){
                c.get(i).setVotes(replace);
            }
        }
    }
    public static void replaceCandidate(List<Candidate> c, String find, String replace, int newVote){
        for(int i = 0; i < c.size(); i++){
            if(c.get(i).getName().equals(find)){
                c.get(i).setName(replace);
                c.get(i).setVotes(newVote);
            }
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
       election.add(new Candidate("Mickey Jones", 3000));
       election.add(new Candidate("Rebecca Morgan", 2000));
       election.add(new Candidate("Kathleen Turner", 8000));
       election.add(new Candidate("Tory Parker", 500));
       election.add(new Candidate("Ashton Davis", 10000));
       
       System.out.println("Original results: ");
       printResults(election);
       System.out.println("Changing Micheal Duffy to John Elmos: ");
       System.out.println();
       replaceName(election, "Micheal Duffy", "John Elmos");
       printResults(election);
       System.out.println("Changing Mickey Jones votes to 2500: ");
       replaceVotes(election, "Mickey Jones", 2500);
       printResults(election);
       System.out.println("Changing Kathleen Turner to John Kennedy and 8000 votes to 8500 votes: ");
       replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
       printResults(election);
      
    }    
}
