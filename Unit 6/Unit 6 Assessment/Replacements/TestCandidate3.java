
/**
 * Write a description of class TestCandidate here.
 * Candidate tester class using arrays and replacing elements
 * @author (Jeffrey Chiu) 
 * @version (06/04/18)
 */
public class TestCandidate3
{
    public static void printVotes(Candidate[] c){
        System.out.println("Results per candidate: ");
        System.out.println("-----------------------");
        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
    
    public static void replaceName(Candidate[] c, String find, String replace){
        for(int i = 0; i < c.length; i++){
            if(c[i].getName().equals(find)){
                c[i].setName(replace);
            }
        }
    }
    public static void replaceVotes(Candidate[] c, String find, int replace){
        for(int i = 0; i < c.length; i++){
            if(c[i].getName().equals(find)){
                c[i].setVotes(replace);
            }
        }
    }
    public static void replaceCandidate(Candidate[] c, String find, String replace, int newVote){
        for(int i = 0; i < c.length; i++){
            if(c[i].getName().equals(find)){
                c[i].setName(replace);
                c[i].setVotes(newVote);
            }
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
      Candidate[] election = new Candidate[10];
       election[0] = new Candidate("John Smith", 5000);
       election[1] = new Candidate("Mary Miller", 4000);
       election[2] = new Candidate("Micheal Duffy", 6000);
       election[3] = new Candidate("Tim Robinson", 2500);
       election[4] = new Candidate("Joe Ashtony", 1800);
       election[5] = new Candidate("Mickey Jones", 3000);
       election[6] = new Candidate("Rebecca Morgan", 2000);
       election[7] = new Candidate("Kathleen Turner", 8000);
       election[8] = new Candidate("Tory Parker", 500);
       election[9] = new Candidate("Ashton Davis", 10000);
       
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
