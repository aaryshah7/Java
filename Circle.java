/*Design a class named Circle containing following attributes and behavior. 
• One double data field named radius. The default value is 1. 
• A no-argument constructor that creates a default circle. 
• A Single argument constructor that creates a Circle with the specified radius. 
• A method named getArea() that returns area of the Circle. 
• A method named getPerimeter() that returns perimeter of it.
 */
//21CE124 - Aary Shah
import java.util.Scanner;
public class Circle {
    private double radius = 1;
 
     public Circle() {}
 
     public Circle(int r) {
         radius = (double) (r);
     }
 
     public double getArea() {
         return radius * 3.14 * radius;
     }
 
     public double getPerimeter() {
         return 2 * 3.14 * radius;
     }
 
     public static void main(String[] args) {
         Circle circle1 = new Circle();
         System.out.println("default area");
         System.out.println(circle1.getArea());

         System.out.println("default perameter");
         System.out.println(circle1.getPerimeter());

         System.out.println("enter radius");
         Scanner sc = new Scanner(System.in);

         int rad = sc.nextInt();

         Circle circle2 = new Circle(rad);

         System.out.println("area");
         System.out.println(circle2.getArea());
         System.out.println("perameter");
         System.out.println(circle2.getPerimeter());
          System.out.println("21CE124 - Aary Shah");
     }

}
