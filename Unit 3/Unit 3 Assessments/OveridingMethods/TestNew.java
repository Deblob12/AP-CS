
/**
 * Test4 demo
 * 
 * Tester class for the cubes, rectangles, and boxes
 * @author (Jeffrey Chiu)  
 * @version (05/30/18)
 */
public class TestNew
{

    public static void main(String []args)
    {
          Rectangle3 one = new Rectangle3(5, 20);
          Rectangle3 five = new Rectangle3(4,5);
          Rectangle3 six = new Rectangle3(5, 20);
         
          Box3 two = new Box3(4, 10, 5);   
          Box3 three = new Box3(4, 4, 4);
          
          Cube3 four = new Cube3(4);
          Cube3 seven = new Cube3(5);

          showEffectBoth(one);
          showEffectBoth(three);
          showEffectBoth(two);
          showEffectBoth(four);
          
          if (three.equals(four)) {
              System.out.println("Box - " + three.getLength() + " X " + three.getWidth() + " X " + three.getHeight() + " is same size as Cube - " +
              four.getLength() + " X " + four.getWidth() + " X " + four.getHeight()); 
            }
          else{
               System.out.println("Box - " + three.getLength() + " X " + three.getWidth() + " X " + three.getHeight() + " is not the same size as Cube - " +
               four.getLength() + " X " + four.getWidth() + " X " + four.getHeight()); 
            } 

          if (two.equals(four)) {
              System.out.println("Box - " + two.getLength() + " X " + two.getWidth() + " X " + two.getHeight() + " is same size as Cube - " +
              four.getLength() + " X " + four.getWidth() + " X " + four.getHeight()); 
            }
          else{
               System.out.println("Box - " + two.getLength() + " X " + two.getWidth() + " X " + two.getHeight() + " is not the same size as Cube - " +
               four.getLength() + " X " + four.getWidth() + " X " + four.getHeight()); 
            } 
 
     }
     
     public static void showEffectBoth(Rectangle3 r)
     {
         System.out.println(r);
     }
}