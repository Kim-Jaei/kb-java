package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.setGas(5);
        if (car.isLeftGas()) {
            car.run();
        }
    }
}
