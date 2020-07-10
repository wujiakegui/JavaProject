package base;

import java.io.File;

/*
 *  递归输出文件目录
 * */
public class RecursionFileName {
    public static void main(String[] args) {
        String path = "D:/";                   // 设定文件路径
        test(path);
    }

    private static void test(String path) {            // 输出文件目录函数
        File f = new File(path);                // 创建一个文件路径对象
        File[] fs = f.listFiles();                // 创建文件路径列表的数组
        if (fs == null) {                        // if数组为空，则返回
            return;
        }
        for (File file : fs) {                    // 输出数组
            if (file.isFile()) {
                System.out.println(file.getPath());
            } else {
                test(file.getPath());
            }
        }
    }
}