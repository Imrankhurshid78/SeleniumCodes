package SeleniumTest;

public class ShoppingStoreTest {
    public static void main(String[] args){
        SeleniumTest.ShoppingStore item1=new SeleniumTest.ShoppingStore("Blanket",49.99,2);
        SeleniumTest.ShoppingStore item2=new SeleniumTest.ShoppingStore("Mattress",439.18,1);
        double item1Price = item1.itemTotalPrice();
        System.out.println("Blanket Total Value "+item1Price);
        double item2Price = item2.itemTotalPrice();
        System.out.println("Mattress Total Value "+item2Price);
        System.out.println("You purchased "+(item1Price+item2Price)+" Today");
    }
}
