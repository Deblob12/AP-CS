
/**
 * Write a description of class TestCandidate here.
 * Candidate tester class using arrays
 * @author (Jeffrey Chiu) 
 * @version (06/04/18)
 */
public class TestCandidate
{
    public static void printVotes(Candidate[] c){
        System.out.println("Results per candidate: ");
        System.out.println("-----------------------");
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
    
    public static int getTotal(Candidate[] c){
        int sum = 0;
        for(int i = 0; i < c.length; i++){
            sum = sum + c[i].getVotes();
        }
        return sum;
    }
    public static void printResults(Candidate[] c){
        String can = "Candidate";
        String vr = "Votes Received";
        String tv = "% of Total Votes";
        int sum = getTotal(c);
        System.out.format("%-15s", can);
        System.out.format("%-15s", vr);
        System.out.format("%-15s", tv);
        System.out.println();
        for(int i = 0; i < c.length; i++){
            System.out.format("%-15s", c[i].getName());
            System.out.format("%-15d", c[i].getVotes());
            System.out.format("%-15d", Math.round((c[i].getVotes()*100)/(double)sum));
            System.out.println();
        }
        System.out.println();
        System.out.println("Total number of votes in election: " + sum);
    }
    public static void main(String[] args){
      Candidate[] election = new Candidate[5];
      election[0] = new Candidate("John Smith", 5000);
      election[1] = new Candidate("Mary Miller", 4000);
      election[2] = new Candidate("Micheal Duffy", 6000);
      election[3] = new Candidate("Tim Robinson", 2500);
      election[4] = new Candidate("Joe Ashtony", 1800);
      printVotes(election);
      printResults(election); 
    }    
}
