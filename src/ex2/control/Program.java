package ex2.control;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan;
        int ans, x;

        scan = new Scanner(System.in);
        ans = scan.nextInt();
        scan.close();
        x = (ans > 3) ? 2 : 3;

        System.out.println(x);
    }
}
