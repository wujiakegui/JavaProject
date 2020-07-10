package base;

public class Function_learn {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = add(4, 9);
        System.out.println(a);
        int b = add(4, 9, 4);
        System.out.println(b);
    }

    // add函数，获取两个值的和
    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // add函数的重载 ,获取三个值的和
    public static int add(int x, int y, int z) {
        int sum = x + y + z;
        return sum;
    }
}
