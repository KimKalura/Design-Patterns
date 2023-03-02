package designpatterns.observer.smartHome;

public class Main {
    public static void main(String[] args) {
        //OBSERVER:
        MotionSensor motionSensor = new MotionSensor("Door", 3);
        SmokeSensor smokeSensor = new SmokeSensor("Kitchen", 8);

        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.registerObserver(smokeSensor);
        sensorSystem.registerObserver(motionSensor);

        smokeSensor.setCurrentVolume(26);
        motionSensor.setCurrentDistance(4);

        sensorSystem.notifyObservers();

        //cu factory
//        try {
//            Sensor smokeSensor = SensorFactory.createSensor("smokeSensor", "kitchen", 10);
//            Sensor motionSensor = SensorFactory.createSensor("motionSensor", "kitchen", 10);
//            SensorSystem sensorSystem = new SensorSystem();
//
//            sensorSystem.registerObserver((Observer) motionSensor);
//            sensorSystem.registerObserver((Observer) smokeSensor);
//
//            MotionSensor sensor1 = (MotionSensor) motionSensor;
//            SmokeSensor sensor2 = (SmokeSensor) smokeSensor;
//
//            sensor1.setCurrentDistance(3);
//            sensor2.setCurrentVolume(12);
//
//            sensorSystem.notifyObservers();
//            sensorSystem.notifyObservers();
//        } catch (IllegalArgumentException e) {
//            Logger.getInstance().log(e.getMessage());
//        }
    }
}