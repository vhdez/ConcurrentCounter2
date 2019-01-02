package org.sla;

public class Counter {
    Integer count;

    Counter() {
        count = 0;
    }

    Integer increment() {
        if (count < 100) {
            count = count + 1;
        } else {
            System.out.println("BAD! Can't increment past 100!!!!");
        }
        return count;
    }

    Integer decrement() {
        if (count > 0) {
            count = count - 1;
        } else {
            System.out.println("BAD! Can't decrement past 0!!!!");
        }
        return count;
    }
}
