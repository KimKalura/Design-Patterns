package designpatterns.observer.youtubeExample;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel();
        YouTubeSubscriber subscriber1 = new YouTubeSubscriber();
        YouTubeSubscriber subscriber2 = new YouTubeSubscriber();
        YouTubeSubscriber subscriber3 = new YouTubeSubscriber();

        youTubeChannel.registerObserver(subscriber1);
        youTubeChannel.registerObserver(subscriber2);
        youTubeChannel.registerObserver(subscriber3);

        youTubeChannel.releaseNewVideo("Polar Express");
        youTubeChannel.releaseNewVideo("Home Alone");
    }
}
