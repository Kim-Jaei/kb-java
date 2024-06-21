package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(50);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(20);
        rc.turnOff();
    }
}
