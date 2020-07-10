package multithreading;

public class Thread_CreateOne {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();       // 创建线程对象 t1
        MyThread t2 = new MyThread();       // 创建线程对象 t2
        t1.setName("huang");                // 设置名称
        t2.setName("xiao");                 // 设置名称
        t1.start();                         // 开始线程
        t2.start();                         // 开始线程
    }
}

class MyThread extends Thread {
    public void run() {       // 重写run方法
        for (int i = 0; i <= 50; i++) {
            System.out.println("Thread " + MyThread.currentThread().getName() + ":" + i);
        }
    }
}
