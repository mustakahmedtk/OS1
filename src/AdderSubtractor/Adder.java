package AdderSubtractor;

public class Adder implements Runnable{
    Count count;
    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 7000; i++) {
            // Lock here
            count.value.addAndGet(i);
            // Unlock here
        }
    }
}
