import java.util.ArrayList;
/**
 * Write a description of class Prime here.
 * Find and displays all prime numbers up to upper limit
 * @author (Jeffrey Chiu) 
 * @version (06/02/18)
 */
public class Prime
{
    // instance variables - replace the example below with your own
    private int limit;
    private ArrayList<Integer> list;

    public Prime(int limit)
    {
        this.limit = limit;
        list = new ArrayList<Integer>();
    }
    
    public int getLimit(){
        return this.limit;
    }
    public ArrayList<Integer> getList(){
        return this.list;
    }
    
    public boolean isPrime(int n){
        boolean prime = true;
        if(n == 2){
            this.list.add(2);
            return prime;
        }
        for(Integer i : list){
            if(n % (int)i == 0){
                prime = false;
            }
        }
        if(prime){
            this.list.add(n);
        }
        return prime;
    }
    public void printPrime(){
        for(int i = 2; i <= limit; i++){
            if(isPrime(i)){
            }
        }
        System.out.println("All the prime numbers up to " + limit + " are : ");
        for(int i = 0; i < list.size(); i++){
            
            if(i % 10 == 0){
                System.out.println();
            }
            if(i != 0){
                System.out.print(" , " + list.get(i));
            }
            else{
                System.out.print("[" + list.get(i));
            }
        }
        System.out.println("]");
        System.out.println();
    }
}
