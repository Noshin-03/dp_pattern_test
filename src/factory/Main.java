package factory;

public class Main {
    public static void main(String[] args) {
        Notification notification1 = NotificationFactory.createNotification("sms");
        notification1.notifyUser();
        Notification notification2 = NotificationFactory.createNotification("email");
        notification2.notifyUser();
        Notification notification3 = NotificationFactory.createNotification("push");
        notification3.notifyUser();
    }
    
}
