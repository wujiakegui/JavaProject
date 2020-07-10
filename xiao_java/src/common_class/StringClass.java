package common_class;

public class StringClass {
    public static void main(String[] args) {
        String xiao = " woshiyigemeiyouganqingdeshashou ";
        System.out.println(xiao.charAt(4));   // 根据下标获取字符
        System.out.println(xiao.contains("shi")); // 判断是否包含字符串

        char[] s = xiao.toCharArray();            // 将字符串转化为数组
        System.out.println(s[3]);

        System.out.println(xiao.indexOf("hi"));
        System.out.println(xiao.indexOf("z"));  // 查找str首次出现的下标，存在，则返回该下标；不存在，则返回-1

        System.out.println(xiao.lastIndexOf("sh"));
        System.out.println(xiao.lastIndexOf("z"));    // 查找str最后出现的下标，存在，则返回该下标；不存在，则返回-1

        System.out.println(xiao.length());   //返回字符串的长度。
        System.out.println(xiao.trim());     //去掉串前后的空格
        System.out.println(xiao.toUpperCase());  //将小写转成大写

        System.out.println(xiao.replace("sha", "xiao"));    //将旧字符串替换成新字符串
    }
}