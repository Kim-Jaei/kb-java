package ch07.sec07.exam3;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";

        parent.method1(); // 제대로 출력

        parent.method2(); // 제대로 출력

//        parent.field2 = "data2"; // parent에 field2가 없음
//
//        parent.method3(); // parent에 method3이 없음

        // 다운캐스팅일 경우에는 부모, 자식 class 요소 모두 사용 가능함
        Child child = (Child) parent; //  다운캐스팅 가능, parent는 실제로 Child 객체를 참조함

        child.field2 = "data2"; // 정상 작동

        child.method3(); // 정상 작동
    }
}
