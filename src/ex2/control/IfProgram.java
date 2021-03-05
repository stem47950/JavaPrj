package ex2.control;

import java.util.Scanner;

public class IfProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x > 3)
            System.out.println("큰 값");

        System.out.println("프로그램 끝!");
    }
}
