package ch08.sec04;

public interface RemoteControl {
    int MAX_VOLUME = 10; // 상수 필드
    int MIN_VOLUME = 0; // 상수 필드

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
