package base;

/**
 * 20200610
 * for循环嵌套（外层控制行数（循环次数），内层控制列数（单次循环操作）
 */

public class ForNesting {
    public static void main(String[] args) {
        System.out.println("打印直角三角形：");
        rightTrianglePrint();
        System.out.println("打印等腰三角形：");
        isoscelesTrianglePrint();
        System.out.println("打印菱形：");
        diamond();
        System.out.println("打印空心菱形：");
        hollowDiamond();
        System.out.println("打印平行四边形：");
        parallelogram();
    }


    // 打印直角三角形
    public static void rightTrianglePrint() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 打印等腰三角形
    public static void isoscelesTrianglePrint() {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond() {
        //定义变量
        int size = 4;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * size - 3; k >= 2 * i - 1; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // 打印空心菱形
    public static void hollowDiamond() {
        // 空心菱形
        for (int i = 1; i <= 5; i++) {
            // 打印上半部分空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // 打印原本实心的*部分
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 仅在一行的开头和末尾打印*
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 4; i >= 1; i--) {
            // 打印下半部分空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // 打印原本实心的*部分
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 仅在一行的开头和末尾打印*
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    //打印平行四边形
    public static void parallelogram() {
        int size = 5;
        for (int A = 1; A <= size; A++) {
            for (int B = 1; B <= size - A; B++) {
                System.out.print(" ");
            }
            for (int C = 1; C <= size; C++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

    }
}

