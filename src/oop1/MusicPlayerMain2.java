package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        on(data);
        off(data);
    }


    private static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("뮤직플레이어 ON");
    }
    private static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("뮤직 플레이어 OFF");
    }
//    볼륨증가
    private static void volumeUp(MusicPlayerData data){
        data.volume++;
    }
//    볼륨감소
    private static void volumeDown(MusicPlayerData data){
        data.volume--;
    }
    
}
