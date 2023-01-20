
class NumberPrinter implements Runnable{

    int number;

    NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.printf("%d\n", number);
    }
}


/* Print all numbers from 1 to 100 by separate threads */

// Task: print 1 number in 1 thread

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!"
                + Thread.currentThread().getName());

        for (int i = 1; i <= 500; i++) {
            NumberPrinter printer = new NumberPrinter(i);
            Thread t = new Thread(printer);
            t.start();
        }

    }
}