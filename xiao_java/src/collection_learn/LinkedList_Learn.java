package collection_learn;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Learn {
    public static void main(String[] args) {
        // 创建LinkedList集合
        LinkedList li = new LinkedList();
        // 添加
        li.add("xiao");                        // 添加到末尾
        li.addFirst("a");                // 添加到第一个位置
        li.addLast("b");                    // 添加到末尾位置
        li.add(1, "Huang");    // 添加到指定位置
        printLinkedList(li);
    }

    // 输出ArrayList集合
    public static int printLinkedList(LinkedList myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\t");
        }
        System.out.println();
        return 0;
    }
}
