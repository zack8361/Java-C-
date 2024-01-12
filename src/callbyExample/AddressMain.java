package callbyExample;

public class AddressMain {
    public static void main(String[] args) {

        Address address = new Address("001","서울시","10000");
        Address address1 = new Address("001","서울시","10000");

        int a = 10;
        int b = 10;
        System.out.println((a == b));
        System.out.println(address1.equals(address));
    }
}
