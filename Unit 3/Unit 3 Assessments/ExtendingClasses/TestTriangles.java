
/**
 * Write a description of class TestTriangles here.
 * Meant to test the Triangle class, Equilateral class, and the IsoscelesRight class.
 * @author (Jeffrey Chiu) 
 * @version (05/28/18)
 */
public class TestTriangles
{
        public static void main(String[] args){
        double sideA = 4.0;
        double sideB = 5.0;
        double sideC = 6.0;
        double leg = 1.5;
        Triangle tri = new Triangle(sideA, sideB, sideC);
        Equilateral equi = new Equilateral(sideB);
        IsoscelesRight iso = new IsoscelesRight(leg);
        System.out.println("Triangle has sides A = " + tri.getSideA() + ", B = " + tri.getSideB() + ", C = " + tri.getSideC());
        System.out.println("Equilateral Triangle has sides A = " + equi.getSide() + ", B = " + equi.getSide() + ", C = " + equi.getSide());
        System.out.println("Isosceles Right Triangle has sides A = " + iso.getLeg() + ", B = " + iso.getLeg() + ", C = " + iso.getHypo());
       }
}
