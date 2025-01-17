package sender;

public class FaceBookSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("페이스북에 발송합니다: " + message);
    }
}
