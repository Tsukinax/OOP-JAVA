package LAB7;
abstract class GeometricObject{
    private String color;
    private boolean filled;

    public GeometricObject( String color, boolean filled){
        this.color= color;
        this.filled = filled;
    }

    public String getcolor(){
        return this.color;
    }
    public boolean getfilled(){
        return this.filled;
    }

    public abstract double getarea();
    public abstract double getparemeter();
}