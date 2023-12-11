package construct;

public class Book {
    String title = "";
    String author = "";
    int page;


//  기본생성자
    public Book(){

    }

    public Book(String title,String author){
        this(title,author,0);
    }

    public Book(String title,String author,int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }
    public void displayInfo() {
        System.out.println(title + " / " + author +" / " + page);
    }
}
