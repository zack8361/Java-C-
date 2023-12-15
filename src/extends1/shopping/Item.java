package extends1.shopping;

public class Item {
    String name;
    int price;

    public Item(String name,int price){
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println(name + "/" +price);
    }

    public int getPrice() {
        return price;
    }
}
