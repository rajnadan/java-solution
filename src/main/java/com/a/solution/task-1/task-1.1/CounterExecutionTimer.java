package com.a.solution;

public class CounterExecutionTimer implements Counter {
    private final Counter counter;

    public CounterExecutionTimer (Counter counter) {
        this.counter = counter;
    }

    public void increment() {
        long start=System.nanoTime();
        counter.increment();
        long end=System.nanoTime();
        System.out.println("increment took "+(end-start)/1_000_000.0+" ms");
    }

    public void decrement() {
        long start=System.nanoTime();
        counter.decrement();
        long end=System.nanoTime();
        System.out.println("decrement took "+(end-start)/1_000_000.0+" ms");
    }
}
