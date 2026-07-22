# Individual Presentation Guide: Q6 – Uncaught Exception Behavior

**Course:** Programming in Java

**Topic:** Uncaught Exceptions, Stack Trace & JVM Default Exception Handler

**Presenter / Student GitHub:** Shashi12899

---

# 🎤 Presentation Slides Overview

## Slide 1: Title & Student Introduction

**Title:** Uncaught Exception Behavior in Java

**Presenter:** Shashi12899

**Objective:**

To demonstrate the difference between an uncaught exception and a handled exception using try-catch blocks and explain the default behavior of the JVM.

---

## Slide 2: What is an Exception?

### Definition

An exception is an unexpected event that interrupts the normal execution of a Java program.

### Key Points

- Exceptions occur during program execution.
- Runtime exceptions are unchecked.
- If not handled, the JVM terminates the program.
- Java provides try-catch blocks for handling exceptions.

---

## Slide 3: Uncaught Exception

### Demonstration

The program deliberately performs integer division by zero without a try-catch block.

Example:

```java
int result = 100 / 0;
```

### JVM Behavior

- Prints stack trace.
- Displays exception type.
- Shows line number.
- Terminates program immediately.

---

## Slide 4: Handled Exception

### Demonstration

The same code is enclosed inside a try-catch block.

```java
try {
    int result = 100 / 0;
}
catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
```

### Result

- Exception is caught.
- Custom message is displayed.
- Program continues execution.

---

## Slide 5: Program Comparison

| Handled Exception | Uncaught Exception |
|-------------------|--------------------|
| Uses try-catch | No try-catch |
| Program continues | Program terminates |
| Custom message | JVM stack trace |
| Better user experience | Application crash |

---

## Slide 6: Summary & Best Practices

### Best Practices

- Always use try-catch for risky operations.
- Validate input before calculations.
- Read stack traces for debugging.
- Handle exceptions gracefully.
- Improve application reliability.

---

# 💬 Presenter Verbal Script for Teacher Viva

"Good day Teacher. My name is **Shashi12899**, and today I am presenting **Question 11: Uncaught Exception Behavior in Java**.

An exception is an unexpected event that interrupts the normal execution of a program. If an exception is not handled using a try-catch block, it becomes an uncaught exception.

In my assignment, I demonstrated two cases.

First, I used a try-catch block to handle an ArithmeticException caused by dividing an integer by zero. The exception was caught successfully, and the program continued execution.

Next, I demonstrated the same exception without using a try-catch block. In this case, the JVM's default exception handler printed the stack trace and terminated the program immediately.

This comparison shows why proper exception handling is important for developing reliable Java applications.

Thank you!"