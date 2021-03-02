import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws IOException {
        // 기본형식: primitive type
        int kor, eng, math;
        int total;
        float avg;
        /*
         * System.out.println("┌───────────────────────┐");
         * System.out.println("│       성적 입력       │");
         * System.out.println("└───────────────────────┘");
         * 
         * Scanner scan = new Scanner(System.in);
         * 
         * System.out.print("국어 성적을 입력하세요.: "); kor = scan.nextInt();
         * System.out.print("영어 성적을 입력하세요.: "); eng = scan.nextInt();
         * System.out.print("수학 성적을 입력하세요.: "); math = scan.nextInt();
         */
        FileInputStream fis = new FileInputStream("data.txt");
        Scanner scan1 = new Scanner(fis);

        kor = scan1.nextInt();
        eng = scan1.nextInt();
        math = scan1.nextInt();

        System.out.println("┌───────────────────────┐");
        System.out.println("│       성적 출력       │");
        System.out.println("└───────────────────────┘");

        total = kor + eng + math;
        avg = (float) total / 3;

        System.out.printf("국어: %4.0f\n", (float) kor);
        System.out.printf("영어: %4.0f\n", (float) eng);
        System.out.printf("수학: %4.0f\n", (float) math);

        System.out.printf("총점: %4.0f\n", (float) total);
        System.out.printf("평균: %7.2f\n", avg);
    }
}