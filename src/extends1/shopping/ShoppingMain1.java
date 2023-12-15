package extends1.shopping;

public class ShoppingMain1 {
    public static void main(String[] args) {
        Book book = new Book("JAVA",10000,"han","12345");

        book.print();
        System.out.println(book.getPrice());
    }
}
