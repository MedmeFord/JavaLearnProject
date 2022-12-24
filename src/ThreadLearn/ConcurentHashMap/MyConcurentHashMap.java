package ThreadLearn.ConcurentHashMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurentHashMap {
    public static void main(String[] argv) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Medme");
        map.put(2, "Kostya");
        map.put(3, "Serega");
        map.put(4, "Tanya");

        new Thread(() -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while(iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException err) {
                    System.out.println("Fail");
                    err.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException err) {
                err.printStackTrace();
            }
            map.put(5, "Elena");
        }).start();

        Thread.sleep(3000);
        System.out.println(map);
    }

}
