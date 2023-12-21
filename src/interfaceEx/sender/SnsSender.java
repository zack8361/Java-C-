package interfaceEx.sender;

public class SnsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SNS 를 발송합니다" + message);
    }
}
