# Task 1.1 - Execution Timer

This solution uses the **Decorator Pattern** to measure the execution time of methods in a class implementing the `Counter` interface.

## Decorator Class (`CounterExecutionTimer`)

Wraps a `Counter` object and measures the time taken for `increment` and `decrement` methods using `System.nanoTime()`.
Delegates the actual operations to the wrapped component, adding the timing behaviour transparently.

## Execution Flow

The `CounterExecutionTimer` intercepts method calls, logs the execution time in milliseconds, and then calls the underlying implementation.

## Benefits

- Non-intrusive: Original class (`MyCounter`) is unchanged.
- Flexible: Any `Counter` implementation can be wrapped for timing.
- Adheres to the **Open/Closed Principle** by extending functionality without modifying existing code.