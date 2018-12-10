
/**
 * Write a description of class testHomework here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testHomework
{
   public static void main(String[] args){
       MyMath m = new MyMath();
       MyScience s = new MyScience();
       MyEnglish e = new MyEnglish();
       MyJava j = new MyJava();
       
       m.createAssignment(4);
       s.createAssignment(6);
       e.createAssignment(10);
       j.createAssignment(5);
       
       System.out.println(m);
       System.out.println(s);
       System.out.println(e);
       System.out.println(j);
    }
}
