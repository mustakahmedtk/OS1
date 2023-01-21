package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NumberPrinter implements Runnable {
    int num;
    NumberPrinter(int value) {
        num = value;
    }
    @Override
    public void run() {
        System.out.println("Printing " + this.num +
                ". Printed by " + Thread.currentThread().getName());
    }
}


public class PrintNumbers {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100; i++){

            if (i == 5 || i == 10 || i == 11 || i == 20) {
                System.out.println(i);
            }

            NumberPrinter printer = new NumberPrinter(i);
            executorService.submit(printer);
        }
        executorService.shutdown();

    }
}
