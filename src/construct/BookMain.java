package construct;

public class BookMain {

    public static void main(String[] args) {

//      기본 생성자 사용
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("HelloJava", "Kong");
        book2.displayInfo();

        Book book3 = new Book("HelloKong","Chanho",700);
        book3.displayInfo();
    }
}
