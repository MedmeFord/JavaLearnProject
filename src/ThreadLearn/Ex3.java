package ThreadLearn;

public class Ex3 {
    public static void main(String[] argv) {
        // v1
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();
        // variant 2
        new Thread(() -> {
            for (int i = 0; i != 10; i++) {
                System.out.println(i);
            };
        }).start();

    }
}
