package day21_Thread;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Thread_03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t1);
        thread.start();
        thread1.start();

    }
}

class T1 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("helloT1   " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }

    }

}

class T2 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("helloT2" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }

    }

}