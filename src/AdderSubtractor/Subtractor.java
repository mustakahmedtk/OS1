package AdderSubtractor;

public class Subtractor implements Runnable{
    Count count;
    Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 7000; i++) {
            // Lock here
            count.value.addAndGet(-i);
            // Unlock
        }
    }
}