package staticClass;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";

        DecoUtil utils = new DecoUtil();
        String deco = utils.deco(s);
        System.out.println("deco = " + deco);


        String decorate = DecoUtil.decorate(s);
        System.out.println("decorate = " + decorate);

    }
}
