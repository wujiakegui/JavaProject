package multithreading;

public class Thread_CreateTwo {
    public static void main(String[] args) {
        MyRunnable t1 = new MyRunnable();
        MyRunnable t2 = new MyRunnable();
        Thread thr1 = new Thread(t1);
        Thread thr2 = new Thread(t2);
        thr1.setName("huang");
        thr2.setName("xiao");
        thr1.start();
        thr2.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {     // 任务
        for (int i = 0; i <= 50; i++) {
            System.out.println("MyRunnable " + Thread.currentThread().getName() + " :" + i);
        }
    }
}