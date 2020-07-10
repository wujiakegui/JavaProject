package file_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutputStream {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // 字节输出流
        FileOutputStream fos = new FileOutputStream("D:\\xiao.txt", true); //true：在文件内容尾部添加 false：覆盖之前的文件内容
        fos.write(98);      // 一次输出一个字节
        byte[] bs = {66, 67, 68, 69, 70};
        fos.write(bs);          // 一次输出一组字节
        fos.write(bs, 1, 3);  // 一次输出一组字节的指定部分

        // 字节输入流
        FileInputStream fis = new FileInputStream("D:\\xiao.txt");
        // 一次读一个字节
        System.out.println(fis.read());
        // 第一种方法：一次读一组字节  简单，但耗费资源
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b + "\t");
        }
        // 第二种方法：一次读一组字节
        byte cache[] = new byte[10];   // 创建一个数组，作为读取时的缓存
        while (true) {
            int count = fis.read(cache);
            if (count == -1) {
                break;
            }
            for (int i = 0; i < count; i++) {
                System.out.print((char) cache[i] + "\t");
            }
            System.out.println();
        }
    }
}
