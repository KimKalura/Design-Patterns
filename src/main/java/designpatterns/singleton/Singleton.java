package designpatterns.singleton;

public class Singleton {

    //atribute
    private static Singleton instance;

    //constructor
    private Singleton(){};

    //metode
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
