package ch06.sec14;

public class Car {
    //필드 선언
    private int speed; // public은 어디서든지 작동 가능, private은 class 내에서만 가능
    private boolean stop; // 왜 정보 은닉하냐고: 예외처리...

    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {
        if(speed<0){
            this.speed=0;
        }else{
            this.speed=speed;
        }}

    public boolean isStop(){
        return stop;
    }

    public void setStop(boolean stop) {
          this.stop = stop;
          if(stop==true) this.speed=0;
    }
}

