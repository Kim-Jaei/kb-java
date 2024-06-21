package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
            int x = 10;
            int y = 10;
            int z;

            x++; // x = 11
            ++x; // x = 12
            System.out.println("x=" + x); // x = 12
            System.out.println("-----------------------");

            y--; // y = 9
            --y; // y = 8
            System.out.println("y=" + y); // y = 8
            System.out.println("-----------------------");

            z = x++; // z = 12
            System.out.println("z=" + z); // z = 12
            System.out.println("x=" + x); // x = 13
            System.out.println("-----------------------");

            z = ++x; // z = 13
            System.out.println("z=" + z); // z = 14
            System.out.println("x=" + x); // x = 14
            System.out.println("-----------------------");

            z = ++x + y++; // z = 15 + 8 = 23
            System.out.println("z=" + z); // z = 23
            System.out.println("x=" + x); // x = 15
            System.out.println("y=" + y); // y = 9
        }
}
