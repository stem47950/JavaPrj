package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        Scanner fscan;
        String line, label;
        String[] cols;
        int total;

        fis = new FileInputStream("res/covid19.csv");
        fscan = new Scanner(fis);

        line = fscan.nextLine();
        cols = line.split(",");
        label = cols[3];

        total = 0;
        while (fscan.hasNextLine()) {
            line = fscan.nextLine();
            cols = line.split(",");
            total += Integer.parseInt(cols[3]);
        }

        fscan.close();
        fis.close();

        System.out.printf("해당 기간의 %s 누적 인원은 %d명입니다.\n", label, total);
    }
}
