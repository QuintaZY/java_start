package day21_Thread;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Thread_05_ThreaExit {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        Thread.sleep(1000 * 10);
         t.setLoop(false);
    }
}


class T extends Thread {
    private int count = 0;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t" + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
