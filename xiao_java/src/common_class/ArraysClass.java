package common_class;

/**
 * Arrays类
 * 20200601
 */

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        String[] names = {"xiao", "xian", "hua", "nian"};
        int[] age = {1, 9, 5, 3, 4, 6};
        // 排序
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));   // 将数组转换为字符串，顺序输出
        // 二分法查询元素在数组出现的索引
        Arrays.binarySearch(names, "xiao");
        System.out.println(Arrays.binarySearch(names, "xiao"));
        // 赋值数组到新数组  newLength 新数组长度
        String s[] = Arrays.copyOf(names, 9);
        System.out.println(Arrays.toString(s));
        // 将数组 2-5 赋值为3
        Arrays.fill(age, 2, 4, 4);
        System.out.println(Arrays.toString(age));
    }
}









