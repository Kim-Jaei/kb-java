package ch03.sec11;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float area = 0;

        System.out.println("윗변의 길이: ");
        float upperSide = scanner.nextFloat();
        System.out.println("아랫변의 길이: ");
        float lowerSide = scanner.nextFloat();
        System.out.println("높이: ");
        float height = scanner.nextFloat();
        scanner.nextLine();
        area = (upperSide + lowerSide) * height / 2;

        System.out.println("사다리꼴의 넓이: " + area);

    }
}
