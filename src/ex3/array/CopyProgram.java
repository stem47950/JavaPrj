package ex3.array;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res/img.bmp");
        FileOutputStream fos = new FileOutputStream("res/img_copy.bmp");

        // 배열을 이용한 복사
        int size;
        byte[] buf;

        size = 0;
        buf = new byte[1024];

        while ((size = fis.read(buf)) != -1)
            fos.write(buf, 0, size);

        fis.close();
        fos.close();

        System.out.println("복사 완료");
    }
}