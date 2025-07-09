package factory;

public class NotificationFactory {
    
    public static Notification createNotification(String type) {
        if(type == "email") {
            return new EmailNotification();
        }
        else if(type == "sms") {
            return new SMSNotification();
        }
        return new PushNotification();
    }
}
