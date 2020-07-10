package exception_learn;

public class NullPointerException {
    public static void main(String[] args) {
        // 不能使用一个值为null的引用类型变量来调用非静态方法，否则会抛出异常
        String str = null;
        try {
            if (str.equals("SnailClimb")) {
                System.out.println("abc");
            } else {
                System.out.println("cde");
            }
        } catch (java.lang.NullPointerException e) {
            System.out.println("空指针异常");
        }

    }
}