package org.sla;

public class CounterDecrementer implements Runnable {
    Counter sharedCounter;

    CounterDecrementer(Counter theCounter) {
        sharedCounter = theCounter;
    }

    @Override
    public void run() {
        // decrement 100 times
        for (int i = 0; i < 100; i++) {
            Integer newCount = sharedCounter.decrement();
            System.out.println(" FIRST Decrementing to " + newCount);
        }
    }
}