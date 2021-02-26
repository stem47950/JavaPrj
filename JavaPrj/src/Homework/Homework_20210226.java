package Homework;

public class Homework_20210226 {
    public static void main(String[] args) {
        int kor, eng, math;
        int total;
        float avg;

        kor = 65;
        eng = 72;
        math = 86;

        total = kor + eng + math;
        avg = (float) total / 3;

        System.out.println("┌───────────────────────┐");
        System.out.println("│       성적 출력       │");
        System.out.println("└───────────────────────┘");

        System.out.printf("국어: %6.2f\n", (float) kor);
        System.out.printf("영어: %6.2f\n", (float) eng);
        System.out.printf("수학: %6.2f\n", (float) math);
        System.out.println();

        System.out.printf("총점: %6.2f\n", (float) total);
        System.out.printf("평균: %6.2f\n", avg);
    }
}