package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
    int score = 93;

    if (score < 90) {
        System.out.println("Your score is " + score);
        System.out.println("Your grade is " + "B");
    } else { //else if로 굳이 안 해줘도 OK
            System.out.println("Your score is " + score);
            System.out.println("Your grade is " + "A");
    }
}
}
