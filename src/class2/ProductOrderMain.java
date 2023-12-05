package class2;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;


        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;


        ProductOrder [] array = {productOrder1,productOrder2,productOrder3};

        int sum = 0;
        for (ProductOrder productOrder : array) {
            System.out.println(productOrder.productName  + " / " + productOrder.price + " / " + productOrder.quantity);
            sum += (productOrder.price * productOrder.quantity);
        }

        System.out.println("totalPrice : " + sum );
    }
}
