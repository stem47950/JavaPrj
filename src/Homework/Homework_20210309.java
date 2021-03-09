package Homework;

import java.util.Scanner;

public class Homework_20210309 {
    public static void main(String[] args) {
        int sub_num;
        Scanner scan;
        String[] sub_names;
        int[] sub_scores;
        boolean valid;
        float score_avg;
        int i;

        sub_num = 3;

        sub_names = new String[sub_num + 1];
        sub_scores = new int[sub_num + 1];
        sub_names[sub_num] = "총합";
        sub_scores[sub_num] = 0;
        score_avg = 0;

        System.out.println("───────성적입력───────");
        System.out.println("각 과목의 점수를 입력하세요.");

        scan = new Scanner(System.in);
        for (i = 0; i < sub_num; i++) {
            switch (i) {
            case 0:
                sub_names[i] = "국어";
                break;

            case 1:
                sub_names[i] = "영어";
                break;

            case 2:
                sub_names[i] = "수학";
                break;
            }

            valid = false;
            while (!valid) {
                System.out.printf("%s> ", sub_names[i]);
                sub_scores[i] = Integer.parseInt(scan.nextLine());
                if (!(sub_scores[i] >= 0 && sub_scores[i] <= 100))
                    System.out.println("0 이상 100 이하의 정수만 입력할 수 있습니다. 다시 입력하세요.");
                else
                    valid = true;
            }
            sub_scores[sub_num] += sub_scores[i];
        }
        scan.close();

        score_avg = (float) (sub_scores[sub_num] / sub_num);

        System.out.println("───────성적출력───────");

        for (i = 0; i < sub_num + 1; i++)
            System.out.printf("%s: %d\n", sub_names[i], sub_scores[i]);
        System.out.printf("평균: %5.2f\n", score_avg);
    }
}
