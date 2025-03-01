package LAB7Q2;

abstract class LibraryItem {
    protected String barcode;
    protected String title;
    protected int period;
    protected String name;
   

    public abstract String getBarcode();
    public abstract String getTitle();
    public abstract int getLoanPeriod();
    public abstract void checkout(String borrowname);

    
}
