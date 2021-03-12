package Homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Homework_20210312 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        Scanner scan, fscan;
        String line, label;
        String[] cols;
        int idx, total;
        boolean valid;

        fis = new FileInputStream("res/covid19.csv");
        fscan = new Scanner(fis);

        line = fscan.nextLine();
        cols = line.split(",");
        System.out.println("원하시는 자료의 번호를 입력하세요.");
        System.out.println("--------------------");
        for (int i = 1; i < cols.length - 1; i++)
            System.out.printf("[%d] %s\n", i, cols[i]);

        valid = false;
        idx = -1;
        scan = new Scanner(System.in);
        while (!valid) {
            System.out.println("--------------------");
            System.out.print("> ");
            idx = scan.nextInt();
            if (!(idx > 0 && idx < (cols.length - 1)))
                System.out.println("없는 번호입니다. 다시 입력하세요.");
            else
                valid = true;
        }
        System.out.println("--------------------");
        scan.close();

        label = cols[idx];
        total = 0;
        while (fscan.hasNextLine()) {
            line = fscan.nextLine();
            cols = line.split(",");
            total += Integer.parseInt(cols[idx]);
        }
        fscan.close();
        fis.close();

        System.out.printf("%s 인원 합계: %d명\n", label, total);
    }
}
