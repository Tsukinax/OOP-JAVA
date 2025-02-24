package LAB5;
public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this("White", false); //ตั้งเป็น Default constructor

    }
    public Shape(String color , boolean filled){    //ตั้งเป็น Paremeter constructor
        this.color =color;
        this.filled =filled;

    }

    //Setter&Getter เเต่ในส่วนนี้ไม่ได้ใช้นะ

    public void setcolor(String color){  //setter
        this.color =color;
    }

    public void setfilled(boolean filled){ //setter
        this.filled = filled;
    }

    public String getcolor(){ //getter
        return color;
    }

    public boolean isfilled(){ //getter
        return filled;
    }

   public String toString(){     //Getter Method เเบบพิเศษ โดยใช้ toString()  ทำให้สามารถ print ออกมาได้โดย print ตัว object อย่างเดียว 
        return "A shape with color of " + color + " and " + (filled ? "filled" : " not filled");   // เเค่ใช้System.out.println(ชื่อ Object); มันก็จะ print ออกมาเลย
    }
    
}

