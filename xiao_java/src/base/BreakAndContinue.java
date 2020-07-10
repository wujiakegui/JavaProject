package base;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i % 5 == 0) {
                break;
            }
            System.out.println("当前循环次数：" + i);
        }
        System.out.println("<--------------------->");
        for (int i = 1; i < 7; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println("当前循环次数：" + i);
        }
    }
}
