package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        Scanner fscan;
        String line;
        String[] names;

        fis = new FileInputStream("res/names1.txt");
        fscan = new Scanner(fis);

        line = fscan.nextLine();
        names = line.split(",");

        System.out.println(names[1]);

        fscan.close();
        fis.close();
    }
}
