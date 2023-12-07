package class2;
//        createOrder();
//        printOrders();
//        getTotalAmount();
public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = createOrder("두부",2000,2);
        ProductOrder productOrder2 = createOrder("김치",5000,1);
        ProductOrder productOrder3 = createOrder("콜라",1500,2);
        

    }
    private static void printOrders(ProductOrder productOrder) {
        System.out.println(productOrder.productName + " / " + productOrder.price + " / " + productOrder.quantity);
    }
    private static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
    private static int getTotalAmout();
}
