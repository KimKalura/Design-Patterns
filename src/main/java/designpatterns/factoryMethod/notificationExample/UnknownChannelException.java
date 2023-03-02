package designpatterns.factoryMethod.notificationExample;

public class UnknownChannelException extends Exception{
    public UnknownChannelException(String message) {
        super(message);
    }
}
