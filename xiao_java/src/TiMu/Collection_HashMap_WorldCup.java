package TiMu;

import javafx.beans.binding.MapExpression;

import java.util.*;

/*
 *  20200526
 *   xiao
 *   一、从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队
 *   如果该年没有举办世界杯，输出：没有举办世界杯
 *
 *   二、从命令行输入一个字符串，表示一个球队，输出该球队获得冠军的年份
 *   如果没有获得冠军，则输出：没有获得冠军
 * */
public class Collection_HashMap_WorldCup {
    public static void main(String[] args) {
        HashMap worldCupMap = new HashMap();
        worldCupMap.put("1930", "乌拉圭");
        worldCupMap.put("1934", "意大利");
        worldCupMap.put("1938", "意大利");
        worldCupMap.put("1950", "乌拉圭");
        worldCupMap.put("1954", "德国");
        worldCupMap.put("1958", "巴西");
        worldCupMap.put("1962", "巴西");
        worldCupMap.put("1966", "英格兰");
        worldCupMap.put("1970", "巴西");
        worldCupMap.put("1974", "德国");
        worldCupMap.put("1978", "阿根廷");
        worldCupMap.put("1982", "意大利");
        worldCupMap.put("1986", "阿根廷");
        worldCupMap.put("1990", "德国");
        worldCupMap.put("1994", "巴西");
        worldCupMap.put("1998", "法国");
        worldCupMap.put("2002", "巴西");
        worldCupMap.put("2006", "意大利");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入世界杯举办年份：");
        String year = sc.next();
        if (worldCupMap.containsKey(year)) {
            System.out.println(year + "年获得世界杯冠军的是：" + worldCupMap.get(year));
        } else {
            System.out.println(year + "年，没有举办世界杯");
        }

        // 遍历输出HashMap 集合
        Set set = worldCupMap.keySet();
        Iterator iter = set.iterator();      // Iterator iter2 = worldCupMap.keySet().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            Object value = worldCupMap.get(key);
            System.out.println(key + " --> " + value);
        }
        System.out.println("--------------------");

        System.out.println("请输入获得世界杯冠军的球队 ：");
        String qiudui = sc.next();
        if (worldCupMap.containsValue(qiudui)) {
            String year1 = printYear(worldCupMap, qiudui);
            System.out.println("年" + qiudui + "获得世界杯冠军");
        } else {
            System.out.println("对不起，" + qiudui + "没有获得世界杯");
        }
        System.out.println("--------------------");
    }

    public static String printYear(HashMap worldCupMap, String year) {
        Set set = worldCupMap.keySet();
        Iterator iter1 = set.iterator();
        while (iter1.hasNext()) {
            Object key = iter1.next();
            Object value = worldCupMap.get(key);
            if (value.equals(year)) {
                System.out.print(key + ",");
            }
        }
        return year;
    }
}
