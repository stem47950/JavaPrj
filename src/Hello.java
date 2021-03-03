import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws IOException {
        // 기본형식: primitive type
        int kor, eng, math;
        int total;
        float avg;

        /*
         * 성적을 입력하는 코드
         * 
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

        /*
         * 파일 data.txt에서 국어, 영어, 수학 성적을 입력받으시오.
         */
        FileInputStream fis = new FileInputStream("data.txt"); // 파일 입력 스트림 객체를 fis라는 이름으로 생성
        Scanner fin = new Scanner(fis); // 객체 fis를 입력으로 받는 Scanner 객체 생성
        kor = fin.nextInt();
        eng = fin.nextInt();
        math = fin.nextInt();
        fin.close(); // fin을 닫아줌.
        fis.close(); // fis를 닫아줌.

        /*
         * 국어, 영어, 수학 성적을 파일 data.txt로 받아내시오.
         */
        FileOutputStream fos = new FileOutputStream("data.txt");
        PrintStream fout = new PrintStream(fos);
        kor++; // kor = kor + 1;
        eng++; // eng = eng + 1;

        fout.printf("%d %d %d", kor, eng, math);
        fout.close();
        fos.close();

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