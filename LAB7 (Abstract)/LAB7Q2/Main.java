package LAB7Q2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LibraryItem[] items =new LibraryItem[3];
        Random rand = new Random();
        
        
        for(int i =0; i<items.length; i++){
            int type = rand.nextInt(3);

            switch (type) {
                case 0 :
                items[i] = new Book();
                
                break;
                case 1 :
                items[i] = new DVD();
                break;
                case 2 :
                items[i] = new Audiobook();
                break;

                default:
                    break;
            }
            
            System.out.println(items[i]);
        }
        
    }
}
