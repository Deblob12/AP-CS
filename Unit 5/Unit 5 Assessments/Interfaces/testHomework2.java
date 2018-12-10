import java.util.*;
/**
 * Write a description of class testHomework here.
 * Prints out before/after reading pages
 * @author (JEffrey Chiu) 
 * @version (06/03/18)
 */
public class testHomework2
{
   public static void main(String[] args){
       MyMath2 m = new MyMath2();
       MyScience2 s = new MyScience2();
       MyEnglish2 e = new MyEnglish2();
       MyJava2 j = new MyJava2();
       
       m.createAssignment(4);
       s.createAssignment(6);
       e.createAssignment(10);
       j.createAssignment(5);
       
       List<Homework2> l = new ArrayList<Homework2>();
       l.add(m);
       l.add(s);
       l.add(e);
       l.add(j);
       for(Homework2 h : l){
           System.out.println("Before Reading : ");
           System.out.println(h);
           h.doReading();
           System.out.println("After Reading : ");
           System.out.println(h);

       }
   }
}
