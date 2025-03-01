package LAB7Q2;

class Book extends LibraryItem{
    private String name;


    public Book(){
        this.name = " Steve Roger ";
    }

    
    @Override
    public String getBarcode(){
        return "B1123";
    }

    @Override
    public String getTitle(){
        return " Captain America ";

    }

    @Override
    public  int getLoanPeriod(){
        return 21;

    }

    @Override
    public void checkout(String borrowname){
        this.name =borrowname;

    }
    @Override
    public String toString(){
        return "Barcode : " + getBarcode() + " Title :" + getTitle() + "  Loan Period: " + getLoanPeriod()
        + " \n checkout by : " + this.name;
    }

    
}
