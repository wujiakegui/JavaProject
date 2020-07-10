package multithreading;

class MyThread4 implements Runnable { // 实现Runnable接口
    public void run() {  // 覆写run()方法
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread().getName()
                    + "运行，i = " + i);  // 取得当前线程的名字
            if (i == 2) {
                System.out.print("线程礼让：");
                Thread.currentThread().yield();    // 线程礼让
            }
        }
    }
};

public class Thread_JoinMethod2 {
    public static void main(String args[]) {
        MyThread4 my = new MyThread4();  // 实例化MyThread对象
        Thread t1 = new Thread(my, "线程A");
        Thread t2 = new Thread(my, "线程B");
        t1.start();
        t2.start();
    }
};