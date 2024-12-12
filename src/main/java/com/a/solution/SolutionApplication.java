package com.a.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolutionApplication.class, args);

		/*
		Task 1.1
		*/
		System.out.println("Task-1.1");

   MyCounter myCounter = new MyCounter(0);
        CounterExecutionTimer counterExecutionTimer = new CounterExecutionTimer(myCounter);

        // Call increment and decrement with timing
		counterExecutionTimer.increment();
counterExecutionTimer.decrement();

        // Access the underlying value using the original instance
        System.out.println("Final value: " + myCounter.getValue());

System.out.println("\n");

	}

}
