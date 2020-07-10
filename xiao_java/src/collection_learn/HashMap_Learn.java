package collection_learn;

import java.util.HashMap;

public class HashMap_Learn {
    public static void main(String[] args) {
        ///*Integer*/map.put("1", 1);//向map中添加值(返回这个key以前的值,如果没有返回null)
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println(map.isEmpty());//true    判断是否为空
        map.put("hx", 1);             // 存值
        System.out.println(map.isEmpty());//false    判断是否为空

        /*Value的类型*///得到map中key相对应的value的值
        System.out.println(map.get("1"));//null      取值
        System.out.println(map.get("DEMO"));//1     取值

        //判断是否含有key
        System.out.println(map.containsKey("xiao"));//false
        map.put("xiao", 8);
        System.out.println(map.containsKey("xiao"));//true

        //判断是否含有value
        System.out.println(map.containsValue(2));//false
        map.put("huang", 2);
        System.out.println(map.containsValue(2));//true

        // 删除这个key值下的value
        System.out.println(map.remove("hx"));//null

        // 显示所有的value值
        System.out.println(map.values());//[1, 2]
        // 显示所有的keys值
        System.out.println(map.keySet());
        // 显示元素的个数
        System.out.println(map.size());//0
        // 显示所有的keys和value值
        System.out.println(map.entrySet());//[]
        System.out.println(map);
        // 替换key的value
        System.out.println(map.replace("xiao", 5));//2

        // 清空hashmap
//        map.clear();
    }
}


