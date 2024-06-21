package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*7);
        switch (num) {
            case 1:
                System.out.println("First number");
                break;
                case 2:
                    System.out.println("Second number");break;
                    case 3:
                        System.out.println("Third number");break;
                        case 4:
                            System.out.println("Fourth number");break;
                            case 5:
                                System.out.println("Fifth number");break;
            default:
                                    System.out.println("Sixth number");
        }
    }
}
