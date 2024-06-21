package ch04.sec09;

public class ForStarExample2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(""); // 안쪽 for문 밑에 위치해서 나중에 실행됨
        }
    }
}
