package ThreadLearn;

public class Ex2Implemet {
    public static void main(String[] argv) {
        Thread mythread1 = new Thread(new MyThread1());
        Thread mythread2 = new Thread(new MyThread2());
        mythread1.start();
        mythread2.start();
    }
}

class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}