package SynchronizedAdderSubtractor;

public class Adder implements Runnable{
    Count count;
    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5000; i++) {
            // Lock here
//            synchronized (count) {
                count.incrementValue(i);
//            }

            // Unlock here
        }
    }
}
