package Homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Homework_20210303 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("res/score.txt");
        PrintStream fileout = new PrintStream(fos);

        fileout.printf("%d %d %d %d", 81, 63, 92, 76);

        fileout.close();
        fos.close();

        FileInputStream fis = new FileInputStream("res/score.txt");
        Scanner filein = new Scanner(fis);

        int a = filein.nextInt();
        int b = filein.nextInt();
        int c = filein.nextInt();
        int d = filein.nextInt();

        filein.close();
        fis.close();

        int x = a | b;
        int y = x & c;
        int z = y ^ d;
        int m = ~z;

        fos = new FileOutputStream("res/score.txt");
        fileout = new PrintStream(fos);
        
        fileout.printf("%d %d %d %d", x, y, z, m);

        fileout.close();
        fos.close();
    }
}
                                           