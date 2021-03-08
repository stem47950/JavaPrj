package ex2.control;

import java.util.Scanner;

public class ProgramWithMenu {
    public static void main(String[] args) {
        boolean more = true;
        Scanner scan = new Scanner(System.in);

        while (more) {
            System.out.println("┌────────────────────┐");
            System.out.println("│     메인  메뉴     │");
            System.out.println("└────────────────────┘");
            System.out.print("1. 성적입력\n2. 성적출력\n3. 종료\n");
            System.out.println();

            int menu = Integer.parseInt(scan.nextLine());
            System.out.print("선택> ");

            int kor, eng, math, total;
            float avg;

            kor = 0;
            eng = 0;
            math = 0;
            total = 0;
            avg = 0;

            if (menu == 1) {
                System.out.println("─────────성적입력─────────");
                System.out.print("국어: ");
                kor = Integer.parseInt(scan.nextLine());
                System.out.print("영어: ");
                eng = Integer.parseInt(scan.nextLine());
                System.out.print("수학: ");
                math = Integer.parseInt(scan.nextLine());
            } else if (menu == 2) {
                total = kor + eng + math;
                avg = (float) total / 3;

                System.out.println("─────────성적출력─────────");
                System.out.printf("국어: %7.2\n", (float) kor);
                System.out.printf("영어: %7.2\n", (float) eng);
                System.out.printf("수학: %7.2\n", (float) math);
                System.out.printf("총합: %7.2\n", (float) total);
                System.out.printf("평균: %7.2\n", avg);
            }
        }
    }
}