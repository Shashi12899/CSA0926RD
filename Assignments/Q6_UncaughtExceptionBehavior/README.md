# Uncaught Exception Behavior

**Course:** Programming in Java

**Topic:** Uncaught Exceptions, Stack Trace & JVM Default Exception Handler

**Assignment Type:** Individual Assignment (Q11 – Uncaught Exception Behavior)

**GitHub Account:** Shashi12899

---

# 📌 Problem Statement

Write a Java program that deliberately allows an exception to go uncaught (without using any try-catch block) and observe the default behavior of the Java Virtual Machine (JVM). The program should demonstrate how the JVM prints a stack trace and terminates the application abruptly.

Then rewrite the same program using proper exception handling with a try-catch block and compare both outputs to understand why uncaught exceptions are problematic.

---

# 💡 Theoretical Background

## What is an Exception?

An exception is an unexpected event that interrupts the normal flow of a Java program.

Exceptions are represented by classes derived from `java.lang.Exception`.

```
                 java.lang.Throwable
                         │
          ┌──────────────┴──────────────┐
      java.lang.Error         java.lang.Exception
                                         │
                              java.lang.RuntimeException
                                         │
                          ArithmeticException
```

---

# 🔍 Uncaught Exception

An uncaught exception is an exception that is not handled using a try-catch block.

When an uncaught exception occurs:

- The JVM invokes its default exception handler.
- A stack trace is displayed.
- Program execution terminates immediately.
- Remaining statements are not executed.

---

# 🔬 Program Demonstration

The program demonstrates two situations:

### 1. Handled Exception

- Uses a try-catch block.
- Exception is caught successfully.
- Custom error message is displayed.
- Program continues execution.

### 2. Uncaught Exception

- No try-catch block is used.
- JVM prints the stack trace.
- Program terminates immediately.

---

# 📁 Folder Structure

```
Assignments/
└── Q11_UncaughtExceptionBehavior/
    ├── bin/
    │   └── UncaughtExceptionDemo.class
    ├── src/
    │   └── UncaughtExceptionDemo.java
    ├── README.md
    └── PRESENTATION.md
```

---

# 🚀 Execution Guide

## Compile

```bash
javac -d bin src/UncaughtExceptionDemo.java
```

## Run

```bash
java -cp bin UncaughtExceptionDemo
```

---

# 📊 Sample Output

### Handled Exception

```
===== Handled Exception Demonstration =====

Before Exception

Exception Caught Successfully!

Exception Type : ArithmeticException

Message : / by zero

Program continues execution...

End of Handled Exception Demo
```

---

### Uncaught Exception

```
===== Uncaught Exception Demonstration =====

Before Exception

Exception in thread "main"
java.lang.ArithmeticException: / by zero
    at UncaughtExceptionDemo.uncaughtExceptionDemo(UncaughtExceptionDemo.java:9)
    at UncaughtExceptionDemo.main(UncaughtExceptionDemo.java:43)
```

---

# 📖 Concepts Covered

- Exception Handling
- Runtime Exceptions
- Uncaught Exceptions
- Stack Trace
- JVM Default Exception Handler
- try-catch

---

#  Learning Outcomes

After completing this assignment, students will be able to:

- Understand what an exception is.
- Differentiate between handled and unhandled exceptions.
- Understand JVM default exception handling.
- Read and interpret stack traces.
- Write Java programs using try-catch blocks.

---

# 👨‍💻 Submission Information

**Course:** Programming in Java

**Assignment:** Q6– Uncaught Exception Behavior

**GitHub Repository Owner:** Shashi12899

Refer to **PRESENTATION.md** for presentation slides and viva explanation.