package access;

public class SpeakerMain1 {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.volumeUp();
        speaker.showVolume();


        speaker.volumeUp();
        speaker.showVolume();



        speaker.showVolume();
    }
}
