package base;

/**
 * 语法：boolean表达式 ? 表达式1 : 表达式2;
 * 解释：boolean表达式的结果是true,则整个表达式的结果就是表达式1，相反则是表达式2
 */


public class ThreeOperater {

    public static void main(String[] args) {
        int age = 18;
        String age1 = age == 17 ? "成年了" : "未成年";
        System.out.println(age1);

        int x = 10;
        int y = 5;
        int z;
        z = (x > y) ? x : y;//三目运算符
		/*if (x>y){
			z = x;
		}else {
			z = y;
		}*/
        System.out.println("z = " + z);
    }
}
