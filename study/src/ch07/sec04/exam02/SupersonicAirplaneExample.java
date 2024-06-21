package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff(); // 이륙합니다.
        sa.fly(); // 일반 비행합니다.
        sa.flyMode = SupersonicAirplane.SUPERSONIC; // flyMode == 2
        sa.fly(); // 초음속 비행합니다.
        sa.flyMode = SupersonicAirplane.NORMAL; // flyMode == 1
        sa.fly(); // 일반 비행합니다.
        sa.land(); // 착륙합니다.
    }
}