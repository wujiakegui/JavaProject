package collection_learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_Learn {
    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<Integer> myList = new ArrayList<Integer>();
        ArrayList<Integer> myList1 = new ArrayList<Integer>();
        // 添加
        myList1.add(2);                                // 添加元素到列表末尾  		add(E e)
        myList1.add(1, 4);                // 指定位置添加指定的元素 	add(int index, E element)
//		myList.clear();  		// 删除所有元素
        myList1.add(9);
        myList1.add(6);
        myList1.add(4);
        myList1.add(3);
        myList.addAll(myList1);        // 添加所有
        // 判断
        System.out.println(myList.contains(0));        // 判断集合是否包含指定元素 	contains(Object o)
        System.out.println(myList.contains(3));        // 返回true  or false
        // 获得
        System.out.println(myList.get(4));            // 返回此列表中指定位置的元素
        System.out.println(myList.indexOf(4));        // 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        System.out.println(myList.lastIndexOf(4)); // 返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。
        // 删除
        myList.remove(2);            //		删除该列表中指定位置的元素。 remove(int index)
        myList.set(2, 4);                //set(int index, E element) 用指定的元素替换此列表中指定位置的元素。
        Collections.reverse(myList);    // 转换 reverse()方法
        printArrayList(myList);
        Collections.shuffle(myList);    // 打乱 shuffle()方法
        printArrayList(myList);
        Collections.sort(myList);       // 排序	sort()方法
        printArrayList(myList);

        // 将集合转换为数组
        Object[] objs = myList.toArray();        // 转化为数组 toArray()方法
        // 输出数组
        for (int i = 0; i < objs.length; i++) {
            System.out.print(objs[i] + "\t");
        }
        System.out.println();
        // 将数组转换为集合  第一种方法
        String[] myArr = {"xiao", "xian", "hua", "nian"}; // 定义一个数组并赋值
//		List<String> myLi = Arrays.asList(myArr);      // 将数值转换为集合
//		List<String> myList = Arrays.asList("Apple","Banana", "Orange");    // 两步化为一步走
        // 将数组转换为集合  第二种方法
        ArrayList<String> myLi = new ArrayList<String>(Arrays.asList(myArr));
        printArrayList((ArrayList) myLi);
        System.out.println(myList.subList(1, 2));  // 输出指定位置的元素 subList()方法
    }

    // 输出ArrayList集合
    public static int printArrayList(ArrayList myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }
        System.out.println();
        return 0;
    }
}
