package LAB7Q2;

class DVD extends LibraryItem {
    private String name;


    public DVD(){
        this.name = " Saitama ";
    }

    
    @Override
    public String getBarcode(){
        return "B1125";
    }

    @Override
    public String getTitle(){
        return " One punch Man ";

    }

    @Override
    public int getLoanPeriod(){
        return 7 ;

    }

    @Override
    public void checkout(String borrowname){
        this.name =borrowname;

    }

    @Override
    public String toString(){
        return "Barcode : " + getBarcode() + ", Title :" + getTitle() + ",  Loan Period: " + getLoanPeriod() + " Days "
        + " \n checkout by : " + this.name ;
    }

    
}
    

