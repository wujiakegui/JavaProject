package TiMu;

import java.util.*;

/*
 *    输入一个字符串，统计各个字符出现的次数
 *     20200526
 *       xiao
 * */
public class Collection_HashMap_StringTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int m = map.get(c);
                map.put(c, m + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Character> keys = map.keySet();
        for (char c : keys) {
            int i = map.get(c);
            System.out.println(c + " ---- " + i);
        }
    }
}
