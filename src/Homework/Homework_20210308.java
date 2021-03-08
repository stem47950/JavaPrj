package Homework;

import java.util.Scanner;

public class Homework_20210308 {
    public static void main(String[] args) {
        Scanner scan;
        int sub_num;
        String[] sub_name;
        int[] sub_score;
        boolean valid;
        int score_total;
        float score_avg;
        int i;

        scan = new Scanner(System.in);
        sub_num = 3;
        sub_name = new String[3];
        sub_score = new int[sub_num];
        score_total = 0;
        score_avg = 0;

        System.out.println("───────성적입력───────");
        System.out.println("각 과목의 점수를 입력하세요.");

        for (i = 0; i < sub_num; i++) {
            switch (i) {
            case 0:
                sub_name[i] = "국어";
                break;

            case 1:
                sub_name[i] = "영어";
                break;

            case 2:
                sub_name[i] = "수학";
                break;
            }

            valid = false;
            while (!valid) {
                System.out.printf("%s> ", sub_name[i]);
                sub_score[i] = Integer.parseInt(scan.nextLine());
                if (!(sub_score[i] >= 0 && sub_score[i] <= 100))
                    System.out.println("0 이상 100 이하의 정수만 입력할 수 있습니다. 다시 입력하세요.");
                else
                    valid = true;
            }
        }
        scan.close();

        for (i = 0; i < sub_num; i++)
            score_total += sub_score[i];
        score_avg = (float) score_total / 3;

        System.out.println("───────성적출력───────");
        for (i = 0; i < sub_num; i++)
            System.out.printf("%s: %6.2f\n", sub_name[i], (float) sub_score[i]);
        System.out.printf("총합: %6.2f\n", (float) score_total);
        System.out.printf("합계: %6.2f\n", score_avg);
    }
}
