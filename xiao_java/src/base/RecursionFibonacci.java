package base;

import java.util.Scanner;

public class RecursionFibonacci {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21 34 55 89
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入fibonacci的项数：");
        int inpu = sc.nextInt();
        int result = fibonacci(inpu);
        System.out.println(result);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
