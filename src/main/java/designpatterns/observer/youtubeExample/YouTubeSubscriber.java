package designpatterns.observer.youtubeExample;

public class YouTubeSubscriber implements Observer {
    @Override
    public void update() {
        System.out.println("New video on channel");
    }
}
