package ex2.control;

import java.util.Scanner;

public class IfProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x % 2 == 0)
            System.out.println("짝수 값");
        else
            System.out.println("홀수 값");

        System.out.println("프로그램 끝!");
    }
}
