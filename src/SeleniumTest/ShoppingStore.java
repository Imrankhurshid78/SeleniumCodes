package SeleniumTest;
    public class ShoppingStore {
        String item;
        double price;
        int quantity;
        ShoppingStore(String item,double price,int quantity){
            this.item=item;
            this.price=price;
            this.quantity=quantity;
        }
         public double itemTotalPrice(){
            return price*quantity;
        }
    }

