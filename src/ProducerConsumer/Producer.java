package ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Producer  implements Runnable{

    Queue<Object> cars;
    int cap;

    Producer(Queue<Object> cars, int cap) {
        this.cars = cars;
        this.cap = cap;
    }


    @Override
    public void run() {
        while(true) {
            synchronized (cars) {
                if (cars.size() < cap) {
                    System.out.println(cars.size() + "From Producer");
                    cars.add(new Object());
                }
            }

        }

    }
}
