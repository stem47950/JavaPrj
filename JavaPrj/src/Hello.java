public class Hello{
    public static void main(String[] args){
        int kor, eng, math;
        int total;
        double avg;

        kor = 60;
        eng = 70;
        math = 80;

        total = kor + eng + math;
        avg = total / 3;

        //System.out.printf("total is %d\n", total);

        System.out.print("┌───────────────────────┐\n");
        System.out.print("│       성적 출력       │\n");
        System.out.print("└───────────────────────┘\n");
        System.out.print("국어: 0\n");
        System.out.print("영어: 0\n");
        System.out.print("수학: 0\n");
        System.out.print("총점: 0\n");
        System.out.print("평균: 0.00\n");
    }
}