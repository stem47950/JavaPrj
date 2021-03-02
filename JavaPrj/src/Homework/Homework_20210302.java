package Homework;

import java.util.Scanner;

public class Homework_20210302 {
    public static void main(String[] agrs) {
        String name, city, interest;
        int age;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("                [정보 입력]");
        System.out.println("[!] 정보를 입력하세요.");
        System.out.print("이름: "); name = scan.nextLine();
        System.out.print("나이: "); age = scan.nextInt(); scan.nextLine();
        System.out.print("지역: "); city = scan.nextLine();
        System.out.print("취미: "); interest = scan.nextLine();
        System.out.println();
 
        System.out.println("                [나의 정보]");
        System.out.printf("이름: %s\n", name);
        System.out.printf("나이: %d\n", age);
        System.out.printf("지역: %s\n", city);
        System.out.printf("취미: %s\n", interest);
        System.out.println();
        System.out.printf("제 이름은 %s입니다. 나이는 %d살이고, 사는 곳은 %s입니다. 취미는 %s입니다.\n", name, age, city, interest);}
}