package day21_Thread;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Thread_04_SellTicket {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

    }
}

class SellTicket01 extends Thread {

    private static int num = 100;  // static 让多个线程共享  num

    @Override
    public void run() {
        while (true) {
            if (num <= 0) {
                System.out.println("结束");
                break;
            }
//            休眠50毫秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("售出" + Thread.currentThread().getName() + ",剩余" + (--num));
        }
    }
}
