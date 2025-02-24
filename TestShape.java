package LAB5;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 =new Shape();
        System.out.println(s1);

        Shape s2 = new Shape("red",true);
        System.out.println(s2);

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle();
        System.out.println("Area = " + c3.getArea());

        Circle c4 = new Circle();
        System.out.println("Paremeter = " + c3.getParemeter());

        Shape s3 = new Shape("blue",true);
        System.out.println(s3);

        Shape s4 =new Shape();
        System.out.println(s4);

        Shape s5 =new Shape();
        System.out.println(s5);


        Rectangle r1 = new Rectangle(4.0,5.0);
        System.out.println("Area = " + r1.getArearR());

        Rectangle r2 = new Rectangle(4.0,5.0);
        System.out.println("Paremeter = " + r2.getParemeterP());

       Shape s6 = new Shape("green",true);
       System.out.println(s6);

        










        
    }
    
}
