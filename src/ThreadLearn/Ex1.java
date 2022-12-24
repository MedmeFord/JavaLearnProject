package ThreadLearn;

public class Ex1 {
    public static void main(String[] argv) {
        Thread1 mythread1 = new Thread1();
        Thread2 mythread2 = new Thread2();
        mythread1.start();
        mythread2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}