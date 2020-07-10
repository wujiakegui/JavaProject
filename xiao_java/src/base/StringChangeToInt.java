package base;

public class StringChangeToInt {
    public static void main(String[] args) {
        //方式一
        int num = Integer.parseInt("56544");
        //方式二
        int num2 = Integer.valueOf("123");
        System.out.println(num + "  " + num2);
    }
}

