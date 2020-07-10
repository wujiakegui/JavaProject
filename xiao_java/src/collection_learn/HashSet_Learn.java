package collection_learn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Learn {
    public static void main(String[] args) {
        // 创建HashSet集合
        HashSet<String> names = new HashSet<String>();  //jdk7.0后实例化时<>中可以不加
        //添加
        names.add("张三");
        names.add("李四");
        //遍历方法不能用传统遍历方法，因为HashSet类中没有get方法
        //第一种遍历方法：加强for循环
        for (String name : names) {
            System.out.println(name);
        }
        //第二种遍历方法：迭代器遍历
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //HashSet变量.clear():清除所有的数据
        names.clear();
        //HashSet变量.idEmpty(): 判断是否为空
        System.out.println(names.isEmpty());
    }
}

