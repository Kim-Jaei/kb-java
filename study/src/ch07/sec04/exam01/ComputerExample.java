package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10; // 자동 형 변환 int -> double

        Calculator calculator = new Calculator();
        System.out.println("원 면적:" + calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println("원 면적" + computer.areaCircle(r));

    }
}
