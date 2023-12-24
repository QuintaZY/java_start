package day21_Thread;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Thread_01 {
    public static void main(String[] args) {
        // chuangjian Cat
        Cat cat = new Cat();
        cat.start();
    }
}

class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("一秒一次" + (++times));
            if(times == 10) {
                break;
            }
        }

    }
}


