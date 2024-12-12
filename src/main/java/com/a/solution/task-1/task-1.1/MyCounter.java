package com.a.solution;

public class MyCounter implements Counter {
  private int value;

  public MyCounter(int value) {
      this.value = value;
  }

  public void increment() {
      this.value++;
  }

  public void decrement() {
      this.value--;
  }

  public int getValue() {
      return this.value;
  }
}