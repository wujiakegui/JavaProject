package common_class;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException, InterruptedException {
        String path = "D:\\xiao";
        File file = new File(path);
        // 创建删除文件夹
        if (!file.exists()) {
            file.mkdir();               // 创建文件夹    mkdir()只会建立一级的文件夹
            file.mkdirs();              // 创建文件夹    mkdirs()可以建立多级文件夹
//            file.delete();              // 删除文件夹
        } else {
            System.out.println("该文件夹已存在");
        }
        //  创建、删除文件
        String filename = "xiao.txt";
        File myFile = new File(path, filename);
        if (!myFile.exists()) {
            myFile.createNewFile();     //  创建文件
//            myFile.delete();            // 删除文件
        } else {
            System.out.println("该文件夹已经存在");
        }
        // 文件函数
        //判断文件是否存在
        System.out.println(myFile.exists());
        //读取文件名称
        System.out.println(myFile.getName());
        //读取文件路径(相对路径)
        System.out.println(myFile.getPath());
        //读取文件绝对路径
        System.out.println(myFile.getAbsolutePath());
        //读取文件的父级路径
        System.out.println(new File(myFile.getAbsolutePath()).getParent());
        //读取文件的大小
        System.out.println(myFile.length());
        //判断文件是否被隐藏
        System.out.println(myFile.isHidden());
        //判断文件是否可读
        System.out.println(myFile.canRead());
        //判断文件是否可写
        System.out.println(myFile.canWrite());
        //判断文件是否为文件夹
        System.out.println(myFile.isDirectory());
    }
}