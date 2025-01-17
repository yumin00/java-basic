package sender;

public class SmsSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("SMS을 발송합니다: " + message);
    }
}
