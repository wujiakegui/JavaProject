package collection_learn;

import java.util.TreeMap;

public class TreeMap_Learn {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("xiao", 3);
        map.put("huang", 5);
        map.put("hx", 4);
//        map.remove("hx");       // 移除指定key对应的映射
//        map.clear();              // 清空 TreeMap
        map.replace("hx", 9);   //replace(K key, V value)：替换指定key对应的value值
        map.replace("xiao", 3, 2);//replace(K key, V oldValue, V newValue)：当指定key的对应的value为指定值时，替换该值为新值

        System.out.println(map.containsKey("huang"));  // 判断该TreeMap中是否包含指定key的映射
        System.out.println(map.containsValue(5));   // 判断该TreeMap中是否包含有关指定value的映射
        System.out.println(map.get("hx"));
        System.out.println(map.entrySet());       // 遍历TreeMap
        System.out.println(map.size());  // 键值对的个数
    }
}
