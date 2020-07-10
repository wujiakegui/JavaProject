package base;

/**
 * xiao
 * 20200529
 */
public class TypeConversion {
    public static void main(String[] args) {
        short s = 123;
        int i = s;        //目标类型大于源类型  自动类型转换 short ---> int
        System.out.println(i);

        double d = i;       //目标类型大于源类型  自动类型转换 int ---> double
        System.out.println(d);

        short num = 123;
        byte target = (byte) num;       //目标类型小于源类型  强制类型转换 short ---> byte
        System.out.println(target);

        double x = 12.34;
        int y = (int) x;            //目标类型小于源类型  强制类型转换 double ---> int
        System.out.println(y);

        short m = 258;
        byte n = (byte) m;      //目标类型小于源类型  强制类型转换 short ---> byte
        System.out.println(n);

        int a = -65;
        char b = (char) a;      //目标类型小于源类型  强制类型转换 int ---> char
        System.out.println(b);
    }
}
