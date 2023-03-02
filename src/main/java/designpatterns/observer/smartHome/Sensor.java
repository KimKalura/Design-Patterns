package designpatterns.observer.smartHome;

public class Sensor{
    private final String name;

    public Sensor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
