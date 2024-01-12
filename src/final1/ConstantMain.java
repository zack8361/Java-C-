package final1;

import java.util.Scanner;

public class ConstantMain {
    public static void main(String[] args) {

        User user1 = new User("zack6353@naver.com","paul2858","이찬호",1);
        User user2 = new User("kong8361@naver.com","paul2858","콩",0);

        System.out.println(user1.getUserName() +" / " + user1.getUserRealType());
        System.out.println(user2.getUserName() +" / " + user2.getUserRealType());
    }
}
