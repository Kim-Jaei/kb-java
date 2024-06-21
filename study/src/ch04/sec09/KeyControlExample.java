package ch04.sec09;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택>");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                System.out.print("예금액>");
                int deposit = Integer.parseInt(scanner.nextLine());
                balance += deposit;
                System.out.println("잔액" + balance);
            } else if (strNum.equals("2")) {
                System.out.print("출금액>");
                int withdraw = Integer.parseInt(scanner.nextLine());
                balance -= withdraw;
                System.out.println("잔액" + balance);
            } else if (strNum.equals("3")) {
                System.out.println("잔액" + balance);
            } else if (strNum.equals("4")) {
                run = false;
                System.out.println("프로그램이 종료됩니다.");
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }scanner.close();
    }
}