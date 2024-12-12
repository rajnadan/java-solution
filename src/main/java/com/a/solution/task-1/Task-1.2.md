# Task 1.2 - Cross-Cutting Concerns

## AOP
Aspect-Oriented Programming (AOP) allows us to define cross-cutting concerns (like method timing) separately from business logic. Using frameworks like Spring AOP, we can create an aspect that intercepts method calls and measures their execution time.

### Why use it?
It's centralised, non-intrusive, and works transparently across multiple methods/classes.

### Best for:
Applications already using Spring or where timing needs to be applied across many methods consistently.

## Proxy Class
Java’s Proxy class dynamically creates a proxy object that implements the same interface as the original object. The proxy can intercept method calls, add timing logic, and then delegate the call to the original method.

### Why use it?
It’s dynamic and doesn’t require modifying the original implementation. It works well when dealing with objects that implement interfaces.

### Best for:
Use cases where interfaces are already in place, and we want a lightweight, framework-agnostic solution.

## Custom Annotations
We can create a custom annotation (e.g. @Timed) and apply it to methods we want to time. A central utility or reflection-based interceptor can then detect the annotation, add timing logic, and execute the method.

### Why use it?
It provides fine-grained control over which methods to time and is easy to understand and apply.

### Best for:
Scenarios where we need selective timing and want a lightweight, customisable approach.