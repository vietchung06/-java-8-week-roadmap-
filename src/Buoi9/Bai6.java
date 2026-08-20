package Buoi9;

import javax.naming.NameNotFoundException;

//6.	NotificationSender (cha, send(String message))
// và các con EmailSender, SmsSender, PushSender
class NotificationSender {
    public void send(String massage){
        System.out.println("Gửi thông báo : "+ massage);
    }
}
class EmailSender extends NotificationSender {
    @Override
    public void send(String massage) {
        System.out.println("Gửi Email : "+ massage);
    }
}
class SmsSender extends NotificationSender {
    @Override
    public void send(String massage) {
        System.out.println("Gửi SMS : "+ massage);
    }
}
class PushSender extends NotificationSender {
    @Override
    public void send(String massage) {
        System.out.println("Gửi Push : "+ massage);
    }
}
public class Bai6 {
    public static void main(String[] args) {
        NotificationSender[] n = {
                new EmailSender(),
                new SmsSender(),
                new PushSender()
        };
        for (int i = 0 ; i < n.length; i++){
            n[i].send("Việt Chung");
        }
    }
}
