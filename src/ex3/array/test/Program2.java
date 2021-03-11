package ex3.array.test;

import java.util.Random;

public class Program2 {
    public static void main(String[] args) {
        // 1. 크기 10의 정수배열 nums를 생성한다.
        // 배열에는 다음의 정수가 입력된다. 1, 2, 3, ..., 10
        // 배열 초기화
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int size;

        size = nums.length;
        // 섞는다....
        // 랜덤값을 얻어서
        Random rand;

        rand = new Random();

        // 두 인덱스 위치의 값을 바꿔라.
        // ex. {1, 2, 6, 4, 5, 3, 7, 8, 9, 10}
        // 섞는 작업을 100번 반복하라.
        int i, idx1, idx2, temp;

        temp = 0;
        for (i = 0; i < 100; i++) {
            idx1 = rand.nextInt(size);
            idx2 = rand.nextInt(size);

            temp = nums[idx1];
            nums[idx1] = nums[idx2];
            nums[idx2] = temp;
        }

        // 배열 nums를 출력하시오. 출력형식은 이전과 같다.
        for (i = 0; i < size; i++) {
            if (i != 0)
                System.out.print(", ");
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}
