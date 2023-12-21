package interfaceEx.sender;

public class sendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SnsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다");
        }
    }
}
