package ch04.sec09;

public class For1to100Example {
    public static void main(String[] args) {

        int result = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}