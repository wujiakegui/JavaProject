package exception_learn;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("----欢迎使用命令行除法计算器----");
        CMDCalculate();
    }

    public static void CMDCalculate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入num1：");
        int num1 = scan.nextInt();
        System.out.println("请输入num2：");
        int num2 = scan.nextInt();
        int result = devide(num1, num2);
        System.out.println("result:" + result);
        scan.close();
    }

    public static int devide(int num1, int num2) {
        return num1 / num2;
    }
}
/*****************************************

 ----欢迎使用命令行除法计算器----
 2
 0
 Exception in thread "main" java.lang.ArithmeticException : / by zero
 at com.example.AllDemo.devide( AllDemo.java:30 )
 at com.example.AllDemo.CMDCalculate( AllDemo.java:22 )
 at com.example.AllDemo.main( AllDemo.java:12 )

 ----欢迎使用命令行除法计算器----
 1
 r
 Exception in thread "main" java.util.InputMismatchException
 at java.util.Scanner.throwFor( Scanner.java:864 )
 at java.util.Scanner.next( Scanner.java:1485 )
 at java.util.Scanner.nextInt( Scanner.java:2117 )
 at java.util.Scanner.nextInt( Scanner.java:2076 )
 at com.example.AllDemo.CMDCalculate( AllDemo.java:20 )
 at com.example.AllDemo.main( AllDemo.java:12 )
 *****************************************/
