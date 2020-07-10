package utils;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

public class UploadUtils {
    // 为每一个上传的文件生成一个唯一的文件名
    public static String newFileName(String filename) {
        return UUID.randomUUID().toString().replaceAll("-", "") + "_" + filename;
    }

    // 为防止一个目录下文件过多， hash算法打散
    public static String newFilePath(String basepath, String filename) {
        // 1.拿到文件名称的hash码
        int hashCode = filename.hashCode();
        // 2. hash码进行&运算，生成2级目录
        int path2 = hashCode & 15;
        // 3.三级目录
        int path3 = (hashCode >> 4) & 15;
        // 4.将一级+二级+三级  生成一个新的完整目录
        String newPath = basepath + File.separator + path2 + File.separator + path3;
        File file = new File(newPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return newPath;
    }

    // 获取文件目录
    public static void getFileList(String path, HashMap<String, String> filenames) {
        // 1 路径当成文件对象
        File file = new File(path);
        // 2 获取改目录（upload）下所有内容 包括文件夹或文件
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                // 如果是文件夹，递归遍历
                if (file1.isDirectory()) {
                    getFileList(file1.getPath(), filenames);
                } else {
                    String name = file1.getName();
                    // 拿到UUID和源文件名称拼接的_的下标
                    int index = name.indexOf("_");
                    // 截取
                    String filename = name.substring(index + 1);
                    // 把需要的存在集合里
                    filenames.put(name, filename);
                }
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(newFileName("黄.jpg"));
    }

}
