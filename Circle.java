package LAB5;

class Circle extends Shape {

    private double radius;
    public Circle(){
        super();
        this.radius =2.5;
    }
    


    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getParemeter(){
        return 2*Math.PI*radius;
    }


}
