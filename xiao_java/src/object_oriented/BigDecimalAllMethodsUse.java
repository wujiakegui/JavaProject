package object_oriented;

import java.math.BigDecimal;


public class BigDecimalAllMethodsUse {
    public static void main(String[] args) {
        BigDecimal bg1 = new BigDecimal("3.3");
        BigDecimal bg2 = new BigDecimal("2.3");

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




