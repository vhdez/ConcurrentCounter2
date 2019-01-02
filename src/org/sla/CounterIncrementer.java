package org.sla;

public class CounterIncrementer implements Runnable {
    Counter sharedCounter;

    CounterIncrementer(Counter theCounter) {
        sharedCounter = theCounter;
    }

    @Override
    public void run() {
        // increment 100 times
        for (int j = 0; j < 100; j++) {
            Integer newCount = sharedCounter.increment();
            System.out.println(" FIRST Incrementing to " + newCount);
        }
    }
}