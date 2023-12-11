package b;

public class Counter {
    private int count;
    private int max;

    public Counter(int max){
        this.max =max;
    }
    public void increment(){
        if(this.count < max) {
            this.count += 1;
            return;
        }
        System.out.println("더이상 증가할 수 없습니다.");
    }
    public int getCount(){
        return this.count;
    }
}
