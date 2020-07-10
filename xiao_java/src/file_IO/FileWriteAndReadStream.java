package file_IO;

import java.io.*;

public class FileWriteAndReadStream {

    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("D:\\xiao.txt", true);
        fw.write("HelloWorld");
        fw.flush();
        fw.close();
        Reader fr = new FileReader("D:\\xiao.txt");
        char[] cache = new char[4];
        while (true) {
            int n = fr.read(cache);
            if (n == -1) break;
            for (int i = 0; i < n; i++) {
                System.out.print(cache[i]);
            }
            System.out.println();
        }

    }

}
