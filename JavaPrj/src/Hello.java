public class Hello {
    public static void main(String[] args) {
        int kor, eng, math;
        int total;
        float avg;

        kor = 60;
        eng = 70;
        math = 80;

        total = kor + eng + math;
        avg = (float) total / 3;

        // System.out.printf("total is %d\n", total);

        System.out.println("┌───────────────────────┐");
        System.out.println("│       성적 출력       │");
        System.out.println("└───────────────────────┘");

        System.out.printf("국어: %d\n", kor);
        System.out.printf("영어: %d\n", eng);
        System.out.printf("수학: %d\n", math);

        System.out.printf("총점: %d\n", total);
        System.out.printf("평균: %5.2f\n", avg);
    }
}