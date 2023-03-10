package designpatterns.observer.youtubeExample;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Observable {
    private List<Observer> subscribers;

    public YouTubeChannel() {
        subscribers = new ArrayList<>();
    }

    public void releaseNewVideo(String videoName) {
        System.out.println("Release new video " + videoName);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update();
        }
    }
}
