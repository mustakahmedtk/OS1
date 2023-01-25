package SynchronizedAdderSubtractor;

public class Count {
    private int value = 0;

    public int getValue() {
        return this.value;
    }

    public synchronized void incrementValue(int val) {
        this.value += val;
    }
}
