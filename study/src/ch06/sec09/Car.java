package ch06.sec09;

public class Car {
    //필드 선언
    String model;
    int speed=100;

    Car(String model) {
        this.model=model;
    }

//    boolean isRunning(){
//        if(speed == 0){
//            System.out.printf("%s가 멈춘 상태입니다.\n", model);
//            return false;
//        }else{
//            return true;
//        }
//    }
    void run(){
        System.out.printf("%s가 달립니다. (시속: %dkm/h)\n", model, speed);
    }
}
