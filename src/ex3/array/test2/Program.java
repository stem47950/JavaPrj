package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        String[] names;
        FileInputStream fis;
        Scanner fscan;
        int i, j;

        names = new String[7];

        fis = new FileInputStream("res/names.txt");
        fscan = new Scanner(fis);

        i = 0;
        while (fscan.hasNextLine()) {
            String name = fscan.nextLine();
            names[i++] = name;
        }

        fscan.close();
        fis.close();

        for (j = 0; j < i; j++) {
            if (j != 0)
                System.out.print(", ");
            System.out.print(names[j]);
        }
        System.out.println();
    }

}
