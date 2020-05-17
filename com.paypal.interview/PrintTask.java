package pal;

import java.util.Arrays;
import java.util.List;

public class PrintTask implements Runnable {
    private static final Object LOCK = new Object();
    private static final int MAX = 99;
    private static int current = 0;
    private int index;

    public PrintTask(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        while (current < MAX) {
            synchronized (LOCK) {
                if ((current < MAX) && (current % 3 + 1 == index)) {
                    System.out.printf("t%d:%d%n", index, ++current);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Thread> threadList = Arrays.asList(
                new Thread(new PrintTask(1)),
                new Thread(new PrintTask(2)),
                new Thread(new PrintTask(3))
        );

        threadList.forEach(Thread::start);
        try {
            for (Thread thread : threadList) {
                thread.join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
