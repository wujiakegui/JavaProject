package TiMu;

import java.util.Scanner;

/*  20200526
 *   xiao
 * */
public class String_ReverseOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
        reverseString(str);
    }

    public static void reverseString(String str) {
        char[] chArra = str.toCharArray();         // 将字符串转换为数组
        System.out.print("逆序输出的字符串是：");
        for (int i = chArra.length - 1; i >= 0; i--) {     // 循环遍历，逆序输出
            System.out.print(chArra[i] + "\t");
        }
    }
}

