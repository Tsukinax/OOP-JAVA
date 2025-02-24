package LAB5;

class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
     
       
    }

    public Rectangle(double width, double length){
        this.width =width;
        this.length =length;
       
    }

    public double getArearR(){
        return width*length;
    }
    public double getParemeterP(){
        return 2*(width+length);
    }


}