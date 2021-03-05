package ex2.control;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int kor, eng, math;
        int total;
        float avg;
        boolean more;

        more = true;
        while (more) {
            System.out.println("┌───────────────────────┐");
            System.out.println("│       성적 입력       │");
            System.out.println("└───────────────────────┘");

            Scanner scan = new Scanner(System.in);

            System.out.print("국어: ");
            kor = scan.nextInt();
            System.out.print("영어: ");
            eng = scan.nextInt();
            System.out.print("수학: ");
            math = scan.nextInt();

            System.out.println("┌───────────────────────┐");
            System.out.println("│       성적 출력       │");
            System.out.println("└───────────────────────┘");

            total = kor + eng + math;
            avg = (float) total / 3;

            System.out.printf("국어: %6.0f\n", (float) kor);
            System.out.printf("영어: %6.0f\n", (float) eng);
            System.out.printf("수학: %6.0f\n", (float) math);

            System.out.printf("총점: %6.0f\n", (float) total);
            System.out.printf("평균: %9.2f\n", avg);

            System.out.println("입력을 계속하겠습니까? [true/false]");
            more = scan.nextBoolean();
        }
    }
}
