package staticClass;

public class MathArrayUtils {
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;
    private static int sum;

    private MathArrayUtils(){
        //생성자를 Private 로 생성함으로써 인스턴스 생성을 막을 수 있다.
    }
    public static int sum(int[] values){
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
    public static double average(int[] values){
        return (double) sum/values.length;
    }

    public static int min(int[] values){
        for (int value : values) {
            min = Math.min(min,value);
        }
        return min;
    }

    public static int max(int[] values){
        for (int value : values) {
            max = Math.max(max,value);
        }
         return max;
    }
}
