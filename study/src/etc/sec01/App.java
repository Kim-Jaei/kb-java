//package etc.sec01;
//
//import java.util.Scanner;
//
//public class App {
//    public static int main(String[] args) {
//        boolean run = true;
//        int studentNum = 0;
//        int[] scores = null;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (run) {
//            System.out.println("------------------------------------------------------");
//            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
//            System.out.println("------------------------------------------------------");
//
//            System.out.println("선택 >");
//            int selecNo = Integer.parseInt(scanner.nextLine());
//
//            if (selecNo == 1) {
//                System.out.println("학생수: ");
//                studentNum = Integer.parseInt(scanner.nextLine());
//                scores = new int[studentNum];
//                } else if (selecNo == 2) {
//                for (int i = 0; i < scores.length; i++) {
//                    System.out.println("scores[학생" + i + "]: ");
//                    scores[i] = Integer.parseInt(scanner.nextLine());
//                }
//                } else if (selecNo == 3) {
//                for (int i = 0; i < scores.length; i++) {
//                    System.out.println("scores[학생" + i + "]:" + scores[i]);
//                }else if (selecNo == 4) {
//                    int max = 0;
//                    int sum = 0;
//                    double avg = 0;
//                    for (int i = 0; i < scores.length; i++) {
//                        max = (max < scores[i]) ? scores[i] : max;
//                        sum += scores[i];
//                    }
//                    avg = (double) sum / studentNum;
//                    System.out.println("최고 점수: " + max);
//                    System.out.println("평균 점수: " + avg);
//                } else if (selectNo == 5) {
//                    run = false;
//                }
//            }
//            System.out.println("프로그램 종료");
//        }
//    }
//}