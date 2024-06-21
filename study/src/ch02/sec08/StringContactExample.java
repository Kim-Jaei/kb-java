package ch02.sec08;

public class StringContactExample {
    public static void main(String[] args) {
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1); // result1: 20

        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2); // result2: 128

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3); // result3: 1028

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4); // result4: 1028 표현식은 좌측에서 우측으로 평가됨 1. "10"+2 = "102" 2. "102"+8 = 1028

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5); //result5: 1010
    }
}
