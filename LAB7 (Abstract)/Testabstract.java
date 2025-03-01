package LAB7;
import java.util.Scanner;
public class Testabstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter three side : ");
        double side1 =scanner.nextDouble();
        double side2 =scanner.nextDouble();
        double side3 =scanner.nextDouble();

        System.out.print("Enter the color : ");
        String color =scanner.next();

        System.out.print("Enter a boolean value for filled : ");
        boolean filled = scanner.nextBoolean();

        Triangle tri =  new Triangle(side1, side2, side3, color, filled);

        System.out.println("The area is " + tri.getarea());
        System.out.println("The Paremeter is " + tri.getparemeter());
        System.out.println("Triangle New " + " side 1 : " + side1 + " side 2 : " + side2 + " side 3 : " + side3);
        System.out.println("The color is " + tri.getcolor());
        System.out.println("The boolean value for filled is " + tri.getfilled());




        
    }
    
}
