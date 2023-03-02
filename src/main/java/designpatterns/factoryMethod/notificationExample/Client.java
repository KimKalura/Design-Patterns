package designpatterns.factoryMethod.notificationExample;

public class Client {
    public static void main(String[] args) {
        try{
            Notification SMSNotification = NotificationFactory.createNotification("SMS");
            SMSNotification.notifyUser();
        }
        catch (UnknownChannelException e) {
            System.out.println(e.getMessage());
        }


        try{
            Notification emailNotification = NotificationFactory.createNotification("Email");
           emailNotification.notifyUser();
        }
        catch (UnknownChannelException e) {
            System.out.println(e.getMessage());
        }
    }
}
