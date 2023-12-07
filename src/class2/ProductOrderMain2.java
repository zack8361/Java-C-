package class2;
//        createOrder();
//        printOrders();
//        getTotalAmount();
public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부",2000,2);
        orders[1] = createOrder("김치",5000,1);
        orders[2] = createOrder("콜라",1500,2);
        printOrders(orders);
        int totalPrice = getTotalAmount(orders);
        System.out.println("totalPrice = " + totalPrice);
    }
    private static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
    private static void printOrders(ProductOrder[] productOrder) {
        for (ProductOrder order : productOrder) {
            System.out.println(order.productName + " / " + order.price +" / " + order.quantity);
        }
    }

    private static int getTotalAmount(ProductOrder[] productOrder){
        int sum = 0;
        for (ProductOrder order : productOrder) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
