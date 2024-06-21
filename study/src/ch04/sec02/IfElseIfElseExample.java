package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
    int score = 200;

    if (score >= 90 && score <= 100){
        System.out.println("""
점수가 90~100입니다.
등급은 A입니다.
""");
    }else if(score >= 80 && score <= 89){
        System.out.println("""
점수가 80~89입니다.
등급은 B입니다.
""");
    }else if(score >= 70 && score <= 79){
        System.out.println("""
점수가 70~79입니다.
등급은 C입니다.
""");
    }else if(score >= 0 && score <=69){
            System.out.println("""
점수가 0~69입니다.
등급은 D입니다.
""");
        }
        System.out.println("점수 범위는 0~100점입니다.");
}
}
