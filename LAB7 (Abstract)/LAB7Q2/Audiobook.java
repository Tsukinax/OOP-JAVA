package LAB7Q2;

class Audiobook extends LibraryItem {

   private String name;


    public Audiobook(){
        this.name = " Tony Stark";
    }

    
    @Override
    public String getBarcode(){
        return "B1124";
    }

    @Override
    public String getTitle(){
        return " Ironman ";

    }

    @Override
    public int getLoanPeriod(){
        return 14 ;

    }

    @Override
    public void checkout(String borrowname){
        this.name =borrowname;

    }

    @Override
    public String toString(){
        return "Barcode : " + getBarcode() + " Title :" + getTitle() + "  Loan Period: " + getLoanPeriod() + " (AudioBook) "
        + " \n checkout by : " + this.name;
    }

    
}
    

