package interview.test;


public class Product {
   String prodName;
   int ProdId;
   long price;
   Offer offer;

    public Product(String prodName, long price, Offer offer) {
        this.prodName = prodName;
        this.price = price;
        this.offer = offer;
    }
}

class Offer {
    int id;
    int discount;

    public Offer(int id, int discount) {
        this.id = id;
        this.discount = discount;
    }
}

 class User {
    String usrName;
    String usrId;
    String addr;
//    Product product;

     public User(String usrName, String usrId, String addr) {
         this.usrName = usrName;
         this.usrId = usrId;
         this.addr = addr;
//         this.product = product;
     }
 }

class Order {
    String ordID;

    public Order(String ordID) {
        this.ordID = ordID;
    }

    class Payment {

    }

    public static void main(String[] args) {
        Offer offer = new Offer(1, 5);
        Product p1 = new Product("Laptop", 55, offer);
        User user = new User("Akash", "11", "Bangalore");

        payOrder(user, p1);
    }

    private static void payOrder(User user, Product p1) {

        // discount = 5%


    }
}
