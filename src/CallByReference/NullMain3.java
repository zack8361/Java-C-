package CallByReference;

import org.w3c.dom.ls.LSOutput;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println(bigData.count);


        System.out.println(bigData.data.value);
    }
}
