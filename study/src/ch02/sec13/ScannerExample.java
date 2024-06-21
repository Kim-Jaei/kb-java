package ch02.sec13;

import java.util.Scanner; // Scanner가 어디 있는지를 컴파일러에게 알려주는 기능

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력: ");
        int x = scanner.nextInt();
        System.out.print("y값 입력: ");
        int y = scanner.nextInt();
        System.out.println("x + y : "+(x+y));

    }
}
