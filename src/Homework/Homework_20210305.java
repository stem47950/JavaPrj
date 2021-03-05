package Homework;

import java.io.IOException;
import java.util.Scanner;

public class Homework_20210305 {
    public static void main(String[] args) throws IOException {
        int max, sqrt, i, j;
        boolean flag;

        Scanner scan = new Scanner(System.in);

        System.out.println("이 프로그램은 0보다 큰 정수 중에서 소수인 수를 출력하는 프로그램입니다.");
        System.out.println("소수를 찾을 범위를 입력하세요. 입력된 값 이하의 범위로 소수를 탐색합니다.");
        // 탐색 범위를 65536(=2^16) 크기로 제한
        // 접근 방법은 에라토스테네스의 체

        // 정수 입력값이 조건을 만족하는지 확인
        max = 0;
        flag = true;
        while (flag) {
            System.out.print(": ");
            max = scan.nextInt();
            sqrt = 1;
            while (!((sqrt * sqrt) > max))
                sqrt++;

            if (!(max <= 65536))
                System.out.println("65536보다 큰 수는 입력할 수 없습니다. 다시 입력하세요.");
            else if (!(max > 0))
                System.out.println("0보다 큰 수를 입력하세요.");
            else if (!(max != 1))
                System.out.println("1은 소수가 아닙니다. 다시 입력하세요.");
            else
                flag = false;
        }

        // 입력값을 사용해서 소수 탐색에 필요한 크기의 배열 생성
        int[] arr = new int[max + 1];
        // 배열을 양의 정수로 채움
        i = 0;
        while (i < arr.length)
            arr[i] = ++i;

        System.out.println("소수 탐색을 시작합니다. 소수가 발견되면 화면에 출력됩니다.");
        j = 2;
        while (j <= max) {

            if (!(arr[j - 1] == 0)) {
                System.out.printf("%d ", j);
                i = 1;
                while (j * i < max) {
                    arr[j * i - 1] = 0;
                    i++;
                }
            }
            j++;
        }

        System.out.println();
    }
}
