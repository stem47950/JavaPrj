package ex2.control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res/img.bmp");
        FileOutputStream fos = new FileOutputStream("res/img_copy.bmp");

        int b = 0;
        while (b != -1) {
            b = fis.read();
            fos.write(b);
        }

        fis.close();
        fos.close();

        System.out.println("복사 완료");
    }
}