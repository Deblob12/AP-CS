import java.util.*;
/**
 * Write a description of class testHomework here.
 * Prints out before/after reading pages
 * @author (JEffrey Chiu) 
 * @version (06/03/18)
 */
public class testHomework3
{
   public static void main(String[] args){
       MyMath3 m = new MyMath3();
       MyScience3 s = new MyScience3();
       MyEnglish3 e = new MyEnglish3();
       MyJava3 j = new MyJava3();
       
       m.createAssignment(4);
       s.createAssignment(6);
       e.createAssignment(4);
       j.createAssignment(5);
       
       List<Homework3> l = new ArrayList<Homework3>();
       l.add(m);
       l.add(s);
       l.add(e);
       l.add(j);
       for(Homework3 h : l){
           System.out.println(h);
       }
       for(int i = 0; i < l.size(); i++){
           for(int k = i + 1; k < l.size(); k++){
               if(l.get(i).compareTo(l.get(k)) == 0){
                   System.out.println("The homework for "+ l.get(i).getHomework() + " and " + l.get(k).getHomework() + " are the same number of pages");
                }
            }
        }
   }
}
