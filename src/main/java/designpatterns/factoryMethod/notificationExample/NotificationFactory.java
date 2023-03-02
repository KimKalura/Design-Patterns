package designpatterns.factoryMethod.notificationExample;

public class NotificationFactory {
    public static Notification createNotification(String channel) throws UnknownChannelException {
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            default: throw new UnknownChannelException("Channel " + channel + " does not exist");
        }

    }
}
