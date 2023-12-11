package memory;

public class Ex01 {
    private String name;
    public static int count;

    public Ex01(String name){
        this.name = name;
        Ex01.count++;
    }
    public static int getCount() {
        return count;
    }

}
