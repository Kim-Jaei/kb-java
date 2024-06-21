package ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("x값 입력: ");
            int x = scanner.nextInt();
            System.out.print("y값 입력: ");
            int y = scanner.nextInt(); // 정수 앞에 있는 개행문자는 무시되어 버퍼에서 제거됨
            scanner.nextLine();
            System.out.println("x + y : "+(x+y));

            while(true){
            System.out.print("입력 문자열: ");
            String inputString = scanner.nextLine();
            if (inputString.equals("q")) {
                break; // 가장 안쪽의 루프가 종료되게 함
            }
            System.out.println("출력 문자열: " + inputString);
        }
        System.out.println("종료");
    }
}