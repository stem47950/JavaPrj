package ex3.array.test2;

import java.util.Random;

public class Program2 {
    public static void main(String[] args) {
        String[] names;
        Random rand;
        int i, j;
        String temp;

        names = new String[] { "강호동", "유재석", "하하", "김지호", "김현준", "김태희", "박민정" };
        String n = new String("hello");
        String n1 = "hello";

        // rand = new Random();

        // for (i = 0; i < 100; i++) {
        // int idx1 = rand.nextInt(7);
        // int idx2 = rand.nextInt(7);
        // // System.out.printf("idx1: %d, idx2: %d\n", idx1, idx2);

        // temp = names[idx1];
        // names[idx1] = names[idx2];
        // names[idx2] = temp;
        // }

        for (j = 0; j < names.length - 1; j++) {
            for (i = 0; i < names.length - 1 - j; i++) {
                if (names[i].compareTo(names[i + 1]) > 0) {
                    temp = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = temp;
                }
            }
        }

        for (i = 0; i < 7; i++) {
            if (i != 0)
                System.out.print(", ");
            System.out.printf("\"%s\"", names[i]);
        }
        System.out.println();
    }
}
