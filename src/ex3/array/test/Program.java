package ex3.array.test;

public class Program {
    public static void main(String[] args) {
        // 1. 크기 10의 정수배열 nums를 생성한다.
        int i, size;
        int[] nums;

        i = 0;
        size = 10;
        nums = new int[size];

        // 2. 배열 nums에 1, 2, 3, 1, 2, 3, 1, ... 처럼 순환하는 정수 10개를 입력하는 반복문을 작성한다.
        for (i = 0; i < size; i++) {
            nums[i] = (i % 3) + 1;
        }

        // 3. 배열 nums를 출력하는 코드를 작성한다.
        // 출력하는 모양은 다음과 같다.
        // 2, 4, 6, 8, [...], 20
        for (i = 0; i < size; i++) {
            if (i != 0)
                System.out.print(", ");
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}
