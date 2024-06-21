package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i%2!=0){
                continue; // 홀수면 다음 반복으로 건너 뛴다
        }System.out.print(i+" "); // 짝수만 출력
            }
    }
}
