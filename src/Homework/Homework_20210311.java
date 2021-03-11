package Homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Homework_20210311 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        Scanner fscan;
        Scanner date_scan;
        String date;
        String line, line_date;
        String[] columns;
        boolean valid;

        System.out.print("조회하려는 기준일자를 다음과 같이 입력하세요.\n[예시] 0000-00-00\n");
        System.out.print("> ");
        date_scan = new Scanner(System.in);
        date = date_scan.nextLine();
        date_scan.close();

        fis = new FileInputStream("res/제주특별자치도_코로나현황_20201214.csv");
        fscan = new Scanner(fis);

        line = "";
        valid = false;
        while (!valid) {
            line = fscan.nextLine();
            if (line.length() == 0)
                break;
            line_date = line.substring(0, 10);
            if (line_date.equals(date))
                valid = true;
        }
        columns = line.split(",");

        System.out.println("----제주-현황----");
        System.out.printf("기준일자: %s\n  확진자: %s\n  사망자: %s\n", columns[0], columns[1], columns[2]);
        System.out.println("-----------------");

        fscan.close();
        fis.close();
    }
}
