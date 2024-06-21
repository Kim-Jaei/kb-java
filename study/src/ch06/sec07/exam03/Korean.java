package ch06.sec07.exam03;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언 : alt + insert
    public Korean(String name, String ssn) {
        this.name = name; // 동일한 이름일 경우 필드에 'this' 추가
        this.ssn = ssn; // 왼: 필드, 오: 지역, 지역변수가 필드보다 우선순위이기 때문에 필드를 꾸며주세요~
    }
}
