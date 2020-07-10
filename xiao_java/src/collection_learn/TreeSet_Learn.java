package collection_learn;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Learn {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();
        names.add("asaf");
        names.add("asgag");
        names.add("werygwe");
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
    }
}
