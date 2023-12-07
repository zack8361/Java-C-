package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isON = false;
        
        
//      음악 플레이어 켜기
        isON = true;
        System.out.println("음악플레이어를 시작합니다");
        
//       볼륨증가
        volume +=1;
//       볼륨감소
        volume -=1;
//       음악 플레이어 상태

//       음악 플레이어 끄기
        isON = false;
        System.out.println("음악 플레이어를 종료합니다");
        System.out.println(isON);
    }
}
