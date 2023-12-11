package b;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int currentCnt = counter.getCount();

        System.out.println("currentCnt = " + currentCnt);
    }
}
