package ex3.array;

public class Program2 {
    public static void main(String[] args) {
        // 반복문을 사용하는 것에 초점을 두고 연습
        int i;

        // 1. 문자 10개를 저장할 수 있는 문자배열 chs를 만드시오.
        char[] chs;

        chs = new char[10];

        // // 2. 배열 chs에 문자 'A'를 모두 채우시오.
        // for (i = 0; i < 10; i++)
        // chs[i] = 'A';

        // // 3. 배열 chs에 담긴 값들을 모두 출력하시오.
        // // 단, 모양이 다음과 같이 되도록 출력하시오.
        // // A A A A A A A A A A
        // for (i = 0; i < 10; i++)
        // System.out.printf("%c ", chs[i]);

        // 문자 J부터 A까지를 배열 chs에 채우는 코드를 작성하시오.
        for (i = 0; i < 10; i++)
            chs[i] = (char) ('J' - i);

        // chs[0]과 chs[9]에 담긴 값을 맞바꾸시오.
        char temp;

        // temp = chs[0];
        // chs[0] = chs[9];
        // chs[9] = temp;

        // 배열에 담긴 값들을 양끝쪽부터 맞바꾸시오.
        for (i = 0; i < 5; i++) {
            temp = chs[i];
            chs[i] = chs[9 - i];
            chs[9 - i] = temp;
        }

        // 배열에 담긴 값들을 출력하는 코드를 작성하시오.
        for (i = 0; i < 10; i++)
            System.out.printf("%c ", chs[i]);

        System.out.println();

    }
}
