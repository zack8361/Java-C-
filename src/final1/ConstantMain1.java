package final1;

public class ConstantMain1 {
    private static final int MAX_USERS = 1000;
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount){
        if(currentUserCount > MAX_USERS){
            System.out.println("대기자로 등록합니다.");
            return;
        }
        System.out.println("게임에 참여합니다");
    }
}
