package common_class;

import java.math.BigDecimal;


public class BigDecimalClass {
    public static void main(String[] args) {
        BigDecimal bg1 = new BigDecimal("3.3");
        BigDecimal bg2 = new BigDecimal("2.3");
        BigDecimal bg3 = new BigDecimal("3.3");
        // 比较   结果为  true or false
        System.out.println(bg1 == bg2);      //比较的是地址  false
        System.out.println(bg1.equals(bg3));  // 比较的是值   true
        // 比较大小   返回 -1 表示小于，0 表示 等于， 1表示 大于
        System.out.println(bg1.compareTo(bg2));
        // 加减乘除 操作
        BigDecimal result1 = bg1.add(bg2);        // 加
        System.out.println(result1);
        BigDecimal result2 = bg1.subtract(bg2);        // 减
        System.out.println(result2);
        BigDecimal result3 = bg1.multiply(bg2);        // 乘
        System.out.println(result3);
        BigDecimal result4 = bg1.divide(bg2, 3, BigDecimal.ROUND_HALF_UP);        // 除   3是保留小数点后3位，BigDecimal.ROUND_HALF_UP是4舍5入
        System.out.println(result4);
    }
}




