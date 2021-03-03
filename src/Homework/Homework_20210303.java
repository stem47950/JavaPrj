package Homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Homework_20210303 {
    public static void main(String[] args) throws IOException {
        int a, b, c, d, e;
        int x, y, z;

        FileInputStream fis = new FileInputStream("score.txt");
        Scanner filein = new Scanner(fis);

        a = filein.nextInt();
        b = filein.nextInt();
        c = filein.nextInt();
        d = filein.nextInt();
        e = filein.nextInt();

        filein.close();
        fis.close();

        x = a | b;
        y = c ^ d;
        z = x + y;

        FileOutputStream fos = new FileOutputStream("score.txt");
        PrintStream fileout = new PrintStream(fos);

        fileout.print(z);
        
        fileout.close();
        fos.close();
    }
}
