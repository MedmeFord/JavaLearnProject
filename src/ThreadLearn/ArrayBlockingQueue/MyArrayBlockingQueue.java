package ThreadLearn.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class MyArrayBlockingQueue {
    public static void main(String[] argv) {
        ArrayBlockingQueue<Integer> myArrBlockQueue = new ArrayBlockingQueue<>(4);

        Runnable runnable1 = () -> {
            int i = 0;
            while (true) {
                try {
                    myArrBlockQueue.put(++i);
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.printf("Query add: %d\n", i);
                System.out.println("Query element: " + myArrBlockQueue + "\n");
            }
        };
        // Runnable runnable == new Thread(() -> {...})
        Runnable runnable2 = () -> {
            while (true) {
                try {
                   Integer j =  myArrBlockQueue.take();
                   System.out.println("Querry remove:" + j);
                   Thread.sleep(12000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Query element: " + myArrBlockQueue + "\n");
            }
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}
