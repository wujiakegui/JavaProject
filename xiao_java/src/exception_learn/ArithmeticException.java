package exception_learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = -1;
        try {
            System.out.println("请输入：");
            int a = sc.nextInt();
            System.out.println("请输入：");
            int b = sc.nextInt();
            result = a / b;
        } catch (java.lang.ArithmeticException e) {             // 算术异常
            System.out.println("除数不能为零!");
        } catch (InputMismatchException e) {           // 输入异常
            System.out.println("请输入有效整数!");
        } catch (RuntimeException e) {
            System.out.println("未知的运行时异常，请联系管理员");
        } catch (Exception e) {
            System.out.println("未知的受查异常，请联系管理员!");
        } finally {
            System.out.println("程序结束");
        }
    }
}