# StringBuilder Append, Insert & Delete

## Objective
The objective of this program is to demonstrate the mutability of the `StringBuilder` class in Java. It shows how a `StringBuilder` object can be modified directly using the `append()`, `insert()`, and `delete()` methods.

## Problem Statement
Write a Java program that starts with a sample string stored in a `StringBuilder` object. Perform the following operations:
1. Append additional text to the end using `append()`.
2. Insert a word at a specific position using `insert()`.
3. Remove a portion of the text using `delete()`.
4. Print the `StringBuilder` after each operation to observe the changes.

## Concepts Used
- StringBuilder
- Mutability
- append()
- insert()
- delete()

## Algorithm
1. Create a `StringBuilder` object with an initial string.
2. Display the original string.
3. Use the `append()` method to add text at the end.
4. Display the updated string.
5. Use the `insert()` method to insert text at a specified position.
6. Display the updated string.
7. Use the `delete()` method to remove a portion of the text.
8. Display the final string.

## Program File
- `StringBuilderOperationsDemo.java`

## Sample Output

```text
Initial StringBuilder:
Java Programming

After append():
Java Programming Language

After insert():
Java Core Programming Language

After delete():
Java Programming Language
```

## Conclusion
This program demonstrates that `StringBuilder` is mutable. Unlike the `String` class, a `StringBuilder` object can be modified directly without creating a new object. The `append()`, `insert()`, and `delete()` methods make it efficient for performing multiple string modifications.

## Author
- Name: Your Name
- Roll Number: Your Roll Number