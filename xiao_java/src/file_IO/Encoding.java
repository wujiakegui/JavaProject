package file_IO;

import java.io.IOException;

public class Encoding {

    public static void main(String[] args) throws IOException {
        String s1 = "你好世界123abc喆";
        byte[] bs = s1.getBytes("GBK");//GBK本文“编码”为二进制
        // 遍历输出
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }
        //使用流写入到文件中
//		FileOutputStream os = new FileOutputStream("xxx");
//		os.write(bs);

        String s2 = new String(bs, "BIG5");//二进制“解码”为GBK本文
        System.out.println(s2);
        byte[] bs2 = s2.getBytes("BIG5");
        String s3 = new String(bs2, "GBK");
        System.out.println(s3);
    }
}

