package LAB7;
class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3,String color, boolean filled){
       super(color, filled);
        this.side1 =side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getside1(){
        return side1;
    }

    public double getside2(){
        return side2;
    }

    public double getside3(){
        return side3;
    }
    
    @Override
    public double getarea(){
        double s = (side1 + side2 + side3) / 2;  // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    
    @Override
    public double getparemeter(){
        return side1+side2+side3;
    }


}
