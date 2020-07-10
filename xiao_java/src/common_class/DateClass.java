package common_class;

/*
20200429
*/

import java.util.Date;
import java.util.Locale;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);  // 当前日期  Wed Apr 29 13:56:15 CST 2020
        //当前日期和时间进行格式化输出
        String a = String.format("%tF", date);    // 2020-04-29
        System.out.println(a);
        String b = String.format("%tD", date);    // 04/29/20
        System.out.println(b);
        String c = String.format("%tr", date);    // 01:56:15 下午
        System.out.println(c);
        String d = String.format("%tT", date);    // 13:56:15
        System.out.println(d);
        String e = String.format("%tR", date);    // 13:56
        System.out.println(e);
        //当前日期进行格式化输出
        String f = String.format(Locale.US, "%ta", date);    //Wed
        System.out.println(f);
        String g = String.format(Locale.US, "%tA", date);    //Wednesday
        System.out.println(g);
        String h = String.format("%ty", date);    //20
        System.out.println(h);
        String i = String.format("%tY", date);    //2020
        System.out.println(i);
        String j = String.format("%tm", date);    //04
        System.out.println(j);
        String k = String.format("%td", date);    //29
        System.out.println(k);
        String l = String.format("%te", date);    //29
        System.out.println(l);
        String m = String.format("%tj", date);    //120
        System.out.println(m);
        String n = String.format(Locale.US, "%tb", date);    //Apr
        System.out.println(n);
        String o = String.format(Locale.US, "%tB", date);    //April
        System.out.println(o);
    }
}
