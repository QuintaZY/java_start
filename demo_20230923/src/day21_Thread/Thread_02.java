package day21_Thread;

import java.rmi.Naming;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Thread_02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.start();
//        创建一个Thread对象， 把Dog对象  放入Thread
        Thread thread = new Thread(dog);
        thread.start();
    }

}

class Dog implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("打印1"+ (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
