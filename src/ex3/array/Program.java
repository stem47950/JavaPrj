package ex3.array;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int i;

        // 1. kors라는 이름을 가진 크기 6의 정수 배열을 생성합시다.
        int[] kors = new int[6];

        // 2. kors의 3번째 방에 정수 36을 입력합시다.
        kors[2] = 36;

        // rand라는 이름으로 Random 객체를 생성합시다.
        Random rand = new Random();
        // 갑자기 분위기 로또. (0 <= n < 45) 범위의 정수를 출력.
        System.out.println(rand.nextInt(45));

        for (i = 0; i < 6; i++) {
            kors[i] = rand.nextInt(45) + 1;
            System.out.printf("%d ", kors[i]);
        }
        System.out.println();
    }
}
