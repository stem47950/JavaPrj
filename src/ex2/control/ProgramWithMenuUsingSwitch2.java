package ex2.control;

import java.util.Scanner;

public class ProgramWithMenuUsingSwitch2 {
    public static void main(String[] args) {
        boolean more;
        Scanner scan;
        int menu;
        int kor, eng, math, total;
        float avg;

        kor = 0;
        eng = 0;
        math = 0;
        total = 0;
        avg = 0;

        more = true;
        EXIT: while (more) {
            System.out.println("┌────────────────────┐");
            System.out.println("│     메인  메뉴     │");
            System.out.println("└────────────────────┘");
            System.out.print("1. 성적입력\n2. 성적출력\n3. 종료\n선택> ");
            scan = new Scanner(System.in);
            menu = Integer.parseInt(scan.nextLine());

            switch (menu) {
            case 1:
                System.out.println("───────성적입력───────");
                do {
                    System.out.print("국어> ");
                    kor = Integer.parseInt(scan.nextLine());
                    if (!(kor >= 0 && kor <= 100))
                        System.out.println("입력 범위: 0과 100 사이의 값만 입력할 수 있습니다.");
                } while (!(kor >= 0 && kor <= 100));
                System.out.print("영어> ");
                eng = Integer.parseInt(scan.nextLine());
                System.out.print("수학> ");
                math = Integer.parseInt(scan.nextLine());
                break;

            case 2:
                total = kor + eng + math;
                avg = (float) total / 3;

                System.out.println("───────성적출력───────");
                System.out.printf("국어: %4.0f\n", (float) kor);
                System.out.printf("영어: %4.0f\n", (float) eng);
                System.out.printf("수학: %4.0f\n", (float) math);
                System.out.printf("총합: %4.0f\n", (float) total);
                System.out.printf("평균: %7.2f\n", avg);
                break;

            case 3:
                more = false;
                break EXIT;
            }
            System.out.print("계속하시겠습니까? [true/false]\n선택> ");
            more = Boolean.parseBoolean(scan.nextLine());
        }
        System.out.println("실행을 종료합니다.");
    }
}